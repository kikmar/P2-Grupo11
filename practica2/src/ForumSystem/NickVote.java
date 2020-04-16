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
public class NickVote {
    
    //Atributes
    private String Nick;
    private boolean Vote;
    
    //Constructor
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
    
    
    
}
