/**
 * Created by yue on  2017/3/29 0029.
 */
Ext.define('compare.view.list.FpbGrid', {
    extend: 'Ext.grid.Panel',
    xtype: 'fpbGrid',


    requires: [
        'Ext.toolbar.Paging',
        'compare.store.FpbStore'
    ],

    title: '扶贫办数据',
    width: 650,
    height: 320,

    frame: true,
    store : Ext.create('compare.store.FpbStore'),
    columns: [{
        text: '县(市、区、旗)',
        dataIndex: 'county',
        sortable: true,
        width: 75
    },{
        text: '镇（乡）',
        dataIndex: 'town',
        sortable: true,
        width: 75
    },{
        text: '行政村',
        dataIndex: 'village',
        width: 80,
        sortable: true
    },{
        text: '户编号',
        dataIndex: 'household_NUM',
        width: 80,
        sortable: true
    },{
        text: '人编号',
        dataIndex: 'person_NUMBER',
        width: 80,
        sortable: true
    },{
        text: '姓名',
        dataIndex: 'name',
        width: 80,
        sortable: true
    },{
        text: '性别',
        dataIndex: 'sex',
        width: 80,
        sortable: true
    },{
        text: '证件号码',
        dataIndex: 'identification_NUMBER',
        width: 80,
        sortable: true
    },{
        text: '人数',
        dataIndex: 'num',
        width: 80,
        sortable: true
    },{
        text: '与户主关系',
        dataIndex: 'relation',
        width: 80,
        sortable: true
    },{
        text: '民族',
        dataIndex: 'nation',
        width: 80,
        sortable: true
    },{
        text: '文化程度',
        dataIndex: 'cultural_LEVEL',
        width: 80,
        sortable: true
    },{
        text: '在校生状况',
        dataIndex: 'school_is',
        width: 80,
        sortable: true
    },{
        text: '健康状况',
        dataIndex: 'health_STATUS',
        width: 80,
        sortable: true
    },{
        text: '劳动能力',
        dataIndex: 'labor_ABILITY',
        width: 80,
        sortable: true
    },{
        text: '务工状况',
        dataIndex: 'working_CONDITION',
        width: 80,
        sortable: true
    },{
        text: '务工时间（月）',
        dataIndex: 'working_TIME',
        width: 80,
        sortable: true
    },{
        text: '是否参加新农合',
        dataIndex: 'is_XNH',
        width: 80,
        sortable: true
    },{
        text: '是否参加新型养老保险页面（是否参加新型农村社会养老保险）',
        dataIndex: 'is_XYLBX',
        width: 80,
        sortable: true
    },{
        text: '是否参加城镇职工基本养老保险',
        dataIndex: 'is_CZYLBX',
        width: 80,
        sortable: true
    },{
        text: '脱贫属性',
        dataIndex: 'tpsx',
        width: 80,
        sortable: true
    },{
        text: '贫困户属性',
        dataIndex: 'pkhsx',
        width: 80,
        sortable: true
    },{
        text: '主要致贫原因',
        dataIndex: 'zyzpyy',
        width: 80,
        sortable: true
    },{
        text: '人均纯收入',
        dataIndex: 'rjsr',
        width: 80,
        sortable: true
    },{
        text: '联系电话',
        dataIndex: 'phone',
        width: 80,
        sortable: true
    },{
        text: '开户银行名称',
        dataIndex: 'bankname',
        width: 80,
        sortable: true
    },{
        text: '银行卡号',
        dataIndex: 'bankcard',
        width: 80,
        sortable: true
    }],

    bbar: {
        xtype: 'pagingtoolbar',
        beforePageText:'第',
        afterPageText:'页,共{0}页',
        displayMsg: '当前显示 {0} - {1} 共 {2}条数据',
        emptyMsg: "没有数据",
        displayInfo: true
    }
});
var ExcelForm = Ext.create('Ext.form.Panel', {
    width: 300,
    height: 100,
    id: 'AgencyManage_ExcelForm',
    padding: '35px 20px 20px 20px',
    bodyStyle: { background: '#DFE9F6', border: 0 },
    defaults: {
        allowBlank: false
    },
    items: [{
        xtype: 'filefield',
        id: 'excelfile',
        name: 'selectexcel',
        // fieldLabel: '选择文件',
        labelWidth: 50,
        msgTarget: 'side',
        allowBlank: false,
        anchor: '100%',
        buttonText: '请选择文件',
        listeners: {
            change: 'onuserImportChange'
        }
    }]
});
//导入界面
var AgencyManage_SelectImportWin =new Ext.Window({
    title: 'Excel导入',
    width: 300,
    id: 'AgencyManage_SelectImportWin',
    height: 200,
    layout: {
        type: 'vbox',
        align: 'center'
    },
    modal: true,
    closeAction: 'hide',
    buttonAlign: "center",
    items: ExcelForm,
    buttons: [{
        text: '确定',
        minWidth: 70,
        handler: 'ImportExcel'
    }, {
        text: '取消',
        minWidth: 70,
        handler: 'CloseAgencyManage_SelectImportWin'
    }]
});