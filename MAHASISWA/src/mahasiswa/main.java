/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author DESI
 */
public class main {
    public static void main(String[]args){
        MAHASISWA mhs = new MAHASISWA("akbar novianto","2310010542");
        
        System.out.println("data Mahasiswa");
        System.out.println("Nama    :"+mhs.getNama());
        System.out.println("Npm    :"+mhs.getNpm());
        
        mhs.setNama("muhammad juanda");
        mhs.setNpm("2310010432");
        
        System.out.println("data mahasiswa");
        System.out.println("Nama    :"+mhs.getNama());
        System.out.println("Npm    :"+mhs.getNpm());
        
        
    }
}
