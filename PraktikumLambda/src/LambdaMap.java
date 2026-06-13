/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

/* Nama File  : LambdaMap.java
 * Deskripsi  : Menampilkan key (NIM) dan value (nama) dari Map menggunakan lambda.
 * Pembuat    : Amelia Aristianti / 24060124120008
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140001", "Adi");
        mahasiswaMap.put("24060122140002", "Bambang");
        mahasiswaMap.put("24060122140003", "Cici");
        mahasiswaMap.put("24060122140004", "Didi");

        // lambda forEach pada Map
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}