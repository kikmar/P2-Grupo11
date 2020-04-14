
package ForumSystem.PostContent;

import ForumSystem.Post;
import java.util.Scanner;

public class Content {
    private String PostContent;
    Scanner sc = new Scanner(System.in);
    
    public Content (String PostContent) { 
        this.PostContent = PostContent;
        
}
    
    public void setPostContent (String PostContent){
        this.PostContent = PostContent;
}
    
    public String getPostContent (){
        return PostContent;
}
    


public void contentModification (boolean edited) {
    
    if (edited = false){
        
        System.out.println("El contenido del post no ha sido editado. \n"
        +"Escriba el contenido que desee que esté modificado: ");
        String contenido = sc.nextLine();
        contenido = this.PostContent;
        edited = true;
    } else {
        System.out.println("El contenido del post ha sido editado.");   
    }
}


} //Final de Clase
