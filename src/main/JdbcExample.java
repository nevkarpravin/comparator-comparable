package main;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load Drivers
        Class.forName("org.hsqldb.jdbcDriver");
        //
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA","");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from ADDRESS ");
        while (resultSet.next()){
            Address address = new Address();
            address.setId(resultSet.getInt("ID"));
            address.setCity(resultSet.getString("CITYNAME"));
            address.setPinCode(resultSet.getInt("PINCODE"));
            address.setState(resultSet.getString("STATE"));
            address.setStreetName(resultSet.getString("STREETNAME"));
            System.out.println("Address :" + address);
        }

        connection.close();
        jdbcUsingPreparedStatement();
    }

    public static void jdbcUsingPreparedStatement() throws ClassNotFoundException, SQLException {
        String query = "Select * from ADDRESS where id = ?";
        Class.forName("org.hsqldb.jdbcDriver");
        //
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA","");
        PreparedStatement statement1 = connection.prepareStatement(query);
        statement1.setInt(1, 1);
        ResultSet resultSet1 = statement1.executeQuery();

        while (resultSet1.next()){
            Address address = new Address();
            address.setId(resultSet1.getInt("ID"));
            address.setCity(resultSet1.getString("CITYNAME"));
            address.setPinCode(resultSet1.getInt("PINCODE"));
            address.setState(resultSet1.getString("STATE"));
            address.setStreetName(resultSet1.getString("STREETNAME"));
            System.out.println("Address :" + address);
        }
    }
}
