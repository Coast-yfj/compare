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

public  List  exprortNotExist() throws Exception{
    List list=new ArrayList();
    list=baseRepository.queryNotexist();
return list;
}
    public  List  exprortName() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryName();

        return list;
    }
    public  List  exprortSex() throws Exception{
        List list=new ArrayList();
        list=baseRepository.querySex();
        return list;
    }
    public  List  exprortNation() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryNation();
        return list;
    }
    public  List  exprorthHouseholType() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryHouseholType();
        return list;

    }
    public  List  exprortPersonStatus() throws Exception{
        List list=new ArrayList();
        list=baseRepository.queryPersonStatus();
        return list;
    }
    public  void exprotAll() throws  Exception{
        FileUtil.writeToFile("身份证号不存在","不存在身份证","数据",this.exprortNotExist());
        FileUtil.writeToFile("姓名错误","姓名错误","数据",this.exprortName());
        FileUtil.writeToFile("性别错误","性别错误","数据",this.exprortSex());
        FileUtil.writeToFile("民族错误","民族错误","数据",this.exprortNation());
        FileUtil.writeToFile("人员状态错误","人员状态错误","数据",this.exprorthHouseholType());
        FileUtil.writeToFile("户类型错误","户类型错误","数据",baseRepository.queryPersonStatus());
    }


}
