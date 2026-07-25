import java.sql.*;

public class StudentDB {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("insert into student values(1,'Ram')");

            ResultSet rs = st.executeQuery("select * from student");

            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
