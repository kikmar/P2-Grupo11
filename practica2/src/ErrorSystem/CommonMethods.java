package ErrorSystem;

import java.util.LinkedList;

public abstract class CommonMethods {
    LinkedList<String> ErrorList = new LinkedList<>();
    
    public String showError (int ErrorIndex){
        ErrorList.clear();
        ErrorList.add("Error 0: No es posible registrarse porque el correo introducio no es institucional.");
        ErrorList.add("Error 1: La cuenta a la que desea acceder esta penalizada.");
        ErrorList.add("Error 2: No posee los permisos necesarios para crear un subforo."); //hay que juntar con clase subforo
        ErrorList.add("Error 3: No es posible acceder al menú de admisitrador porque la cuenta no posee los permisos necesarios."); //hay que juntar con clase Post
        ErrorList.add("Error 4: No es posible acceder al menú de creador porque la cuenta no posee los permisos necesarios."); //hay que juntar con la clase Subforo
        ErrorList.add("Error 5: No es posible la inserción de contenidos porque la cuenta no posee los permisos necesarios.");
        
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
