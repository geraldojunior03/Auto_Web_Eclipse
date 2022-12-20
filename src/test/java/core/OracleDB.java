package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import managers.FileReaderManager;

public class OracleDB {

	private static String host_PP = FileReaderManager.getInstance().getConfigReader().getHost_PP_FCS();
	private static String host_SIT = FileReaderManager.getInstance().getConfigReader().getHost_SIT_FCS();

	private static String port = FileReaderManager.getInstance().getConfigReader().getPort_FCS();
	private static String user = FileReaderManager.getInstance().getConfigReader().getUser_DB_FCS();
	private static String password = FileReaderManager.getInstance().getConfigReader().getPassword_DB_FCS();

	private static String db_PP = FileReaderManager.getInstance().getConfigReader().getDB_PP_FCS();
	private static String db_SIT = FileReaderManager.getInstance().getConfigReader().getDB_SIT_FCS();

	private static String myUrl = null;
	private static String ambiente_db = System.getProperty("ambiente");

	public static void CustomQuery(String sql) throws SQLException {

		try {
			// String myDriver = "com.mysql.cj.jdbc.Driver";
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			conn.close();
		} catch (Exception ex) {
			System.err.println("Houve uma exceção!");
			System.out.println("SQLException: " + ex.getMessage());
		}
	}

	public static void CustomQueryLocal(String sql) {
		try {
			// cria uma conex�o ao banco de dados
			// String myDriver = "com.mysql.cj.jdbc.Driver";
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			// executar a sql

			conn.close();
			// fecha a conex�o com o banco de dados
		} catch (Exception e) {
			System.err.println("Houve uma exceção!");
			System.err.println(e.getMessage());
		}

	}

	public static String QuerySelect(String sql) {
		ResultSet rs = null;
		String json = "[";
		try {
			// cria uma conex�o ao banco de dados
			// String myDriver = "com.mysql.cj.jdbc.Driver";
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);

			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// executar a sql
			Integer contador = 1;
			while (rs.next()) {
				if (contador > 1) {
					json += ",";
				}
				json += "{\"nome\":\"" + rs.getString("nome") + "\"}";
				contador++;
			}
			json += "]";
			conn.close();

			// fecha a conex�o com o banco de dados
		} catch (Exception e) {
			System.err.println("Houve uma exceção!");
			System.err.println(e.getMessage());
		}
		return json;
	}

	public static String DBLookup(String sql) throws SQLException, ClassNotFoundException, InterruptedException {
		ResultSet rs = null;
		String lookup = "";
		try {
			// String myDriver = "com.mysql.cj.jdbc.Driver";
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(getMyURL(), user, password);
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			Thread.sleep(12000);
			rs = stmt.executeQuery(sql);
//			rs.last();
//			Integer totalLinhas = rs.getRow();
//			System.out.println(totalLinhas);
			rs.next();
			lookup = rs.getString("MOBILE_CODE");
//			System.out.println(lookup);

//			if (rs.first()) {
//				lookup = rs.getString(1);
//			} else {
//				lookup = null;
//			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
			// System.err.println("Houve uma exceção!");
			// System.err.println(e.getMessage());
		}
		return lookup;
	}

	public static void QueryInsert(String sql) {
		// System.out.println(myUrl);

		try {
			// cria uma conex�o ao banco de dados
			// String myDriver = "com.mysql.cj.jdbc.Driver";
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, user, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			// executar a sql
			conn.close();
			// fecha a conex�o com o banco de dados
		} catch (Exception e) {
			System.err.println("Houve uma exceção!");
			System.err.println(e.getMessage());
		}

	}

	private static String getMyURL() {
		try {
			if (ambiente_db == null) {
				ambiente_db = FileReaderManager.getInstance().getConfigReader().getAmbiente();
			}
		} catch (Exception e) {

		}

		if (ambiente_db.equals("PP_FVS_ALELO")) {
			myUrl = "jdbc:oracle:thin:@//" + host_PP + ":" + port + "/" + db_PP;
		} else if (ambiente_db.equals("SIT_FVS_ALELO")) {
			myUrl = "jdbc:oracle:thin:@//" + host_SIT + ":" + port + "/" + db_SIT;
		}

		return myUrl;
	}
	
	public static String selectDBAlelo(String sql, String campo) throws InterruptedException {
		ResultSet rs = null;
		String lookup = "";
		try {
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(getMyURL(), user, password);
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			Thread.sleep(12000);
			rs = stmt.executeQuery(sql);
			rs.next();
			lookup = rs.getString(campo);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lookup;
	}
	

}
