package com.fupin.util;

import com.fupin.domain.FpbData;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
        Workbook workbook=  ExcelExportUtil.exportExcel(params,
                FpbData.class, list);
        return workbook;
    }
}
