package com.rdc;
import java.util.HashMap;
import java.util.Map;

import com.rdc.entity.AddlCtryData;
import com.rdc.entity.Custmain;
import com.rdc.entity.Custmain_ext;
import com.rdc.entity.External_CUST_IDS;
import com.rdc.entity.External_id;
import com.rdc.entity.Firmographics;
import com.rdc.entity.Internal_id;
import com.rdc.entity.KDUNS_NEW;
import com.rdc.entity.KNA1;
import com.rdc.entity.KNA1PK;
import com.rdc.entity.KNB1;
import com.rdc.entity.KNVK;
import com.rdc.entity.KNVL;
import com.rdc.entity.KNVL_EXT;
import com.rdc.entity.KNVV;
import com.rdc.entity.KNVV_EXT;
import com.rdc.entity.KUNNR_EXT;
import com.rdc.entity.Kna1AddlBilling;
import com.rdc.entity.LOCAL_LANG_ADDR;
import com.rdc.entity.LOCAL_LANG_NAME;
import com.rdc.entity.LOCNADDR;
import com.rdc.entity.LOCNMAIN;
import com.rdc.entity.LOCNNAME;
import com.rdc.entity.LOCN_IDS;
import com.rdc.entity.SADR;
import com.rdc.entity.STXH;
import com.rdc.entity.STXL;
import com.rdc.entity.US_COMPANY;
import com.rdc.entity.US_ENTERPRISE;
import com.rdc.entity.US_GEM_TRANS;

public class PojoRegistry {
    private static final Map<String, Class<?>> pojoMap = new HashMap<>();

    static {
        pojoMap.put("CUSTMAIN", Custmain.class);
        pojoMap.put("CUSTMAIN_EXT", Custmain_ext.class);
        pojoMap.put("INTERNAL_ID", Internal_id.class);
        pojoMap.put("EXTERNAL_ID", External_id.class);
        pojoMap.put("FIRMOGRAPHICS", Firmographics.class);
        pojoMap.put("LOCNNAME", LOCNNAME.class);
        pojoMap.put("LOCNMAIN", LOCNMAIN.class);
        pojoMap.put("LOCNADDR", LOCNADDR.class);
        pojoMap.put("LOCN_IDS", LOCN_IDS.class);
        pojoMap.put("KNA1",KNA1.class);
        pojoMap.put("KUNNR_EXT",KUNNR_EXT.class);
        pojoMap.put("KNVV",KNVV.class);
        pojoMap.put("KNVL",KNVL.class);
        pojoMap.put("KNA1_ADDL_BILLING",Kna1AddlBilling.class);
        pojoMap.put("ADDLCTRYDATA",AddlCtryData.class);
        pojoMap.put("KNB1",KNB1.class);
        pojoMap.put("KNVL_EXT",KNVL_EXT.class);
        pojoMap.put("KNVV_EXT",KNVV_EXT.class);
        pojoMap.put("US_COMPANY",US_COMPANY.class);
        pojoMap.put("US_ENTERPRISE",US_ENTERPRISE.class);
        pojoMap.put("US_GEM_TRANS",US_GEM_TRANS.class);
        //pojoMap.put("KNVL_EXT",KNVL_EXT.class);
        pojoMap.put("KNVK",KNVK.class);
        pojoMap.put("KDUNS_NEW",KDUNS_NEW.class);
        pojoMap.put("SADR",SADR.class);
        pojoMap.put("STXL",STXL.class);
        pojoMap.put("STXH",STXH.class);
        pojoMap.put("EXTERNAL_CUST_IDS",External_CUST_IDS.class);
        pojoMap.put("LOCAL_LANG_NAME",LOCAL_LANG_NAME.class);
        pojoMap.put("LOCAL_LANG_ADDR",LOCAL_LANG_ADDR.class);
        pojoMap.put("KNA1PK",KNA1PK.class);
        pojoMap.put("KNA1PK",KNA1PK.class);
        //pojoMap.put("KNA1PK",SiteLegacy.class);
        
    }

    public static Class<?> getPojoClass(String key) {
        return pojoMap.get(key);
    }
}