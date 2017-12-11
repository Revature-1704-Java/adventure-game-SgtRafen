public class Compare
{

    Classroom cl = new Classroom();
    Lobby lb = new Lobby();
    Library lib = new Library();
    String currentRoom = new String();
    
    public void compareRooms(String newRoom)
    {
        cl.setName("classroom");
        lb.setName("lobby");
        lib.setName("Library");
      
        
        if (!newRoom.equals(currentRoom))
        {
            if (newRoom.equals("classroom") && !currentRoom.equals("library")){
                
                cl.Description();
                currentRoom = cl.getName();
                
            }
            else if (newRoom.equals("library") && !currentRoom.equals("classroom"))
            {
                lib.Description();
                currentRoom = lib.getName();;
            }
            else if(newRoom.equals("lobby"))
            {
                lb.Description();
                currentRoom = lb.getName();
            }
            else
            {
                System.out.println("I'm sorry you cannot just teleport to the " + newRoom + " without first going through the lobby!");
                System.out.println("");
            }

        }
        else
        {
            System.out.println("");
            System.out.println("You are already in this room.");
            System.out.println("");
        }
    }
}