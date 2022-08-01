package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JdbcTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try (Connection con =
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
						"c##scott",
						"tiger"))
		{
			log.info(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
