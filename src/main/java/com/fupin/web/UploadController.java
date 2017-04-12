package com.fupin.web;

import com.fupin.domain.FpbData;
import com.fupin.domain.FpbRepository;
import com.fupin.domain.PcsData;
import com.fupin.domain.PcsRepository;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luculent on 2017/4/1.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private FpbRepository fpbRepository;
    @Autowired
    private PcsRepository pcsRepository;



    @RequestMapping("/fpb")
    @ResponseBody
    public Map upload(@RequestParam("selectexcel")MultipartFile file){
        Map map=new HashMap<>();
        Workbook wb = null;
        List<FpbData>   list=new ArrayList<>();
        if(!file.isEmpty()){
            ImportParams params = new ImportParams();
            params.setTitleRows(1);
            try {
              String  filename=file.getOriginalFilename();
               String fileType = filename.substring(filename.lastIndexOf(".") + 1, filename.length());
                InputStream is=file.getInputStream();
                if ("xls".equals(fileType)) {
                    wb = new HSSFWorkbook(is);
                    params.setSheetNum( wb.getNumberOfSheets());
                     list = ExcelImportUtil.importExcel(file.getInputStream(), FpbData.class, params);
                } else if ("xlsx".equals(fileType)) {
                    params.setSheetNum(1000);
                      list = ExcelImportUtil.importExcelBySax(file.getInputStream(), FpbData.class, params);
                }

              //  List<FpbData>   list = ExcelImportUtil.importExcelBySax(file.getInputStream(), FpbData.class, params);
                fpbRepository.save(list);

            } catch (Exception e) {
                e.printStackTrace();
            }
            map.put("success","true");
        }else{
            map.put("success","false");
        }
        return map;
    }

    @RequestMapping("/pcs")
    @ResponseBody
    public Map uploadPcs(@RequestParam("pcsselectexcel")MultipartFile file){
        Map map=new HashMap<>();
        Workbook wb = null;
        List<PcsData>   list=new ArrayList<>();
        if(!file.isEmpty()){
            ImportParams params = new ImportParams();
            try {
                String  filename=file.getOriginalFilename();
                String fileType = filename.substring(filename.lastIndexOf(".") + 1, filename.length());
                InputStream is=file.getInputStream();
                if ("xls".equals(fileType)) {
                    wb = new HSSFWorkbook(is);
                    params.setSheetNum( wb.getNumberOfSheets());
                    list = ExcelImportUtil.importExcel(file.getInputStream(), PcsData.class, params);
                } else if ("xlsx".equals(fileType)) {
                    params.setSheetNum(1000);
                    list = ExcelImportUtil.importExcelBySax(file.getInputStream(), PcsData.class, params);
                }
                pcsRepository.save(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
            map.put("success","true");
        }else{
            map.put("success","false");
        }
        return map;
    }
}
