package com.rdc;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.io.InputStream;


public class ReadFiles {

	/**
    * Reads a single property file and returns a Map of key-value pairs.
    * @param filePath The path to the property file.
    * @return A Map containing the key-value pairs from the property file.
    * @throws IOException If an I/O error occurs.
    */
   public Map<String, String> readPropertiesFile(String filePath) throws IOException {
       Map<String, String> propertiesMap = new HashMap<>();
       Properties properties = new Properties();

       try (InputStream input = new FileInputStream(filePath)) {
           properties.load(input);
           for (String key : properties.stringPropertyNames()) {
               propertiesMap.put(key, properties.getProperty(key));
           }
       }

       return propertiesMap;
   }

   /**
    * Reads a list of property files and combines their contents into a single Map.
    * @param filePaths List of paths to the property files.
    * @return A Map containing the combined key-value pairs from all property files.
    */
   public  Map<String, String> readPropertiesFiles(String config_path) {
	   List<String> propertyFiles = new ArrayList<String>();
       propertyFiles.add(config_path+"/kna1.properties");
       propertyFiles.add(config_path+"/knvv.properties");
       propertyFiles.add(config_path+"/knvk.properties");
       propertyFiles.add(config_path+"/stxl.properties");
       propertyFiles.add(config_path+"/stxh.properties");
       propertyFiles.add(config_path+"/kunnr_ext.properties");
       propertyFiles.add(config_path+"/kduns_new.properties");
       propertyFiles.add(config_path+"/sadr.properties");
       propertyFiles.add(config_path+"/external_cust_ids.properties");
       
       Map<String, String> combinedProperties = new HashMap<>();
       
       for (String filePath : propertyFiles) {
           try {
               Map<String, String> fileProperties = readPropertiesFile(filePath);
               combinedProperties.putAll(fileProperties);
           } catch (IOException e) {
               System.err.println("Warning: Could not read file " + filePath + " due to " + e.getMessage());
           }
           
       }
       for (Map.Entry<String, String> entry : combinedProperties.entrySet()) {
           System.out.println(entry.getKey() + "=" + entry.getValue());
       }

       return combinedProperties;
   }
   

   /**
    * Reads a list of property files and combines their contents into a single Map.
    * @param filePaths List of paths to the property files.
    * @return A Map containing the combined key-value pairs from all property files.
    */
   public  Map<String, String> readDefaultPropertiesFiles(String config_path) {
	   List<String> propertyFiles = new ArrayList<String>();
       propertyFiles.add(config_path+"/Default_Legacy_columns.properties");
       //propertyFiles.add("Tactical_columns.properties");
       
       
       Map<String, String> combinedProperties = new HashMap<>();
       
       for (String filePath : propertyFiles) {
           try {
               Map<String, String> fileProperties = readPropertiesFile(filePath);
               combinedProperties.putAll(fileProperties);
           } catch (IOException e) {
               System.err.println("Warning: Could not read file " + filePath + " due to " + e.getMessage());
           }
           
       }
       for (Map.Entry<String, String> entry : combinedProperties.entrySet()) {
           System.out.println(entry.getKey() + "=" + entry.getValue());
       }

       return combinedProperties;
   }


   }


