package PersistensiA;

/**
 *
 * @author HP
 */

/* Nama File  : MainDAO.java
 * Deskripsi  : Main program untuk akses DAO
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 12 Mei 2026
 */

public class MainDAO {

    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}