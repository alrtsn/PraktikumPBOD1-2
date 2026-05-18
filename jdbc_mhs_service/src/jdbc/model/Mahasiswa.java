package jdbc.model;

/**
 *
 * @author HP
 */
/* Nama File  : Mahasiswa.java
 * Deskripsi  : Persistent object sebagai model untuk tabel mahasiswa
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 12 Mei 2026
 */

public class Mahasiswa {

    // Atribut sesuai kolom tabel mahasiswa
    private int id;
    private String nama;

    // Constructor default
    public Mahasiswa() {
    }

    // Constructor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}