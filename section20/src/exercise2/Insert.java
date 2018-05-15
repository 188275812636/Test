package exercise2;

import exercise1.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement sql;
        ResultSet res;
        DbUtil d = new DbUtil();

        try {
            Insert c = new Insert();
            con = d.getCon();
            sql = con.prepareStatement("insert into tb_stu(name,sex,birthday) values(?,?,?)");
            sql.setString(1, "李某");
            sql.setString(2, "女");
            sql.setString(3, "1999-10-20");
            sql.executeUpdate();
            System.out.println("数据插入成功。");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
