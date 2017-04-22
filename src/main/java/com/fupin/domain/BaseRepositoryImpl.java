package com.fupin.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by yue on  2017/4/2 0002.
 */
@Repository
public class BaseRepositoryImpl implements  BaseRepository {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public List queryNotexist() throws Exception {

        String sql="select  * from fpb f WHERE  not EXISTS" +
                " (SELECT  1 from pcs p WHERE  p.IDENTIFICATION_NUMBER=substr(f.IDENTIFICATION_NUMBER,0,18))";
        entityManager.clear();
        return entityManager.createNativeQuery(sql,FpbData.class).getResultList();
    }

    @Override
    public List queryName() throws Exception {

        String sql="SELECT f.ID ,f.XH,f.COUNTY  ,f.TOWN ,f.VILLAGE ,f.HOUSEHOLD_NUM ,f.PERSON_NUMBER, f.NAME ,f.SEX ,f.IDENTIFICATION_NUMBER ,f.NUM ,f.RELATION ,f.NATION ,f.CULTURAL_LEVEL ,f.SCHOOL_IS\n" +
                " ,f.HEALTH_STATUS ,f.LABOR_ABILITY ,f.WORKING_CONDITION ,f.WORKING_TIME\n" +
                " ,f.IS_XNH ,f.IS_XYLBX ,f.IS_CZYLBX ,f.TPSX ,f.PKHSX ,f.ZYZPYY ,f.RJSR ,f.PHONE ,f.BANKNAME  ,f.PSEX ,f.PNATION ,f.HOUSEHOL_TYPE ,f.PERSON_STATUS ,f.BANKCARD ,p.name as pname FROM FPB  f,pcs p where " +
                "p.IDENTIFICATION_NUMBER=substr(f.IDENTIFICATION_NUMBER,0,18) and f.name!=p.name";
        entityManager.clear();
        return  entityManager.createNativeQuery(sql,FpbData.class).getResultList();

    }

    @Override
    public List querySex() throws Exception {

        String sql="SELECT  f.ID,f.XH,f.COUNTY  ,f.TOWN ,f.VILLAGE ,f.HOUSEHOLD_NUM ,f.PERSON_NUMBER, f.NAME ,f.SEX ,f.IDENTIFICATION_NUMBER ,f.NUM, f.RELATION ,f.NATION ,f.CULTURAL_LEVEL ,f.SCHOOL_IS\n" +
                " ,f.HEALTH_STATUS ,f.LABOR_ABILITY ,f.WORKING_CONDITION ,f.WORKING_TIME\n" +
                " ,f.IS_XNH ,f.IS_XYLBX ,f.IS_CZYLBX ,f.TPSX ,f.PKHSX ,f.ZYZPYY ,f.RJSR ,f.PHONE ,f.BANKNAME ,f.PNAME  ,f.PNATION ,f.HOUSEHOL_TYPE ,f.PERSON_STATUS ,f.BANKCARD,p.sex as psex  FROM FPB  f,pcs p where " +
                "p.IDENTIFICATION_NUMBER=substr(f.IDENTIFICATION_NUMBER,0,18) and f.sex!=p.sex";
        entityManager.clear();
        return entityManager.createNativeQuery(sql,FpbData.class).getResultList();
    }

    @Override
    public List queryNation() throws Exception {

        String sql="SELECT f.ID ,f.XH,f.COUNTY  ,f.TOWN ,f.VILLAGE ,f.HOUSEHOLD_NUM ,f.PERSON_NUMBER, f.NAME ,f.SEX ,f.IDENTIFICATION_NUMBER ,f.NUM ,f.RELATION ,f.NATION ,f.CULTURAL_LEVEL ,f.SCHOOL_IS\n" +
                " ,f.HEALTH_STATUS ,f.LABOR_ABILITY ,f.WORKING_CONDITION ,f.WORKING_TIME\n" +
                " ,f.IS_XNH ,f.IS_XYLBX ,f.IS_CZYLBX ,f.TPSX ,f.PKHSX ,f.ZYZPYY ,f.RJSR ,f.PHONE ,f.BANKNAME ,f.PNAME ,f.PSEX  ,f.HOUSEHOL_TYPE ,f.PERSON_STATUS ,f.BANKCARD,p.nation as pnation  FROM FPB  f,pcs p where " +
                "p.IDENTIFICATION_NUMBER=substr(f.IDENTIFICATION_NUMBER,0,18) and f.nation!=p.nation";
        entityManager.clear();
        return  entityManager.createNativeQuery(sql,FpbData.class).getResultList();
    }

    @Override
    public List queryPersonStatus() throws Exception {
        String sql="SELECT  f.ID ,f.XH,f.COUNTY  ,f.TOWN ,f.VILLAGE ,f.HOUSEHOLD_NUM ,f.PERSON_NUMBER, f.NAME ,f.SEX ,f.IDENTIFICATION_NUMBER ,f.NUM, f.RELATION ,f.NATION ,f.CULTURAL_LEVEL ,f.SCHOOL_IS\n" +
                " ,f.HEALTH_STATUS ,f.LABOR_ABILITY ,f.WORKING_CONDITION ,f.WORKING_TIME\n" +
                " ,f.IS_XNH ,f.IS_XYLBX ,f.IS_CZYLBX ,f.TPSX ,f.PKHSX ,f.ZYZPYY ,f.RJSR ,f.PHONE ,f.BANKNAME ,f.PNAME ,f.PSEX ,f.PNATION ,f.HOUSEHOL_TYPE  ,f.BANKCARD,p.person_status FROM FPB  f,pcs p where " +
                "p.IDENTIFICATION_NUMBER=substr(f.IDENTIFICATION_NUMBER,0,18) and p.PERSON_STATUS in ('死亡','迁出（离开）本地')";
        entityManager.clear();
        return entityManager.createNativeQuery(sql,FpbData.class).getResultList();
    }

    @Override
    public List queryHouseholType() throws Exception {
        String sql="SELECT  f.ID, f.XH,f.COUNTY  ,f.TOWN ,f.VILLAGE ,f.HOUSEHOLD_NUM ,f.PERSON_NUMBER, f.NAME ,f.SEX ,f.IDENTIFICATION_NUMBER ,f.NUM ,f.RELATION ,f.NATION ,f.CULTURAL_LEVEL ,f.SCHOOL_IS\n" +
                " ,f.HEALTH_STATUS ,f.LABOR_ABILITY ,f.WORKING_CONDITION ,f.WORKING_TIME\n" +
                " ,f.IS_XNH ,f.IS_XYLBX ,f.IS_CZYLBX ,f.TPSX ,f.PKHSX ,f.ZYZPYY ,f.RJSR ,f.PHONE ,f.BANKNAME ,f.PNAME ,f.PSEX ,f.PNATION , f.PERSON_STATUS ,f.BANKCARD,p.househol_type  FROM FPB  f,pcs p where " +
                "p.IDENTIFICATION_NUMBER=substr(f.IDENTIFICATION_NUMBER,0,18) and p.HOUSEHOL_TYPE='非农业家庭户口'";
        entityManager.clear();
        return entityManager.createNativeQuery(sql,FpbData.class).getResultList();
    }


}


