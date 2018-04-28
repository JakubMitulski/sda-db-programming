package pl.sda.poznan;

import pl.sda.poznan.util.DbUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) throws SQLException {
        ResultSet rs = DbUtils.getConnection().createStatement()
                .executeQuery("SELECT COUNT(ID) FROM USERS");

        rs.next();
        int count = rs.getInt(1);
        System.out.println(count);
    }
}