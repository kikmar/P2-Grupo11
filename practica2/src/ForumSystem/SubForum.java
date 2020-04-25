package ForumSystem;

import java.util.LinkedList;


public class SubForum {

   private int ID;
   private Post Pilaposts;
   private String name;
   private final LinkedList<String> subscribersList = new LinkedList();

    public SubForum(int ID, Post Pilaposts, String name, String subscribersList) {
        this.ID = ID;
        this.Pilaposts = Pilaposts;
        this.name = name;
       
    }
   

    
   
   public void setID(int ID) {
        this.ID = ID;
    }

    public void setPilaposts(Post Pilaposts) {
        this.Pilaposts = Pilaposts;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getID() {
        return ID;
    }

    public Post getPilaposts() {
        return Pilaposts;
    }

    public String getName() {
        return name;
    }

    
    
    public void suscribe (String nicklogeado){
        boolean subscribed = false;
        for (int i = 0; i < subscribersList.size(); i++) {
        if (subscribersList.get(i).equals(nicklogeado)){
            System.out.println("Ya estas registrado en este subforo");
            subscribed = true;
        }
        }
        if (subscribed == false){
            subscribersList.add(nicklogeado);
            System.out.println("Acabas de subscribirse");
            
        }
        
        
            
        
    
    
    
    
    
    
    }

    
    
    
   
   
   
}
/*
Suscribirse parametro nick
get id devuelve integer
desuscribirse entra nick
mandar notificaciones devuelve integer
Crear susforo entra por parametro esalumno y nombre tipo string

*/

