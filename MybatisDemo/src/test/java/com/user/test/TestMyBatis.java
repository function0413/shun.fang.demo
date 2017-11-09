package com.user.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.user.dao.UserDao;
import com.user.domain.UsrDto;
/***
 * MyBatis单元测试方法
 * @author function0413
 *
 */
public class TestMyBatis {
	private SqlSessionFactory factory;
	SqlSession openSession;
	UserDao userDao;

	@Before
	public void setUp() throws Exception {
		String resource = "sqlMapConfig.xml";
		//通过流将核心配置文件读入
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//通过核心配置文件输入流, 创建会话工厂
		factory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂创建会话
		 openSession = factory.openSession(true);//通过参数可以设置是否自动提交
		//通过会话的getMapper方法来实例化 接口
			 userDao = openSession.getMapper(UserDao.class);
	}

	/***
	 * 测试传入Map参数
	 */
	@Test
	public void testMapPram() {
				
				Map map=new HashMap();
				map.put("usr_key", "10");
				//map.put("act_key", "11");
				List<UsrDto> res = userDao.testMapPram(map);
	}
	/***
	 * 测试传入List参数
	 */
	@Test
	public void testListPram() {
		List list=new ArrayList();
		list.add("10122");
		list.add("10194");
		list.add("10126");
		List<UsrDto> res = userDao.testListPram(list);
		System.out.println(res);
	}
	/***
	 * 测试传入数组参数
	 */
	@Test
	public void testArrayPram() {
		String[] usr_keys={"10122","10194","10126"};
		List<UsrDto> res = userDao.testArrayPram(usr_keys);
		System.out.println(res);
	}
	/***
	 * 测试传入多个参数
	 */
	@Test
	public void testMultiPram() {
		List<UsrDto> res = userDao.testMultiPram("方","fang");
		System.out.println(res);
	}
	/***
	 * 测试传入多个集合类型参数
	 */
	@Test
	public void testMultiCollectPram() {
		List list=new ArrayList();
		list.add("10122");
		list.add("10194");
		list.add("10126");
		Map map=new HashMap();
		map.put("usr_last_name", "王傻");
		map.put("usr_login", "WANG");
		List<UsrDto> res = userDao.testMultiCollectPram(list, map);
		System.out.println(res);
	}
	/***
	 * 测试if 和 trim 标签
	 */
	@Test
	public void testIfAndTrim() {
		userDao.testIfAndTrim("100","");
		userDao.testIfAndTrim(null,"FANG");
	}
	/***
	 * 测试where  和 trim 标签
	 */
	@Test
	public void testWhereAndTrim() {
		
		userDao.testWhereAndTrim("2985","","安庆市怀宁县高河镇");
	}
	/***
	 * 测试choose 标签
	 */
	@Test
	public void testChoose() {
		Map map=new HashMap();
		//map.put("usr_login", "FANG");
		//map.put("usr_last_name", "方");
		userDao.testChoose(map);
	}
	/***
	 * 测试分页
	 */
	@Test
	public void testPagination() {
		userDao.testPagination(10, 1);
	}
	/***
	 * 测试返回Map
	 */
	@Test
	public void testResMap() {
		List<Map> res = userDao.testResMap();
		for (Map map : res) {
			System.out.println(map);
		}
	}

}
