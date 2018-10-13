/*
 * The Location class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Author: Wladimir Canar
 */
package model;

import java.io.Serializable;

public class Location implements Serializable {
    
    private String description;
    private String symbol;

    public Location() { 
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String _description){
        description = _description;
    }

    public String getSymbol(){
        return symbol;
    }
    
    public void setSymbol(String _symbol){
        symbol = _symbol;
    }
}

