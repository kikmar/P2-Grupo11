package UserSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

public class Ban implements Serializable{
    private String Nick;
    private boolean isBanned;
    private Date beginDate;
    private Date endDate;
    private static final long serialVersionUID = 1L;
    private File Bans = new File("DataBase/Bans/BansDataBase.obj");

    public Ban(final String Nick, final boolean isBanned, final Date beginDate, final Date endDate) {
        this.Nick = Nick;
        this.isBanned = isBanned;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }     

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(final boolean isBanned) {
        this.isBanned = isBanned;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(final Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(final String nick) {
        Nick = nick;
    }

    private LinkedList<Ban> GetBanList() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream InputFile = new FileInputStream("DataBase/Bans/BansDataBase.obj");
        ObjectInputStream InputObject = new ObjectInputStream(InputFile);

        LinkedList <Ban> BanList  = (LinkedList <Ban>) InputObject.readObject();

        InputFile.close();
        InputObject.close();

        return BanList;
    }
    
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
        FileOutputStream OutputFile = new FileOutputStream("DataBase/Users/UsersDataBase.obj");
        ObjectOutputStream OutputObject = new ObjectOutputStream(OutputFile);
        OutputObject.writeObject(BanList); 
 
        OutputFile.close();
        OutputObject.close();


    }
}