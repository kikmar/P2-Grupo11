
package ForumSystem.PostContent;

import java.io.Serializable;

public class Content implements Serializable {
    private String PostContent;
    private static final long serialVersionUID = 1L;
    public Content (String PostContent) { 
        this.PostContent = PostContent;
        
    }
    
    //Getters
    public void setPostContent (String PostContent){
        this.PostContent = PostContent;
    }
    
    
    //Setters
    public String getPostContent (){
        return PostContent;
    }
    
 
    public String toString(){
        return PostContent;
    }
    

} 
