package UserSystem.Users;

import java.io.Serializable;

public class Teacher extends User implements Serializable{


    public Teacher(String Name, String Surname1, String Surname2, String Nick, String Email, String Password, boolean IsStudent, int ID) {
        super(Name, Surname1, Surname2, Nick, Email, Password, IsStudent, ID);
    }

    
}