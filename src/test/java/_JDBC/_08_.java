package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _08_ extends JDBCParent {
    public static void main(String[] args) throws SQLException {

        DBConnectionOpen();

        ResultSet rs=statement.executeQuery("select city_id, city, country_id from citt");
        rs.next();
        System.out.println("id = rs.getString(1) = " + rs.getString("city_id"));

        int cityID= rs.getInt("city_id");
        System.out.println("cityID = " + cityID);

        DBConnectionClose();
    }
}
