/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanperulangan;

/**
 *
 * @author Yeremia Rizky
 */
public class Challange2Array {
    public static void main(String[] args){
        
        int nilai[] = new int[5];
        double ratarata = 0.0;
           
        nilai [0] = 78;
        nilai [1] = 89;
        nilai [2] = 90;
        nilai [3] = 100;
        nilai [4] = 95;
       
              
        ratarata = (nilai [0] + nilai [1] + nilai[2] + nilai[3] + nilai[4]) /5;
        
        System.out.println("Nilai rata-rata anda " +ratarata);
      
        if(ratarata >=80){
            System.out.println("Selamat Nilai Anda Diatas Rata-Rata");
      
        }else if(ratarata <=79){
             System.out.println("Nilai Anda Dibawah Rata-Rata ");
    }
        
                  

        
        
        
    }
    
}
