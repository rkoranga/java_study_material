

import java.sql.*;  
 
 class JdbcSelectTest {  
   public static void main(String[] args) {
      try (
         
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop",
               "myuser", "xxxx");   // For MySQL only
               
         Statement stmt = conn.createStatement();
      ) {
         
         String strSelect = "select title, price, qty from books";
         System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
 
         ResultSet rset = stmt.executeQuery(strSelect);
 
         System.out.println("The records selected are:");
         int rowCount = 0;
         
         while(rset.next()) {   // Repeatedly process each row
            String title = rset.getString("title");  // retrieve a 'String'-cell in the row
            double price = rset.getDouble("price");  // retrieve a 'double'-cell in the row
            int    qty   = rset.getInt("qty");       // retrieve a 'int'-cell in the row
            System.out.println(title + ", " + price + ", " + qty);
            ++rowCount;
         }
         System.out.println("Total number of records = " + rowCount);
 
      } catch(SQLException ex) {
         ex.printStackTrace();
      }  
   }
}