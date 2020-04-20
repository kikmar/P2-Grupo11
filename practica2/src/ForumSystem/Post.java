/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import ForumSystem.PostContent.Content;
import ForumSystem.PostContent.Exercises;
import ForumSystem.PostContent.PlainText;
import ForumSystem.PostContent.Poll;
import UserSystem.Ban;
import UserSystem.Users.User;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Post {
    private String Tittle;
    private int Valoration;
    private boolean Visibility;
    private String Owner;
    private int Updates;

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String Tittle) {
        this.Tittle = Tittle;
    }

    public boolean isVisibility() {
        return Visibility;
    }

    public void setVisibility(boolean Visibility) {
        this.Visibility = Visibility;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public int getUpdates() {
        return Updates;
    }

    public void setUpdates(int Updates) {
        this.Updates = Updates;
    }
    
    private LinkedList <Content> ContentList = new LinkedList();
    private LinkedList <Coment> ComentList = new LinkedList();
    private LinkedList <NickVote> ValorantsList = new LinkedList();

    public Post(String Tittle, String Owner,int TypeOfContent,String PostContent) throws IOException, FileNotFoundException, ClassNotFoundException {
 
        boolean found = CheckIfIsUser(Owner);
        boolean isTeacher = CheckIfTeacher(Owner);
        
        if (found){
           if(isTeacher){
            
                if (TypeOfContent==1){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    Content C1 = new PlainText(PostContent);
                    ContentList.add(C1);
                }

                if (TypeOfContent==2){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    Content C2 = new Exercises(PostContent);
                    ContentList.add(C2);
                }

                if (TypeOfContent==3){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    Content C3 = new Poll(PostContent);
                    ContentList.add(C3);
                }
            }
        
            else{
                if (TypeOfContent==1){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    Content C1 = new PlainText(PostContent);
                    ContentList.add(C1);
                }
            } 
        }
        
        
    }
    
    public void MenuAdmin() throws IOException, ClassNotFoundException, ParseException{

    int opcion=0;
    

    while (opcion!=3){
        System.out.println("Menu Administrador");
        System.out.println("1. Cambiar visibilidad del post.");
        System.out.println("2. Penalizar a un usuario.");
        System.out.println("3. Salir del Menu Administrador.");
        System.out.println("Escoja una de las opciones disponibles:");
        Scanner sc = new Scanner (System.in);
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                changeVisibility();
                break;
                
            case 2:
                Suspend();
                break;
                
            case 3:
                break;

            default:
                System.out.println("Esta opción no está disponible");
                break;
                
        }
    }
}
    
    private void changeVisibility() {
    if (isVisibility()){
        setVisibility(false);
    }
    else {
        setVisibility(true);
    }
}
    
    private void Suspend() throws IOException, ClassNotFoundException, ParseException{
    System.out.println("Ingrese el Nick del usuario que desea penalizar:");
    Scanner sc = new Scanner (System.in);
    String nick = sc.nextLine();
    System.out.println("Escriba la fecha de inicio de la penalizacion con formato DD-MM-YYYY:");
    String fechaIni = sc.nextLine();
    System.out.println("Escriba la fecha de fin de la penalizacion con formato DD-MM-YYYY:");
    String fechaFin = sc.nextLine();

    Ban penalizacion = new Ban (nick, true, fechaIni, fechaFin);
}
    
    private boolean CheckIfTeacher(String Owner) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean isTeacher = true;
        
        LinkedList UserList = GetUserList();
        
        for(int i=0; i<UserList.size();i++){
            User User = (User) UserList.get(i);
            
            if(User.getNick().equals(Owner)){               
                if (User.isIsStudent()){
                   isTeacher=false; 
                } 
            }
        }
        
        return isTeacher;
        
    }
    
    private boolean CheckIfIsUser(String Owner) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean found = false;
        LinkedList UserList = GetUserList();
        
        for(int i=0; i<UserList.size();i++){
            User User = (User) UserList.get(i);
            
            if(User.getNick().equals(Owner)){
                found = true;

            }
        }
        
        return found;
    }
    
    //Returns User List from Data Base
    private LinkedList<User> GetUserList() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream("DataBase/Users/UsersDataBase.obj");
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
        LinkedList <User> UserList  = (LinkedList <User>) InputObject.readObject();
        
        InputFile.close();
        InputObject.close();
        
        return UserList;
    }
    
    
   public boolean VotePost(String Nick, boolean Vote){
        boolean hasVoted = false;
        boolean isAllOk = true;
        
        NickVote NickVote = new NickVote(Nick,Vote);
        
        try{
            
            //Check if user has voted
            for (int i=0; i<ValorantsList.size();i++){
                if (ValorantsList.get(i).getNick().equals(Nick)){
                    if (ValorantsList.get(i).isVote() == Vote){
                        hasVoted = true;
                        isAllOk = false;
                    }
                    
                    //If he has voted but he want to changue it
                    else{
                        if (Vote){
                            Valoration += 1;                       
                        }
                        else{
                            Valoration -=1;
                        }
                        
                        ValorantsList.remove(i);
                        ValorantsList.add(NickVote);
                    }
                }  
            }
            
            //If the user never has voted
            if (!hasVoted){
                if(Vote){
                    Valoration += 1;
                }
                else{
                    Valoration -=1;                    
                }  
                ValorantsList.add(NickVote);
            }    
        } 
        
        //If ValoratansList is empty
        catch(NullPointerException Npe){
           if(ValorantsList.isEmpty()){
                if(Vote){
                    Valoration += 1;
                }
                else{
                    Valoration -=1;                    
                }
                ValorantsList.add(NickVote);    
            }
        }

        return isAllOk;
    }
   
   public String Share(){
       return "https://uredditjc.es/"+Tittle;
   }
    
    public void Mostrar(){
        
        System.out.println(Tittle);
        for(int i=0; i<ContentList.size();i++){
            System.out.println(ContentList.get(i).getPostContent());
        }
    }

    public int getValoration() {
        return Valoration;
    }
    
    
    
    
    
}
