package ForumSystem.PostContent;
import java.util.*;
//import UserSystem.Users.User;

public class Content {
    private LinkedList<String> postContent = new LinkedList();
    //private int dimension;

  
   
   
    
    public void setPostContentNew (){
        //boolean usuario = true;
        //if (usuario == true){
            System.out.println("Introduce el texto que quieres añadir");
            Scanner sc = new Scanner(System.in);
            postContent.add(sc.nextLine());
            System.out.println(postContent);
        
        
        
        
        }
    
    
    public void setPostContent (){
        //boolean usuario = true;
        //if (usuario == true){
            System.out.println("Introduce el texto que quieres añadir");
            Scanner sc = new Scanner(System.in);
            postContent.add(sc.nextLine());
            String option = "si";
            while (option.equals("si")){
              System.out.println("¿Quieres añadir otro bloque de texto?");
              option = sc.nextLine();
              if (option.equals("si")){
                System.out.println("Introduce el texto que quieres añadir");
                postContent.add(sc.nextLine());
                System.out.println(postContent);
              }
              
            }
              System.out.println("Se han guardado sus cambios correctamente en la base de datos");
        
        }
    
    
    
    
    public LinkedList <String> getPostContent (){
        return postContent;
    }
       
}
        
 

    
    /*Posiblemente se quite al hacer la base de datos
    public void FillContent(){
       System.out.println("Rellene el Post");
       Scanner introContent = new Scanner(System.in);
       postContent = introContent.nextLine();
    }
*/

  




//} //Final de Clase-


