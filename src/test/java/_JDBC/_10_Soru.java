package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _10_Soru extends  JDBCParent{
    public static void main(String[] args) throws SQLException {

        DBConnectionOpen();

        // language tablosunu sorguluyoruz
        ResultSet rs = statement.executeQuery("select * from language");

        // Metadata bilgilerini alıyoruz
        // sorgu sonucunda DATA dışındaki veriler, kolon sayısı ve kolon isimleri
        ResultSetMetaData rsmd=rs.getMetaData();
        int kolonSayisi= rsmd.getColumnCount();

        System.out.println("kolonSayisi = " + kolonSayisi);

        // Kolon isimlerini yazdırma
        for (int i = 1; i <= kolonSayisi; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println();

        // Tüm satırları ve sütunları yazdırma
        while (rs.next()) {
            for (int i = 1; i <= kolonSayisi; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }

        DBConnectionClose();



    }
}
