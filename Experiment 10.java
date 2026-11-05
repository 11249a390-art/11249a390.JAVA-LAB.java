Experiment 10 — Database Connectivity

  // Ex 10: retrieve all rows from the student table
import java.sql.*;
public class FetchData {
 public static void main(String[] args) {
 String url = "jdbc:mysql://localhost:3306/scsvmv_lab";
 try (Connection con = DriverManager.getConnection(url, "root", "root");
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM student")) {
 System.out.println("REG NAME MARKS");
 while (rs.next()) {
 System.out.printf("%-7s%-11s%d%n",
 rs.getString("reg_no"),
 rs.getString("name"),
 rs.getInt("marks"));
 }
 } catch (SQLException e) {
 System.out.println("Database error : " + e.getMessage());
 }
 }
}
Output
REG NAME MARKS
101 Aravind 78
102 Divya 91
  

  Program 10.2 — InsertData.java (21 lines)
// Ex 10: insert a row safely with a PreparedStatement
import java.sql.*;
public class InsertData {
 public static void main(String[] args) {
 String url = "jdbc:mysql://localhost:3306/scsvmv_lab";
 String sql = "INSERT INTO student VALUES (?, ?, ?)";
 try (Connection con = DriverManager.getConnection(url, "root", "root");
 PreparedStatement ps = con.prepareStatement(sql)) {
 ps.setString(1, "103");
 ps.setString(2, "Karthik");
 ps.setInt (3, 45);
 int n = ps.executeUpdate();
 System.out.println(n + " row inserted.");
 } catch (SQLException e) {
 System.out.println("Database error : " + e.getMessage());
 }
 }
}

Output
1 row inserted.
Run FetchData again:
REG NAME MARKS
101 Aravind 78
102 Divya 91
103 Karthik 4


  Case Study 10 — Student Record Menu

  Solution — part 1 — Db.java (10 lines)
// Case Study 10, file 1: one place that opens the connection
import java.sql.*;
public class Db {
 static Connection open() throws SQLException {
 return DriverManager.getConnection(
 "jdbc:mysql://localhost:3306/scsvmv_lab", "root", "root");
 }
}
Solution — part 2 — StudentApp.java (25 lines)
// Case Study 10, file 2: add, search, update, delete
import java.sql.*;
import java.util.Scanner;
public class StudentApp {
 static void run(String sql, Object... v) {
 try (Connection c = Db.open(); PreparedStatement p = c.prepareStatement(sql)) {
 for (int i = 0; i < v.length; i++) p.setObject(i + 1, v[i]);
 if (sql.startsWith("SELECT")) {
 ResultSet rs = p.executeQuery();
 while (rs.next())
 System.out.println(rs.getString(1) + " " + rs.getString(2)
 + " " + rs.getInt(3));
 } else {
 System.out.println(p.executeUpdate() + " row(s) affected.");
 }
 } catch (SQLException e) { System.out.println("Error : " + e.getMessage()); }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Register number to search : ");
 String reg = sc.nextLine();
 run("SELECT * FROM student WHERE reg_no = ?", reg);
 run("UPDATE student SET marks = ? WHERE reg_no = ?", 95, reg);
   run("SELECT * FROM student WHERE reg_no = ?", reg);
 }
}
Output
  r number to search : 102
102 Divya 91
1 row(s) affected.
102 Divya 95




PRACTICE QUESTION :

• Add a delete option using DELETE FROM student WHERE reg_no = ?
  
import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/UniversityDB",
                "root", "password");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Registration Number to delete: ");
            int reg_no = sc.nextInt();

            String sql = "DELETE FROM student WHERE reg_no = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reg_no);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student deleted successfully!");
            else
                System.out.println("Student not found!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

SAMPLE OUTPUT :


Enter Registration Number to delete: 101
Student deleted successfully!

If registration number does not exist:


  Enter Registration Number to delete: 999
Student not found!
