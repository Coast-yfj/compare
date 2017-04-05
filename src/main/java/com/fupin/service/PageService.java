package com.fupin.service;

import com.fupin.domain.FpbData;
import com.fupin.domain.FpbRepository;
import com.fupin.domain.PcsData;
import com.fupin.domain.PcsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
        PageRequest request = this.buildPageRequest(pageNumber, pageSize);
        Page<PcsData> sourceCodes = this.pcsRepository.findAll(request);
        return sourceCodes;
    }

    public  void  del() throws  Exception{
        this.pcsRepository.deleteAll();
        this.fpbRepository.deleteAll();
    }
}
