package com.fupin.web;

import com.fupin.service.ExportService;
import com.fupin.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    return FileUtil.downFile("姓名错误", exportService.exprortName());
    }
    @RequestMapping("/exportSex")
    @ResponseBody
    public ResponseEntity exportSex()  throws Exception{
        return FileUtil.downFile("性别错误", exportService.exprortSex());
    }
    @RequestMapping("/exportNation")
    @ResponseBody
    public ResponseEntity exportNation()  throws Exception{

        return FileUtil.downFile("民族错误", exportService.exprortNation());
    }
    @RequestMapping("/exportNotExist")
    @ResponseBody
    public ResponseEntity exportNotExist()  throws Exception{

        return FileUtil.downFile("身份证号不存在", exportService.exprortNotExist());
    }
    @RequestMapping("/exportHouseholType")
    @ResponseBody
    public ResponseEntity exportHouseholType()  throws Exception{

        return FileUtil.downFile("户类型", exportService.exprorthHouseholType());
    }
    @RequestMapping("/exportPersonStatus")
    @ResponseBody
    public ResponseEntity exportPersonStatus()  throws Exception{

        return FileUtil.downFile("人员状态", exportService.exprortPersonStatus());
    }
}
