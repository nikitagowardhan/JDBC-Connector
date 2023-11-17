package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //Step1
	Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Step1 Done");
    
    //Step2
    Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","abc123");
    System.out.println("Step2 Done");
    
    //Step3
    Statement st = con.createStatement();
    System.out.println("Step3 Done");
    
    //Step4
    int a =st.executeUpdate("insert into mydb_tbl values(102,'Mansi')");
    System.out.println("Step4 Done");
    if(a>0)
    {
    	System.out.println("Data inserted");
    }
    else
    {
    	System.out.println("Unsuccesful insertion");
    }
    
    //Step5
    
    con.close();
    System.out.println("Step5 Done");
		
		
}
}