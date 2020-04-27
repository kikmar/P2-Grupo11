package ForumSystem;

import java.util.LinkedList;

import ErrorSystem.CommonMethods;
import UserSystem.Users.User;


public class SubForum extends CommonMethods{

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
        final User user = new User();
        for (int i = 0; i < subscribersList.size(); i++) {
        if (subscribersList.get(i).equals(nicklogeado)){
            System.out.println("Ya estas registrado en este subforo");
            subscribed = true;
        }
        }
        if (subscribed == false){
            subscribersList.add(nicklogeado);
            System.out.println("Acabas de subscribirse");
            user.notificationAdd(name,Pilaposts.size() );    //Sacamos el tamaño de la pilaposts que falta para las notificicaiones
            
            
        }       
    }
    
    public void unsubscribe (String nicklogeado){
        boolean subscribed = false;
        final User user = new User();
        for (int i = 0; i < subscribersList.size(); i++) {
        if (subscribersList.get(i).equals(nicklogeado)){
            subscribed = true;
        }
        }
        if (subscribed == false){
            System.out.println("No estas subscrito a este Subforo");
            
        } 
        else {
            subscribersList.remove("nicklogeado");
            user.notificationRemove(name);
            System.out.println("Se ha desubscrito del Subforo con exito");
            
        
        }
    }
    
    public void sendNotifications (){
        
    
    
    
    }
    
   
   
   
}
/*
Suscribirse parametro nick --------ya ta
get id devuelve integer --------- ya ta
desuscribirse entra nick -------- ya ta
mandar notificaciones devuelve integer --------- 
Crear susforo entra por parametro esalumno y nombre tipo string -------


NOTA DE AITOR:
Cuando hagais el metodo de CrearSubforo, 
en la condicion que diga que no puede crearlo hay que escribir esto:
showError(2);
para que muestre el error de que no es posible crear un subforo sin los permisos necesarios
*/

