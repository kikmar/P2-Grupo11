/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

/**
 *
 * @author crist
 */
public class Content {
    //Atributos 
    private String postContent;
    
    
    //Cosntructor
    
    public Content (String postContent){
        this.postContent = postContent;
    }
    
    //Geter y seter
    
    public void setPostContent(String postContent){
        this.postContent = postContent;
    }
    
    public String getPostContent(){
        return postContent;
    }
    
    
}
