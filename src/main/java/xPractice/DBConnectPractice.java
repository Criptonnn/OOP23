package xPractice;

import java.sql.*;
public class DBConnectPractice {
    private final String CONNECTION_STR = "jdbc:mysql://localhost:3306/lab3";
    private final String NAME = "root";
    private final String PASSWORD = "";
    private Connection connection;

    public DBConnectPractice() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STR, NAME, PASSWORD);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllData() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks;");
        ResultSet result = statement.executeQuery();
        while(result.next()) {
            System.out.print(result.getString("task_description"));
            System.out.print(" --- ");
            System.out.print(result.getString("task_status"));
            System.out.println();
        }

    }

    public void getRecordByStatus(Status stat) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks WHERE task_status = ?");
        statement.setString(1, stat.toString());
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()) {
            System.out.print(resultSet.getInt("id") + " ");
            System.out.print(resultSet.getString("task_description") + " ");
            System.out.println(resultSet.getString("task_status"));
        }


    }

    public static void main(String[] args) {
        DBConnectPractice connection = new DBConnectPractice();
        try {
            connection.getRecordByStatus(Status.COMPLETED);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
