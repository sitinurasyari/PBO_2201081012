/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siti040423;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class Latihan72 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int[] angka = new int[10];
        
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1) + ":");
            angka[i] = Integer.parseInt(input);
        }
        
        // Mencari nomor terbesar dari array
        int max = angka[0];
        for (int i = 1; i < 10; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        
        // Menampilkan nomor terbesar kepada user
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah " + max);
    }
        
}
