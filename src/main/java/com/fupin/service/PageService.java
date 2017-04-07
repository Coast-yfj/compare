package com.fupin.service;

import com.fupin.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by yue on  2017/4/1 0001.
 */
@Service
public class PageService {

    @Autowired
    private FpbRepository fpbRepository;
    @Autowired
    private PcsRepository pcsRepository;
    //构建PageRequest
    private PageRequest buildPageRequest(int pageNumber, int pagzSize) {
        return new PageRequest(pageNumber , pagzSize, null);
    }

    public Page<FpbData> getFpb(int pageNumber, int pageSize) {
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<FpbData> sourceCodes = this.fpbRepository.findAll(request);
        return sourceCodes;
    }
    public Page<PcsData> getPcs(int pageNumber, int pageSize) {
        Pageable pageable = this.buildPageRequest(pageNumber, pageSize);
        Page<PcsData> sourceCodes = this.pcsRepository.findAll(pageable);
        return sourceCodes;
    }

    public Page<ViewInfo> getName(int pageNumber, int pageSize){
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<ViewInfo> sourceCodes = this.fpbRepository.queryName(request);
        return sourceCodes;
    }
    public Page<ViewInfo> getSex(int pageNumber, int pageSize){
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<ViewInfo> sourceCodes = this.fpbRepository.querySex(request);
        return sourceCodes;
    }
    public Page<ViewInfo> getNation(int pageNumber, int pageSize){
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<ViewInfo> sourceCodes = this.fpbRepository.queryNation(request);
        return sourceCodes;
    }
    public Page<ViewInfo> getHouseholType(int pageNumber, int pageSize){
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<ViewInfo> sourceCodes = this.fpbRepository.queryHouseholType(request);
        return sourceCodes;
    }
    public Page<ViewInfo> getPersonStatus(int pageNumber, int pageSize){
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<ViewInfo> sourceCodes = this.fpbRepository.queryPersonStatus(request);
        return sourceCodes;
    }
    public Page<ViewInfo> getNotexist(int pageNumber, int pageSize){
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<ViewInfo> sourceCodes = this.fpbRepository.queryNotexist(request);
        return sourceCodes;
    }
    public  void  del() throws  Exception{
        this.pcsRepository.deleteAll();
        this.fpbRepository.deleteAll();
    }
}
