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

    public void setName(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }
    
}
