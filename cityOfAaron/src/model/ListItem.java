/*
 * The ListItem class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team Members: Megan Hendrickson, McKell Painter, Wladimir Canar
 * @author mpainter
 */
package model;

import java.io.Serializable;

public class ListItem implements Serializable{
    private String name;
    private int number;
    
    public ListItem(){        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String _name) {
        this.name = _name;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int _number) {
        this.number = _number;
    }
}
