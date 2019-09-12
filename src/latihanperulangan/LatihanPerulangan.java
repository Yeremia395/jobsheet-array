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
public class LatihanPerulangan {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    
        int bil, hasil = 1;
        Scanner s = new Scanner(System.in);
             
        System.out.print("Masukkan sebuah angka:");
        bil = s.nextInt();
        int i = bil;
        
        do {
            System.out.println("Nilai faktorial dari "+bil+ " adalah " +hasil); 
            hasil = hasil * i;
            i--;
        
        }while (i > 0);
    }
    
}
