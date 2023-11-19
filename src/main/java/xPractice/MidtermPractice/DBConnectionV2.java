package xPractice.MidtermPractice;

import java.sql.*;

public class DBConnectionV2 {
    private static final String CONNECTION_STR = "";
    private static final String UNAME = "";
    private static final String PWD = "";
    private Connection connection = null;

    public DBConnectionV2() {
        try {
            this.connection = DriverManager.getConnection(CONNECTION_STR, UNAME, PWD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllUsers() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks");
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getString("task_description"));
        }
    }
}
