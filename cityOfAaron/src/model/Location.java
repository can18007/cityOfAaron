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
        return this.description;
    }
    
    public void setDescription(String _description){
        this.description = _description;
    }

    public String getSymbol(){
        return this.symbol;
    }
    
    public void setSymbol(String _symbol){
        symbol = _symbol;
    }
}

