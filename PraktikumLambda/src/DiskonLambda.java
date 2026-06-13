/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

/**
 * Nama File : DiskonLambda.java
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 * Pembuat   : Amelia Aristianti / 24060124120008
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda (anonymous class)
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda (ekspresi langsung)
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // dengan lambda + block statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "   + diskonBiasa.hitungDiskon(45000));
    }
}

// JAWABAN PERTANYAAN 3.1.b
// diskonMerdeka masih pake cara lama yaitu anonymous class, jadi penulisannya panjang karena
// harus bikin method lengkap di dalamnya. diskonLebaran udah pake lambda tapi versi singkat,
// langsung return tanpa perlu kurung kurawal. diskonBiasa juga pake lambda tapi ada kurung
// kurawal {}-nya jadi harus nulis return sendiri. Jadi ketiganya sebenernya fungsinya sama,
// cuma cara penulisannya aja yang beda.
