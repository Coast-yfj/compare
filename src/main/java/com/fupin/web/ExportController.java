package com.fupin.web;

import com.fupin.service.ExportService;
import com.fupin.util.FileUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yue on  2017/4/2 0002.
 */
@Controller
public class ExportController {

    @Autowired
    private ExportService exportService;
    @RequestMapping("/export")
    @ResponseBody
    public Map export()  {
        Map map=new HashMap<>();
        try {
            exportService.exprotAll();
            map.put("success","true");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success","false");
        }
        return map;
    }
@RequestMapping("/exportName")
    @ResponseBody
    public ResponseEntity exportName()  throws Exception{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\""+new String(("姓名错误" + ".xls").getBytes("GBK"),
                "ISO8859_1") + "\""));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        Workbook workbook= FileUtil.createWorkbook("姓名错误","姓名错误", exportService.exprortName());
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
    @RequestMapping("/exportSex")
    @ResponseBody
    public ResponseEntity exportSex()  throws Exception{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\""+new String(("性别错误" + ".xls").getBytes("GBK"),
                "ISO8859_1") + "\""));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        Workbook workbook= FileUtil.createWorkbook("性别错误","性别错误", exportService.exprortSex());
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
    @RequestMapping("/exportNation")
    @ResponseBody
    public ResponseEntity exportNation()  throws Exception{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\""+new String(("民族错误" + ".xls").getBytes("GBK"),
                "ISO8859_1") + "\""));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        Workbook workbook= FileUtil.createWorkbook("民族错误","民族错误", exportService.exprortNation());
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
    @RequestMapping("/exportNotExist")
    @ResponseBody
    public ResponseEntity exportNotExist()  throws Exception{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\""+new String(("身份证号不存在" + ".xls").getBytes("GBK"),
                "ISO8859_1") + "\""));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        Workbook workbook= FileUtil.createWorkbook("身份证号不存在","身份证号不存在", exportService.exprortNotExist());
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
    @RequestMapping("/exportHouseholType")
    @ResponseBody
    public ResponseEntity exportHouseholType()  throws Exception{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\""+new String(("户类型" + ".xls").getBytes("GBK"),
                "ISO8859_1") + "\""));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        Workbook workbook= FileUtil.createWorkbook("户类型","户类型", exportService.exprorthHouseholType());
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
    @RequestMapping("/exportPersonStatus")
    @ResponseBody
    public ResponseEntity exportPersonStatus()  throws Exception{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\""+new String(("人员状态" + ".xls").getBytes("GBK"),
                "ISO8859_1") + "\""));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        Workbook workbook= FileUtil.createWorkbook("人员状态","人员状态", exportService.exprortPersonStatus());
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
}
