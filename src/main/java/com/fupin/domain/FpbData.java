package com.fupin.domain;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by luculent on 2017/3/31.
 */
@Entity
@Table(name="fpb")
@ExcelTarget("fpbData")
public class FpbData implements Serializable  {
    public static final long serialVersionUID = 2233912281609962999L;
    @Id
    @GeneratedValue
    private  int ID;
    @Excel(name="县(市、区、旗)")
    private  String COUNTY;
    @Excel(name="镇(乡)")
    private  String TOWN;
    @Excel(name="行政村")
    private  String VILLAGE;
    @Excel(name="户编号")
    private  String HOUSEHOLD_NUM;
    @Excel(name="人编号")
    private  String PERSON_NUMBER;
    @Excel(name="姓名")
    private  String NAME;
    @Excel(name="性别")
    private  String SEX;
    @Excel(name="证件号码")
    private  String IDENTIFICATION_NUMBER;
    @Excel(name="人数")
    private  String NUM;
    @Excel(name="与户主关系")
    private  String  RELATION;
    @Excel(name="民族")
    private  String NATION;
    @Excel(name="文化程度")
    private  String CULTURAL_LEVEL;
    @Excel(name="在校生状况")
    private  String SCHOOL_IS;
    @Excel(name="健康状况")
    private  String HEALTH_STATUS;
    @Excel(name="劳动能力\n" +
            "页面（劳动技能）")
    private  String LABOR_ABILITY;
    @Excel(name="务工状况")
    private  String WORKING_CONDITION;
    @Excel(name="务工时间（月）")
    private  String WORKING_TIME;
    @Excel(name="是否参加新农合\n" +
            "页面（是否参加新型农村合作医疗）")
    private  String IS_XNH;
    @Excel(name="是否参加新型养老保险\n" +
            "页面（是否参加新型农村社会养老保险）")
    private  String IS_XYLBX;
    @Excel(name="是否参加城镇职工基本养老保险")
    private  String IS_CZYLBX;
    @Excel(name="脱贫属性")
    private  String TPSX;
    @Excel(name="贫困户属性")
    private  String PKHSX;
    @Excel(name="主要致贫原因")
    private  String ZYZPYY;
    @Excel(name="人均纯收入")
    private  String RJSR;
    @Excel(name="联系电话")
    private  String PHONE;
    @Excel(name="开户银行名称")
    private  String BANKNAME;
    @Excel(name="银行卡号")
    private  String BANKCARD;


    @Excel(name="公安姓名")
    private String PNAME;
    @Excel(name="公安性别")
    private String PSEX;
    @Excel(name="公安民族")
    private String PNATION;
    @Excel(name="公安户类型")
    private String HOUSEHOL_TYPE;
    @Excel(name="公安人员状态")
    private String PERSON_STATUS;

    public String getPNAME() {
        return PNAME;
    }

    public void setPNAME(String PNAME) {
        this.PNAME = PNAME;
    }

    public String getPSEX() {
        return PSEX;
    }

    public void setPSEX(String PSEX) {
        this.PSEX = PSEX;
    }

    public String getPNATION() {
        return PNATION;
    }

    public void setPNATION(String PNATION) {
        this.PNATION = PNATION;
    }

    public String getHOUSEHOL_TYPE() {
        return HOUSEHOL_TYPE;
    }

    public void setHOUSEHOL_TYPE(String HOUSEHOL_TYPE) {
        this.HOUSEHOL_TYPE = HOUSEHOL_TYPE;
    }

    public String getPERSON_STATUS() {
        return PERSON_STATUS;
    }

    public void setPERSON_STATUS(String PERSON_STATUS) {
        this.PERSON_STATUS = PERSON_STATUS;
    }

    public FpbData() {
    }

    public FpbData(String COUNTY, String TOWN, String VILLAGE, String HOUSEHOLD_NUM, String PERSON_NUMBER, String NAME, String SEX, String IDENTIFICATION_NUMBER, String NUM, String RELATION, String NATION, String CULTURAL_LEVEL, String SCHOOL_IS, String HEALTH_STATUS, String LABOR_ABILITY, String WORKING_CONDITION, String WORKING_TIME, String IS_XNH, String IS_XYLBX, String IS_CZYLBX, String TPSX, String PKHSX, String ZYZPYY, String RJSR, String PHONE, String BANKNAME, String BANKCARD, String PNAME, String PSEX, String PNATION, String HOUSEHOL_TYPE, String PERSON_STATUS) {
        this.COUNTY = COUNTY;
        this.TOWN = TOWN;
        this.VILLAGE = VILLAGE;
        this.HOUSEHOLD_NUM = HOUSEHOLD_NUM;
        this.PERSON_NUMBER = PERSON_NUMBER;
        this.NAME = NAME;
        this.SEX = SEX;
        this.IDENTIFICATION_NUMBER = IDENTIFICATION_NUMBER;
        this.NUM = NUM;
        this.RELATION = RELATION;
        this.NATION = NATION;
        this.CULTURAL_LEVEL = CULTURAL_LEVEL;
        this.SCHOOL_IS = SCHOOL_IS;
        this.HEALTH_STATUS = HEALTH_STATUS;
        this.LABOR_ABILITY = LABOR_ABILITY;
        this.WORKING_CONDITION = WORKING_CONDITION;
        this.WORKING_TIME = WORKING_TIME;
        this.IS_XNH = IS_XNH;
        this.IS_XYLBX = IS_XYLBX;
        this.IS_CZYLBX = IS_CZYLBX;
        this.TPSX = TPSX;
        this.PKHSX = PKHSX;
        this.ZYZPYY = ZYZPYY;
        this.RJSR = RJSR;
        this.PHONE = PHONE;
        this.BANKNAME = BANKNAME;
        this.BANKCARD = BANKCARD;
        this.PNAME = PNAME;
        this.PSEX = PSEX;
        this.PNATION = PNATION;
        this.HOUSEHOL_TYPE = HOUSEHOL_TYPE;
        this.PERSON_STATUS = PERSON_STATUS;
    }

    public String getCOUNTY() {
        return COUNTY;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCOUNTY(String COUNTY) {
        this.COUNTY = COUNTY;
    }

    public String getTOWN() {
        return TOWN;
    }

    public void setTOWN(String TOWN) {
        this.TOWN = TOWN;
    }

    public String getVILLAGE() {
        return VILLAGE;
    }

    public void setVILLAGE(String VILLAGE) {
        this.VILLAGE = VILLAGE;
    }

    public String getHOUSEHOLD_NUM() {
        return HOUSEHOLD_NUM;
    }

    public void setHOUSEHOLD_NUM(String HOUSEHOLD_NUM) {
        this.HOUSEHOLD_NUM = HOUSEHOLD_NUM;
    }

    public String getPERSON_NUMBER() {
        return PERSON_NUMBER;
    }

    public void setPERSON_NUMBER(String PERSON_NUMBER) {
        this.PERSON_NUMBER = PERSON_NUMBER;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }


    public String getIDENTIFICATION_NUMBER() {
        return IDENTIFICATION_NUMBER;
    }

    public void setIDENTIFICATION_NUMBER(String IDENTIFICATION_NUMBER) {
        this.IDENTIFICATION_NUMBER = IDENTIFICATION_NUMBER;
    }

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    public String getRELATION() {
        return RELATION;
    }

    public void setRELATION(String RELATION) {
        this.RELATION = RELATION;
    }

    public String getNATION() {
        return NATION;
    }

    public void setNATION(String NATION) {
        this.NATION = NATION;
    }

    public String getCULTURAL_LEVEL() {
        return CULTURAL_LEVEL;
    }

    public void setCULTURAL_LEVEL(String CULTURAL_LEVEL) {
        this.CULTURAL_LEVEL = CULTURAL_LEVEL;
    }

    public String getSCHOOL_IS() {
        return SCHOOL_IS;
    }

    public void setSCHOOL_IS(String SCHOOL_IS) {
        this.SCHOOL_IS = SCHOOL_IS;
    }

    public String getHEALTH_STATUS() {
        return HEALTH_STATUS;
    }

    public void setHEALTH_STATUS(String HEALTH_STATUS) {
        this.HEALTH_STATUS = HEALTH_STATUS;
    }

    public String getLABOR_ABILITY() {
        return LABOR_ABILITY;
    }

    public void setLABOR_ABILITY(String LABOR_ABILITY) {
        this.LABOR_ABILITY = LABOR_ABILITY;
    }

    public String getWORKING_CONDITION() {
        return WORKING_CONDITION;
    }

    public void setWORKING_CONDITION(String WORKING_CONDITION) {
        this.WORKING_CONDITION = WORKING_CONDITION;
    }

    public String getWORKING_TIME() {
        return WORKING_TIME;
    }

    public void setWORKING_TIME(String WORKING_TIME) {
        this.WORKING_TIME = WORKING_TIME;
    }

    public String getIS_XNH() {
        return IS_XNH;
    }

    public void setIS_XNH(String IS_XNH) {
        this.IS_XNH = IS_XNH;
    }

    public String getIS_XYLBX() {
        return IS_XYLBX;
    }

    public void setIS_XYLBX(String IS_XYLBX) {
        this.IS_XYLBX = IS_XYLBX;
    }

    public String getIS_CZYLBX() {
        return IS_CZYLBX;
    }

    public void setIS_CZYLBX(String IS_CZYLBX) {
        this.IS_CZYLBX = IS_CZYLBX;
    }

    public String getTPSX() {
        return TPSX;
    }

    public void setTPSX(String TPSX) {
        this.TPSX = TPSX;
    }

    public String getPKHSX() {
        return PKHSX;
    }

    public void setPKHSX(String PKHSX) {
        this.PKHSX = PKHSX;
    }

    public String getZYZPYY() {
        return ZYZPYY;
    }

    public void setZYZPYY(String ZYZPYY) {
        this.ZYZPYY = ZYZPYY;
    }

    public String getRJSR() {
        return RJSR;
    }

    public void setRJSR(String RJSR) {
        this.RJSR = RJSR;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getBANKNAME() {
        return BANKNAME;
    }

    public void setBANKNAME(String BANKNAME) {
        this.BANKNAME = BANKNAME;
    }

    public String getBANKCARD() {
        return BANKCARD;
    }

    public void setBANKCARD(String BANKCARD) {
        this.BANKCARD = BANKCARD;
    }


}
