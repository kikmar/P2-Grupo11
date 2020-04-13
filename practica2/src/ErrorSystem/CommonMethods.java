package ErrorSystem;

import java.util.LinkedList;

public abstract class CommonMethods {
    LinkedList<String> ErrorList = new LinkedList<>();
    
    public String showErrors (int ErrorIndex){
        ErrorList.clear();
        ErrorList.add("Error 0: Error por tratar de registrarnos con un correo no institucional.");
        ErrorList.add("Error 1: Error por tratar de acceder a una cuenta penalizada.");
        ErrorList.add("Error 2: Error por tratar de crear un SubForo sin los permisos necesarios.");
        ErrorList.add("Error 3: Error por tratar de acceder al menú de administrador sin los permisos necesarios.");
        ErrorList.add("Error 4: Error por tratar de acceder al menú de creador sin los permisos necesarios.");
        ErrorList.add("Error 5: Error por tratar de insertar contenidos sin los permisos necesarios");
        
        
        if (ErrorIndex==0){
            return ErrorList.get(0);
        }
        else if (ErrorIndex==1){
            return ErrorList.get(1);
        }
        else if (ErrorIndex==2){
            return ErrorList.get(2);
        }
        else if (ErrorIndex==3){
            return ErrorList.get(3);
        }
        else if (ErrorIndex==4){
            return ErrorList.get(4);
        }
        else if (ErrorIndex==5){
            return ErrorList.get(5);
        }
        else {
            return null;
        }
    }
}
