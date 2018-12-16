/*
 * The Player class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir Canar
 */
package model;

import java.io.Serializable;

public class Player implements Serializable {

    private String name;

    public Player(){
    }

    public void setPlayerName(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }
    
    public int mapRow;
    
    public void setMapRow(int _mapRow){
        this.mapRow = _mapRow;
    }
    
    public int getMapRow(){
        return this.mapRow;
    }
    
    public int mapCol;
    
    public void setMapCol(int _mapCol){
        this.mapCol = _mapCol;
    }
    
    public int getMapCol(){
        return this.mapCol;
    }
    
    
}
