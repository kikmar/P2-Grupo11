/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ForumSystem.Forum;
import LoginSystem.Identifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Main {
    
    //DataBaseFiles
    private File Users = new File("DataBase/Users/UsersDataBase.obj");
    private File Bans = new File("DataBase/Bans/BansDataBase.obj");

    public Main() throws IOException, FileNotFoundException, ClassNotFoundException {
        
        //Objects initialization
        Forum forum = new Forum();
        Identifier ident = new Identifier(Users,Bans);
        
        
        int option = 0;
        while(option !=-1){
            
            MenuForo();
            
            Scanner scanner = new Scanner(System.in);     
            option = scanner.nextInt();  
        
            switch(option) {
                case 1:
                    if(Register(ident)){
                        System.out.println("Register completed");
                    } 
                    else{
                       System.out.println("Failed at register"); 
                    }
                    break;
                case 2:
                    if(Login(ident)){
                        System.out.println("Login completed");
                    } 
                    else{
                       System.out.println("Failed at Login"); 
                    }

                    break;
                case 3:
                    if(Logout(ident)){
                        System.out.println("Logout completed");
                    } 
                    else{
                       System.out.println("Failed at Logout"); 
                    }
                    break;
              }
        }
       
    }
    
    private void MenuForo(){
        System.out.println("Select one");
        System.out.println("1-Register");
        System.out.println("2-Login");
        System.out.println("3-Logout");
         
    }
    
    private boolean Register(Identifier ident) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean Ok = false;
                
         Scanner scanner = new Scanner(System.in); 
            System.out.println("Enter your Name");
            String Name = scanner.nextLine(); 
            
            System.out.println("Enter yor First Surname");
            String Surname1 = scanner.nextLine(); 
            
            System.out.println("Enter your Second Surname");
            String Surname2 = scanner.nextLine(); 
            
            System.out.println("Enter your Nick");
            String Nick = scanner.nextLine(); 
            
            System.out.println("Enter your Email");
            String Email = scanner.nextLine(); 
            
            System.out.println("Enter your Password");
            String Password = scanner.nextLine(); 
        
        Ok = ident.Register(Name,Surname1,Surname2,Nick,Email,Password);
        return Ok;
    }
    
    private boolean Login(Identifier ident) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean Ok = false;
        
        Scanner scanner = new Scanner(System.in); 
            System.out.println("Enter your Email");
            String Email = scanner.nextLine(); 
            
            System.out.println("Enter yor Password");
            String Password= scanner.nextLine();
        
        Ok = ident.Login(Email,Password);
        return Ok;

    }
    
    private boolean Logout(Identifier ident) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean Ok = false;
        
        Scanner scanner = new Scanner(System.in); 
            System.out.println("Enter your Email");
            String Email = scanner.nextLine(); 
            
            System.out.println("Enter yor Password");
            String Password= scanner.nextLine();
            
        Ok = ident.Logout(Email,Password);
        return Ok;
    }
}
