/**
 * This view is an example list of people.
 */
Ext.define('compare.view.list.List', {
    extend: 'Ext.panel.Panel',
    xtype: 'mainlist',

    requires: [
        'Ext.layout.container.VBox',
        'compare.view.list.FpbGrid',
        'compare.view.list.PcsGrid'
    ],

    layout: {
        type: 'vbox',
        pack: 'start',
        align: 'stretch'
    },
    dockedItems : [
        {
            dock: 'top',
            xtype: 'toolbar',
            items: [
                {
                    xtype: 'button',
                    text: '导入扶贫办数据',
                    iconCls: 'add',
                    listeners: {
                        click:'fpbupload'
                    }
                },
                {
                    xtype : 'button',
                    text : '导入派出所数据',
                    iconCls : 'add',
                    handler : function() {
                        Pcsdata_SelectImportWin.show();
                    }},
                {
                    // 分隔符，不解释。
                    xtype : 'tbseparator'
                },
                {
                    xtype : 'button',
                    text : '一键导出数据',
                    iconCls : 'add',
                    handler : 'Export'
                    },
                {
                    xtype : 'button',
                    text : '清除数据',
                    iconCls : 'add',
                    handler : 'delete'
                }

            ]
        }
    ],
    items: [
        {
            xtype: 'fpbGrid',
            text: '扶贫办数据',
            height: 400,
            collapsible: true,
            margin: '0 0 10 0'
        },
        {
            xtype: 'pcsGrid',
            title: '派出所数据',
            height: 400,
            collapsible: true,
            margin: '0 0 10 0'
        }

    ]

});

