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
public class Notification implements Serializable{
    private String Tittle;
    private boolean isRead;
    
    private static final long serialVersionUID = 1L;

    public Notification(String Tittle, boolean isRead) {
        this.Tittle = Tittle;
        this.isRead = isRead;
    }
}
