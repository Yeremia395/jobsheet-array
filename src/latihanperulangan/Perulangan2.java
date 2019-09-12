/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanperulangan;

import java.util.Scanner;

/**
 *
 * @author Yeremia Rizky
 */
public class Perulangan2 {
   public static void main(String[] args){
        
        int a,b,jumlah;
        Scanner s =new Scanner(System.in);
        
        //input
        System.out.print("Masukkan nilai suku awal:");
        a = s.nextInt();
        
        System.out.print("Masukkan nilai beda tiap suku:");
        b = s.nextInt();
        
        System.out.print("Masukan jumah suku:");
        jumlah = s.nextInt();
        System.out.print("Berikut tampilan deret aritmatika:");
        
        int i = 1;    
       while (i<jumlah){
            a+=b;
           System.out.print(a + ""); 
           i++;                  
            
            
        }
    }
    
}
