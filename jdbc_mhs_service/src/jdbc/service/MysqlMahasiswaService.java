package jdbc.service;

/**
 *
 * @author HP
 */

/* Nama File  : MysqlMahasiswaService.java
 * Deskripsi  : Kelas service untuk mengelola operasi CRUD tabel mahasiswa
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 12 Mei 2026
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    // Constructor, inisialisasi koneksi saat objek dibuat
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    // Membuat objek mahasiswa baru (tanpa id, id di-generate database)
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    /** Menambahkan data mahasiswa ke tabel */
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException sqle) {
            System.out.println("Gagal insert : " + sqle.getMessage());
        }
    }

    /** Update data mahasiswa berdasarkan id */
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException sqle) {
            System.out.println("Gagal update : " + sqle.getMessage());
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException sqle) {
            System.out.println("Gagal delete : " + sqle.getMessage());
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal getById : " + sqle.getMessage());
        }
        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal getAll : " + sqle.getMessage());
        }
        return list;
    }
}
