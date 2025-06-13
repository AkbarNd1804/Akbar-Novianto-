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
public class dosen {
    String nama;
    String nidn;
    String mataKuliah;
    
    public dosen(String nama, String nidn, String mataKuliah) {
        this.nama = nama;
        this.nidn = nidn;
        this.mataKuliah = mataKuliah;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("NIDN: " + nidn);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}
