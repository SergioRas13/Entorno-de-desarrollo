
package tema7ac7;

import java.util.Scanner;


public class Tema7Ac7 {

 
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     Object[] vector = new Object[50];
     for(int i=0; i<vector.length; i++){
     System.out.println("Introduzca dato número "+(i+1)+": ");
     vector[i]=teclado.nextInt();
     }
     
     int encontrado=100;
     for(int i=0; i<vector.length; i++){   
     if (vector[i].equals(0))   
     if (encontrado==100)
         encontrado=i;     
     }
     
     if (encontrado!=100)
     System.out.println("La posición del primer número con valor 0 es: "+encontrado);
     else
     System.out.println("No hay números con valor 0");
     }
     }   
    
