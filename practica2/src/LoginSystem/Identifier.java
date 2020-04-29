/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSystem;

import ErrorSystem.CommonMethods;
import UserSystem.Ban;
import UserSystem.Users.Student;
import UserSystem.Users.Teacher;
import UserSystem.Users.User;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;



/**
 *
 * @author crist
 */
public class Identifier extends CommonMethods{
    
    //Atributes
    private File Users;
    private File Bans;
    
    //Constructor
    public Identifier(File Users,File Bans) throws IOException {   
                
        this.Users = Users;
        this.Bans = Bans;
        
        Users.createNewFile();
        Bans.createNewFile();

    }


    //Register a user in to User´s file
    public boolean Register(String Name,String Surname1,String Surname2,String Nick,String Email,String Password) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsRegisterOk = true;
       
        //Parameters validation
        if (isPersonalFromUrjc(Email)){
            
            if (isStudentOrTeacher(Email)){
                User Student = new User(Name,Surname1,Surname2,Nick,Email,Password,true,0);
                WriteDataToDataBase(Student);    
            } 
            else{
                User Teacher = new Teacher(Name,Surname1,Surname2, Nick, Email, Password,false,0);
                WriteDataToDataBase(Teacher);
            }
        }
        else{
            IsRegisterOk = false;
            showError(0); //mirar clase CommonMethods en paquete ErrorSystem
        }
        
        return IsRegisterOk;
    }
    
    public boolean Login(String Email, String Password) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsLogged = false;
        boolean IsBanned = false;
        
        LinkedList UserList = GetUserList();
        LinkedList BanList = GetBanList();
                
        //Find Email & Password match 
        for(int i = 0; i<UserList.size();i++){
            User User = (User) UserList.get(i);
              
            if (User.getEmail().equals(Email) && User.getPassword().equals(Password) && !User.isIsConected()){
                String Nick = User.getNick();
                
                //If found, check if User is banned
                try{
                    for(int j = 0; j<BanList.size();j++){
                        Ban Ban = (Ban) BanList.get(j);  

                        if(Nick.equals(Ban.getNick())&& Ban.getIsBanned()){
                            IsBanned = true;
                            showError(1); //mirar clase CommonMethods del paquete ErrorSystem
                            break; 
                        }
                    }   
                }
                
                catch(NullPointerException e){
                    IsBanned = false;
                }
                   
                
                //If is not banned, the user can login
                if(!IsBanned){
                    User.setIsConected(true);

                    UserList.remove(i);
                    UserList.add(User);

                    //Then rewrite the list with the new user    
                    FileOutputStream OutputFile = new FileOutputStream(Users);
                    ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
                    OutputObject.writeObject(UserList); 

                    IsLogged = true;

                    break; 
                    }
                 
            } 
 
        }
        return IsLogged;
    }
    
    public boolean Logout(String Email, String Password) throws IOException, FileNotFoundException, ClassNotFoundException{
        boolean IsLogout = false;
        LinkedList UserList = GetUserList();
        for(int i = 0; i<UserList.size();i++){
            User User = (User) UserList.get(i);
            
            if (User.getEmail().equals(Email) && User.getPassword().equals(Password) && User.isIsConected()){
                User.setIsConected(false);
                
                UserList.remove(i);
                UserList.add(User);
                
                //Then rewrite the list with the new user    
                FileOutputStream OutputFile = new FileOutputStream(Users);
                ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
                OutputObject.writeObject(UserList); 
                
                IsLogout = true;             
                break;
            } 
        }
        return IsLogout;
 
    }

    //Check if it´s a student´s email or teacher´s email
    private boolean isStudentOrTeacher(String Email){
        boolean isStudent = true;
        int emailType = Email.indexOf("@alumnos.urjc.es");
        
        if (emailType==-1){
            isStudent = false;
        }
        
        return isStudent;
    }
    
    //Check if it´s an email from URJC
    private boolean isPersonalFromUrjc(String Email){
        boolean isFromUrjc = true;
        int emailType1 = Email.indexOf("@alumnos.urjc.es");
        int emailType2 = Email.indexOf("@urjc.es");
        
        if (emailType1 == -1 && emailType2 == -1){
            isFromUrjc= false; 
        }
        return isFromUrjc;
  
    }
    
    //Write User in to User´s file
    private void WriteDataToDataBase(User CreatedUser) throws IOException, ClassNotFoundException{ 
        LinkedList <User> UserList  = new LinkedList();
        //Check if there are more user´s in the file
        try{
            FileInputStream InputFile = new FileInputStream(Users);
            ObjectInputStream InputObject = new ObjectInputStream(InputFile);
            UserList  = (LinkedList <User>) InputObject.readObject();
            InputFile.close();
            InputObject.close();
            UserList.add(CreatedUser);         
        }
        
        //If not this is the first user
        catch (Exception FileNotFoundException){
            UserList.add(CreatedUser);
        }
        
        //Then rewrite the list with the new user    
        FileOutputStream OutputFile = new FileOutputStream(Users);
        ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
        OutputObject.writeObject(UserList); 
 
        OutputFile.close();
        OutputObject.close();   
    }
    
    
    //Returns User List from Data Base
    private LinkedList<User> GetUserList() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream(Users);
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
        LinkedList <User> UserList  = (LinkedList <User>) InputObject.readObject();
        
        InputFile.close();
        InputObject.close();
        
        return UserList;
    }
    
    //Returns Ban List from Data Base
    private LinkedList<Ban> GetBanList() throws FileNotFoundException, IOException, ClassNotFoundException{
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
    
    ///////////////////////////////////////////////////////////////////////////////////////
    public void Mostrar() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream("DataBase/Users/UsersDataBase.obj");
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
        LinkedList <User> UserList  = (LinkedList <User>) InputObject.readObject();
        InputFile.close();
        InputObject.close();
        for(int i = 0; i<UserList.size();i++){
            System.out.println(UserList.get(i).toString());
        }
    }
    
  
}