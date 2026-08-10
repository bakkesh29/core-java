// // //CREATE DATABASE college;

// // // USE college;

// // // CREATE TABLE student (
// // //     id INT PRIMARY KEY,
// // //     name VARCHAR(50),
// // //     marks DOUBLE
// // // );

// // import java.sql.*;

// // public class JdbcExample {

// //     public static void main(String[] args) {

// //         String url = "jdbc:mysql://localhost:3306/college";
// //         String username = "root";
// //         String password = "root";

// //         try {
// //             // 1. Load MySQL JDBC Driver
// //             Class.forName("com.mysql.cj.jdbc.Driver");

// //             // 2. Establish connection
// //             Connection con = DriverManager.getConnection(
// //                     url, username, password
// //             );

// //             System.out.println("Database connected successfully!");

// //             // 3. INSERT
// //             String insertQuery =
// //                     "INSERT INTO student VALUES (?, ?, ?)";

// //             PreparedStatement ps = con.prepareStatement(insertQuery);

// //             ps.setInt(1, 101);
// //             ps.setString(2, "Bakkesh");
// //             ps.setDouble(3, 85.5);

// //             ps.executeUpdate();

// //             System.out.println("Student inserted successfully.");

// //             // 4. SELECT
// //             String selectQuery = "SELECT * FROM student";

// //             Statement stmt = con.createStatement();

// //             ResultSet rs = stmt.executeQuery(selectQuery);

// //             System.out.println("\nStudent Details:");

// //             while (rs.next()) {
// //                 int id = rs.getInt("id");
// //                 String name = rs.getString("name");
// //                 double marks = rs.getDouble("marks");

// //                 System.out.println(
// //                         id + " " + name + " " + marks
// //                 );
// //             }

// //             // 5. UPDATE
// //             String updateQuery =
// //                     "UPDATE student SET marks = ? WHERE id = ?";

// //             PreparedStatement updatePs =
// //                     con.prepareStatement(updateQuery);

// //             updatePs.setDouble(1, 90.0);
// //             updatePs.setInt(2, 101);

// //             updatePs.executeUpdate();

// //             System.out.println("\nStudent updated successfully.");

// //             // 6. DELETE
// //             String deleteQuery =
// //                     "DELETE FROM student WHERE id = ?";

// //             PreparedStatement deletePs =
// //                     con.prepareStatement(deleteQuery);

// //             deletePs.setInt(1, 101);

// //             deletePs.executeUpdate();

// //             System.out.println("Student deleted successfully.");

// //             // 7. Close connection
// //             con.close();

// //         } catch (ClassNotFoundException e) {
// //             System.out.println("JDBC Driver not found.");
// //             e.printStackTrace();

// //         } catch (SQLException e) {
// //             System.out.println("Database error.");
// //             e.printStackTrace();
// //         }
// //     }
// // }



// 1. Import java.sql.*
//         ↓
// 2. Load JDBC Driver
//         ↓
// 3. Establish Connection
//         ↓
// 4. Create Statement / PreparedStatement
//         ↓
// 5. Execute SQL Query
//         ↓
// 6. Process ResultSet
//         ↓
// 7. Close Connection