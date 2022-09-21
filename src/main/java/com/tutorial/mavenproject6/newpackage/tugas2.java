/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.mavenproject6.newpackage;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class tugas2 {

 
    public static int kelilingPersegi(int s){
        int x = 4*s;
        System.out.println("keliling persegi :" + x);
       return x; 
    }
     public static int luasPersegi(int s){
        int x = s*s;
        System.out.println("luas persegi :" + x);
       return x; 
    }
        public static int kelilingPersegipanjang(int p, int l){
        int x = 2*(p*l);
        System.out.println("keliling persegi panjang :" + x);
       return x; 
    }
     public static int luasPersegipanjang(int p, int l){
        int x = p*l;
        System.out.println("luas persegi panjang :" + x);
       return x; 
    }
        public static int kelilingLingkaran(int r){
        int x = 2*22/7*r;
        System.out.println("keliling lingkaran:" + x);
       return x; 
    }
     public static int luasLingkaran(int r){
        int x = 22/7 *r*r;
        System.out.println("luas lingkaran :" + x);
       return x; 
    }
        public static int kelilingSegitiga(int s){
        int x = s+s+s;
        System.out.println("keliling segitiga :" + x);
       return x; 
    }
     public static int luasSegitiga(int a, int t){
        int x = a*t/2;
        System.out.println("luas segitiga:" + x);
       return x; 
    }
      public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner input = new Scanner(System.in);
        //int k = input.nextInt();
        
        //int m = kelilingPersegi(k);
         boolean y = true;
        while (true){
        System.out.println("<===========================>");
                System.out.println("<=== Menghitung luas dan keliling bangun datar===>");
                        System.out.println("<===========================>");
                                System.out.println("\n 1.Persegi \n 2.lingkaran\n 3.segi tiga\n 4. keluar ");
                                        System.out.println("<===========================>");
                                                        
                                                        Scanner input = new Scanner(System.in);
                                                        System.out.println("masukan pilihan");
                                                        int x = input.nextInt();
                                                        System.out.println("<===========================>");
                                                            switch (x){
                                                               case 1 : System.out.println("\n 1. keliling\n 2. Luas\n 3.keluar");
                                                               Scanner h = new Scanner(System.in);
                                                               System.out.println("Masukan pilihan : " );
                                                               int n = h.nextInt();
                                                               
                                                               if (n == 1){
                                                               Scanner j = new Scanner(System.in);
                                                               System.out.println("masukan sisi :" );
                                                               int l = j.nextInt();
                                                               int m = kelilingPersegi(l);
                                                               break;
                                                               }
                                                                  if (n == 2){
                                                               Scanner j = new Scanner(System.in);
                                                               System.out.println("masukan sisi :" );
                                                               int l = j.nextInt();
                                                               int m = luasPersegi(l);
                                                               break;}
                                                                    if (n == 3){
                                                              System.exit(0);
                                                               break;}
                                                                   case 2 : System.out.println("\n 1. keliling\n 2. Luas\n 3.keluar");
                                                               Scanner hh = new Scanner(System.in);
                                                               System.out.println("Masukan pilihan : " );
                                                               int nn = hh.nextInt();
                                                               
                                                               if (nn == 1){
                                                               Scanner jj = new Scanner(System.in);
                                                               System.out.println("masukan panjang :" );
                                                               int ll = jj.nextInt();
                                                                Scanner dd = new Scanner(System.in);
                                                               System.out.println("masukan Lebar :" );
                                                               int kk = dd.nextInt();
                                                               int mm = kelilingPersegipanjang(ll,kk);
                                                               break;
                                                               }
                                                                  if (nn == 2){
                                                               Scanner jj = new Scanner(System.in);
                                                               System.out.println("masukan Panjang :" );
                                                               int ll = jj.nextInt();
                                                               Scanner dd = new Scanner(System.in);
                                                               System.out.println("masukan Lebar :" );
                                                               int kk = dd.nextInt();
                                                               int mm= luasPersegipanjang(ll,kk);
                                                               break;}
                                                                    if (nn == 3){
                                                              System.exit(0);
                                                               break;}
                                                                  
                                                                      case 3 : System.out.println("\n 1. keliling\n 2. Luas\n 3.keluar");
                                                               Scanner hhh = new Scanner(System.in);
                                                               System.out.println("Masukan pilihan : " );
                                                               int nnn = hhh.nextInt();
                                                               
                                                               if (nnn == 1){
                                                               Scanner jjj = new Scanner(System.in);
                                                               System.out.println("masukan jari-jari :" );
                                                               int lll = jjj.nextInt();
                                                               int mmm = kelilingLingkaran(lll);
                                                               break;
                                                               }
                                                                  if (nnn == 2){
                                                               Scanner jjj = new Scanner(System.in);
                                                               System.out.println("masukan sisi :" );
                                                               int lll = jjj.nextInt();
                                                               int mmm = luasLingkaran(lll);
                                                               break;}
                                                                    if (nnn == 3){
                                                              System.exit(0);
                                                               break;}   
                                                                       case 4 : System.out.println("\n 1. keliling\n 2. Luas\n 3.keluar");
                                                               Scanner hhhh = new Scanner(System.in);
                                                               System.out.println("Masukan pilihan : " );
                                                               int nnnn = hhhh.nextInt();
                                                               
                                                               if (nnnn == 1){
                                                               Scanner jjjj = new Scanner(System.in);
                                                               System.out.println("masukan sisi :" );
                                                               int llll = jjjj.nextInt();
                                                               int mmmm = kelilingSegitiga(llll);
                                                               break;
                                                               }
                                                                  if (nnnn == 2){
                                                               Scanner jjjj = new Scanner(System.in);
                                                               System.out.println("masukan alas :" );
                                                               int llll = jjjj.nextInt();
                                                               Scanner ddd = new Scanner(System.in);
                                                               System.out.println("masukan tinggi :" );
                                                               int kkk = ddd.nextInt();
                                                               int mmmm = luasSegitiga(llll,kkk);
                                                               break;}
                                                                    if (nnnn == 3){
                                                              System.exit(0);
                                                               break;}
                                                              break;
                                                            }
        }
      }
}
        
        
      
                                                              
                                                         
                                                               

    

