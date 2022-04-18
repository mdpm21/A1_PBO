/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Daffa
 */

class Game{
   private int ID;
   private String judul;
   private String rilis;
   private String platform;
   private int harga;
   private double rating;

//   constructor
   Game(int ID, String judul, String rilis, String platform, int harga, double rating){
      this.ID = ID;
      this.judul = judul;
      this.rilis = rilis;
      this.platform = platform;
      this.harga = harga;
      this.rating = rating;
   }

//   method
   public int getID(){
      return ID;
   }
    public void setID(int ID) {
        this.ID = ID;
    }

        
    public int getHarga(){
       return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    

    public String getJudul(){
       return judul;
    }
    public void setJudul(String judul) {
         this.judul = judul;
     }
    
    public String getRilis(){
       return rilis;
    }
    public void setRilis(String rilis) {
         this.rilis = rilis;
     }
    

    public String getPlatform(){
       return platform;
    }
    public void setPlatform(String platform) {
         this.platform = platform;
     }
    

    public double getRating() {
         return rating;
     }
    public void setRating(double rating) {
         this.rating = rating;
     }

     
    // Overriding
    public void display(){
//       String ekslusifGame = lihatSeri ();
       System.out.println("   ID        : " + this.getID());
       System.out.println("   Judul     : " + this.getJudul());
       System.out.println("   Rilis     : " + this.getRilis());
       System.out.println("   Platform  : " + this.getPlatform());
       System.out.println("   Harga     : " + this.getHarga());
       System.out.println("   Rating    : " + this.getRating());
       System.out.println("   "+lihatSeri());
       System.out.println(" ");
    }
    
    // Overloading
    public String lihatSeri () {
        return "Status    : Tidak Ekslusif";
    }

    public String lihatStatus (String status) {
        return "Status    : " +status;
    }
    
      

   public String toString(){
      return ID+" "+judul+" "+rilis+" "+platform+" "+harga+" "+rating;
   }

    void setSeri(String seri) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

