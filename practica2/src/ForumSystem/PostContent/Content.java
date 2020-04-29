
package ForumSystem.PostContent;

import java.io.Serializable;
import java.util.LinkedList;

public class Content implements Serializable {
    private String PostContent;
    private static final long serialVersionUID = 1L;
    public Content (String PostContent) { 
        this.PostContent = PostContent;
        
    }
    
    public void setPostContent (String PostContent){
        this.PostContent = PostContent;
    }
    
    public String getPostContent (){
        return PostContent;
    }
    
 

    

} 
