/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1pertemuan2;

/**
 *
 * @author Asus
 */
public class Segitiga {
    
    private float alas, tinggi, luas;
    
    public Segitiga(float al, float tg){
        alas = al;
        tinggi = tg;
        luas = (alas*tinggi)/2;
        
    }
    
    public void setALAS(float nVAL){
        alas = nVAL;
    }
    public float getALAS(){
        return alas;
    }
    public void setTINGGI(float nVAL){
         tinggi = nVAL;
    }
    public float getTINGGI(){
        return tinggi;
    }
    public void Lsegitiga(){
        luas = (alas*tinggi)/2;
    }
    public float getLUAS(){
        return luas;
    }
}
    

