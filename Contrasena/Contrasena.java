







 

 
import java.util.Scanner;
/**
 * Este programa simula el proceso de verificacion de una contraseña
 * @author: Sanchez Pablo Christian Viery
 * 
 */


public class Contrasena
{
    String contrasena = "12345"; /** Contraseña asignada*/
    int cont = 0;/** Contador del programa*/
    
    /** Metodo que realiza la comprobacion de la contrasena*/
    
    public void comprobar(){
    
    boolean band = false;/** Se establece una bandera de estado*/
    
    System.out.println("Introduce la Contrasena");/** Se solicita la contraseña*/
    
    Scanner sc = new Scanner(System.in);/**Se instancia a partir de la clase Scanner */
    
    
        while(!band && cont<3){ /**Verificacion de las condiciones*/
        String clave = sc.nextLine(); /**Se almacena el valor dado por el usuario */
    
        if(clave.equals(contrasena)){ /**Se verifica los valores son iguales */
        band = true;/**Si lo son la bandera cambia a true */
        cont = 0;/**El contador se reinicia */
        System.out.println("Contraseña correcta");/**Se imprime */
        return;/**Se termina el metodo */
        }else{/**En caso de que la contraseña sea incorrecta */
        if(cont<2){
        System.out.println("Contrasena Incorrecta, vuelve a intentarlo");   /**Se imprime */
        }
        cont= cont +1;/**Aumenta el contador */
        }
        
        }
        if(cont==3)/**Se verifica si el contador es igual a 3 */
        System.out.println("Se acabaron los intentos");/**Se imprime */
        }
    
    
    
    public static void main(String [] args){
    Contrasena c = new Contrasena();/**Se crea una instancia apartir de la clase Numero */
    c.comprobar();/**Se ejecuta el metodo comprobar */
    
    
    }
    
    
    
    
}
