/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;


import java.util.Scanner;
import UserSystem.Users.User;



/**
 *
 * @author crist
 */
public class Coment {
    //ATRIBUTOS GENERALES DE LA CLASE:
    private int assesment;
    private String text;
    private String user;
    private String valorantsList;
    
    
    //CONSTRUCTOR DE LA CLASE:
    public Coment (int assesment, String text, String user, String valorantsList) {
        this.assesment = assesment;
        this.text = text;
        this.user = user;
        this.valorantsList = valorantsList;
    }
    
    
    //MÉTODOS SET:
    public void setAssesment (int valueAssesment){
        assesment = valueAssesment;
    }
    
    public void setText (String valueText){
        text = valueText;
    }
    
    public void setUser (String valueUser){
        user = valueUser;
    }
    
    public void setValorantsList (String valueValorantsList){
        valorantsList = valueValorantsList;
    }
    
    
    
    //MÉTODOS GET:
    public int getAssesment(){return assesment;}
    public String getText(){return text;}
    public String getUser(){return user;}
    public String getValorantsList(){return valorantsList;}
    
    
    
    //METODO PARA VER VOTACION DEL USUARIO HA VOTADO:
    
    public void voteComent (String Nick, boolean Value){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su Nick porfavor: ");
        Nick = sc.nextLine();
        this.user = Nick;
        System.out.println("¿Le ha gustado el comentario? Si/No: ");
        String ask = sc.nextLine();
        if (ask == "Si") {
            Value = true;
        } else {
            Value = false;
        }
        if (Value == true){
            this.assesment = this.assesment + 1;
        } else {
            this.assesment = this.assesment - 1;
        }
    }
   
   //METODO PARA CREAR UN COMENTARIO POR PARTE DEL USUARIO:
     
   public void createComent (String Nick, String Text){
       System.out.println("Confirme su Nick porfavor: ");
       Scanner sc = new Scanner(System.in);
       Nick = sc.nextLine();
       if (this.user != Nick){
           System.out.println("Su nick no corresponde con el de un usuario.");
           return;
       }
       else {
           System.out.println("Escriba su comentario porfavor: ");
           String coment = sc.nextLine();
           this.text = coment;
       }
   }  

}
