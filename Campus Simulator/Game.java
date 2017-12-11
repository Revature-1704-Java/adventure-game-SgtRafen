
import java.util.Scanner;

public class Game {
    boolean exit = false;
    Compare compare = new Compare();
    Scanner answer = new Scanner(System.in);
    public static void main(String[] args)
    {
        Game game = new Game();
        game.startGame();
        entering();
        game.gameRunning();

    
    }
    public Game()
    {
        
    }
    public void startGame()
    {
        System.out.println("Greetings! Welcome to Generic University");
        System.out.println("Please feel free to move about the campus");
        System.out.println("");

        
    }
    public void walking()
    {
      
         String action = answer.nextLine();
         
        
        if(action.equals("quit")){
            exit = true;
        }
        else if(action.equals("classroom") || action.equals("library") || action.equals("lobby"))
        {
            compare.compareRooms(action);
        }
        else
        {
            System.out.println("");
            System.out.println("that is not a valid command.");
            System.out.println("");
        }     
    }
    public void gameRunning()
    {
    
        while (exit != true){
            walking();
           
        }
        leaving();
        answer.close();
        
    }


    public static void entering()
    {
        System.out.println("");
        System.out.println("You walk up to the entrence to the university");
        System.out.println("It's Michigan so it's rather cold");
        System.out.println("");
        System.out.println("Commands: lobby | quit");
        System.out.println("");
    }
    public static void leaving()
    {
        System.out.println("");
        System.out.println("You decide to leave the campus");
        System.out.println("It's Michigan so it's still cold outside");
        System.out.println("");
    }
}
