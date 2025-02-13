package com.rdc;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.rdc.entity.AddlCtryData;
import com.rdc.entity.External_CUST_IDS;
import com.rdc.entity.KDUNS_NEW;
import com.rdc.entity.KNA1;
import com.rdc.entity.KNB1;
import com.rdc.entity.KNVK;
import com.rdc.entity.KNVL;
import com.rdc.entity.KNVL_EXT;
import com.rdc.entity.KNVV;
import com.rdc.entity.KNVV_EXT;
import com.rdc.entity.KUNNR_EXT;
import com.rdc.entity.Kna1AddlBilling;
import com.rdc.entity.SADR;
import com.rdc.entity.STXH;
import com.rdc.entity.STXL;
import com.rdc.entity.US_COMPANY;
import com.rdc.entity.US_ENTERPRISE;
import com.rdc.entity.US_GEM_TRANS;

public class PojoInvoker {

    public static Object invokeGetter(String pojoIdentifier, String fieldName,Object pojoObject) {
        try {
            // Get the POJO class based on the identifier
            Class<?> pojoClass = PojoRegistry.getPojoClass(pojoIdentifier);
            if (pojoClass == null) {
                System.out.println("POJO class not found for identifier: " + pojoIdentifier);
                return null;
            }

            // Create an instance of the POJO class
            Object pojoInstance = pojoClass.getDeclaredConstructor().newInstance();
            pojoInstance =  pojoObject; 

            // Find the getter method for the field name
            String getterMethodName = "get" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1).toLowerCase();
			/*
			 * Method getterMethod = Arrays.stream(pojoClass.getMethods()) .filter(method ->
			 * method.getName().equals(getterMethodName)) .findFirst() .orElse(null);
			 */
            Method getterMethod = Arrays.stream(pojoClass.getMethods())
            	    .filter(method -> {
            	        String methodName = method.getName();
            	        if (methodName.startsWith("get") && methodName.length() > 3) {
            	            String propertyName = methodName.substring(3);
            	            // Capitalize first letter and make the rest lowercase
            	            String formattedName = "get"+Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1).toLowerCase();
            	            return formattedName.equals(getterMethodName);
            	        }
            	        return false;
            	    })
            	    .findFirst()
            	    .orElse(null); 
            	        

            if (getterMethod == null) {
                System.out.println("Getter method for field \"" + fieldName + "\" not found.");
                return null;
            }

            // Call the getter method
            Object result = getterMethod.invoke(pojoInstance);

            // Print the result
            System.out.println("Result from getter method \"" + getterMethodName + "\": " + result);
            return result;
            

        } catch (Exception e) {
            e.printStackTrace();
            return e;
        }
		
    }
    
    public static Object invokeSetter(String pojoIdentifier, String fieldName, Object value,Object classObj) {
    	//Object pojoInstance = new Object();
    	//Object value1 = value.toString();
    	Object pojoClass = null;
    	if(value != null && value.equals("")) {
    		return classObj;
    	}
    	
        try {
        	
            // Get the POJO class based on the identifier
            //Class<?> pojoClass = PojoRegistry.getPojoClass(pojoIdentifier);
			/*
			 * if (pojoClass == null) {
			 * System.out.println("POJO class not found for identifier: " + pojoIdentifier);
			 * throw new Exception("POJO class not found for identifier: " +
			 * pojoIdentifier); }
			 */

            // Create an instance of the POJO class
            // pojoInstance = pojoClass.getDeclaredConstructor().newInstance();
             
             //pojoInstance = classObj;

            // Find the setter method for the field name
        	switch(pojoIdentifier) {
        	case "ADDLCTRYDATA":
        		pojoClass = AddlCtryData.class.cast(classObj);
       		 break;
        	
        	case "KNA1":
        		 pojoClass = KNA1.class.cast(classObj);
        		 break;
        		
        	case "KNA1_ADDL_BILLING":	
        		 pojoClass = Kna1AddlBilling.class.cast(classObj);
        		 break;
        		 
        	case "KNB1":
        		pojoClass = KNB1.class.cast(classObj);
       		 	break;
       		 	
        	case "KUNNR_EXT":
	       		 pojoClass = KUNNR_EXT.class.cast(classObj);
	    		 break;
    		 
        	case "KDUNS_NEW":
          		 pojoClass = KDUNS_NEW.class.cast(classObj);
          		 break;
        	
        	case "KNVK":
         		 pojoClass = KNVK.class.cast(classObj);
         		 break;
      		 
        	case "KNVL":
        		 pojoClass = KNVL.class.cast(classObj);
        		 break;
     		 
        	case "KNVL_EXT":
        		 pojoClass = KNVL_EXT.class.cast(classObj);
        		 break;
     		 
        	case "KNVV":
       		 	pojoClass = KNVV.class.cast(classObj);
       		 	break;
    		 
        	case "KNVV_EXT":
          		 pojoClass = KNVV_EXT.class.cast(classObj);
          		 break;
          		 
        	case "SADR":
        		 pojoClass = SADR.class.cast(classObj);
          		 break;
          		 
        	case "STXL":
        		pojoClass = STXL.class.cast(classObj);
         		 break;
         		 
        	case "EXTERNAL_CUST_IDS":
        		pojoClass = External_CUST_IDS.class.cast(classObj);
        		break;
        		
        	case "STXH":
        		pojoClass = STXH.class.cast(classObj);
        		break;
        		
        	case "US_COMPANY":
        		pojoClass = US_COMPANY.class.cast(classObj);
        		break;
        		
        	case "US_ENTERPRISE":
        		pojoClass = US_ENTERPRISE.class.cast(classObj);
        		break;
        		
        	case "US_GEM_TRANS":
        		pojoClass = US_GEM_TRANS.class.cast(classObj);
        		break;	
        	}
        	
        	
        	
            String setterMethodName = "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1).toLowerCase();
            try {
                // Get the setter method
                //Method setter = findSetterMethod(pojoClass, setterMethodName, value.getClass());
				/*
				 * Method setter = Arrays.stream(pojoClass.getMethods())) .filter(method ->
				 * method.getName().equals(setterMethodName)) .findFirst() .orElse(null);
				 */
                        Method setter = null;
                        Method[] methods = pojoClass.getClass().getDeclaredMethods();
                        for (Method method : methods) {
                            if (method.getName().equalsIgnoreCase(setterMethodName) &&
                                method.getParameterCount() == 1 ) {
                                setter = method;
                                break;
                            }
                        }
                if (setter != null) {
                	setter.setAccessible(true);
					/*
					 * Object value1; if(fieldName.equals("GOE_EXP_DATE")) { value1 = (Object)value;
					 * setter.invoke(pojoInstance, value1.toString()); } else if(fieldName ==
					 * "SHAD_UPDATE_TS" || fieldName == "SAP_TS") { value1 = (Timestamp)value;
					 * setter.invoke(pojoInstance, value1); }
					 * 
					 * else
					 */
                	
                    // Invoke the setter method
					/*
					 * if(fieldName.equals("SHAD_UPDATE_TS") ){
					 * 
					 * String dateString = value.toString(); if(!dateString.equals("")) { // Define
					 * the date format that matches the string pattern SimpleDateFormat dateFormat =
					 * new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					 * 
					 * try { // Parse the string into a Date object java.util.Date parsedDate =
					 * dateFormat.parse(dateString);
					 * 
					 * // Convert Date to Timestamp Timestamp timestamp = new
					 * Timestamp(parsedDate.getTime());
					 * 
					 * // Output the timestamp System.out.println("Converted Timestamp: " +
					 * timestamp); value = timestamp; } catch (ParseException e) {
					 * e.printStackTrace(); } } else value = null; }
					 */
                	if(fieldName.equals("UMSA1")|| fieldName.equals("UMSAT")) {
                		 int IntField = Integer.parseInt(value.toString());
                		 value = IntField;
                	}
                	
                    setter.invoke(pojoClass, value);
				} /*
					 * else { Field[] fields = ((Class<?>) pojoClass).getDeclaredFields(); for
					 * (Field field : fields) { if
					 * (field.isAnnotationPresent(javax.persistence.EmbeddedId.class)) { Class<?>
					 * EmbedpojoClass = field.getType(); Object EmbedpojoInstance =
					 * EmbedpojoClass.getDeclaredConstructor().newInstance(); setter =
					 * pojoClass.getClass().getMethod(setterMethodName, value.getClass());
					 * 
					 * setter.invoke(EmbedpojoInstance, value); //assign the pojo instance value to
					 * orignal pojo String setterMethodName1 = "set" +
					 * Character.toUpperCase(field.getName().charAt(0)) +
					 * field.getName().substring(1).toLowerCase(); setter =
					 * Arrays.stream(((Class<?>) pojoClass).getMethods()) .filter(method ->
					 * method.getName().equals(setterMethodName1)) .findFirst() .orElse(null); if
					 * (setter != null) { // Invoke the setter method setter.invoke(pojoClass,
					 * EmbedpojoInstance); } }
					 * 
					 * } }
					 */
                    
                
                
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Caught exceptio"+ e.getMessage());
                return e;
            }
        }
     catch (Exception e) {
        e.printStackTrace();
        //return e;
    }
		return pojoClass;
    }
    
    public static Object invokeSetter1(String pojoIdentifier, String fieldName, java.util.Date value,Object classObj) {
    	Object pojoInstance = new Object();
    	//Object value1 = value.toString();
        try {
            // Get the POJO class based on the identifier
            Class<?> pojoClass = PojoRegistry.getPojoClass(pojoIdentifier);
            if (pojoClass == null) {
                System.out.println("POJO class not found for identifier: " + pojoIdentifier);
                throw new Exception("POJO class not found for identifier: " + pojoIdentifier);
            }

            // Create an instance of the POJO class
             pojoInstance = pojoClass.getDeclaredConstructor().newInstance();
             
             pojoInstance = classObj;

            // Find the setter method for the field name
            String setterMethodName = "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1).toLowerCase();
            try {
                // Get the setter method
                //Method setter = findSetterMethod(pojoClass, setterMethodName, value.getClass());
				/*
				 * Method setter = Arrays.stream(pojoClass.getMethods())) .filter(method ->
				 * method.getName().equals(setterMethodName)) .findFirst() .orElse(null);
				 */
                        Method setter = Arrays.stream(pojoClass.getMethods())
                        	    .filter(method -> {
                        	        String methodName = method.getName();
                        	        if (methodName.contains("set") && methodName.length() > 3) {
                        	        	
                        	            String propertyName = methodName.split("set")[1];
                        	            // Capitalize first letter and make the rest lowercase
                        	            String formattedName = "set"+Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1).toLowerCase();
                        	            return formattedName.equals(setterMethodName);
                        	        }
                        	        return false;
                        	    })
                        	    .findFirst()
                        	    .orElse(null);        
                if (setter != null) {
					/*
					 * Object value1; if(fieldName.equals("GOE_EXP_DATE")) { value1 = (Object)value;
					 * setter.invoke(pojoInstance, value1.toString()); } else if(fieldName ==
					 * "SHAD_UPDATE_TS" || fieldName == "SAP_TS") { value1 = (Timestamp)value;
					 * setter.invoke(pojoInstance, value1); }
					 * 
					 * else
					 */
                	
                    // Invoke the setter method
                    setter.invoke(pojoInstance, value);
                } else {
                	Field[] fields = pojoClass.getDeclaredFields();
                    for (Field field : fields) {
                        if (field.isAnnotationPresent(javax.persistence.EmbeddedId.class)) {
                        	Class<?> EmbedpojoClass = field.getType();
                        	Object EmbedpojoInstance = EmbedpojoClass.getDeclaredConstructor().newInstance();
                        	 setter = Arrays.stream(EmbedpojoClass.getMethods())
                                    .filter(method -> method.getName().equals(setterMethodName))
                                    .findFirst()
                                    .orElse(null);
                        	
                        	setter.invoke(EmbedpojoInstance, value);
                        	//assign the pojo instance value to orignal pojo
                        	String  setterMethodName1 = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1).toLowerCase();
                        	  setter = Arrays.stream(pojoClass.getMethods())
                                      .filter(method -> method.getName().equals(setterMethodName1))
                                      .findFirst()
                                      .orElse(null);
                        	  if (setter != null) {
                                  // Invoke the setter method
                                  setter.invoke(pojoInstance, EmbedpojoInstance);
                        	  }
                        }
                        
                    }
                	}
                    
                
                
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Caught exceptio"+ e.getMessage());
                return e;
            }
        }
     catch (Exception e) {
        e.printStackTrace();
        //return e;
    }
		return pojoInstance;
    }
    
              
}