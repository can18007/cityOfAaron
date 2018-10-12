/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir Canar
 */
package cityofaaron;
import model.*;

/**
 *
 * @author mwcaq480
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Megan");
        
        Game game = new Game();
        game.setPlayer(playerOne);

        Player result = game.getPlayer();
        System.out.println(result.getName());

        System.out.println(TeamMember.MEGAN.getName() + " - " + TeamMember.MEGAN.getTitle());
    }
    
}
