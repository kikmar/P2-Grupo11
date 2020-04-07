/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSystem;

//Superclase Visitante
public class Visitor {
   
   private int ID;
   
   public Visitor(int ID){
   this.ID=ID;    
   }
   public int getID(){
       return ID;
   }
   public void setID(int ID){
       this.ID = ID;
   }
}