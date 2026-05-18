package PersistensiA;

/**
 *
 * @author HP
 */

/* Nama File  : ReadSerializedPerson.java
 * Deskripsi  : Program untuk membaca objek Person yang telah terserialisasi
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 12 Mei 2026
 */

import java.io.*;

public class ReadSerializedPerson {

    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}