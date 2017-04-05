/**
 * Created by yue on  2017/3/29 0029.
 */
Ext.define('compare.view.list.PcsGrid',{
    extend: 'Ext.grid.Panel',

    xtype: 'pcsGrid',

    requires: [
        'Ext.toolbar.Paging',
        'compare.store.PcsStore'
        //  'Ext.ux.ProgressBarPager'
    ],
    title: '派出所数据',
    width: 650,
    height: 320,

    frame: true,
    store : Ext.create('compare.store.PcsStore'),
    columns: [{
        text: '人员状态',
        dataIndex: 'person_STATUS',
        sortable: true,
        width: 75
    },{
        text: '户号',
        dataIndex: 'household_NUM',
        sortable: true,
        width: 75
    },{
        text: '与户主关系',
        dataIndex: 'relation',
        sortable: true,
        width: 105
    },{
        text: '姓名',
        dataIndex: 'name',
        sortable: true,
        width: 75
    },{
        text: '公民身份证号',
        dataIndex: 'identification_NUMBER',
        sortable: true,
        width: 105
    },{
        text: '性别',
        dataIndex: 'sex',
        sortable: true,
        width: 75
    },{
        text: '民族',
        dataIndex: 'nation',
        sortable: true,
        width: 75
    },{
        text: '户类型',
        dataIndex: 'househol_TYPE',
        sortable: true,
        width: 85
    },{
        text: '出生日期',
        dataIndex: 'date_BIRTH',
        sortable: true,
        width: 85
    },{
        text: '住址',
        dataIndex: 'address',
        sortable: true,
        width: 75
    },{
        text: '数据所属单位',
        dataIndex: 'attribution',
        sortable: true,
        width: 105
    }
    ],
    bbar: {
        xtype: 'pagingtoolbar',
        displayInfo: true
        // plugins: Ext.create('Ext.ux.ProgressBarPager', {})
    }

});
var PcsExcelForm = Ext.create('Ext.form.Panel', {
    width: 300,
    height: 100,
    id: 'PcsManage_ExcelForm',
    padding: '35px 20px 20px 20px',
    bodyStyle: { background: '#DFE9F6', border: 0 },
    defaults: {
        allowBlank: false
    },
    items: [{
        xtype: 'filefield',
        id: 'pcsexcelfile',
        name: 'pcsselectexcel',
        // fieldLabel: '选择文件',
        labelWidth: 50,
        msgTarget: 'side',
        allowBlank: false,
        anchor: '100%',
        buttonText: '请选择文件',
        listeners: {
            change: 'pcsImportChange'
        }
    }]
});
//导入界面
var Pcsdata_SelectImportWin =new Ext.Window({
    title: 'Excel导入',
    width: 300,
    id: 'Pcsdata_SelectImportWin',
    height: 200,
    layout: {
        type: 'vbox',
        align: 'center'
    },
    modal: true,
    closeAction: 'hide',
    buttonAlign: "center",
    items: PcsExcelForm,
    buttons: [{
        text: '确定',
        minWidth: 70,
        handler: 'ImportPcsExcel'
    }, {
        text: '取消',
        minWidth: 70,
        handler: 'ClosePcs_SelectImportWin'
    }]
});