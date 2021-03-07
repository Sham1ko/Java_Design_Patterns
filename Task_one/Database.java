package Task_one;

import java.sql.*;

public class Database {

    private static Database instance;
    Connection connection=null;
    private Database(){
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc","postgres","shamiko");
            if (connection!=null){
                System.out.println("Connection OK");
            }else {
                System.out.println("Connection Failed");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static Database getInstance(){
        if (Database.instance == null){
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void query(String sql) throws SQLException {
        Statement statement;
        statement=connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            System.out.println(rs.getString("project_id")+" "+rs.getString("project")+"\n");
        }
    }

}
