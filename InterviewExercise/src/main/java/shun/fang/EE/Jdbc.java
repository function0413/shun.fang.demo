package shun.fang.EE;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class Jdbc {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testOracle() throws ClassNotFoundException, SQLException {
		
		// 注册驱动,测试修改
		Class.forName("oracle.jdbc.OracleDriver");
		// 得到连接
		Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:orcl", "scott", "m123");
		// 编写sql语句,得到preparedStatement对象
		PreparedStatement ps = con.prepareStatement("select * from emp");
		// 执行语句得到结果
		ResultSet rs = ps.executeQuery();
		// 遍历取出结果
		while (rs.next()) {
			System.out.println("结果:"+rs.getString(2));
		}
		// 关闭资源
		rs.close();
		ps.close();
		con.close();

	}

}
