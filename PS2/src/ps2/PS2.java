
package ps2;
 import java.util.Scanner;
     import java.util.InputMismatchException;
import java.io.IOException;

/**
 *
 * @author DAVID JACOB LÓPEZ
 */
public class PS2 {

    
    
    public static void main(String[] args) {
        PS2 lb= new PS2(); 
        lb.relacion();
        // TODO code application logic here
       

       
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //La opcion del usuario se guarda en la variable "opcion"
       
       
       
       while(!salir){
           System.out.println("===================================================================\n");
           System.out.println("========================MENÚ PRINCIPAL=============================\n");
           System.out.println("===================================================================\n");
           
           System.out.println("1. ¿QUÉ ES IDE\n");
           System.out.println("2. VARIABLES/OPERADORES (ARITMÉTICOS, LÓGICOS, RELACIÓN)\n");
           System.out.println("3. CONDICIONALES\n");
           System.out.println("4. CICLOS\n");
           System.out.println("5. FUNCIONES\n");
           System.out.println("6. ARREGLOS\n");
           System.out.println("7. PROCEDIMIENTOS\n");
           System.out.println("8. SALIR\n");
         
           try{
               
           System.out.println("Ingrese una opción:  ");
           opcion = sn.nextInt();
           
         switch(opcion){
             
             case 1:
                   System.out.println("OPCIÓN 1: ¿QUÉ ES UN IDE?\n\n");
                   System.out.println("\tI:ntregrated\t\n");
                   System.out.println("\tD:evelopment\t\n");
                   System.out.println("\tE:nvironment\t\n\n");
                   System.out.println("\tEs un entorno de programación que ha sido empaquetado como un programa de aplicación,\n o sea, consiste en un editor de código, un compilador, un depurador y un constructor de interfaz gráfica.\n\n Los IDEs pueden ser aplicaciones por sí solas o pueden ser parte de aplicaciones existentes.\t\n");
                   

                   
             break;
             
             
             

             
             case 2:
                   System.out.println("OPCIÓN 2: VARIABLES/OPERADORES\n\n");
                   int opvar;
                  System.out.println("\t2.1 Operadores Aritmeticos\n\t2.2 Operadores Lógicos \t\n2.3 Operadores de Relación");
         Scanner scan2 = new Scanner(System.in);
          opvar = scan2.nextInt();
         
                  /* Declaramos 6 variables,las cuales nos permitiran realizar distintas operaciones aritmeticas:
                   SUMA
                   RESTA
                   MULTIPLICACIÓN
                   DIVISIÓN
                   */
                   
                  switch(opvar){
                  
                      case 1:
                           System.out.println("2.1 Operadores Aritmeticos\n\n");
                            int n1,n2,rsum,rrest,rmul,rdiv;
                      Scanner sca = new Scanner(System.in);
                      Scanner sca1 = new Scanner(System.in);
                   System.out.println("Ingrese el primer número: ");  
                   n1 = sca.nextInt();
                   System.out.println("Ingrese el segundo número: ");
                  n2 = sca.nextInt();
                  
                  rsum= n1+n2; rrest=n2-n1; rmul=n1*n2; rdiv=n2/n1;
                  System.out.println("=====RESULTADOS=====: ");
                  System.out.println("SUMA= " + rsum);
                  System.out.println("RESTA=" + rrest);
                          
                  System.out.println("MULTIPLICACIÓN=" + rmul);
                    System.out.println("DIVISIÓN=" +rdiv);
                  
                          
                      case 2:
                        
                          
                          
                      case 3:
                     /* int edad;
                             Scanner scaedad = new Scanner(System.in);
                          System.out.println("Ingrese una edad: ");
                     edad = scaedad.nextInt();
                     if(edad<18)
                         System.out.println("=====LA PERSONA ES MENOR DE EDAD =====");
                          if(edad>18)
                               System.out.println("=====LA PERSONA ES MAYOR DE EDAD =====");
                          
                      default:
                     System.out.println("Ingrese una opción entre 1 y 3");
*/
                     lb.relacion();
                          
                  }
                  
                  
                  
                  
                 
                   
             break;
             
             
             
             
             
             
             case 3:
                   System.out.println("OPCIÓN 3: CONDICIONALES");
                   
                   
                   
                   
                   
                   
                   
             break;
             
             
             
             
             
             case 4:
                   System.out.println("OPCIÓN 4: CICLOS");
             break;
             
             
             
             
             
              case 5:
                   System.out.println("OPCIÓN 5: FUNCIONES");
             break;
             
             
             
             
             case 6:
                   System.out.println("OPCIÓN 6: ARREGLOS");
             break;
             
             
             
             
             case 7:
                   System.out.println("OPCIÓN 7: PROCEDIMIENTOS");
             break;
             
             
             
             case 8:
                   System.out.println("Saliendo del programa.....");
                   salir=true;
                   break;
                   
             default:
                     System.out.println("Ingrese solo números entre 1 y 8");

         }
           }catch(InputMismatchException e){
               System.out.println("DEBES INSERTAR UN NÚMEROS");
               sn.next();
           
       }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       }
      
 }
    
    
    
    
      public void relacion (){
       int    i = -3;
       byte   b = 5;
       float  f = 1e-10f;
       double d = 3.14;
       boolean b1 = i > i;
       boolean b2 = i < b;
       boolean b3 = b <= f;
       boolean b4 = f >= d;
       boolean b5 = d != 0;
       boolean b6 = 1 == f;

       System.out.println("b1: " + i + " > " + i + " = " + b1);
       System.out.println("b2: " + i + " < " + b + " = " + b2);
       System.out.println("b3: " + b + " <= " + f + " = " + b3);
       System.out.println("b4: " + f + " >= " + d + " = " + b4);
       System.out.println("b5: " + d + " != " + 0 + " = " + b5);
       System.out.println("b6: " + 1 + " == " + f + " = " + b6);
   }

      
      
}
    

  
