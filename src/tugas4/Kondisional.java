/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author RYZEN 5
 */
public class Kondisional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float nilai = inp.nextFloat();
        Nilai nl = new Nilai();
        char huruf = nl.getNilHuruf(nilai);
        String predikat = nl.getPredikat(huruf);

        System.out.println("Nilai : " + nilai + " dengan Huruf " + huruf + " Predikat " + predikat);
        
    }
    
}
