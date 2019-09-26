package cn.day23;

import cn.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Dao {
    public static void main(String[] args) {
        User u = new User("zhanw","123456");
        //增
        ins(u);
        //删
        // del(3);
//        List<User> list = sel();
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).toString();
//            System.out.println(list.get(i).toString());
//        }
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //增
    public static void ins(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.util();
            String sql = "insert into user(name,password) values(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, user.getName());
            ps.setObject(2, user.getPassword());
            int i = ps.executeUpdate();
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, ps);
        }
    }

    //删
    public static void del(int i) {
        PreparedStatement ps = null;
        Connection conn = null;
        try {
            conn = JDBCUtil.util();
            String sql = "delete from student where id=? ";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, i);
            int j = ps.executeUpdate();
            System.out.println(j);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, ps);
        }
    }

    //查看
    public static List sel() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> list = new ArrayList();
        try {
            conn = JDBCUtil.util();
            String sql = "select * from user ";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.toString();
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, ps, rs);
            return list;
        }
    }
}