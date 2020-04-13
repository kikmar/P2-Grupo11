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

import ForumSystem.PostContent.Content;
import UserSystem.Users.User;


/**
 *
 * @author crist
 */
public class Post {
    //Atributos
    private String title;
    private Content content;
    private int valoration;
    private boolean visible;
    private User creator;
    private Coment comentList;
    private String voteList;
    private int updates;
    
    
    //Constructor de la clase
    
    public Post (String title, Content content, int valoration, boolean visible,User creator, Coment comentList, String voteList, int updates) {
        this.creator = creator;
        this.title = title;
        this.content = content;
        this.valoration = valoration;
        this.visible = visible;
        this.comentList = comentList;
        this.voteList = voteList;
        this.updates = updates;
    }
    
    //Getters:
    
    public String getTitle(){
        return title;
    }
    
    public Content getContent(){
        return content;
    }
    
    public int getValoration(){
        return valoration;
    }
    
    public boolean getVisible(){
        return visible;
    }
    
    public Coment getComent(){
        return comentList;
    }
    
    public String getVoteList(){
        return voteList;
    }
    
    public int getUpdates(){
        return updates;
    }
    
    public User getCreator(){
        return creator;
    }
    
    
    //Setters:
    
    public void setTitle (String title){
        this.title = title;
    }
    
    public void setContent (Content content){
        this.content = content;
    }
    
    public void setValoration (int valoration){
        this.valoration = valoration;
    }
    
    public void setVisible (boolean visible){
        this.visible = visible;
    }
    
    public void setComent (Coment comentList){
        this.comentList = comentList;
    }
    
    public void setVoteList (String voteList){
        this.voteList = voteList;
    }
            
    public void setUpdates (int updates){
        this.updates = updates;
    }        
    
    public void setCreator (User creator){
        this.creator = creator;
    }
}
