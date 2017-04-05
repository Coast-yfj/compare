package com.fupin.service;

import com.fupin.domain.BaseRepository;
import com.fupin.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yue on  2017/4/2 0002.
 */
@Service
public class ExportService {
@Autowired
  private   BaseRepository baseRepository;

public  void  exprortNotExist() throws Exception{
    List list=new ArrayList();
    list=baseRepository.queryNotexist();
    FileUtil.writeToFile("身份证号不存在","不存在身份证","数据",list);

}
    public  void  exprortName() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryName();
        FileUtil.writeToFile("姓名错误","姓名错误","数据",list);
    }
    public  void  exprortSex() throws Exception{
        List list=new ArrayList();
        list=baseRepository.querySex();
        FileUtil.writeToFile("性别错误","性别错误","数据",list);
    }
    public  void  exprortNation() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryNation();
        FileUtil.writeToFile("民族错误","民族错误","数据",list);
    }
    public  void  exprorthHouseholType() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryHouseholType();
        FileUtil.writeToFile("人员状态错误","人员状态错误","数据",list);
    }
    public  void  exprortPersonStatus() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryPersonStatus();
        FileUtil.writeToFile("户类型错误","户类型错误","数据",baseRepository.queryPersonStatus());
    }

}
