package Task_one;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        Database instanceFirst = Database.getInstance();
        instanceFirst.query("Select * from project");

        Database instanceSecond = Database.getInstance();
        instanceSecond.query("Select * from project");
    }
}
