package n2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectionMySQL {
	public static String status = "Não conectou...";
	
	public ConectionMySQL() {
	
	}
	public static java.sql.Connection getConectionMySQL() {
    Connection connection = null;    
    String driverName = "com.mysql.cj.jdbc.Driver";
    
    try {
  		Class.forName(driverName);
  	} catch (ClassNotFoundException e) {
  		e.printStackTrace();
  	}
    
    try {
  		connection = DriverManager.getConnection("jdbc:mysql://localhost/avaln2", "root", "");
  		status = " Conectado";
  		System.out.println("Banco avaln2 " + status);
  	} catch (SQLException e) {
  		System.out.println(status);
  		e.printStackTrace();
  	}
    
    return connection;
	
	}


}
