/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author DESI
 */

public class Hitung {
    private double bil1;
    private double bil2;

    // Constructor
    public Hitung (double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double setPenjumlahan() {
        return bil1 + bil2;
    }  
    public double setPengurangan() {
        return bil1 - bil2;
    }

    public double setPerkalian() {
        return bil1 * bil2;
    }

    public double setPembagian() {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
    }

        // TODO code application logic here   
