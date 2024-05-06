/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1pertemuan2;

/**
 *
 * @author SURYAPRADIVA 2201010582
 * TGL 28-04-2024
 */
public class Tugas1pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float al = 5;
        float tg = 8;
        Segitiga S3 = new Segitiga(al,tg);
        
        System.out.println("hitung luas segitiga");
        System.out.println("~~");
        System.out.println("Luas = ½ * Alas *");
        System.out.println("   = ½ * "+S3.getALAS()+" * "+S3.getTINGGI());
        System.out.println("    ="+S3.getLUAS());
    }
    
}
