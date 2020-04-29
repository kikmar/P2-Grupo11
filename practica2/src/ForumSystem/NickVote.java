/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import java.io.Serializable;

/**
 *
 * @author crist
 */
public class NickVote implements Serializable{
    

    private String Nick;
    private boolean Vote;
    
    private static final long serialVersionUID = 1L;
    
    public NickVote(String Nick, boolean Vote) {
        this.Nick = Nick;
        this.Vote = Vote;
    }
    
    //Getters
    public String getNick() {
        return Nick;
    }

    public boolean isVote() {
        return Vote;
    }
    
    
    //Setters
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public void setVote(boolean Vote) {
        this.Vote = Vote;
    }
    
    
    //Methods
    public String toString(){
        return "Nick: "+Nick+" Vote: "+Vote;
    }
    
    
}
