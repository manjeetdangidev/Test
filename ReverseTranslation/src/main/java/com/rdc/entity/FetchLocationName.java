package com.rdc.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchLocationName {

	
	

   public String FetchLocation_Name(Connection con,String site_id) throws SQLException { 
        // Replace these values with the actual SITE_ID you want to search for
        
        String locationName = null;

        // SQL Query to fetch LOCATION_NAME from LOCNNAME table
        String query = "SELECT ln.LOCN_NAME_ID "+
                       " FROM EDM_LOCN.LOCNNAME ln " +
                       "JOIN EDM_LOCN.LOCNMAIN lM ON lm.LOCN_NAME_ID = ln.LOCN_NAME_ID " +
                       "WHERE lm.SITE_ID = ?";

        // Establish connection and execute query
        
             PreparedStatement pstmt = con.prepareStatement(query);

            // Set the SITE_ID parameter
            pstmt.setString(1, site_id);

            // Execute the query
            try (ResultSet rs = pstmt.executeQuery()) {
                // Process the result
                if (rs.next()) {
                    locationName = rs.getString(1);
                    System.out.println("Location Name: " + locationName);
                } else {
                    System.out.println("No location found for SITE_ID: " + site_id);
                    
                }
            }
			return locationName;

        
    }

public String FetchLocation_Addr(Connection connection_Client360, String site_id) throws SQLException {
	String locationAddress = null;

    // SQL Query to fetch LOCATION_NAME from LOCNNAME table
    String query = "SELECT la.LOCN_ADDR_ID "+
                   " FROM EDM_LOCN.LOCNADDR la " +
                   "JOIN EDM_LOCN.LOCNMAIN lM ON lm.LOCN_ADDR_ID = la.LOCN_ADDR_ID " +
                   "WHERE lm.SITE_ID = ?";

    // Establish connection and execute query
    
         PreparedStatement pstmt = connection_Client360.prepareStatement(query);

        // Set the SITE_ID parameter
        pstmt.setString(1, site_id);

        // Execute the query
        try (ResultSet rs = pstmt.executeQuery()) {
            // Process the result
            if (rs.next()) {
            	locationAddress = rs.getString(1);
                System.out.println("Location Address: " + locationAddress);
            } else {
                System.out.println("No location found for SITE_ID: " + site_id);
                
            }
        }
		return locationAddress;
}

public String FetchLocation_Ids(Connection connection_Client360, String site_id) throws SQLException {
	String locationIds = null;

    // SQL Query to fetch LOCATION_NAME from LOCNNAME table
    String query = "SELECT la.LOCN_IDS_ROWID "+
                   " FROM EDM_LOCN.LOCN_IDS la " +
                   "JOIN EDM_LOCN.LOCNMAIN lM ON lm.LOCN_IDS_ROWID = la.LOCN_IDS_ROWID " +
                   "WHERE lm.SITE_ID = ?";

    // Establish connection and execute query
    
         PreparedStatement pstmt = connection_Client360.prepareStatement(query);

        // Set the SITE_ID parameter
        pstmt.setString(1, site_id);

        // Execute the query
        try (ResultSet rs = pstmt.executeQuery()) {
            // Process the result
            if (rs.next()) {
            	locationIds = rs.getString(1);
                System.out.println("Location IDS: " + locationIds);
            } else {
                System.out.println("No location found for SITE_ID: " + site_id);
                
            }
        }
		return locationIds;
}




}
