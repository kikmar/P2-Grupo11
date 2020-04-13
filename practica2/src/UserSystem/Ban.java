package UserSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Ban implements Serializable{
    private String Nick;
    private boolean isBanned;
    private Date beginDate;
    private Date endDate;
    
    private File Bans = new File("DataBase/Bans/BansDataBase.obj");
    
    private static final long serialVersionUID = 1L;
    

    public Ban(String Nick,boolean isBanned,String beginDate,String endDate) throws IOException, ClassNotFoundException, ParseException {
        
        
        DateFormat begin = new SimpleDateFormat("dd-MM-yyyy");
	Date beginDateConvert = begin.parse(beginDate);
        
        DateFormat end = new SimpleDateFormat("dd-MM-yyyy");
	Date endDateConvert = end.parse(beginDate);
	
	
        
        this.Nick = Nick;
        this.isBanned = isBanned;
        this.beginDate = beginDateConvert;
        this.endDate = endDateConvert;
        
        WriteDataToDataBase(this);
    }     

    public String getNick() {
        return Nick;
    }

    public boolean getIsBanned() {
        return isBanned;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public File getBans() {
        return Bans;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public void setIsBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setBans(File Bans) {
        this.Bans = Bans;
    }

     //Write User in to User´s file
    private void WriteDataToDataBase(Ban CreatedBan) throws IOException, ClassNotFoundException{ 
        LinkedList <Ban> BanList  = new LinkedList();
        //Check if there are more user´s in the file
        try{
            FileInputStream InputFile = new FileInputStream(Bans);
            ObjectInputStream InputObject = new ObjectInputStream(InputFile);
            BanList  = (LinkedList <Ban>) InputObject.readObject();
            InputFile.close();
            InputObject.close();
            BanList.add(CreatedBan);         
        }
        
        //If not this is the first user
        catch (Exception FileNotFoundException){
            BanList.add(CreatedBan);
        }
        
        //Then rewrite the list with the new user    
        FileOutputStream OutputFile = new FileOutputStream(Bans);
        ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
        OutputObject.writeObject(BanList); 
 
        OutputFile.close();
        OutputObject.close();

    }
    
    ////////////////////////////////////////////////////////////////////////////
    public void Mostrar() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream(Bans);
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);
        
        LinkedList <Ban> BanList  = (LinkedList <Ban>) InputObject.readObject();
        InputFile.close();
        InputObject.close();
        for(int i = 0; i<BanList.size();i++){
            System.out.println(BanList.get(i).toString());
        }
    }
    
    @Override
    public String toString() {
        
        SimpleDateFormat beginDateDate = new SimpleDateFormat("yyyy/MM/dd");
        String beginDateStr = beginDateDate.format(beginDate);
        
        SimpleDateFormat endDateDate = new SimpleDateFormat("yyyy/MM/dd");
        String endDateStr = endDateDate.format(endDate);
        
        
        
        return "Nick: " + Nick + " . BeginDate: " + beginDateStr + " . endDate: " + endDateStr
                + " . IsBanned= " + isBanned;
    }
    
    
    
    
}