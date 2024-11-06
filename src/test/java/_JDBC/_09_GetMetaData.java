package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _09_GetMetaData extends JDBCParent {
    public static void main(String[] args) throws SQLException {


        DBConnectionOpen();

        ResultSet rs=statement.executeQuery("select * from city");

        // sorgu sonucunda DATA dışındaki veriler, kolon sayısı ve kolon isimleri
        ResultSetMetaData rsmd=rs.getMetaData();

        int kolonSayisi= rsmd.getColumnCount();
        System.out.println("kolonSayisi = " + kolonSayisi);

        for (int i = 1; i <= kolonSayisi; i++) {
            System.out.println("rsmd.getColumnTypeName(i) = " + rsmd.getColumnTypeName(i));

        }

        rs.next();

        for (int i = 1; i <= kolonSayisi; i++) {
            System.out.println("rs.getString(i) = " + rs.getString(i));
        }
        DBConnectionClose();
    }
}
