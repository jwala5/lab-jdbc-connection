package controller;
import utility.ConnectionManager;
import java.sql.Connection;



public class Main {
	public static void main(String args[]) throws Exception {
		
	// Fill your code
		Connection c= null;
		c= ConnectionManager.getconnection();
		if(c!=null)
			System.out.println("Connection established");
		else
			System.out.println("Check connection");
		
		
	}
}
