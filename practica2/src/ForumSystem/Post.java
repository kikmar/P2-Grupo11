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
import java.io.Serializable;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Post implements Serializable{
    private String Tittle;
    private int Valoration;
    private boolean Visibility;
    private String Owner;
    private int Valid;
    
    private LinkedList <Content> ContentList = new LinkedList();
    private LinkedList <Coment> ComentList = new LinkedList();
    private LinkedList <NickVote> ValorantsList = new LinkedList();
    
    private static final long serialVersionUID = 1L;

    public Post(String Tittle, String Owner,int TypeOfContent,String PostContent) throws IOException, FileNotFoundException, ClassNotFoundException {
 
        boolean found = CheckIfIsUser(Owner);
        boolean isTeacher = CheckIfTeacher(Owner);
        this.Valid = -1;
        
        if (found){
           if(isTeacher){
            
                if (TypeOfContent==1){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    this.Visibility = false;
                    Content C1 = new PlainText(PostContent);
                    ContentList.add(C1);
                    this.Valid =1;
                }

                if (TypeOfContent==2){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    this.Visibility = false;
                    Content C2 = new Exercises(PostContent);
                    ContentList.add(C2);
                    this.Valid =1;
                }

                if (TypeOfContent==3){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    this.Visibility = false;
                    Content C3 = new Poll(PostContent);
                    ContentList.add(C3);
                    this.Valid =1;
                }
                
            }
        
            else{
                if (TypeOfContent==1){
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    this.Visibility = false;
                    Content C1 = new PlainText(PostContent);
                    ContentList.add(C1);
                    this.Valid =1;
                }
                
            } 
           
        }
        
        
    }
    
    
    public void Coment(String Nick,String Text) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean isUser = false;
        
        LinkedList <User> UserList = GetUserList();
        
        for (int i=0;i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(Nick.equals(User.getNick())){
                isUser = true;
            }
        }
        
        if (isUser){
           Coment Coment = new Coment(Nick,Text);
           ComentList.add(Coment);
        }
        
    }

    public LinkedList<Coment> getComentList() {
        return ComentList;
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
        
        if(!Nick.equals(Owner)){
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
               if(ValorantsList.size() == 0){
                    if(Vote){
                        Valoration += 1;
                    }
                    else{
                        Valoration -=1;                    
                    }
                    ValorantsList.add(NickVote);    
                }
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
    
    public int getValid(){
        return Valid;
    }

    public String getTittle() {
        return Tittle;
    }
    
    
        
    public void MenuAdmin(String Nick) throws IOException, ClassNotFoundException, ParseException {
        boolean exit = false;
        boolean Admin = false;

        LinkedList UserList = GetUserList();
        for (int i = 0; i < UserList.size(); i++) {
            User User = (User) UserList.get(i);

            if (User.getNick().equals(Nick)) {
                Admin= User.isIsAdmin();

            }
        }
        if (Admin == false) {
            while (!exit) {
                menuAdminInteface();
                
                Scanner sc = new Scanner(System.in);
                int Option = Integer.parseInt(sc.nextLine());

                switch (Option){
                    case 1:
                        ChangeVisibility();
                        break;
                    case 2:
                        System.out.println("Enter Nick to ban::");
                        String nickToBan = sc.nextLine();
                        
                        System.out.println("Enter start date in DD-MM-YYY:");
                        String beginDate = sc.nextLine();
                        System.out.println("Enter end date in DD-MM-YYY:");
	                String endDate = sc.nextLine();

                        Suspend(nickToBan,beginDate,endDate);
                        break;

                    case 3:
                        exit = true;
                        break;

                    default:
                        System.out.println("Please, select a valid option");

                }
            }
        }
        
        else {
            
        }
    }

    private void menuAdminInteface(){
        System.out.println(
                          " ***********************************************************\n"
                        + "****************** MENU ADMIN ******************************\n"
                        + "                                                            \n"
                        + "               1-CHANGUE POST´S VISIBILITY                  \n"
                        + "               2-BAN USER                                   \n"
                        + "               3-EXIT                                       \n"
                        + "                                                            \n"
                        + "************************************************************\n");
    }
    
    private void ChangeVisibility() { 
        System.out.println("Do you want to changue post´s visibility? Y/N");
        Scanner sc = new Scanner(System.in);
        String ask = sc.nextLine();
        
        if (ask.equals("Y")) {
            this.Visibility = !Visibility;
            System.out.println("Visibility changued");
        } else {
            System.out.println("Visibility not changued");

        }
    }

    private void Suspend(final String Nick, String beginDate, String endDate) throws IOException, ClassNotFoundException, ParseException {
        Ban Ban = new Ban(Nick,true,beginDate,endDate);
    }


    public String toString(){
        return "Tittle: "+ Tittle;
    
    }
    
    
    
}
