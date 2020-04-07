package practica2mp;

import UserSystem.Users.User;

public class Practica2MP {


    public static void main(String[] args) {
         
         User Usuario = new User();
         
         Usuario.setNombre("Juan");
         
         Usuario.setApellido1 ("Garcia");
         
         System.out.println(Usuario.getNombre());
         
         System.out.println(Usuario.getApellido1());
    }
    
}
