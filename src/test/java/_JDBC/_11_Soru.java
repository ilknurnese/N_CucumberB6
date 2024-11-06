package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class _11_Soru extends JDBCParent {

//kendisine gönderilen bir select sorgusunun sonucunu
// ArrayList olarak döndüren metodu yazınız.
    // Mainde Listi yazdırarak sonucu kontrol edinimiz.

    public static void main(String[] args) throws SQLException {

        DBConnectionOpen();

        List< List<String> > resultList = executeQueryToList("SELECT * FROM language");

        // Sonucu yazdırarak kontrol etme
        for (List<String> row : resultList) {
            System.out.println(row);
        }

        DBConnectionClose();

    }

    // Kendisine gönderilen bir SELECT sorgusunun sonucunu ArrayList olarak döndüren metot
    public static List< List<String> > executeQueryToList(String query) throws SQLException {

        List< List<String> > resultList = new ArrayList<>();

        ResultSet rs = statement.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Satırları ArrayList olarak ekleyelim
        while (rs.next()) {
            List<String> row = new ArrayList<>();
            for (int i = 1; i <= columnCount; i++) {
                row.add(rs.getString(i)); // Her sütundaki veriyi alıp satır listesine ekliyoruz
            }
            resultList.add(row); // Satırı ana listeye ekliyoruz
        }

        return resultList;
    }
}
