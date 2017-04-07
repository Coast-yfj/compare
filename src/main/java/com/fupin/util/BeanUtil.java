package com.fupin.util;

import com.fupin.domain.FpbData;
import com.fupin.domain.PcsData;
import com.fupin.domain.ViewInfo;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yue on  2017/4/7 0007.
 */
public class BeanUtil
{
    public  static List<FpbData> AssemblyUtil(Page<ViewInfo> page){

        List relist=new ArrayList();
       List<ViewInfo> list=page.getContent();
        for (ViewInfo vi:list) {
       FpbData fpbData= vi.getFpbData();
       PcsData pcsData= vi.getPcsData();
       fpbData.setPSEX(pcsData.getSEX());
       fpbData.setPNAME(pcsData.getNAME());
       fpbData.setPNATION(pcsData.getNATION());
       fpbData.setHOUSEHOL_TYPE(pcsData.getHOUSEHOL_TYPE());
       fpbData.setPERSON_STATUS(pcsData.getPERSON_STATUS());
            relist.add(fpbData);
        }
     return relist;
    }
}
