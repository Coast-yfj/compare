package com.fupin.domain;

import java.util.List;

/**
 * Created by yue on  2017/4/2 0002.
 */

public interface BaseRepository {

    /**
     * 查询不存在的数据
     * @param
     * @param
     * @return
     * @throws Exception
     */
    public List queryNotexist() throws Exception;

    /**
     * 查询名字错误
     * @return
     * @throws Exception
     */
    public List queryName() throws Exception;

    /**
     * 查询性别错误
     * @return
     * @throws Exception
     */
    public List querySex() throws Exception;

    /**
     * 查询民族错误
     * @return
     * @throws Exception
     */
    public List queryNation() throws Exception;

    /**
     * 查询错误的人员状态
     * @return
     * @throws Exception
     */
    public List queryPersonStatus() throws Exception;

    /**
     * 查询非农户类型
     * @return
     * @throws Exception
     */
    public List queryHouseholType() throws Exception;

}
