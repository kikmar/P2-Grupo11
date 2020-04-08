package UserSystem.Users;

import java.io.Serializable;

public class Student extends User implements Serializable{
    
 

    public Student(String Name, String Surname1, String Surname2, String Nick, String Email, String Password, boolean IsAdmin, boolean IsStudent, boolean IsConected, int ID) {
        super(Name, Surname1, Surname2, Nick, Email, Password, IsAdmin, IsStudent, IsConected, ID);
    }

    
}
