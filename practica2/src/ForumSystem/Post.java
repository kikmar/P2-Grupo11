/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import ForumSystem.PostContent.Content;
import ForumSystem.PostContent.Exercises;
import ForumSystem.PostContent.PlainText;
import ForumSystem.PostContent.Poll;
import UserSystem.Ban;
import UserSystem.Users.User;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Post {

    private String Tittle;
    private int Valoration;
    private boolean Visibility;
    private String Owner;
     

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(final String Tittle) {
        this.Tittle = Tittle;
    }

    public boolean isVisibility() {
        return Visibility;
    }

    public void setVisibility(final boolean Visibility) {
        this.Visibility = Visibility;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(final String Owner) {
        this.Owner = Owner;
    }

   
    


    private final LinkedList<Content> ContentList = new LinkedList();
    private final LinkedList<Coment> ComentList = new LinkedList();
    private final LinkedList<NickVote> ValorantsList = new LinkedList();

    public Post(final String Tittle, final String Owner, final int TypeOfContent, final String PostContent)
            throws IOException, FileNotFoundException, ClassNotFoundException {

        final boolean found = CheckIfIsUser(Owner);
        final boolean isTeacher = CheckIfTeacher(Owner);

        if (found) {
            if (isTeacher) {

                if (TypeOfContent == 1) {
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    final Content C1 = new PlainText(PostContent);
                    ContentList.add(C1);
                }

                if (TypeOfContent == 2) {
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    final Content C2 = new Exercises(PostContent);
                    ContentList.add(C2);
                }

                if (TypeOfContent == 3) {
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    final Content C3 = new Poll(PostContent);
                    ContentList.add(C3);
                }
            } else {
                if (TypeOfContent == 1) {
                    this.Tittle = Tittle;
                    this.Owner = Owner;
                    final Content C1 = new PlainText(PostContent);
                    ContentList.add(C1);
                }
            }
        }

    }

    public void MenuAdmin(final String nicklogeado) throws IOException, ClassNotFoundException, ParseException {

        int opcion;
        boolean exit = false;
        boolean administrador = false;

        final LinkedList UserList = GetUserList();
        for (int i = 0; i < UserList.size(); i++) {
            final User User = (User) UserList.get(i);

            if (User.getNick().equals(nicklogeado)) {
                administrador = User.isIsAdmin();

            }
        }
        if (administrador == true) {
            while (!exit) {
                System.out.println(" *********************************************************** \n"
                        + "****************** MENU ADMINISTRADOR ********************* \n"
                        + "                                                            \n"
                        + "               1- CAMBIAR VISIBILIDAD DEL POST              \n"
                        + "               2- PENALIZAR USUARIO                         \n"
                        + "               3- SALIR                                     \n"
                        + "                                                            \n"
                        + "************************************************************\n");
                final Scanner sc = new Scanner(System.in);
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        changeVisibility();
                        break;

                    case 2:
                        System.out.println("Escriba el nick del usuario a banear:");
                        String nickToBan = sc.nextLine();
                        System.out.println("Escriba la fecha de inicio para la penalización en formato DD-MM-YYY:");
                        String beginDate = sc.nextLine();
                        System.out.println("Escriba la fecha de fin para la penalización en formato DD-MM-YYY:");
	                    String endDate = sc.nextLine();

                        Suspend(nickToBan,beginDate,endDate);
                        break;

                    case 3:
                        exit = true;
                        break;

                    default:
                        System.out.println("Tipo de dato introducido no valido, introduzca una de las opciones");

                }
            }
        }
    }

    private void changeVisibility() {
        final Scanner sc = new Scanner(System.in);
        System.out.println("¿Quiere cambiar la visibilidad del post? si/no");
        final String ask = sc.nextLine();
        if (ask.equals("si")) {
            this.Visibility = !Visibility;
            System.out.println("Ha cambiado la visibilidad del post");
        } else {
            System.out.println("Se ha mantenido la visibilidad");

        }
    }

    private void Suspend(final String nickParaBanear, String fechaIni, String fechaFin) throws IOException, ClassNotFoundException, ParseException {

        boolean baneado;
        LinkedList BanList = GetBanList();
        LinkedList UserList = GetUserList();
        boolean comprobado = false;

        for (int i = 0; i < BanList.size(); i++) {
            Ban Ban = (Ban) BanList.get(i);

            if (Ban.getNick().equals(nickParaBanear)) {
                System.out.println("El usuario ya esta baneado.");
                comprobado = true;
            } else {
                //los dejo por si acaso
            }
        }
        if (!comprobado) {
            for (int i = 0; i < UserList.size(); i++) {
                User user = (User) UserList.get(i);
                
                if (user.getNick().equals(nickParaBanear)) {
                    Ban newBan = new Ban (nickParaBanear,true,fechaIni,fechaFin);
                    BanList.add(newBan);
                } else {
                    //los dejo por si acaso
                }
            }
        }
    }

    private boolean CheckIfTeacher(final String Owner)
            throws IOException, FileNotFoundException, ClassNotFoundException {
        boolean isTeacher = true;

        final LinkedList UserList = GetUserList();

        for (int i = 0; i < UserList.size(); i++) {
            final User User = (User) UserList.get(i);

            if (User.getNick().equals(Owner)) {
                if (User.isIsStudent()) {
                    isTeacher = false;
                }
            }
        }

        return isTeacher;

    }

    private boolean CheckIfIsUser(final String Owner)
            throws IOException, FileNotFoundException, ClassNotFoundException {
        boolean found = false;
        final LinkedList UserList = GetUserList();

        for (int i = 0; i < UserList.size(); i++) {
            final User User = (User) UserList.get(i);

            if (User.getNick().equals(Owner)) {
                found = true;

            }
        }

        return found;
    }

    // Returns User List from Data Base
    private LinkedList<User> GetUserList() throws FileNotFoundException, IOException, ClassNotFoundException {
        final FileInputStream InputFile = new FileInputStream("DataBase/Users/UsersDataBase.obj");
        final ObjectInputStream InputObject = new ObjectInputStream(InputFile);

        final LinkedList<User> UserList = (LinkedList<User>) InputObject.readObject();

        InputFile.close();
        InputObject.close();

        return UserList;
    }

    private LinkedList<Ban> GetBanList() throws FileNotFoundException, IOException, ClassNotFoundException {
        final FileInputStream InputFile = new FileInputStream("DataBase/Users/BansDataBase.obj");
        final ObjectInputStream InputObject = new ObjectInputStream(InputFile);

        final LinkedList<Ban> BanList = (LinkedList<Ban>) InputObject.readObject();

        InputFile.close();
        InputObject.close();

        return BanList;
    }

    public boolean VotePost(final String Nick, final boolean Vote) {
        boolean hasVoted = false;
        boolean isAllOk = true;

        final NickVote NickVote = new NickVote(Nick, Vote);

        try {

            // Check if user has voted
            for (int i = 0; i < ValorantsList.size(); i++) {
                if (ValorantsList.get(i).getNick().equals(Nick)) {
                    if (ValorantsList.get(i).isVote() == Vote) {
                        hasVoted = true;
                        isAllOk = false;
                    } // If he has voted but he want to changue it
                    else {
                        if (Vote) {
                            Valoration += 1;
                        } else {
                            Valoration -= 1;
                        }

                        ValorantsList.remove(i);
                        ValorantsList.add(NickVote);
                    }
                }
            }

            // If the user never has voted
            if (!hasVoted) {
                if (Vote) {
                    Valoration += 1;
                } else {
                    Valoration -= 1;
                }
                ValorantsList.add(NickVote);
            }
        } // If ValoratansList is empty
        catch (final NullPointerException Npe) {
            if (ValorantsList.isEmpty()) {
                if (Vote) {
                    Valoration += 1;
                } else {
                    Valoration -= 1;
                }
                ValorantsList.add(NickVote);
            }
        }

        return isAllOk;
    }

    public String Share() {
        return "https://uredditjc.es/" + Tittle;
    }

    public void Mostrar() {

        System.out.println(Tittle);
        for (int i = 0; i < ContentList.size(); i++) {
            System.out.println(ContentList.get(i).getPostContent());
        }
    }

    public int getValoration() {
        return Valoration;
    }

    public void menuCreator(final String nicklogeado) {
        final Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        final Post posts = new Post(); // da error en compilacion por no meter datos
        if (posts.getOwner().equals(nicklogeado)) {
            while (!exit) {
                System.out.println(" *********************************************************** \n"
                        + "********************* MENU CREADOR ************************ \n"
                        + "                                                            \n"
                        + "               1- MODIFICAR POST                            \n"
                        + "               2- CREAR NUEVO POST                          \n"
                        + "               3- Salir                                     \n"
                        + "                                                            \n"
                        + "************************************************************\n");
                option = sn.nextInt();
                switch (option) {

                    case 1:
                        contentChange();//da error en compilacion por no meter datos
                        break;
                    case 2:
                        postCreation();//da error en compilacion por no meter datos
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Tipo de dato introducido no valido, introduzca una de las opciones");

                }

            }

        }
    }
}
