package controller;

import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		ConnectionManager obj=new ConnectionManager();
		Connection obj2=obj.getConnection();
		if(obj2!=null) {
			System.out.println("Connection established");
		}
		else
			System.out.println("Check your connection");
		
	}
}
