/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import UserSystem.Users.User;
import java.io.File;
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
public class Forum implements Serializable {
    
    
    
    private static final long serialVersionUID = 1L;
    
    public Forum() throws IOException, ClassNotFoundException{
        SubForum SubForum = new SubForum("Starter Page");
        WriteDataToDataBase(SubForum);
    }
    
    public boolean CreateSubForum(String Nick,String Name) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsTeacher = false;
        LinkedList UserList = GetUserList();
        
        for(int i = 0; i<UserList.size();i++){
            User User = (User) UserList.get(i);
            
            if (User.getNick().equals(Nick)&& !User.isIsStudent()){
                SubForum SubForum = new SubForum(Name);
                WriteDataToDataBase(SubForum);
                IsTeacher = true;
            } 
        }
        
        return IsTeacher;
    }
    
    public boolean CreatePost(String SubForumName,String Tittle, String Owner,int TypeOfContent,String PostContent) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsCreated = false;
        LinkedList <SubForum> SubForumList = GetSubForumList();
        
       
        
        for(int i=0; i<SubForumList.size();i++){
            SubForum SubForum = SubForumList.get(i);
            
            if(SubForum.getSubForumName().equals(SubForumName)){
                if(SubForum.CreatePost(Tittle, Owner, TypeOfContent, PostContent)){
                    
                    SubForumList.remove(i);
                    SubForumList.add(SubForum);
                    
                    //Then rewrite the list with the new user    
                    FileOutputStream OutputFile = new FileOutputStream("DataBase/Forum/ForumDataBase.obj");
                    ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
                    OutputObject.writeObject(SubForumList);
                    
                    IsCreated = true;
                }
                
            }
        }
        return IsCreated;
    }
    
    public boolean VotePost(String SubForumName,String Tittle,String Nick, boolean Vote) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean isVoted = false; 
        boolean isUser = false;
        
        LinkedList <User> UserList = GetUserList();
        LinkedList <SubForum> SubForumList = GetSubForumList();
        
        for (int i=0;i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(Nick.equals(User.getNick())){
                isUser = true;
            }
        }
        
        if (isUser){
            for(int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);
            
                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();

                    for (int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);


                        if(Post.getTittle().equals(Tittle)){
                            Post.VotePost(Nick, Vote);

                            SubForumList.remove(i);
                            SubForumList.add(SubForum);

                            //Then rewrite the list with the new user    
                            FileOutputStream OutputFile = new FileOutputStream("DataBase/Forum/ForumDataBase.obj");
                            ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
                            OutputObject.writeObject(SubForumList);

                            isVoted = true;
                        }
                    }


                }
            }
        }

        
        return isVoted;
        
    }
    
    public void ViewVotesOfAPost(String SubForumName,String Tittle) throws IOException, FileNotFoundException, ClassNotFoundException{
        LinkedList <SubForum> SubForumList = GetSubForumList();

        for(int i=0; i<SubForumList.size();i++){
            SubForum SubForum = SubForumList.get(i);
            
            if(SubForum.getSubForumName().equals(SubForumName)){
                LinkedList <Post> PostList = SubForum.getPostsList();
                
                for (int j=0;j<PostList.size();j++){
                    Post Post = PostList.get(j);
                                    
                    if(Post.getTittle().equals(Tittle)){
                        System.out.println("Votes: "+Post.getValoration());
                    }
                }
                
                
            }
        }
    }
    
    public String SharePost(String SubForumName,String Tittle) throws IOException, FileNotFoundException, ClassNotFoundException{
        String URL="";
        
        LinkedList <SubForum> SubForumList = GetSubForumList();

        for(int i=0; i<SubForumList.size();i++){
            SubForum SubForum = SubForumList.get(i);
            
            if(SubForum.getSubForumName().equals(SubForumName)){
                LinkedList <Post> PostList = SubForum.getPostsList();
                
                for (int j=0;j<PostList.size();j++){
                    Post Post = PostList.get(j);
                                    
                    if(Post.getTittle().equals(Tittle)){
                        URL = Post.Share();
                    }
                }
                
                
            }
        }
        
        return URL;
        
    }
    
    public boolean ComentPost(String SubForumName,String Tittle,String Nick, String Text) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean isComent = false;
        boolean isUser = false;
        
        LinkedList <SubForum> SubForumList = GetSubForumList();
        LinkedList <User> UserList = GetUserList();
        
        for (int i=0;i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(Nick.equals(User.getNick())){
                isUser = true;
            }
        }
        
        if (isUser){
            for(int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);

                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();

                    for (int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);

                        if(Post.getTittle().equals(Tittle)){
                            Post.Coment(Nick,Text);
                            
                            SubForumList.remove(i);
                            SubForumList.add(SubForum);
                                    
                            //Then rewrite the list with the new user    
                            FileOutputStream OutputFile = new FileOutputStream("DataBase/Forum/ForumDataBase.obj");
                            ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
                            OutputObject.writeObject(SubForumList);
                            
                            isComent = true;
                        }

                    }


                }
            }
        }
        
        
        return isComent;
    }
    
    public void ViewPostComents(String SubForumName,String Tittle) throws IOException, FileNotFoundException, ClassNotFoundException{
        LinkedList <SubForum> SubForumList = GetSubForumList();
        LinkedList <Coment> ComentsList = null;

        for(int i=0; i<SubForumList.size();i++){
            SubForum SubForum = SubForumList.get(i);
            
            if(SubForum.getSubForumName().equals(SubForumName)){
                LinkedList <Post> PostList = SubForum.getPostsList();
                
                for (int j=0;j<PostList.size();j++){
                    Post Post = PostList.get(j);
                                    
                    if(Post.getTittle().equals(Tittle)){
                        ComentsList = Post.getComentList();
                        
                        
                    }
                }
                
                
            }
        }
        try{
            for (int j=0; j<ComentsList.size();j++){
                System.out.println(ComentsList.get(j).toString());
            }  
        }
        
        catch(NullPointerException NPE){
            System.out.println("No coments yet");
        }
        
        
    }
    
    public boolean VoteComent(String SubForumName,String Tittle,String NickVoter,String NickCreator,String Text, boolean Vote) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean isVoted = false; 
        boolean isUser = false;
        
        LinkedList <User> UserList = GetUserList();
        LinkedList <SubForum> SubForumList = GetSubForumList();
        LinkedList <Coment> ComentList = new LinkedList();
        
        for (int i=0;i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(NickVoter.equals(User.getNick())){
                isUser = true;
            }
        }
        
        if (isUser){
            for(int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);
            
                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();

                    for (int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);


                        if(Post.getTittle().equals(Tittle)){
                            ComentList = Post.getComentList();
                            
                            for (int k=0;k<ComentList.size();k++){
                                Coment Coment = ComentList.get(i);
                                
                                if(Coment.getNick().equals(NickCreator) && Coment.getText().equals(Text)){
                                    Coment.VoteComent(NickVoter,Vote);
                                    
                                    SubForumList.remove(i);
                                    SubForumList.add(SubForum);

                                    //Then rewrite the list with the new user    
                                    FileOutputStream OutputFile = new FileOutputStream("DataBase/Forum/ForumDataBase.obj");
                                    ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
                                    OutputObject.writeObject(SubForumList);

                                    isVoted = true;
                                }
                            }
                        }
                    }


                }
            }
        }

        
        return isVoted;
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
    
    //Returns User List from Data Base
    private LinkedList<SubForum> GetSubForumList() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream("DataBase/Forum/ForumDataBase.obj");
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
        LinkedList <SubForum> SubForumList  = (LinkedList <SubForum>) InputObject.readObject();
        
        InputFile.close();
        InputObject.close();
        
        return SubForumList;
    }
    
    
    
    //Write User in to User´s file
    private void WriteDataToDataBase(SubForum CreatedSubForum) throws IOException, ClassNotFoundException{ 
        LinkedList <SubForum> SubForumList  = new LinkedList();
        //Check if there are more user´s in the file
        try{
            FileInputStream InputFile = new FileInputStream("DataBase/Forum/ForumDataBase.obj");
            ObjectInputStream InputObject = new ObjectInputStream(InputFile);
            SubForumList  = (LinkedList <SubForum>) InputObject.readObject();
            InputFile.close();
            InputObject.close();
            SubForumList.add(CreatedSubForum);         
        }
        
        //If not this is the first user
        catch (Exception FileNotFoundException){
            SubForumList.add(CreatedSubForum);
        }
        
        //Then rewrite the list with the new user    
        FileOutputStream OutputFile = new FileOutputStream("DataBase/Forum/ForumDataBase.obj");
        ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
        OutputObject.writeObject(SubForumList); 
 
        OutputFile.close();
        OutputObject.close();   
    }
    
     public void Mostrar() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream("DataBase/Forum/ForumDataBase.obj");
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
        LinkedList <SubForum> UserList  = (LinkedList <SubForum>) InputObject.readObject();
        InputFile.close();
        InputObject.close();
        for(int i = 0; i<UserList.size();i++){
            System.out.println(UserList.get(i).toString());
        }
    }
    
    
}
