/*
 * The Game class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir Canar
 */
package model;

import java.io.Serializable;


public class Game implements Serializable {
    
    private Player thePlayer;
    private CropData cropData; 
    
        

    public Game() {

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
    
}
