package exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Find {

    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet res;
        DbUtil d = new DbUtil();
        try {
            con = d.getCon();
            sql = con.createStatement();
            res = sql.executeQuery("select * from tb_emp where dapt = '销售部'");
            while (res.next()) {
                String id = res.getString(1);
                String name = res.getString("name");
                String sex = res.getString("sex");
                String birthday = res.getString("birthday");
                System.out.print("编号：" + id+" 姓名：" + name+" 性别:" + sex+" 生日：" + birthday);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
