/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to pilange this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest6;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Daffa
 */

class Main{

    private static final ArrayList<Game> koleksi = new ArrayList<>();
//    ArrayList<Kapal> dataKapal = new ArrayList<>();
//    private static ArrayList<PlayStation> koleksiPS = new ArrayList<PlayStation>();
//    private static ArrayList<Game> koleksi = new ArrayList<Game>();
    private static Scanner s = new Scanner(System.in); // String
    private static Scanner s1 = new Scanner(System.in); // Int dan Double
    private static Iterator<Game> i = koleksi.iterator();
    private static boolean found = false;
    private static int ID ;
    private static Game dataGame;
    private static PlayStation dataPS;
    private static Game dataXbox;
    private static Game dataNintendo;
    private static int ID2 = 14;
//    private static String judul = s.nextLine();
//    private static String platform = s.nextLine();
//    private static int harga = s.nextInt();
//    private static double rating = s.nextDouble();
    
   public static void main(String[] args) {
      
//      List<Game> c = new ArrayList<Game>();
//      Scanner s = new Scanner(System.in);
//      Scanner s1 = new Scanner(System.in);
//      Game game1;
      
      // All Platform
      Game dataGame = new Game(1, "The Witcher 3: Wild Hunt", "18 Mei 2015", "PlayStation, Xbox, Nintendo", 399000, 9.4) {}; koleksi.add(dataGame);
      Game dataGame2 = new Game(2, "Red Dead Redemption 2", "6 Desember 2019", "PlayStation, Xbox, Nintendo", 640000, 8.9) {}; koleksi.add(dataGame2);
      Game dataGame3 = new Game(3, "Forza Horizon 5", "9 November 2021", "PlayStation, Xbox, Nintendo", 699000, 9.2) {}; koleksi.add(dataGame3);
      Game dataGame4 = new Game(4, "Jump Force", "12 Oktober 2018", "PlayStation, Xbox, Nintendo", 349000, 8.8) {}; koleksi.add(dataGame4);
      Game dataGame5 = new Game(5, "Mortal Kombat 11", "23 April 2019", "PlayStation, Xbox, Nintendo", 559000, 9.3) {}; koleksi.add(dataGame5);
      
      // PlayStation
      Game dataPS = new PlayStation(6, "The Last of Us part II", "19 Juni 2020", "PlayStation", 599000, 9.6, "4, 5", "Ekslusif"); koleksi.add(dataPS);
      Game dataPS2 = new PlayStation(7, "Uncharted 4: A Thief's End", "10 Mei 2016", "PlayStation", 299000, 8.8, "4, 5", "Ekslusif"); koleksi.add(dataPS2);
      Game dataPS3 = new PlayStation(8, "Ghost of Tsushima", "17 Juli 2020", "PlayStation", 369000, 9.4, "4, 5", "Ekslusif"); koleksi.add(dataPS3);
      
      // Xbox
      Game dataXbox = new Xbox(9, "Halo Infinite", "15 November 2021", "Xbox", 449000, 9.0, "X, S, ONE", "Ekslusif"); koleksi.add(dataXbox);
      Game dataXbox2 = new Xbox(10, "Tell Me Why", "27 Agustus 2020", "Xbox", 239000, 8.5, "ONE", "Ekslusif"); koleksi.add(dataXbox2);
      Game dataXbox3 = new Xbox(11, "The Gunk", "16 Desember 2021", "Xbox", 390000, 8.7, "X, S, ONE", "Ekslusif"); koleksi.add(dataXbox3);
      
      
      //Nintendo
      Game dataNintendo = new Nintendo(12, "The Legend of Zelda Series", "3 Maret 2017", "Nintendo", 569000, 9.8, "Switch, Wii U", "Ekslusif"); koleksi.add(dataNintendo);
      Game dataNintendo2 = new Nintendo(13, "Super Smash Bros. Ultimate", "7 Desember 2018", "Nintendo", 159000, 8.6, "Switch", "Ekslusif"); koleksi.add(dataNintendo2);
      Game dataNintendo3 = new Nintendo(14, "Xenoblade Chronicles 2", "1 Desember 2017", "Nintendo", 229000, 7.9, "Switch", "Ekslusif"); koleksi.add(dataNintendo3);
      
      
      
      

      int pil;
      int pil3 = 0;
      do{
         System.out.println("+========================================+");
         System.out.println("|------------Sistem Data Game------------|");
         System.out.println("+========================================+");
         System.out.println("|  [1] Lihat Data Game                   |");
         System.out.println("|  [2] Tambah Data Game                  |");
         System.out.println("|  [3] Cari Data Game                    |");
         System.out.println("|  [4] Hapus Data Game                   |");
         System.out.println("|  [5] Perbarui Data Game                |");
         System.out.println("|  [6] Data Game Ekslusif                |");
         System.out.println("|  [0] Keluar                            |");
         System.out.println("+========================================+");
         System.out.print("Pilih [1-6] : ");
         pil = s.nextInt();
         System.out.print("\n");

         switch(pil){
             
            case 1 -> lihat();
            
            case 2 -> tambah();
            
            case 3 -> cari();

            case 4 -> hapus();
            
            case 5 -> perbarui();
            
            case 6 -> ekslusifMenu();
            
            case 0 -> System.out.println("Terima kasih (^-^)");

            
         }
      }while(pil!=0);
   }
   
   
public static void lihat(){
    System.out.println("+========================================+");
    System.out.println("|----------------Data Game---------------|");
    System.out.println("+========================================+");
//        Iterator<Game> i = c.iterator();

//               c = Game.();
    for (Game dataGame : koleksi) {
//        String ekslusifGame = dataGame.lihatSeri ();
        dataGame.display();
//        System.out.println(" ");
//        System.out.println("   ID       : " + dataGame.getID());
//        System.out.println("   Judul    : " + dataGame.getJudul());
//        System.out.println("   Rilis    : " + dataGame.getRilis());
//        System.out.println("   Platform : " + dataGame.getPlatform());
//        System.out.println("   Harga    : " + dataGame.getHarga());
//        System.out.println("   Rating   : " + dataGame.getRating());
//        System.out.println("   "+ekslusifGame);
        
    }
//               while(i.hasNext()){
//                  Game e = i.next(); 
//                  System.out.println(e);
//               }
    System.out.println("+========================================+\n");
    
}
   
   
public static void tambah() {

//    System.out.print("Masukkan ID       : ");
//    int no = s.nextInt();
    System.out.print("Masukkan judul    : ");
    String judul = s1.nextLine();
    System.out.print("Masukkan rilis    : ");
    String rilis = s1.nextLine();
    System.out.print("Masukkan platform : ");
    String platform = s1.nextLine();
    System.out.print("Masukkan harga    : ");    
    int harga = s.nextInt();
    System.out.print("Masukkan rating   : ");    
    double rating = s.nextDouble();
//               System.out.print(" ");

//    koleksi.add(new Game(no,judul,rilis,platform,harga,rating));
    
    dataGame = new Game(++ID2,judul,rilis,platform,harga,rating) {};
//    dataGame = new Game(++ID2,judul,rilis,platform,harga,rating); (Kalo kyk gini error krna blm implemen abstract)
    koleksi.add(dataGame);
    dataGame.berhasilTambah(); 
//    System.out.println("\tData berhasil ditambah...!\n");
 }


public static void cari(){  
    found = false;
    System.out.print("Masukkan ID yang ingin di cari :");
    ID = s.nextInt();
    System.out.println("+========================================+");
    i = koleksi.iterator();
    while(i.hasNext()){
       Game dataGame = i.next();
       if(dataGame.getID() == ID)  {
//          System.out.println(x);
          System.out.println("   ID       : " + dataGame.getID());
          System.out.println("   Judul    : " + dataGame.getJudul());
          System.out.println("   Rilis    : " + dataGame.getRilis());
          System.out.println("   Platform : " + dataGame.getPlatform());
          System.out.println("   Harga    : " + dataGame.getHarga());
          System.out.println("   Rating   : " + dataGame.getRating());

          found = true;
       }
    }

    if(!found){
       System.out.println("Data tidak ditemukan\n");
    }
    System.out.println("+========================================+\n");
    
}

public static void hapus(){
    lihat();
    found = false;
    System.out.print("Masukkan ID data yang ingin dihapus :");
    ID = s.nextInt();
    System.out.println("+========================================+");
    i = koleksi.iterator();
    while(i.hasNext()){
       Game dataGame = i.next();
       if(dataGame.getID() == ID)  {
          i.remove();
          found = true;
       }
    }

    if(!found){
       System.out.println("Data tidak ditemukan\n");
    }else{
       System.out.println("\tData berhasil dihapus...!\n");
//       dataGame.berhasilHapus(); 
    }

    System.out.println("+========================================+\n");
     
    
}


public static void perbarui(){
    lihat();
    found = false;
    System.out.print("Masukkan ID data yang akan diperbarui :");
    ID = s.nextInt();

    ListIterator<Game>li = koleksi.listIterator();
    while(li.hasNext()){
       Game dataGame = li.next();
       if(dataGame.getID() == ID)  {
          System.out.print("Masukkan judul    : ");
          String judul = s1.nextLine();
          
          System.out.print("Masukkan rilis    : ");
          String rilis = s1.nextLine();

          System.out.print("Masukkan platform : ");
          String platform = s1.nextLine();

          System.out.print("Masukkan harga    : ");
          int harga = s.nextInt();

          System.out.print("Masukkan rating   : ");
          double rating = s.nextDouble();
          
          dataGame.setJudul(judul);
          dataGame.setRilis(rilis);
          dataGame.setPlatform(platform);
          dataGame.setHarga(harga);
          dataGame.setRating(rating);
          

//          li.set(new Game(ID,judul,rilis,platform,harga,rating));
          found = true;
       }
    }

    if(!found){
       System.out.println("Data tidak ditemukan");
    }else{
       System.out.println("Data berhasil diperbarui...!\n");
//       dataGame.berhasilPerbarui(); 
    } 
    
  }



public static void ekslusifMenu(){
//    ArrayList<PlayStation> koleksiPS

//    ArrayList<PlayStation> koleksiPS = new ArrayList<>();
//    ArrayList<Xbox> koleksiXbox = new ArrayList<>();
//    ArrayList<Nintendo> koleksiNintendo = new ArrayList<>();
    int nomor = 0;
    System.out.println("+========================================+");
    System.out.println("|--------------Game Ekslusif-------------|");
    System.out.println("+========================================+");
    System.out.println("|  [1] PlayStation                       |");
    System.out.println("|  [2] Xbox                              |");
    System.out.println("|  [3] Nintendo                          |");
    System.out.println("|  [0] Kembali                           |");
    System.out.println("+========================================+");
    System.out.print("Pilih [1-3] : ");
    nomor = s.nextInt();
    System.out.print("\n");
//    int nomor = input.nextInt(); input.nextLine();
        switch (nomor) {
            case 0 -> {
                
            }
            case 1 -> { // PlayStation
                menuPlayStation();
            }
            case 2 -> { // XBOX
                menuXbox();
            }
            case 3 -> {  // NINTENDO
                menuNintendo(); 
            }
            default -> System.out.println("\nPilihan tidak tersedia.");
        }
    
}

public static void menuPlayStation(){
    int nomorPS = 0;
    System.out.println("+========================================+");
    System.out.println("|---------------PlayStation--------------|");
    System.out.println("+========================================+");
    System.out.println("|  [1] Lihat Data PlayStation            |");
    System.out.println("|  [2] Tambah Data PlayStation           |");
    System.out.println("|  [3] Hapus Data PlayStation            |");
    System.out.println("|  [4] Perbarui Data PlayStation         |");
    System.out.println("|  [0] Kembali                           |");
    System.out.println("+========================================+");
    System.out.print("Pilih [1-5] : ");
    nomorPS = s.nextInt();
    System.out.print("\n");
    if(nomorPS == 0) {
       ekslusifMenu();
    }

    else if(nomorPS == 1) { // lihat PlayStation
        System.out.println("+========================================+");
        System.out.println("|----------Data Game PlayStation---------|");
        System.out.println("+========================================+");
    //                    dataPS.display();
        for (Game dataPS : koleksi) {
            if(dataPS instanceof PlayStation) {
                dataPS.display();
            }
        }
        System.out.println("+========================================+\n");
        menuPlayStation();
    }
    else if(nomorPS == 2) { // Tambah PlayStation

        String judul, rilis,seri;
        int harga;
        double rating;

//        System.out.print("Masukkan ID       : ");
//        no = s.nextInt();
        System.out.print("Masukkan judul    : ");
        judul = s1.nextLine();
        System.out.print("Masukkan rilis    : ");
        rilis = s1.nextLine();
//        System.out.print("Masukkan platform : ");
//        platform = s1.nextLine();
        System.out.print("Masukkan seri     : ");
        seri = s1.nextLine();
        System.out.print("Masukkan harga    : ");
        harga = s.nextInt();
        System.out.print("Masukkan rating   : ");
        rating = s.nextDouble();


        dataPS = new PlayStation(++ID2,judul,rilis,"PlayStation",harga,rating, seri, "Ekslusif");
        koleksi.add(dataPS);
        dataPS.berhasilTambah(); 
//        System.out.println("\tData berhasil ditambah...!\n");

        menuPlayStation();

    }

    else if(nomorPS == 3) { // Hapus PlayStation

        found = false;

        System.out.println("+========================================+");
        System.out.println("|----------Data Game PlayStation---------|");
        System.out.println("+========================================+");
    //                    dataPS.display();
        for (Game dataPS : koleksi) {
            if(dataPS instanceof PlayStation) {
                dataPS.display();
            }
        }
        System.out.println("+========================================+\n");
        System.out.print("Masukkan ID data yang ingin dihapus :");
        ID = s.nextInt();
        System.out.println("+========================================+");
        i = koleksi.iterator();
        while(i.hasNext()){
            Game dataPS = i.next();
            if(dataPS.getID() == ID)  {
                i.remove();
                found = true;
            }
        }

        if(!found){
            System.out.println("Data tidak ditemukan\n");
        }else{
            System.out.println("\tData berhasil dihapus...!\n");
//            dataPS.berhasilHapus(); 
        }

        System.out.println("+========================================+\n");
        menuPlayStation();


    }

    else if(nomorPS == 4) { // Perbarui PlayStation

        found = false;

        System.out.println("+========================================+");
        System.out.println("|----------Data Game PlayStation---------|");
        System.out.println("+========================================+");
    //                    dataPS.display();
        for (Game dataPS : koleksi) {
            if(dataPS instanceof PlayStation) {
                dataPS.display();
            }
        }
        System.out.println("+========================================+\n");

        System.out.print("Masukkan ID data yang akan diperbarui :");
        ID = s.nextInt();

        ListIterator<Game>li = koleksi.listIterator();
        while(li.hasNext()){
            Game dataPS = li.next();
            if(dataPS.getID() == ID)  {
                System.out.print("Masukkan judul    : ");
                String judul = s1.nextLine();

                System.out.print("Masukkan rilis    : ");
                String rilis = s1.nextLine();

//                System.out.print("Masukkan platform : ");
//                String platform = s1.nextLine();

                System.out.print("Masukkan seri     : ");
                String seri = s1.nextLine();

                System.out.print("Masukkan harga    : ");
                int harga = s.nextInt();

                System.out.print("Masukkan rating   : ");
                double rating = s.nextDouble();

                dataPS.setJudul(judul);
                dataPS.setRilis(rilis);
//                dataPS.setPlatform("PlayStation");
//                dataPS.setPlatform(platform);
                dataPS.setHarga(harga);
                dataPS.setRating(rating);
                dataPS.setSeri(seri);


                //          li.set(new Game(ID,judul,rilis,platform,harga,rating));
                found = true;
            }
        }

        if(!found){
            System.out.println("Data tidak ditemukan");
        }else{
            System.out.println("Data berhasil diperbarui...!\n");
//            dataPS.berhasilPerbarui(); 
        }

        menuPlayStation();


    }
}

public static void menuXbox(){
    int nomorXbox = 0;
    System.out.println("+========================================+");
    System.out.println("|------------------Xbox------------------|");
    System.out.println("+========================================+");
    System.out.println("|  [1] Lihat Data Xbox                   |");
    System.out.println("|  [2] Tambah Data Xbox                  |");
    System.out.println("|  [3] Hapus Data Xbox                   |");
    System.out.println("|  [4] Perbarui Data Xbox                |");
    System.out.println("|  [0] Kembali                           |");
    System.out.println("+========================================+");
    System.out.print("Pilih [1-5] : ");
    nomorXbox = s.nextInt();
    System.out.print("\n");
    if(nomorXbox == 0) {
       ekslusifMenu();
    }

    else if(nomorXbox == 1) { // lihat xbox
        System.out.println("+========================================+");
        System.out.println("|-------------Data Game Xbox-------------|");
        System.out.println("+========================================+");
//                    dataPS.display();
        for (Game dataXbox : koleksi) {
            if(dataXbox instanceof Xbox) {
                dataXbox.display();
            }
        }
        System.out.println("+========================================+\n");



        menuXbox();
    }

    else if(nomorXbox == 2) { // Tambah xbox

        String judul, rilis, seri;
        int harga;
        double rating;

//        System.out.print("Masukkan ID       : ");
//        no = s.nextInt();
        System.out.print("Masukkan judul    : ");
        judul = s1.nextLine();
        System.out.print("Masukkan rilis    : ");
        rilis = s1.nextLine();
//        System.out.print("Masukkan platform : ");
//        platform = s1.nextLine();
        System.out.print("Masukkan seri     : ");
        seri = s1.nextLine();
        System.out.print("Masukkan harga    : ");
        harga = s.nextInt();
        System.out.print("Masukkan rating   : ");
        rating = s.nextDouble();


        dataXbox = new Xbox(++ID2,judul,rilis,"Xbox",harga,rating,seri,"Ekslusif");
        koleksi.add(dataXbox);
        dataXbox.berhasilTambah(); 
//        System.out.println("\tData berhasil ditambah...!\n");

        menuXbox();



    }

    else if(nomorXbox == 3) { // Hapus xbox

        found = false;

        System.out.println("+========================================+");
        System.out.println("|-------------Data Game Xbox-------------|");
        System.out.println("+========================================+");
//                    dataPS.display();
        for (Game dataXbox : koleksi) {
            if(dataXbox instanceof Xbox) {
                dataXbox.display();
            }
        }
        System.out.println("+========================================+\n");

        System.out.print("Masukkan ID data yang ingin dihapus :");
        ID = s.nextInt();
        System.out.println("+========================================+");
        i = koleksi.iterator();
        while(i.hasNext()){
            Game dataXbox = i.next();
            if(dataXbox.getID() == ID)  {
                i.remove();
                found = true;
            }
        }

        if(!found){
            System.out.println("Data tidak ditemukan\n");
        }else{
            System.out.println("\tData berhasil dihapus...!\n");
//            dataXbox.berhasilHapus(); 
        }

        System.out.println("+========================================+\n");
        menuXbox();


    }

    else if(nomorXbox == 4) { // Perbarui xbox

        found = false;

        System.out.println("+========================================+");
        System.out.println("|-------------Data Game Xbox-------------|");
        System.out.println("+========================================+");
//                    dataPS.display();
        for (Game dataXbox : koleksi) {
            if(dataXbox instanceof Xbox) {
                dataXbox.display();
            }
        }
        System.out.println("+========================================+\n");

        System.out.print("Masukkan ID data yang akan diperbarui :");
        ID = s.nextInt();

        ListIterator<Game>li = koleksi.listIterator();
        while(li.hasNext()){
            Game dataXbox = li.next();
            if(dataXbox.getID() == ID)  {
                System.out.print("Masukkan judul    : ");
                String judul = s1.nextLine();

                System.out.print("Masukkan rilis    : ");
                String rilis = s1.nextLine();

//                System.out.print("Masukkan platform : ");
//                String platform = s1.nextLine();

                System.out.print("Masukkan seri     : ");
                String seri = s1.nextLine();

                System.out.print("Masukkan harga    : ");
                int harga = s.nextInt();

                System.out.print("Masukkan rating   : ");
                double rating = s.nextDouble();

                dataXbox.setJudul(judul);
                dataXbox.setRilis(rilis);
//                dataXbox.setPlatform(platform);
                dataXbox.setHarga(harga);
                dataXbox.setRating(rating);
                dataXbox.setSeri(seri);


                //          li.set(new Game(ID,judul,rilis,platform,harga,rating));
                found = true;
            }
        }

        if(!found){
            System.out.println("Data tidak ditemukan");
        }else{
            System.out.println("Data berhasil diperbarui...!\n");
//            dataXbox.berhasilPerbarui(); 
        }

        menuXbox();


    }
}

public static void menuNintendo(){
    int nomorNintendo = 0;
    System.out.println("+========================================+");
    System.out.println("|----------------Nintendo----------------|");
    System.out.println("+========================================+");
    System.out.println("|  [1] Lihat Data Nintendo               |");
    System.out.println("|  [2] Tambah Data Nintendo              |");
    System.out.println("|  [3] Hapus Data Nintendo               |");
    System.out.println("|  [4] Perbarui Data Nintendo            |");
    System.out.println("|  [0] Kembali                           |");
    System.out.println("+========================================+");
    System.out.print("Pilih [1-5] : ");
    nomorNintendo = s.nextInt();
    System.out.print("\n");
    if(nomorNintendo == 0) {
       ekslusifMenu();
    }

    else if(nomorNintendo == 1) { // lihat Nintendo
        System.out.println("+========================================+");
        System.out.println("|-----------Data Game Nintendo-----------|");
        System.out.println("+========================================+");
//                    dataPS.display();
        for (Game dataNintendo : koleksi) {
            if(dataNintendo instanceof Nintendo) {
                dataNintendo.display();
            }
        }
        System.out.println("+========================================+\n");

        menuNintendo();
    }
    else if(nomorNintendo == 2) { // Tambah Nintendo

        String judul, rilis, seri;
        int harga;
        double rating;

//        System.out.print("Masukkan ID       : ");
//        no = s.nextInt();
        System.out.print("Masukkan judul    : ");
        judul = s1.nextLine();
        System.out.print("Masukkan rilis    : ");
        rilis = s1.nextLine();
        System.out.print("Masukkan seri     : ");
        seri = s1.nextLine();
        System.out.print("Masukkan harga    : ");
        harga = s.nextInt();
        System.out.print("Masukkan rating   : ");
        rating = s.nextDouble();


        dataNintendo = new Nintendo(++ID2,judul,rilis,"Nintendo",harga,rating,seri,"Ekslusif");
        koleksi.add(dataNintendo);
        dataNintendo.berhasilTambah(); 
//        System.out.println("\tData berhasil ditambah...!\n");

        menuNintendo();



    }

    else if(nomorNintendo == 3) { // Hapus Nintendo

        found = false;

        System.out.println("+========================================+");
        System.out.println("|-----------Data Game Nintendo-----------|");
        System.out.println("+========================================+");
//                    dataPS.display();
        for (Game dataNintendo : koleksi) {
            if(dataNintendo instanceof Nintendo) {
                dataNintendo.display();
            }
        }
        System.out.println("+========================================+\n");

        System.out.print("Masukkan ID data yang ingin dihapus :");
        ID = s.nextInt();
        System.out.println("+========================================+");
        i = koleksi.iterator();
        while(i.hasNext()){
            Game dataNintendo = i.next();
            if(dataNintendo.getID() == ID)  {
                i.remove();
                found = true;
            }
        }

        if(!found){
            System.out.println("Data tidak ditemukan\n");
        }else{
            System.out.println("\tData berhasil dihapus...!\n");
//            dataNintendo.berhasilHapus(); 
        }

        System.out.println("+========================================+\n");
        menuNintendo();


    }

    else if(nomorNintendo == 4) { // Perbarui Nintendo

        found = false;

        System.out.println("+========================================+");
        System.out.println("|-----------Data Game Nintendo-----------|");
        System.out.println("+========================================+");
//                    dataPS.display();
        for (Game dataNintendo : koleksi) {
            if(dataNintendo instanceof Nintendo) {
                dataNintendo.display();
            }
        }
        System.out.println("+========================================+\n");

        System.out.print("Masukkan ID data yang akan diperbarui :");
        ID = s.nextInt();

        ListIterator<Game>li = koleksi.listIterator();
        while(li.hasNext()){
            Game dataNintendo = li.next();
            if(dataNintendo.getID() == ID)  {
                System.out.print("Masukkan judul    : ");
                String judul = s1.nextLine();

                System.out.print("Masukkan rilis    : ");
                String rilis = s1.nextLine();

//                System.out.print("Masukkan platform : ");
//                String platform = s1.nextLine();

                System.out.print("Masukkan seri     : ");
                String seri = s1.nextLine();

                System.out.print("Masukkan harga    : ");
                int harga = s.nextInt();

                System.out.print("Masukkan rating   : ");
                double rating = s.nextDouble();

                dataNintendo.setJudul(judul);
                dataNintendo.setRilis(rilis);
//                dataNintendo.setPlatform(platform);
                dataNintendo.setHarga(harga);
                dataNintendo.setRating(rating);
                dataNintendo.setSeri(seri);


                //          li.set(new Game(ID,judul,rilis,platform,harga,rating));
                found = true;
            }
        }

        if(!found){
            System.out.println("Data tidak ditemukan");
        }else{
            System.out.println("Data berhasil diperbarui...!\n");
//            dataNintendo.berhasilPerbarui(); 
        }

        menuNintendo();


    }
}
   

}