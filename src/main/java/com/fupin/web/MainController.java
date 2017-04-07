package com.fupin.web;

import com.fupin.domain.FpbData;
import com.fupin.domain.PcsData;
import com.fupin.domain.ViewInfo;
import com.fupin.service.PageService;
import com.fupin.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yue on  2017/3/29 0029.
 */
@Controller
public class MainController {

    @Autowired
    private PageService pageService;

    @RequestMapping("/")
    public  String  index(){
        return "index";
    }


    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public Map<String,ArrayList> findAll(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
        Page<FpbData> fpbDatas=pageService.getFpb(page,limit);
        map.put("totalRecord",fpbDatas.getTotalElements());
        map.put("data",fpbDatas.getContent());
        return map;
    }
    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findPcsAll")
    @ResponseBody
    public Map<String,ArrayList> findPcsAll(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
        Page<PcsData> pcsDatas=pageService.getPcs(page,limit);
        map.put("totalRecord",pcsDatas.getTotalElements());
        map.put("data",pcsDatas.getContent());
        return map;
    }
    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAllName")
    @ResponseBody
    public Map<String,ArrayList> findNameAll(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
       Page<ViewInfo> pcsDatas=pageService.getName(page,limit);
        map.put("totalRecord",pcsDatas.getTotalElements());
        map.put("data", BeanUtil.AssemblyUtil(pcsDatas));
        return map;
    }
    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAllSex")
    @ResponseBody
    public Map<String,ArrayList> findSexAll(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
        Page<ViewInfo> pcsDatas=pageService.getSex(page,limit);
        map.put("totalRecord",pcsDatas.getTotalElements());
        map.put("data",BeanUtil.AssemblyUtil(pcsDatas));
        return map;
    }
    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAllNation")
    @ResponseBody
    public Map<String,ArrayList> findNationAll(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
        Page<ViewInfo> pcsDatas=pageService.getNation(page,limit);
        map.put("totalRecord",pcsDatas.getTotalElements());
        map.put("data",BeanUtil.AssemblyUtil(pcsDatas));
        return map;
    }
    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAllHouseholType")
    @ResponseBody
    public Map<String,ArrayList> HouseholType(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
        Page<ViewInfo> pcsDatas=pageService.getHouseholType(page,limit);
        map.put("totalRecord",pcsDatas.getTotalElements());
        map.put("data",BeanUtil.AssemblyUtil(pcsDatas));
        return map;
    }
    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAllPersonStatus")
    @ResponseBody
    public Map<String,ArrayList> findPersonStatusAll(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
        Page<ViewInfo> pcsDatas=pageService.getPersonStatus(page,limit);
        map.put("totalRecord",pcsDatas.getTotalElements());
        map.put("data",BeanUtil.AssemblyUtil(pcsDatas));
        return map;
    }
    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAllNotexist")
    @ResponseBody
    public Map<String,ArrayList> findNotexistAll(int start, int limit,int page){
        // 内存数据库操作
        Map map =new HashMap<String,FpbData>();
        Page<FpbData> pcsDatas=pageService.getNotexist(page,limit);
        map.put("totalRecord",pcsDatas.getTotalElements());
        map.put("data",pcsDatas.getContent());
        return map;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Map  delete(){
        Map map=new HashMap<>();
        try {
            pageService.del();
            map.put("success","true");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success","false");
        }
        return map;
    }
}
