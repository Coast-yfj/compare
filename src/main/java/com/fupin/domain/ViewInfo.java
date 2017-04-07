package com.fupin.domain;

import java.io.Serializable;

/**
 * Created by luculent on 2017/4/7.
 */

public class ViewInfo implements Serializable {

    private  FpbData fpbData;
    private  PcsData pcsData;

    public ViewInfo(FpbData fpbData, PcsData pcsData) {
        this.fpbData = fpbData;
        this.pcsData = pcsData;
    }

    public ViewInfo() {
    }

}
