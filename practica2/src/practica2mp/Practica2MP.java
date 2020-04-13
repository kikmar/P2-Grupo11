package practica2mp;

import LoginSystem.Identifier;
import UserSystem.Ban;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Practica2MP {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {
        
        
        //Pruebas de Identifier
        Identifier Ident = new Identifier();
        
        //Ident.Register("Cristian","De Gracia","Nuero","Cfres","Cristian@urjc.es","1234");
        /*
        //Parameters to create a new user
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
            
            Ident.Register(Name,Surname1,Surname2,Nick,Email,Password);
            
            Ident.Mostrar();
            
            if(Ident.Login("Cristian@urjc.es","1234")){
                System.out.println("Logueado con exito");
            }
            
            if(Ident.Login("Cçsadsa","123das4")){
                System.out.println("Logueado con exito");
            }
            
            Ident.Mostrar();
            
            if(Ident.Logout("Cristian@urjc.es","1234")){
                System.out.println("Logout con exito");
            }
            
            Ident.Mostrar();
            */
            //Ban ban1 = new Ban("Alberto",true,"09-04-2020","12-04-2020");
            //Ban ban2 = new Ban("Aitor",true,"09/04/2020","12/04/2020");
            
            
            //ban1.Mostrar();
 
            
           //Ident.Register("Alberto","Sroda","Gonzalez","Alfres","Alberto@urjc.es","1234");
           //Ident.Register("Cristian","De Gracia","Nuero","Cfres","Cristian@urjc.es","1234");
            
           //Ban ban = new Ban("Admin",true,"09-04-2020","12-04-2020");
        
           //Ban ban = new Ban("Alfres",true,"09-04-2020","12-04-2020");
           //Ban ban = new Ban("Cfres",true,"09-04-2020","12-04-2020");
           //ban.Mostrar();
           //Ident.Mostrar();
            
            //ban.Mostrar();
            
            if(Ident.Login("Cristian@urjc.es","1234")){
                System.out.println("Logueado con exito");
                Ident.Logout("Cristian@urjc.es","1234");
            }
            else{
                System.out.println("Error al iniciar sesion");
            }
            
            if(Ident.Login("Alberto@urjc.es","1234")){
                System.out.println("Logueado con exito");
                Ident.Logout("Alberto@urjc.es","1234");
            }
            else{
                System.out.println("Error al iniciar sesion");
            }

    }
    
}
