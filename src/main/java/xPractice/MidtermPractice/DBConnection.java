package xPractice.MidtermPractice;

import java.sql.*;
public class DBConnection {
    private static final String CONNECTION_STR = "jdbc:mysql://localhost:3306/lab3";
    private static final String NAME = "root";
    private static final String PASSWORD = "";

    private Connection connection;

    public DBConnection() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STR, NAME, PASSWORD);
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllCustomers() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks;");
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            System.out.print(rs.getInt("id"));
            System.out.print(" " + rs.getString("task_description"));
            System.out.print(" " + rs.getString("task_status"));
            System.out.println();
        }
    }

    public void getTaskByDescripiton(String description) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks WHERE task_description = ?");
        statement.setString(1, description);
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            System.out.print(rs.getInt("id"));
            System.out.print(" " + rs.getString("task_description"));
            System.out.print(" " + rs.getString("task_status"));
            System.out.println();
        }
    }


    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        try {
            dbConnection.getTaskByDescripiton("Night out");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
