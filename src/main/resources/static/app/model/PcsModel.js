/**
 * Created by yue on  2017/3/29 0029.
 */
/**
 * Created by yue on  2017/3/29 0029.
 */
Ext.define("compare.model.PcsModel", {
    extend: "Ext.data.Model",
    fields: [
        { name: 'person_STATUS', type: 'string' },
        { name: 'household_NUM', type: 'string' },
        { name: 'relation', type: 'string' },
        { name: 'name', type: 'string' },
        { name: 'identification_NUMBER', type: 'string' },
        { name: 'sex', type: 'string' },
        { name: 'nation', type: 'string' },
        { name: 'househol_TYPE', type: 'string' },
        { name: 'date_BIRTH', type: 'int' },
        { name: 'address', type: 'string' },
        { name: 'attribution', type: 'string' }
    ]
});