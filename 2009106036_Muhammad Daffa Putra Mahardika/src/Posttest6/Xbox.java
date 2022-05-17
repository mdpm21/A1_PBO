/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;

/**
 *
 * @author Daffa
 */
public class Xbox extends Game{
    
    static String seri;
    static String status;
    
    public Xbox(int ID, String judul, String rilis, String platform, int harga, double rating, String seri, String status) {
        super(ID, judul, rilis, platform, harga, rating);
        Xbox.seri = seri;
        Xbox.status = status;
    }
    
    public String getSeri() {
        return seri;
    }


    public void setSeri(String seri) {
        Xbox.seri = seri;
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
    
    @Override
    public void berhasilTambah() {
        System.out.print("\nData game " + getJudul() + " berhasil ditambahkan!!\n\n");
    }
    
    
    
}
