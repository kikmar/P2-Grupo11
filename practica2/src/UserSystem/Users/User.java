
package UserSystem.Users;


public class User {
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Nick;
    private String Email;
    private String Contrasena;
    private boolean Admin; 
    private boolean EsAlumno;
    private Penalizacion Penalizado;
  //private ListaSuscripciones ListaSubforos


    
    public void setNombre (String NombreUsuario){
        Nombre = NombreUsuario;
}
        
    public void setApellido1 (String Apellido1Usuario){
        Apellido1 = Apellido1Usuario;
}

    public void setApellido2 (String Apellido2Usuario){
        Apellido2 = Apellido2Usuario;
}
    
     public void setNick (String NickUsuario){
        Nick = NickUsuario;
}
     
     public void setEmail (String EmailUsuario){
         Email = EmailUsuario;
}
     
     public void setContrasena (String ContrasenaUsuario){
         Contrasena = ContrasenaUsuario;
}
     
     public void setAdmin (boolean AdminUsuario){
         Admin = AdminUsuario;
}
     
     public void setEsAlumno (boolean EsAlumnoUsuario){
         EsAlumno = EsAlumnoUsuario;
}
     
     public void setPenalizado (Penalizacion PenalizadoUsuario){
         Penalizado = PenalizacionUsuario;
}
    
     public String getNick(){
        return Nick;
}
     
     public boolean getEsAlumno (){
         return EsAlumno;
}
     public String getEmail (){
         return Email;
     }
     
     public String getContrasena (){
         return Contrasena;
     }
     
     public Penalizacion getPenalizado (){
         return Penalizado;
     }
        
}

    
    
    


        