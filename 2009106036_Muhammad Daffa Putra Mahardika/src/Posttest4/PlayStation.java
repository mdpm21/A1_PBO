/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Daffa
 */
public class PlayStation extends Game {

    private String seri;
    private String status;
    
    public PlayStation(int ID, String judul, String rilis, String platform, int harga, double rating, String seri, String status) {
        super(ID, judul, rilis, platform, harga, rating);
        this.seri = seri;
        this.status = status;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }


    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    @Override
    public void display(){
        
        System.out.println("   ID        : " + this.getID());
        System.out.println("   Judul     : " + this.getJudul());
        System.out.println("   Rilis     : " + this.getRilis());
        System.out.println("   Platform  : " + this.getPlatform());
        System.out.println("   Seri      : " + this.getSeri());
        System.out.println("   Harga     : " + this.getHarga());
        System.out.println("   Rating    : " + this.getRating());
        System.out.println("   " + lihatStatus(status));
        System.out.println(" ");
        
     }
    
    
    
    
    
    
}
