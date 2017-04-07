package com.fupin.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luculent on 2017/3/31.
 */
@Repository
public interface FpbRepository extends PagingAndSortingRepository<FpbData,Long> {

    @Query(value = "select  new  com.fupin.domain.ViewInfo(f,p) from    com.fupin.domain.FpbData  f," +
            "com.fupin.domain.PcsData   p where p.IDENTIFICATION_NUMBER =substring (f.IDENTIFICATION_NUMBER,0,18)  and not(p.NAME=f.NAME) ")
    public Page<ViewInfo> queryName(Pageable pageable)  ;

    @Query(value = "select  new  com.fupin.domain.ViewInfo(f,p) from    com.fupin.domain.FpbData  f," +
            "com.fupin.domain.PcsData   p where p.IDENTIFICATION_NUMBER =substring (f.IDENTIFICATION_NUMBER,0,18)  and not(p.SEX=f.SEX) ")
    public Page<ViewInfo> querySex(Pageable pageable) ;

    @Query(value = "select  new  com.fupin.domain.ViewInfo(f,p) from    com.fupin.domain.FpbData  f," +
            "com.fupin.domain.PcsData   p where p.IDENTIFICATION_NUMBER =substring (f.IDENTIFICATION_NUMBER,0,18)  and not(p.NATION=f.NATION) ")
    public Page<ViewInfo> queryNation(Pageable pageable)  ;

    @Query(value = "select  new  com.fupin.domain.ViewInfo(f,p) from    com.fupin.domain.FpbData  f," +
            "com.fupin.domain.PcsData   p where p.IDENTIFICATION_NUMBER =substring (f.IDENTIFICATION_NUMBER,0,18)   and p.PERSON_STATUS in ('死亡','迁出（离开）本地') ")
    public Page<ViewInfo> queryPersonStatus(Pageable pageable);

    @Query(value = "select  new  com.fupin.domain.ViewInfo(f,p) from    com.fupin.domain.FpbData  f," +
            "com.fupin.domain.PcsData   p where p.IDENTIFICATION_NUMBER =substring (f.IDENTIFICATION_NUMBER,0,18)   and p.HOUSEHOL_TYPE='非农业家庭户口' ")
    public Page<ViewInfo> queryHouseholType(Pageable pageable);

    @Query("select  f from FpbData f WHERE  not exists" +
            " (SELECT  p.IDENTIFICATION_NUMBER from PcsData p WHERE  p.IDENTIFICATION_NUMBER=substring(f.IDENTIFICATION_NUMBER,0,18))")
    public Page<FpbData> queryNotexist(Pageable pageable);
}
