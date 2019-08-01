
package burbujafntcn;
 import java.util.Scanner;

/**
 *
 * @author DAVID JACOB LÓPEZ
 */
public class BurbujaFntcn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        BurbujaFntcn datos=new BurbujaFntcn ();
        datos.burbujad();
         datos.burbujaiz();
        
        int sw,opcion;
          boolean salir = false;
     
        sw=1;
        
         while(!salir){
             
            System.out.println("0. Salir");
            System.out.println("1. Burbuja Derecha Izquierda");
            System.out.println("2. Burbuja de Izquerda Derecha");
            System.out.print("Opcion ==> ");
             Scanner scan2 = new Scanner(System.in);
          opcion = scan2.nextInt();
         
            switch(opcion)
            {
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 0:
                    break;
                    
                
                
                
                
            }
 
            
 
        }while(sw==1);
    }
    
    
    public void burbujad(){




}
    
        
    public void burbujaiz(){




}
    
    
    
    
    
}


