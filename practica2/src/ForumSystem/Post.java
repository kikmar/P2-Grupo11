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
import UserSystem.Users.User;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedList;

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
        this.Valid = -1;

        if (IsUser(Owner)){
           if(IsTeacher(Owner)){
            
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
       
    //Getters
    public String getTittle(){
        return Tittle;
        
    }

    public int getValoration() {
        return Valoration;
    }

    public boolean isVisibility() {
        return Visibility;
    }

    public String getOwner() {
        return Owner;
    }

    public int getValid() {
        return Valid;
    }

    public LinkedList<Content> getContentList() {
        return ContentList;
    }

    public LinkedList<NickVote> getValorantsList() {
        return ValorantsList;
    }
    
    public LinkedList<Coment> getComentList() {
        return ComentList;
    }
    
    
    //Setters
    public void setTittle(String Tittle) {
        this.Tittle = Tittle;
    }

    public void setValoration(int Valoration) {
        this.Valoration = Valoration;
    }

    public void setVisibility(boolean Visibility) {
        this.Visibility = Visibility;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setValid(int Valid) {
        this.Valid = Valid;
    }

    public void setContentList(LinkedList<Content> ContentList) {
        this.ContentList = ContentList;
    }

    public void setComentList(LinkedList<Coment> ComentList) {
        this.ComentList = ComentList;
    }

    public void setValorantsList(LinkedList<NickVote> ValorantsList) {    
        this.ValorantsList = ValorantsList;
    }
    
    
    //Methods
    public void Coment(String Nick, String Text) throws IOException, FileNotFoundException, ClassNotFoundException {
        if (IsUser(Nick)){
            Coment Coment = new Coment(Nick,Text,0);
            ComentList.add(Coment);
        }
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
                        if (ValorantsList.get(i).isVote() & Vote){
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
                        hasVoted = true;
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
        
        else{
            isAllOk = false;
        }
        
        
        
        return isAllOk;
    }
   
    public String Share(){
       return "https://uredditjc.es/"+Tittle;
   }
    

    private boolean IsTeacher(String Owner) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsTeacher = true;
        
        LinkedList UserList = GetUserList();
        
        for(int i=0; i<UserList.size();i++){
            User User = (User) UserList.get(i);
            
            if(User.getNick().equals(Owner)){               
                if (User.isIsStudent()){
                   IsTeacher=false; 
                } 
            }
        }
        
        return IsTeacher;     
    }
    
    private boolean IsUser(String Owner) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean Found = false;
        LinkedList UserList = GetUserList();
        
        for(int i=0; i<UserList.size();i++){
            User User = (User) UserList.get(i);
            
            if(User.getNick().equals(Owner)){
                Found = true;
            }
        }    
        return Found;
    }
    
    private LinkedList<User> GetUserList() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream("DataBase/Users/UsersDataBase.obj");
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
        LinkedList <User> UserList  = (LinkedList <User>) InputObject.readObject();
        
        InputFile.close();
        InputObject.close();
        
        return UserList;
    }

    public int Mostrar(){       // Deberia ser void pero ponemos int para comprobar el test y el return no deberia existir
        System.out.println(Tittle);
        int i;
        for(i=0; i<ContentList.size();i++){
            System.out.println(ContentList.get(i).getPostContent());
        }
        return i;
    }

    public String toString(){
        return "Tittle: "+ Tittle;
    
    }
 
}
