package PersistensiA;

/**
 *
 * @author HP
 */

/* Nama File  : SerializePerson.java
 * Deskripsi  : Program untuk menyimpan objek Person ke file person.ser
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 12 Mei 2026
 */

import java.io.*;

// Class Person
class Person implements Serializable {

    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

// Class SerializePerson
public class SerializePerson {

    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
