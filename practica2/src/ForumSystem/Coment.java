/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import java.io.Serializable;
import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author crist
 */
public class Coment implements Serializable{
    
    //Atributes
    private int Valoration;
    private String Text;
    private String Nick;
    
    private LinkedList <NickVote> ValorantsList = new LinkedList();
    private static final long serialVersionUID = 1L;
    //Constructor
    public Coment(String Nick, String Text) {
        this.Text = Text;
        this.Nick = Nick;
        this.Valoration = 0;
    }
    
    //Getters
    public int getValoration() {
        return Valoration;
    }

    public String getText() {
        return Text;
    }

    public String getNick() {
        return Nick;
    }

    public LinkedList<NickVote> getValorants() {
        return ValorantsList;
    }
    
    //Setters
    public void setValoration(int valoration) {
        this.Valoration = valoration;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public void setValorants(LinkedList<NickVote> Valorants) {
        this.ValorantsList = Valorants;
    }
    
    //Vote a coment
    public boolean VoteComent(String Nick, boolean Vote){
        boolean hasVoted = false;
        boolean isAllOk = true;
        
        NickVote NickVote = new NickVote(Nick,Vote);
        
        try{
            
            //Check if user has voted
            for (int i=0; i<ValorantsList.size();i++){
                if (ValorantsList.get(i).getNick().equals(Nick)){
                    if (ValorantsList.get(i).isVote() == Vote){
                        hasVoted = true;
                        isAllOk = false;
                    }
                    
                    //If he has voted but he want to changue it
                    else{
                        if (Vote){
                            Valoration += 1;                       
                        }
                        else{
                            Valoration -=1;
                        }
                        
                        ValorantsList.remove(i);
                        ValorantsList.add(NickVote);
                    }
                }  
            }
            
            //If the user never has voted
            if (!hasVoted){
                if(Vote){
                    Valoration += 1;
                }
                else{
                    Valoration -=1;                    
                }  
                ValorantsList.add(NickVote);
            }    
        } 
        
        //If ValoratansList is empty
        catch(NullPointerException Npe){
           if(ValorantsList.size() == 0){
                if(Vote){
                    Valoration += 1;
                }
                else{
                    Valoration -=1;                    
                }
                ValorantsList.add(NickVote);    
            }
        }

        return isAllOk;
    }
    
    public String toString(){
        return "Nick: "+Nick+" Comment: "+Text+" Valoration: "+Valoration;
    }
}


