/**
 * Created by luculent on 2017/4/1.
 */
/**
 * Created by luculent on 2017/3/30.
 */
Ext.define("compare.store.PcsStore", {
    extend: 'Ext.data.Store',
    id: 'store.pcsStore',
    model: "compare.model.PcsModel",

    proxy : new Ext.data.HttpProxy({
        type : 'ajax',
        url : '/findPcsAll',
        actionMethods : {
            read : 'POST' // Store设置请求的方法，与Ajax请求有区别
        },
        reader : new Ext.data.JsonReader({
            type : 'json',
            rootProperty : 'data',// 数据(不配置的话无法接收数据)，返回的key为data
            totalProperty : 'totalRecord'// 记录数(不配置的话无法翻页)，返回的key为totalRecord
        })
    }),
    autoLoad: true
});
