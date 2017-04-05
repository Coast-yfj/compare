package com.fupin.domain;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by luculent on 2017/4/1.
 */
@Entity
@Table(name="pcs")
@ExcelTarget("pcsData")
public class PcsData {
    @Id
    @GeneratedValue
    private  String id;
    @Excel(name="人员状态")
    private  String PERSON_STATUS;
    @Excel(name="户号")
    private  String HOUSEHOLD_NUM;
    @Excel(name="与户主关系")
    private  String RELATION;
    @Excel(name="姓名")
    private  String NAME;
    @Excel(name="公民身份号码")
    private  String IDENTIFICATION_NUMBER;
    @Excel(name="性别")
    private  String SEX;
    @Excel(name="民族")
    private  String NATION;
    @Excel(name="户类型")
    private  String HOUSEHOL_TYPE;
    @Excel(name="出生日期")
    private  String DATE_BIRTH;
    @Excel(name="住址")
    private  String ADDRESS;
    @Excel(name="数据归属单位")
    private  String ATTRIBUTION;

    public PcsData() {
    }

    public PcsData(String PERSON_STATUS, String HOUSEHOLD_NUM, String RELATION, String NAME, String IDENTIFICATION_NUMBER, String SEX, String NATION, String HOUSEHOL_TYPE, String DATE_BIRTH, String ADDRESS, String ATTRIBUTION) {
        this.PERSON_STATUS = PERSON_STATUS;
        this.HOUSEHOLD_NUM = HOUSEHOLD_NUM;
        this.RELATION = RELATION;
        this.NAME = NAME;
        this.IDENTIFICATION_NUMBER = IDENTIFICATION_NUMBER;
        this.SEX = SEX;
        this.NATION = NATION;
        this.HOUSEHOL_TYPE = HOUSEHOL_TYPE;
        this.DATE_BIRTH = DATE_BIRTH;
        this.ADDRESS = ADDRESS;
        this.ATTRIBUTION = ATTRIBUTION;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPERSON_STATUS() {
        return PERSON_STATUS;
    }

    public void setPERSON_STATUS(String PERSON_STATUS) {
        this.PERSON_STATUS = PERSON_STATUS;
    }

    public String getHOUSEHOLD_NUM() {
        return HOUSEHOLD_NUM;
    }

    public void setHOUSEHOLD_NUM(String HOUSEHOLD_NUM) {
        this.HOUSEHOLD_NUM = HOUSEHOLD_NUM;
    }

    public String getRELATION() {
        return RELATION;
    }

    public void setRELATION(String RELATION) {
        this.RELATION = RELATION;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getIDENTIFICATION_NUMBER() {
        return IDENTIFICATION_NUMBER;
    }

    public void setIDENTIFICATION_NUMBER(String IDENTIFICATION_NUMBER) {
        this.IDENTIFICATION_NUMBER = IDENTIFICATION_NUMBER;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getNATION() {
        return NATION;
    }

    public void setNATION(String NATION) {
        this.NATION = NATION;
    }

    public String getHOUSEHOL_TYPE() {
        return HOUSEHOL_TYPE;
    }

    public void setHOUSEHOL_TYPE(String HOUSEHOL_TYPE) {
        this.HOUSEHOL_TYPE = HOUSEHOL_TYPE;
    }

    public String getDATE_BIRTH() {
        return DATE_BIRTH;
    }

    public void setDATE_BIRTH(String DATE_BIRTH) {
        this.DATE_BIRTH = DATE_BIRTH;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getATTRIBUTION() {
        return ATTRIBUTION;
    }

    public void setATTRIBUTION(String ATTRIBUTION) {
        this.ATTRIBUTION = ATTRIBUTION;
    }
}
