/**
 * This class is the controller for the main view for the application. It is specified as
 * the "controller" of the Main view class.
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('compare.view.main.MainController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.main',

    fpbupload: function () {
        AgencyManage_SelectImportWin.show();
    },

//关闭导入界面
    CloseAgencyManage_SelectImportWin: function () {
        AgencyManage_SelectImportWin.hide();
    },

//验证导入文件的格式
    onuserImportChange: function () {
        var filenPath = Ext.getCmp("excelfile").getValue();
        fileExtension = filenPath.substring(filenPath.lastIndexOf('.')).toLowerCase();
        if (fileExtension != ".xls" && fileExtension != ".xlsx") {
            Ext.Msg.show({
                title: '警告',
                msg: '选择的文件必须是xls格式的',
                buttons: '确定'
            });
        }
    },
    //验证导入文件的格式
    pcsImportChange: function () {
        var filenPath = Ext.getCmp("pcsexcelfile").getValue();
        fileExtension = filenPath.substring(filenPath.lastIndexOf('.')).toLowerCase();
        if (fileExtension != ".xls" && fileExtension != ".xlsx") {
            Ext.Msg.show({
                title: '警告',
                msg: '选择的文件必须是xls格式的',
                buttons: '确定'
            });
        }
    },
//导入Excel文件
    ImportExcel: function () {
        var excelForm = Ext.getCmp('AgencyManage_ExcelForm').getForm();
        if (excelForm.isValid) {
            excelForm.submit({
                url: '/upload/fpb',
                method: 'POST',
                waitMsg: '正在导入',
                success: function (fp, o) {
                    Ext.Msg.alert('成功', '导入成功');
                    Ext.getCmp('AgencyManage_SelectImportWin').hide();
                    Ext.widget('mainlist').items.items[0].store.reload();
                },
                failure: function(response, o) {
                    Ext.Msg.alert('错误', '导入失败请检查文件');
                    Ext.getCmp('AgencyManage_SelectImportWin').hide();
                    Ext.widget('mainlist').items.items[0].store.reload();
                }
            })
        }},
    ImportPcsExcel: function (grid) {
        var excelForm = Ext.getCmp('PcsManage_ExcelForm').getForm();

        if (excelForm.isValid) {
            excelForm.submit({
                url: '/upload/pcs',
                method: 'POST',
                waitMsg: '正在导入',
                success: function (fp, o) {
                    Ext.Msg.alert('成功', '导入成功');
                    Ext.getCmp('Pcsdata_SelectImportWin').hide();
                    Ext.widget('mainlist').items.items[1].store.reload();

                },
                failure: function(response, o) {
                    Ext.Msg.alert('错误', '导入失败请检查文件');
                    Ext.getCmp('Pcsdata_SelectImportWin').hide();
                    Ext.widget('mainlist').items.items[1].store.reload();
                }
            })
        }},
    //关闭导入界面
    ClosePcs_SelectImportWin: function () {
        Pcsdata_SelectImportWin.hide();
    },

    Export: function () {

        Ext.Ajax.request({
            url: '/export',

            success: function(response, opts) {
                Ext.Msg.alert('成功', '导出成功文件在C盘fpb文件夹下');
            },

            failure: function(response, opts) {
                Ext.Msg.alert('错误', '导出失败');
            }
        });
    },
    delete:function () {
        Ext.Ajax.request({
            url: '/delete',

            success: function(response, opts) {
                Ext.Msg.alert('成功', '清除数据成功');
                Ext.widget('mainlist').items.items[0].store.reload();
                Ext.widget('mainlist').items.items[1].store.reload();
            },

            failure: function(response, opts) {
                Ext.Msg.alert('错误', '清除数据成功失败');
                Ext.widget('mainlist').items.items[0].store.reload();
                Ext.widget('mainlist').items.items[1].store.reload();
            }
        });
    },
    onMenuClick: function (tabs, newTab, oldTab) {
        if(newTab.title=='户类型不对'){
            Ext.widget('mainHouseholType').store.reload();
        } else  if(newTab.title=='不存在的数据'){
            Ext.widget('mainNotExist').store.reload();
        }else  if(newTab.title=='姓名错误'){
            Ext.widget('mainName').store.reload();
        }else  if(newTab.title=='民族错误'){
            Ext.widget('mainNation').store.reload();
        }else  if(newTab.title=='性别错误'){
            Ext.widget('mainSex').store.reload();
        }else  if(newTab.title=='人员类型不对'){
            Ext.widget('mainPersonStatus').store.reload();
        }
    }
});
