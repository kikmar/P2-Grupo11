package ForumSystem;



import ForumSystem.PostContent.Content;
import UserSystem.Users.User;
import java.util.Scanner;



public class Post {
    
    //Scanner
    Scanner sc = new Scanner(System.in);
    
    
    //Atributos
    
    private String title;
    private Content content;
    private int valoration;
    private boolean visible;
    private String creator; //Lo he creado como string porque creo que es mejor que a que sea usuario para que solo coja el Nick y no contraseña y demases
    private Coment comentList;
    private String voteList;
    private int updates;
    
    
    //Constructor de la clase
    
    
    public Post () {
        this.creator = creator;
        this.title = title;
        this.content = content;
        this.valoration = valoration;
        this.visible = visible;
        this.comentList = comentList;
        this.voteList = voteList;
        this.updates = updates;
    }
    
    
    public Post (String title, Content content, int valoration, boolean visible,String creator, Coment comentList, String voteList, int updates) {
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
    
    public String getCreator(){
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
    
    public void setCreator (String creator){
        this.creator = creator;
    }
    
    public void postCreation (String SubForo, String title, String text){
        
        
    
    }
    
    public void visibilityModification (){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quiere cambiar la visibilidad del post? si/no");
        String ask = sc.nextLine();
        if (ask.equals ("si")){
         // this.visible = !visible;
          System.out.println("Ha cambiado la visibilidad del post");
          }
        else{
          System.out.println("Se ha mantenido la visibilidad de origen"); 
          
          }
    }
    
    public void adminMenu(){
       Scanner sn = new Scanner(System.in);
       boolean exit = false;
       int option;
       
       while (!exit){
       System.out.println(" *********************************************************** \n"
                          +"****************** MENU ADMINISTRADOR ********************* \n"
                          +"                                                            \n"
                          +"               1- CAMBIAR VISIBILIDAD DEL POST              \n"
                          +"               2- PENALIZAR USUARIO                         \n"
                          +"               3- SALIR                                     \n"
                          +"                                                            \n"
                          +"************************************************************\n"); 
       option = sn.nextInt();
         switch (option){
             
             case 1:
               visibilityModification();
               break;
             case 3:
               exit = true;
               break;
             default:
               System.out.println("Tipo de dato introducido no valido, introduzca una de las opciones"); 
        
       
         } 
       }
    }
    
    
    public void contentChange () {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea cambiar algo del contenido de su post?");
        String changes = sc.nextLine();
        
        if (changes.equals ("si")){
            System.out.println("Escriba su nuevo contenido");
            Content content = new Content();
            content.setPostContentNew();
            
           // String contenido = añadir fuincion cambiar contenido en clase contenido            
        }
    }
    
    public void postCreation () {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea crear un nuevo post?");
        String changes = sc.nextLine();
        
        if (changes.equals ("si")){
            System.out.println("Escriba el titulo del post");
            this.title = sc.nextLine();
            User user = new User();
            this.creator = user.getNick();
            Content content = new Content();
            content.setPostContent();
            this.content = content;
            System.out.println(this.title);
            System.out.println(this.creator);
            System.out.println(content.getPostContent());
                     
        }
    }
    
    public void menuCreator () {
       Scanner sn = new Scanner(System.in);
       boolean exit = false;
       int option;
       
       while (!exit){
       System.out.println(" *********************************************************** \n"
                          +"********************* MENU CREADOR ************************ \n"
                          +"                                                            \n"
                          +"               1- MODIFICAR POST                            \n"
                          +"               2- CREAR NUEVO POST                          \n"
                          +"               3- Salir                                     \n"
                          +"                                                            \n"
                          +"************************************************************\n");       
       option = sn.nextInt();
         switch (option){
             
             case 1:
               contentChange();
               break;
             case 2:
               postCreation();
               break;
             case 3:
               exit = true;
               break;
             default:
               System.out.println("Tipo de dato introducido no valido, introduzca una de las opciones");
               
                    
    }
    
    
    
    
    
    }
   }
    
   public boolean isCreator () {
       boolean isORnot = false;
       
       
       
       
       
       return isORnot;
       
   } 
   
   public boolean isVisible () {
      boolean visibles;
      //visibles = this.visible;
      if(visibles = false) {
          System.out.println("La visibilidad del post está desactivada");
          return visibles;
      }
      else {
          System.out.println("La visibilidad del post está activada");
      }
      return visibles;
      
   }
   
   
   public void postVote () {
       System.out.println("Escriba su voto con un 1 para positivo y un 0 para negativo");
       String response = sc.nextLine();
       if (response == "1"){
           boolean b1 = Boolean.parseBoolean(response);
           if (b1){
               this.valoration = 1;
           }
           else {
               this.valoration = 0;
           }
       }
       if (response == "0") {
           boolean b2 = Boolean.parseBoolean(response);
           if (b2){
               this.valoration = -1;
           }
           else{
               this.valoration = 0;
           }
       }
      
       
       
   }
   
   
   
   
   
   
}