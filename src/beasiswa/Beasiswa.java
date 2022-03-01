/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beasiswa;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Beasiswa {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan Nilai TPA : ");
        int TPA = masukkan.nextInt();
        System.out.print("Masukkan Nilai Bahasa Inggris : ");
        int BahasaInggris = masukkan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa Dapat Beasiswa");
        else 
            System.out.println("Siswa Tidak Dapat Beasiswa"); 
    }
    
}
