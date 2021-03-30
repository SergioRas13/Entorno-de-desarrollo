/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio11;

public class Tema4Ejercicio11 {

    
    public static void main(String[] args) {
     int n1=2;   
     int n2=3;
     System.out.println("El valor de las variables main es: "+n1+" para el número 1 y "+n2+" para el número 2");
     suma(n1,n2);
     System.out.println("El valor de la suma es: "+suma(n1,n2));
     System.out.println("El valor de las variables main es: "+n1+" para el número 1 y "+n2+" para el número 2");
     resta(n1,n2);
     System.out.println("El valor de la resta es: "+resta(n1,n2));
     System.out.println("El valor de las variables main es: "+n1+" para el número 1 y "+n2+" para el número 2");
     multiplicacion(n1,n2);
     System.out.println("El valor de la multiplicacion es: "+multiplicacion(n1,n2));
     System.out.println("El valor de las variables main es: "+n1+" para el número 1 y "+n2+" para el número 2");
     division(n1,n2);
     System.out.println("El valor de la division es: "+division(n1,n2));
     System.out.println("El valor de las variables main es: "+n1+" para el número 1 y "+n2+" para el número 2");
    }
   
    
 public static int suma(int n1,int n2){
n1=n1+n2;
return n1;
 }
 
 public static int resta(int n1,int n2){
n1=n1-n2;
return n1;
 } 
 
  public static int multiplicacion(int n1,int n2){
n1=n1*n2;
return n1;     
 }
  
  public static double division(double n1,double n2){
n1=n1/n2;
return n1;   
 }

}
