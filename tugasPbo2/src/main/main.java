/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DESI
 */
public class main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Rina Anggraini", "220001", "Informatika");
        dosen dosen1 = new dosen("Dr. Budi Santoso", "123456", "Pemrograman Java");
        
        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilkanInfo();
        
        System.out.println("\n=== Data Dosen ===");
        dosen1.tampilkanInfo();
    }
}
