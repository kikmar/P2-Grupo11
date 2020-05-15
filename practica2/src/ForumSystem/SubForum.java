/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import UserSystem.Users.User;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author crist
 */
public class SubForum implements Serializable {
   private String SubForumName;
   
   private LinkedList<String> SubscribersList = new LinkedList();
   private LinkedList<Post> PostsList = new LinkedList();
   
   private static final long serialVersionUID = 1L;
   
   public SubForum(String SubForumName) {
        this.SubForumName = SubForumName; 
    }
   
   
    //Getters
    public String getSubForumName() {
        return SubForumName;
    }

    public LinkedList<Post> getPostsList(){
        return PostsList;
    }

    public LinkedList<String> getSubscribersList() {
        return SubscribersList;
    }
    
    
    //Setters
    public void setSubForumName(String SubForumName) {
        this.SubForumName = SubForumName;
    }

    public void setSubscribersList(LinkedList<String> SubscribersList) {
        this.SubscribersList = SubscribersList;
    }

    public void setPostsList(LinkedList<Post> PostsList) {
        this.PostsList = PostsList;
    }
    
   //Methods
   public void Suscribe (String Nick){
        boolean Subscribed = false;

        for (int i = 0; i < SubscribersList.size(); i++) {
            if (SubscribersList.get(i).equals(Nick)){
                System.out.println("Already suscribed");
                Subscribed = true;
            }
        }
        if (Subscribed == false){
            SubscribersList.add(Nick);
            System.out.println("Subscription done");               
        }       
    }
   
   public void Unsubscribe (String Nick){
        boolean Subscribed = false;
        int Position = -1;
        
        for (int i = 0; i < SubscribersList.size(); i++) {
            if (SubscribersList.get(i).equals(Nick)){
                Subscribed = true;
                Position = i;
            }
        }
        
        if (Subscribed){
            SubscribersList.remove(Position);
            System.out.println("Unsusbription done");  
        } 
        
        else {
            System.out.println("Already unsuscribed");  
        }
    }
   
   public boolean CreatePost(String Tittle,String Owner, int TypeOfContent, String PostContent) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean PostCreated = false; 
       
        Post Post = new Post(Tittle,Owner,TypeOfContent,PostContent);
        if (Post.getValid() !=-1){
            PostCreated = true;
            PostsList.add(Post);
            
            Notification Notification = new Notification("New post has been created in"+this.SubForumName,false);
            
            LinkedList <User> UserList = GetUserList();
            for (int i=0; i<UserList.size();i++){
                User User = (User) UserList.get(i);
                
                try{
                    if(SubscribersList.get(i).equals(User.getNick())){
                        User.getNotificationsList().add(Notification);
                        UserList.remove(i);
                        UserList.add(User);
                    }  
                }
                catch(IndexOutOfBoundsException IOOBE){
                    
                }
                
            }
            
            //Then rewrite the list with the new user    
            FileOutputStream OutputFile = new FileOutputStream("DataBase/Users/UsersDataBase.obj");
            ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
            OutputObject.writeObject(UserList); 
        }
       return PostCreated; 
    }
    
   private LinkedList<User> GetUserList() throws FileNotFoundException, IOException, ClassNotFoundException {
        final FileInputStream InputFile = new FileInputStream("DataBase/Users/UsersDataBase.obj");
        final ObjectInputStream InputObject = new ObjectInputStream(InputFile);

        final LinkedList<User> UserList = (LinkedList<User>) InputObject.readObject();

        InputFile.close();
        InputObject.close();

        return UserList;
    }
    
   public String toString(){
        return "SubForumName: "+SubForumName;
    
    }
    
}
