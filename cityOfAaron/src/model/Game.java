/*
 * The Game class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir Canar
 */
package model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Game implements Serializable {
    
    private Map theMap;
    private Player thePlayer;
    private CropData cropData;
    private ArrayList<ListItem> provisions;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
        
    //private Game theGame;

        

    public Game() {

    }
  
    public void setMap(Map _theMap){
        this.theMap = _theMap;      
    }
    
    public Map getMap( ){
        return this.theMap;      
    }
    
    
    public void setPlayer(Player _thePlayer){
        this.thePlayer = _thePlayer;
    }
    
    public Player getPlayer(){
        return this.thePlayer;
    }
    
    public void setCropData(CropData _cropData){
        this.cropData = _cropData;
    }

    public CropData getCropData( ){
        return this.cropData;
    }
    
    public void setAnimals(ArrayList<ListItem> _animals)
    {
        animals = _animals;
    }
    
    public ArrayList<ListItem> getAnimals(){
        return animals;
    }
    
    public void setProvisions(ArrayList<ListItem> _provisions ){
        provisions = new ArrayList<ListItem>(_provisions);
    }
    
     public ArrayList<ListItem> getProvisions( ){
        return provisions;
    }
    
    public void setTools(ArrayList<ListItem> _tools ){
        tools = new ArrayList<ListItem>(_tools);
    }
    
    public ArrayList<ListItem> getTools( ){
        return tools;
    }
}
