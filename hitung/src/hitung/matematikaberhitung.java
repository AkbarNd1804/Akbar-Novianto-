package hitung;

public class matematikaberhitung {
    public static void main(String[] args) {
        Hitung akbar = new Hitung(4, 2);

        System.out.println("Hasil Penjumlahan: " + akbar.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + akbar.setPengurangan());
        System.out.println("Hasil Perkalian  : " + akbar.setPerkalian());
        System.out.println("Hasil Pembagian  : " + akbar.setPembagian());
    }
}
