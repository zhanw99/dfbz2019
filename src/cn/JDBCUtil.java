package cn;


import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JDBCUtil {
    public  static Connection util(){
        Connection conn = null;
        Map<String, String> path = getPath();
        try {
            conn = DriverManager.getConnection(path.get("Url"), path.get("User"), path.get("Password"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }



    public static Map<String,String> getPath() {
        Map map  =new HashMap();
        Properties properties = new Properties();
        try {
            properties.load(JDBCUtil.class.getResourceAsStream("/jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.put("Driver",properties.getProperty("Driver"));
        map.put("Url",properties.getProperty("Url"));
        map.put("User",properties.getProperty("User"));
        map.put("Password",properties.getProperty("Password"));
        return map;
    }


    public static void close(Connection conn, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
