package com.fupin.util;

import com.fupin.domain.FpbData;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Date;
import java.util.List;

/**
 * Created by yue on  2017/4/2 0002.
 */
@Component
public class FileUtil {



    public static  String writeToFile(String fileName, String title,String sheetName,List<FpbData> list) throws IOException{

        String saveDir="C:\\fpb";
        File fileDir = new File("C:\\fpb");

        if(!fileDir.exists()){
            fileDir.mkdirs();
        }

        Workbook  workbook= createWorkbook(title,sheetName,list);
         fileName =fileName+ new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) ;
        String filePath = saveDir+ File.separator+fileName+".xls";
        FileOutputStream fout = new FileOutputStream(filePath);
        ByteArrayOutputStream ostream = new ByteArrayOutputStream();
        workbook.write(ostream);
        fout.write(ostream.toByteArray());
        fout.flush();
        ostream.close();
        fout.close();
        return fileName+".xls";
    }

    public  static Workbook   createWorkbook(String title,String sheetName,List<FpbData> list){
        ExportParams params = new ExportParams(title, sheetName);
     //   params.setAddIndex(true);
        Workbook workbook=  ExcelExportUtil.exportExcel(params,
                FpbData.class, list);
        return workbook;
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public static ResponseEntity<InputStreamResource> downFile(String filename,List list) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\""+new String((""+filename + ".xls").getBytes("GBK"),
                "ISO8859_1") + "\""));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        Workbook workbook= FileUtil.createWorkbook(filename+"",filename+"", list);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        workbook.write(bos);
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
       return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(bytes.length)
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new InputStreamResource(bis));
    }

    public static void addXh(List list){
        for (int i = 0,l=list.size(); i <l ; i++) {
            FpbData map= (FpbData) list.get(i);
            map.setXH(i+1);
        }

    }
}
