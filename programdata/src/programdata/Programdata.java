/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programdata;

/**
 *
 * @author DESI
 */
public class Programdata {
      String nama;
      String npm;
      String kelas;
      String Alamat;
      String nomorhp;
    
     public static void main(String nama kelas alamat,int npm[]args){
        Programdata data = new Programdata();
        
        data.nama = "Akbar";
        data.npm = "2310010542";
        data.kelas = "4B";
        data.Alamat = "jalan sungai andai";
        data.nomorhp = "08595600567";
        
        System.out.println("nama :"+ data.nama);
        System.out.println("npm :"+ data.npm);
        System.out.println("kelas :"+ data.kelas);
        System.out.println("Alamat :"+ data.Alamat);
        System.out.println("nomor hp :"+ data.nomorhp);
        // TODO code application logic here
    }
    
}
