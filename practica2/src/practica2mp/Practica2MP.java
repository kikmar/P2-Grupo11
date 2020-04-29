package practica2mp;

import ForumSystem.Coment;
import ForumSystem.Forum;
import ForumSystem.Post;
import LoginSystem.Identifier;
import Main.Main;
import UserSystem.Ban;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Practica2MP {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("WELCOME TO UREEDITJC");
        System.out.println("INITIALIZING SYSTEM");
        Forum Forum = new Forum();
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("LETS REGISTER SOME USERS");
        System.out.println("INITIALIZING REGISTER SYSTEM");
        File Users = new File("DataBase/Users/UsersDataBase.obj");
        File Bans = new File("DataBase/Bans/BansDataBase.obj");
        Identifier Identifier = new Identifier(Users,Bans);
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        System.out.println("CASE 1: REGISTERING A TEACHER");
            if(Identifier.Register("Cristian","De Gracia","Nuero","Cr","Cristian@urjc.es","1234")){
                System.out.println("Register completed");
                System.out.println();
            }
            else{
                System.out.println("Register failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
            
         System.out.println("CASE 2: REGISTERING A STUDENT");
            if(Identifier.Register("Aitor","Lopez","Del Alamo","At","Aitor@alumnos.urjc.es","1234")){
                System.out.println("Register completed");
                System.out.println();
            }
            else{
                System.out.println("Register failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        System.out.println("CASE 3: REGISTERING A USER WITH INVALID EMAIL");
            if(Identifier.Register("Adrian","Lopez","Garcia","Ad","Adrian@gmail.com","1234")){
                System.out.println("Register completed");
                System.out.println();
            }
            else{
                System.out.println("Register failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("NOW LETS LOGIN SOME USERS");
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        System.out.println("CASE 1: LOGIN A TEACHER");
            if(Identifier.Login("Cristian@urjc.es","1234")){
                System.out.println("Login completed");
                System.out.println();
            }
            else{
                System.out.println("Login failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        System.out.println("CASE 2: LOGIN A STUDENT");
            if(Identifier.Login("Aitor@alumnos.urjc.es","1234")){
                System.out.println("Login completed");
                System.out.println();
            }
            else{
                System.out.println("Login failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        
        System.out.println("CASE 3: LOGIN A USER THAT IS ALREADY LOGIN");
            if(Identifier.Login("Aitor@alumnos.urjc.es","1234")){
                System.out.println("Login completed");
                System.out.println();
            }
            else{
                System.out.println("Login failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 4: LOGIN A USER WITHOUT ACCOUNT");
            if(Identifier.Login("Hugo@alumnos.urjc.es","1234")){
                System.out.println("Login completed");
                System.out.println();
            }
            else{
                System.out.println("Login failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        
        System.out.println("CASE 5: LOGIN A USER WHOSE PASSWORD IS WRONG");
            if(Identifier.Login("Cristian@urjc.es","123")){
                System.out.println("Login completed");
                System.out.println();
            }
            else{
                System.out.println("Login failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("NEXT WE ARE TRYING TO LOGOUT SOME USERS");
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        System.out.println("CASE 1: LOGOUT A LOGGED USER");
            if(Identifier.Logout("Cristian@urjc.es","1234")){
                System.out.println("Logout completed");
                System.out.println();
            }
            else{
                System.out.println("Logout failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 2: LOGOUT A LOGGEDOUT USER");
            if(Identifier.Logout("Cristian@urjc.es","1234")){
                System.out.println("Logout completed");
                System.out.println();
            }
            else{
                System.out.println("Logout failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 3: LOGOUT A USER WHO HAVEN´T LOGIN OR HAVE ALREADY LOGOUT");
            if(Identifier.Logout("Cristian@urjc.es","1234")){
                System.out.println("Logout completed");
                System.out.println();
            }
            else{
                System.out.println("Logout failed");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("IT´S A GOOD MOMENT TO TRY TO CREATE A SUBFORUM");
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine(); 
        
        System.out.println("CASE 1: A TEACHER CREATES A SUBFORUM");
            if(Forum.CreateSubForum("Cr","A")){
                System.out.println("Subforum created");
                System.out.println();
            }
            else{
                System.out.println("Error creating subforum");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 2: A STUDENT TRY TO CREATE A SUBFORUM");
            if(Forum.CreateSubForum("At","B")){
                System.out.println("Subforum created");
                System.out.println();
            }
            else{
                System.out.println("Error creating subforum");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 3: A NON REGISTERED USER TRY TO CREATE A SUBFORUM");
            if(Forum.CreateSubForum("Xx","C")){
                System.out.println("Subforum created");
                System.out.println();
            }
            else{
                System.out.println("Error creating subforum");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("LETS TRY TO CREATE SOME POSTS");
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 1: USER CREATES A POST");
            if(Forum.CreatePost("A","Apost","Cr",1,"PlainText")){
                System.out.println("Post created");
                System.out.println();
            }
            else{
                System.out.println("Error creating post");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 2: USER CREATES A POST BUT THE SUBFORUM IS NOT FOUND");
            if(Forum.CreatePost("B","Apost","Cr",1,"PlainText")){
                System.out.println("Post created");
                System.out.println();
            }
            else{
                System.out.println("Error creating post");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 3: A TEACHER CREATES A POST WITH DIFFERENT TYPE OF PLAINTEXT");
            if(Forum.CreatePost("A","Apost2","Cr",2,"Exercises")){
                System.out.println("Post created");
                System.out.println();
            }
            else{
                System.out.println("Error creating post");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 4: A STUDENT CREATES A POST WITH DIFFERENT TYPE OF PLAINTEXT");
            if(Forum.CreatePost("A","Apost2","At",2,"Exercises")){
                System.out.println("Post created");
                System.out.println();
            }
            else{
                System.out.println("Error creating post");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 5: A STUDENT CREATES A POST OF PLAINTEXT");
            if(Forum.CreatePost("A","Apost2","At",1,"PlainText")){
                System.out.println("Post created");
                System.out.println();
            }
            else{
                System.out.println("Error creating post");
                System.out.println();
            }
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("NOW WE ARE GOING TO TRY SOME OPTIONS OF THE POSTS");
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 1: VOTE POSITIVE A CREATED POST");
            if(Forum.VotePost("A","Apost","At", true)){
                System.out.println("Post voted");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }   
            Forum.ViewVotesOfAPost("A","Apost");
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 2: VOTE POSITIVE AGAIN THE POST");
            if(Forum.VotePost("A","Apost","At", true)){
                System.out.println("Post voted");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }   
            Forum.ViewVotesOfAPost("A","Apost");
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        
        System.out.println("CASE 3: POST´S OWNER TRY TO VOTE HIS POST");
            if(Forum.VotePost("A","Apost","Cr", true)){
                System.out.println("Post voted");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }   
            Forum.ViewVotesOfAPost("A","Apost");
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 4: NON REGISTERED USER TRY TO VOTE A POST");
            if(Forum.VotePost("A","Apost","SDA", true)){
                System.out.println("Post voted");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }   
            Forum.ViewVotesOfAPost("A","Apost");
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 5: ANOTHER USER VOTE POSITIVE");
        Identifier.Register("Hugo","Gonzalez","Nuero","Hg","Hugo@urjc.es","1234");
        Identifier.Login("Hugo@urjc.es","1234");
            if(Forum.VotePost("A","Apost","Hg", true)){
                System.out.println("Post voted");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }   
            Forum.ViewVotesOfAPost("A","Apost");
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 6: THE FIRST USER CHANGUES HER MIND AND VOTE NEGATIVE");
            if(Forum.VotePost("A","Apost","At", false)){
                System.out.println("Post voted");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }   
            Forum.ViewVotesOfAPost("A","Apost");
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 7: WE WANT TO SHARE THE POST");
            System.out.println(Forum.SharePost("A","Apost"));
            System.out.println();
        
        System.out.println("CASE 8: COMENT A POST");
            if(Forum.ComentPost("A","Apost","At", "This is my coment")){
                System.out.println("Post comented");
                Forum.ViewPostComents("A","Apost");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }
            
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 9: ADD ANOTHER COMENT");
            if(Forum.ComentPost("A","Apost","Cr", "This is my coment")){
                System.out.println("Post comented");
                Forum.ViewPostComents("A","Apost");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }
            
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 10: VOTE A COMENT");
            if(Forum.VoteComent("A","Apost","At","Cr", "This is my coment",true)){
                System.out.println("Post comented");
                Forum.ViewPostComents("A","Apost");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }
            
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 11: TRY TO VOTE THE SAME COMENT WITH THE SAME USER");
            if(Forum.VoteComent("A","Apost","At","Cr", "This is my coment",true)){
                System.out.println("Post comented");
                Forum.ViewPostComents("A","Apost");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }
            
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 12: VOTE THE SAME COMENT WITH ANOTHER USER");
            if(Forum.VoteComent("A","Apost","Hg","Cr", "This is my coment",true)){
                System.out.println("Post comented");
                Forum.ViewPostComents("A","Apost");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }
            
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 13: THE FIRST USER CHANGUES HER MIND AND VOTE NEGATIVE ");
            if(Forum.VoteComent("A","Apost","At","Cr", "This is my coment",false)){
                System.out.println("Post comented");
                Forum.ViewPostComents("A","Apost");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }
            
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        System.out.println("CASE 14: A NON REGISTER USER TRY TO VOTE A COMENT ");
            if(Forum.VoteComent("A","Apost","RES","Cr", "This is my coment",false)){
                System.out.println("Post comented");
                Forum.ViewPostComents("A","Apost");
                System.out.println();
            }
            else{
                System.out.println("Error voting post");
                System.out.println();
            }
            
            
        System.out.println("PRESS ENTER TO CONTINUE");
        scanner.nextLine();
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
    }
    
    
    
}
