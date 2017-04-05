package com.fupin.web;

import com.fupin.service.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
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
            exportService.exprorthHouseholType();
            exportService.exprortName();
            exportService.exprortNation();
            exportService.exprortSex();
            exportService.exprortPersonStatus();
            exportService.exprortNotExist();
            map.put("success","true");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success","false");
        }
        return map;
    }
}
