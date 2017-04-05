/**
 * Created by yue on  2017/3/29 0029.
 */
Ext.define("compare.model.FpbModel", {
    extend: "Ext.data.Model",
    fields: [
        { name: 'county', type: 'string' },
        { name: 'town', type: 'string' },
        { name: 'village', type: 'string' },
        { name: 'household_NUM', type: 'string' },
        { name: 'person_NUMBER', type: 'string' },
        { name: 'name', type: 'string' },
        { name: 'sex', type: 'string' },
        { name: 'identification_NUMBER', type: 'string' },
        { name: 'num', type: 'int' },
        { name: 'relation', type: 'string' },
        { name: 'nation', type: 'string' },
        { name: 'cultural_LEVEL', type: 'string' },
        { name: 'school_IS', type: 'string' },
        { name: 'health_STATUS', type: 'string' },
        { name: 'labor_ABILITY', type: 'string' },
        { name: 'working_CONDITION', type: 'string' },
        { name: 'working_TIME', type: 'string' },
        { name: 'is_XNH', type: 'string' },
        { name: 'is_XYLBX', type: 'string' },
        { name: 'is_CZYLBX', type: 'string' },
        { name: 'tpsx', type: 'string' },
        { name: 'pkhsx', type: 'string' },
        { name: 'zyzpyy', type: 'string' },
        { name: 'rjsr', type: 'string' },
        { name: 'phone', type: 'string' },
        { name: 'bankname', type: 'string' },
        { name: 'bankcard', type: 'string' }
    ]
});