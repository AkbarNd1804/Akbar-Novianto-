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
public class MAHASISWA {
    //atribut
    private String npm;
    private String nama;
    
    public MAHASISWA (String npm,String nama){
        this.npm = npm;
        this.nama =nama;
    }
    
    public String getNpm(){
        return npm;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNpm(String npm){
        this.npm = npm;
    }
    
    public void setNama(String nama){
       this.nama = nama;
    }
}
