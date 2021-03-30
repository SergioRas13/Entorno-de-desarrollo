/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio15;

public class Tema4Ejercicio15 {

    public static void main(String[] args) {
     int n= 4;
     Sumatorio(n);
    }
     private static int Sumatorio(int n){
  if (n==0)
    return 0;
  else {
      System.out.println(n);
      return n + Sumatorio(n-1);
  }
    
} 
    
}
