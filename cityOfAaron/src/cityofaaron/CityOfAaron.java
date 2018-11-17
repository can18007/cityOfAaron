/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir Canar
 */

package cityofaaron;
import model.*;
import view.*;

/**
 *
 * @author mwcaq480
 */
public class CityOfAaron {

    //variable for keeping a reference to the Game object
    private static Game theGame = null;
    
    //main function - etnry point for the program
    //runs the main menu
    public static void main(String[] args) {   
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
    }    
    
    /**
     *
     * @param _theGame
     */
    public static void setGame(Game _theGame){
        CityOfAaron.theGame = _theGame;
    }    

    public static Game getGame(){
        return CityOfAaron.theGame;
        
 
    }

}
