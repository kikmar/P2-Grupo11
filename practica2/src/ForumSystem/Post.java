/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

/**
 *
 * @author crist
 */

import ForumSystem.PostContent.Content;
import UserSystem.Users.User;
import java.util.Scanner;


/**
 *
 * @author crist
 */
public class Post {
    //Atributos
    
    private String title;
    private Content content;
    private int valoration;
    private boolean visible;
    private User creator;
    private Coment comentList;
    private String voteList;
    private int updates;
    
    
    //Constructor de la clase
    
    public Post (String title, Content content, int valoration, boolean visible,User creator, Coment comentList, String voteList, int updates) {
        this.creator = creator;
        this.title = title;
        this.content = content;
        this.valoration = valoration;
        this.visible = visible;
        this.comentList = comentList;
        this.voteList = voteList;
        this.updates = updates;
    }

    
    //Getters:
    
    public String getTitle(){
        return title;
    }
    
    public Content getContent(){
        return content;
    }
    
    public int getValoration(){
        return valoration;
    }
    
    public boolean getVisible(){
        return visible;
    }
    
    public Coment getComent(){
        return comentList;
    }
    
    public String getVoteList(){
        return voteList;
    }
    
    public int getUpdates(){
        return updates;
    }
    
    public User getCreator(){
        return creator;
    }
    
    
    //Setters:
    
    public void setTitle (String title){
        this.title = title;
    }
    
    public void setContent (Content content){
        this.content = content;
    }
    
    public void setValoration (int valoration){
        this.valoration = valoration;
    }
    
    public void setVisible (boolean visible){
        this.visible = visible;
    }
    
    public void setComent (Coment comentList){
        this.comentList = comentList;
    }
    
    public void setVoteList (String voteList){
        this.voteList = voteList;
    }
            
    public void setUpdates (int updates){
        this.updates = updates;
    }        
    
    public void setCreator (User creator){
        this.creator = creator;
    }
    
    public void postCreation (String SubForo, String title, String text){
        
        
    
    }
    
    public void visibilityModification (){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quiere cambiar la visibilidad del post? si/no");
        String ask = sc.nextLine();
        if (ask.equals ("si")){
         // this.visible = !visible;
          System.out.println("Ha cambiado la visibilidad del post");
          }
        else{
          System.out.println("Se ha mantenido la visibilidad de origen"); 
          
          }
    }
    
    public void adminMenu(){
       Scanner sn = new Scanner(System.in);
       boolean exit = false;
       int option;
       
       while (!exit){
       System.out.println("Se encuentra en el menu de administracion que accion quiere realizar:");
       System.out.println("1- Cambiar visibilidad del post");
       System.out.println("2- Penalizar Usuario");
       System.out.println("3- Salir del menu administrador");       
       System.out.println("Escribe una de las opciones");
       option = sn.nextInt();
         switch (option){
             
             case 1:
               visibilityModification();
               break;
             case 3:
               exit = true;
               
                 
        
       
         } 
       }
    }
    
    
    public void contentChange () {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea cambiar algo del contenido de su post?");
        String changes = sc.nextLine();
        
        if (changes == "si"){
            System.out.println("Escriba su nuevo contenido");
            String contenido = sc.nextLine();
            
        }
    }
    
    public void menuCreator () {
       Scanner sn = new Scanner(System.in);
       boolean exit = false;
       int option;
       
       while (!exit){
       System.out.println(" *********************************************************** \n"
                          +"********************* MENU CREADOR ************************ \n"
                          +"                                                            \n"
                          +"               1- Modificar post                            \n"
                          +"               2- Crear post                                \n"
                          +"                                                            \n"
                          +"************************************************************\n");       
       option = sn.nextInt();
         switch (option){
             
             case 1:
               contentChange();
               break;
               //case 2:
              //postCreation();
             //break;
             case 3:
               exit = true;
    }
    
    
    
    
    
    }
   }
    
   public boolean isCreator () {
       boolean isORnot = false;
       
       
       
       
       
       return isORnot;
       
   } 
   
   public boolean isVisible () {
      boolean visibles;
      visibles = this.visible;
      if(visibles = false) {
          System.out.println("La visibilidad del post está desactivada.");
      }
      else {
          System.out.println("La visibilidad del post está activada");
      }
      return visibles;
      
   }
   
    
}