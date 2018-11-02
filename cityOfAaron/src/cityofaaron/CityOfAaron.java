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

    /**
     * @param args the command line arguments
     */
    //variable for keeping a reference to the Game object
    private static Game theGame = null;
    
    //main function - etnry point for the program
    //runs the main menu
    public static void main(String[] args) {
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
        
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Megan");
        
        Game game = new Game();
        game.setPlayer(playerOne);

        Player result = game.getPlayer();
        System.out.println(result.getName());

        System.out.println(TeamMember.MEGAN.getName() + " - " + TeamMember.MEGAN.getTitle());
        
        //Test Location class author wladimir
        Location myLocation = new Location();
        myLocation.setDescription("Test Location");
        myLocation.setSymbol("example symbol");
        
        System.out.println(myLocation.getDescription());
        System.out.println(myLocation.getSymbol());
        //end test
        
        //Test ListItem class author mpainter
        ListItem aListItem = new ListItem();
        aListItem.setName("Item1");
        aListItem.setNumber(1);
        
        System.out.println(aListItem.getName());
        System.out.println(aListItem.getNumber());
        //end test
        

        //Test CropData class author Megan Hendrickson
        CropData myCropData = new CropData();
        myCropData.setYear(2010);
        myCropData.setPopulation(27);

        System.out.println(myCropData.getYear());
        System.out.println(myCropData.getPopulation());
        
    }
    
}
