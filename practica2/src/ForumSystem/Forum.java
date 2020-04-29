/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import UserSystem.Ban;
import UserSystem.Users.User;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.LinkedList;

/**
 *
 * @author crist
 */
public class Forum implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public Forum() throws IOException, ClassNotFoundException{

    }
    
    //Methods
    
    //SubForum Methods
    public boolean CreateSubForum(String Nick,String SubForumName) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsTeacher = false;
        LinkedList UserList = GetUserList();
        
        if(!AlreadyExistsSubForum(SubForumName)){
            for(int i = 0; i<UserList.size();i++){
                User User = (User) UserList.get(i);

                if (User.getNick().equals(Nick)&& !User.isIsStudent()){
                    
                    //Store Data
                    SubForum SubForum = new SubForum(SubForumName);
                    WriteDataToDataBase(SubForum);
                    IsTeacher = true;
                } 
            }
        }
        return IsTeacher;
    }
    
    
    //Post Methods
    public boolean CreatePost(String SubForumName,String Tittle, String Owner,int TypeOfContent,String PostContent) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsCreated = false;
        
        if(!AlreadyExistsPost(SubForumName,Tittle)){
            LinkedList <SubForum> SubForumList = GetSubForumList();

            for(int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);

                if(SubForum.getSubForumName().equals(SubForumName)){
                    if(SubForum.CreatePost(Tittle, Owner, TypeOfContent, PostContent)){
                        
                        //Update changues
                        SubForumList.remove(i);
                        SubForumList.add(SubForum);
                        UpdateChangues("DataBase/Forum/ForumDataBase.obj",SubForumList);                    
                        IsCreated = true;
                    }
                }
            }
        }
        
        return IsCreated;
    }
    
    public boolean VotePost(String SubForumName,String Tittle,String Nick, boolean Vote) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsVoted = false; 
        LinkedList <SubForum> SubForumList = GetSubForumList();
              
        if (IsUser(Nick)){
            
            //Find the Post
            for(int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);
            
                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();

                    for (int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);

                        if(Post.getTittle().equals(Tittle)){
                            if(Post.isVisibility()){
                                if(Post.VotePost(Nick, Vote)){
                                    
                                    //Update the post
                                    SubForumList.remove(i);
                                    SubForumList.add(SubForum);
                                    UpdateChangues("DataBase/Forum/ForumDataBase.obj",SubForumList);    
                                    IsVoted = true;  
                                } 
                            }
                        }
                    }
                }
            }
        }
        return IsVoted;        
    }
    
    public void ViewVotesOfAPost(String SubForumName,String Tittle) throws IOException, FileNotFoundException, ClassNotFoundException{
        LinkedList <SubForum> SubForumList = GetSubForumList();
        
        //Find the post
        for(int i=0; i<SubForumList.size();i++){
            SubForum SubForum = SubForumList.get(i);
            
            if(SubForum.getSubForumName().equals(SubForumName)){
                LinkedList <Post> PostList = SubForum.getPostsList();
                
                for (int j=0;j<PostList.size();j++){
                    Post Post = PostList.get(j);
                                    
                    if(Post.getTittle().equals(Tittle)){
                        if(Post.isVisibility()){
                            System.out.println("Votes: "+Post.getValoration());
                        }                        
                    }
                }
            }
        }
    }
    
    public String SharePost(String SubForumName,String Tittle) throws IOException, FileNotFoundException, ClassNotFoundException{
        String URL=""; 
        LinkedList <SubForum> SubForumList = GetSubForumList();
        
        //Find the post
        for(int i=0; i<SubForumList.size();i++){
            SubForum SubForum = SubForumList.get(i);
            
            if(SubForum.getSubForumName().equals(SubForumName)){
                LinkedList <Post> PostList = SubForum.getPostsList();
                
                for (int j=0;j<PostList.size();j++){
                    Post Post = PostList.get(j);
                                    
                    if(Post.getTittle().equals(Tittle)){
                        if(Post.isVisibility()){
                           URL = Post.Share(); 
                        } 
                    }
                } 
            }
        }
        return URL;    
    }
    
    
    //Coments Methods
    public boolean ComentPost(String SubForumName,String Tittle,String Nick, String Text) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsComent = false;
        
        if(!AlreadyExistsComent(SubForumName,Tittle,Nick,Text)){            
            LinkedList <SubForum> SubForumList = GetSubForumList();

            if (IsUser(Nick)){
                for(int i=0; i<SubForumList.size();i++){
                    SubForum SubForum = SubForumList.get(i);

                    if(SubForum.getSubForumName().equals(SubForumName)){
                        LinkedList <Post> PostList = SubForum.getPostsList();

                        for (int j=0;j<PostList.size();j++){
                            Post Post = PostList.get(j);

                            if(Post.getTittle().equals(Tittle)){
                                if(Post.isVisibility()){
                                    
                                    //Add the coment
                                    Post.Coment(Nick,Text);
                                    SubForumList.remove(i);
                                    SubForumList.add(SubForum);
                                    UpdateChangues("DataBase/Forum/ForumDataBase.obj",SubForumList);    
                                    IsComent = true;
                                }   
                            }
                        }
                    }
                }
            }
        }
        return IsComent;
    }
 
    public boolean VoteComent(String SubForumName,String Tittle,String NickVoter,String NickCreator,String Text, boolean Vote) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsVoted = false; 

        LinkedList <SubForum> SubForumList = GetSubForumList();
        LinkedList <Coment> ComentList = new LinkedList();

        
        if (IsUser(NickVoter)){
            for(int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);
            
                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();

                    for (int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);


                        if(Post.getTittle().equals(Tittle)){
                            ComentList = Post.getComentList();
                            
                            for (int k=0;k<ComentList.size();k++){
                                Coment Coment = ComentList.get(k);
                                
                                if(Coment.getNick().equals(NickCreator) && Coment.getText().equals(Text)){
                                    if(Post.isVisibility()){
                                        if(Coment.VoteComent(NickVoter,Vote)){
                                            SubForumList.remove(i);
                                            SubForumList.add(SubForum);
                                            UpdateChangues("DataBase/Forum/ForumDataBase.obj",SubForumList);    
                                            IsVoted = true;
                                        } 
                                    } 
                                }
                            }
                        }
                    }
                }
            }
        }
        return IsVoted;
    }
    
    public void ViewPostComents(String SubForumName,String Tittle) throws IOException, FileNotFoundException, ClassNotFoundException{
        LinkedList <SubForum> SubForumList = GetSubForumList();
        LinkedList <Coment> ComentsList = null;
        
        //Find the coments of the post
        for(int i=0; i<SubForumList.size();i++){
            SubForum SubForum = SubForumList.get(i);
            
            if(SubForum.getSubForumName().equals(SubForumName)){
                LinkedList <Post> PostList = SubForum.getPostsList();
                
                for (int j=0;j<PostList.size();j++){
                    Post Post = PostList.get(j);
                                    
                    if(Post.getTittle().equals(Tittle)){
                        if(Post.isVisibility()){
                            ComentsList = Post.getComentList();
                        }                       
                    }
                }  
            }
        }
        
        //If there is no coments
        try{
            for (int j=0; j<ComentsList.size();j++){
                System.out.println(ComentsList.get(j).toString());
            }  
        } 
        catch(NullPointerException NPE){
            System.out.println("No coments yet");
        }

    }
    
   
    //Admin Methods
    public void SetAdmin(String Nick,boolean Admin) throws IOException, FileNotFoundException, ClassNotFoundException{
        LinkedList <User> UserList = GetUserList();
        
        for (int i=0; i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(User.getNick().equals(Nick)){
                User.setIsAdmin(Admin);
                UserList.remove(i);
                UserList.add(User);
                UpdateChangues("DataBase/Users/UsersDataBase.obj",UserList);
            }
        }
    }
    
    public boolean ChangueVisibility(String Nick,String SubForumName,String Tittle,boolean Visibility) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsAdmin = IsAdmin(Nick);
        boolean IsChangued = false;
        
        LinkedList <User> UserList = GetUserList();
        LinkedList <SubForum> SubForumList = GetSubForumList();
        
        for (int i=0; i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(User.getNick().equals(Nick) && User.isIsAdmin()){
                IsAdmin = true;
 
            }
        }
        
        if (IsAdmin){
            for(int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);

                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();

                    for (int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);

                        if(Post.getTittle().equals(Tittle)){
                            Post.setVisibility(Visibility);
                            SubForumList.remove(i);
                            SubForumList.add(SubForum);
                            UpdateChangues("DataBase/Forum/ForumDataBase.obj",SubForumList);    
                            IsChangued = true;
                              
                        }
                    }
                }
            }
        }
        return IsChangued;
    }
    
    public boolean BanUser(String Admin,String BannedUser,String beginDate,String endDate) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException{
        boolean IsBanned = false;
        boolean IsAdmin = IsAdmin(Admin);
        
        LinkedList <User> UserList = GetUserList();   
        
        if(IsAdmin){
            for (int i=0; i<UserList.size();i++){
                User User = UserList.get(i);

                if(User.getNick().equals(BannedUser)){
                    Ban Ban = new Ban(BannedUser,true,beginDate,endDate);
                    IsBanned = true;
                }
            }
        }
        return IsBanned;
    }
    
    public boolean DeleteBan(String Admin, String Nick) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean BanDeleted = false;
        
        if(IsAdmin(Admin)){
            LinkedList <Ban> BanList = GetBanList(); 
        
            for (int i=0;i<BanList.size();i++){
                Ban Ban = BanList.get(i);

                if(Ban.getNick().equals(Nick)){
                    BanList.remove(i); 
                    FileOutputStream OutputFile = new FileOutputStream("DataBase/Bans/BansDataBase.obj");
                    ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
                    OutputObject.writeObject(BanList);
                    BanDeleted = true;
                }
            }
        }
        return BanDeleted;
    }
    
    
    //Auxiliar Methods
    private boolean IsAdmin(String Nick) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsAdmin = false;
        LinkedList <User> UserList = GetUserList();       
        for (int i=0; i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(User.getNick().equals(Nick) && User.isIsAdmin()){
                IsAdmin = true;
            }
        }
        return IsAdmin;
    }
    
    private boolean IsUser(String Nick) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsUser = false;
        LinkedList <User> UserList = GetUserList();
        
        //Find in the data base the nick given
        for (int i=0;i<UserList.size();i++){
            User User = UserList.get(i);
            
            if(Nick.equals(User.getNick())){
                IsUser = true;
            }
        }
        return IsUser;
    }
    
    private boolean AlreadyExistsSubForum(String SubForumName) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean Exists = false;
        LinkedList <SubForum> SubForumList = GetSubForumList();
        if(SubForumList!=null){
           for (int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);

                if(SubForum.getSubForumName().equals(SubForumName)){
                    Exists = true;
                }
            } 
        }         
        return Exists;
    }
    
    private boolean AlreadyExistsPost(String SubForumName,String Tittle) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean Exists = false;
        LinkedList <SubForum> SubForumList = GetSubForumList();
        
        if(SubForumList!=null){
            
           for (int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);
                
                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();
                    
                    for(int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);
                        
                        if(Post.getTittle().equals(Tittle)){
                            Exists = true;
                        }
                    } 
                }
            } 
        }        
        return Exists;
    }
    
    private boolean AlreadyExistsComent(String SubForumName,String Tittle,String Nick,String Text) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean Exists = false;
        LinkedList <SubForum> SubForumList = GetSubForumList();
        
        if(SubForumList!=null){
            
           for (int i=0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);
                
                if(SubForum.getSubForumName().equals(SubForumName)){
                    LinkedList <Post> PostList = SubForum.getPostsList();
                    
                    for(int j=0;j<PostList.size();j++){
                        Post Post = PostList.get(j);
                        
                        if(Post.getTittle().equals(Tittle)){
                            LinkedList <Coment> ComentsList = Post.getComentList();
                            
                            for(int k=0;k<ComentsList.size();k++){
                                Coment Coment = ComentsList.get(k);
                                
                                if(Coment.getNick().equals(Nick)&&Coment.getText().equals(Text)){
                                    Exists = true;
                                }
                            }
                        }
                    } 
                }
            } 
        }        
        return Exists;
    }
    
    
    //Get Data From DataBase Methods
    private LinkedList<User> GetUserList() throws FileNotFoundException, IOException, ClassNotFoundException{
        File Users = new File("DataBase/Users/UsersDataBase.obj");
        Users.createNewFile();
        try{
            FileInputStream InputFile = new FileInputStream(Users);
            ObjectInputStream InputObject = new ObjectInputStream(InputFile);

            LinkedList <User> UserList  = (LinkedList <User>) InputObject.readObject();

            InputFile.close();
            InputObject.close();

            return UserList;
        }
        catch (EOFException e){
         return null;  
       }   
    }
    
    private LinkedList<SubForum> GetSubForumList() throws FileNotFoundException, IOException, ClassNotFoundException{
        File SubForums = new File("DataBase/Forum/ForumDataBase.obj");
        SubForums.createNewFile();
        try{
            FileInputStream InputFile = new FileInputStream(SubForums);
            ObjectInputStream InputObject = new ObjectInputStream(InputFile);

            LinkedList <SubForum> SubForumList  = (LinkedList <SubForum>) InputObject.readObject();

            InputFile.close();
            InputObject.close();

            return SubForumList;
        }
        catch(EOFException e){
            return null;
        }
        
    }
    
    private LinkedList<Ban> GetBanList() throws FileNotFoundException, IOException, ClassNotFoundException{
        File Bans = new File("DataBase/Bans/BansDataBase.obj");
        Bans.createNewFile();
        try{
            FileInputStream InputFile = new FileInputStream("DataBase/Bans/BansDataBase.obj");
            ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
            LinkedList <Ban> BanList  = (LinkedList <Ban>) InputObject.readObject();
        
            InputFile.close();
            InputObject.close();
        
            return BanList;
        }
        catch (EOFException e){
            return null;  
        }
        
    }
    
    
    //Write To DataBase Methods
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
    
    public void UpdateChangues(String URL,LinkedList List) throws FileNotFoundException, IOException{
        FileOutputStream OutputFile = new FileOutputStream(URL);
        ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
        OutputObject.writeObject(List);
    }
    
    
    //Show The Forum Method
    public void Mostrar() throws FileNotFoundException, IOException, ClassNotFoundException{

        LinkedList <SubForum> SubForumList  = GetSubForumList();
        LinkedList <User> UserList  = GetUserList();

        System.out.println("REGISTERED USERS");
        System.out.println();

        if(UserList != null){
            for(int l=0;l<UserList.size();l++){
                User User = UserList.get(l);
                System.out.println("USER"+l+": "+User.toString());
            }
        }
        else{
            System.out.println("NO USERS REGISTERED YET");
            System.out.println();
        }
        
        System.out.println();
        System.out.println("SUBFORUMS CREATED");
        System.out.println();
        
        if(SubForumList != null){
            for(int i = 0; i<SubForumList.size();i++){
                SubForum SubForum = SubForumList.get(i);
                System.out.println("SUBFORUM "+i+": "+SubForum.getSubForumName());
                LinkedList <Post> PostList = SubForum.getPostsList();

                for(int j=0; j<PostList.size();j++){
                    Post Post = PostList.get(j);
                    System.out.println("POST "+j+": "+Post.getTittle());
                    System.out.println("CONTENT: " +Post.getContentList().get(0).toString());
                    LinkedList <Coment> ComentsList = Post.getComentList();

                    for(int k=0; k<ComentsList.size();k++){
                        Coment Coment = ComentsList.get(k);
                        System.out.println("COMENT "+k+": "+ Coment.toString());
                    }
                }
            }
        }
        else{
            System.out.println("NO SUBFORUMS CREATED YET");
        }      
    }
}
