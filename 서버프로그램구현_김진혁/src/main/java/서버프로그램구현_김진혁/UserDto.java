package �������α׷�����_������;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDto {
	
	private static Connection connection;
	private static PreparedStatement ps;
	private static ResultSet rs;
	public static UserDao userDao = new UserDao();
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234");
			System.out.println("DB���� ����");
		}
		catch (Exception e) {
			System.out.println("[DB ���� ���� (UserDao) :");
		}
	}	
}
