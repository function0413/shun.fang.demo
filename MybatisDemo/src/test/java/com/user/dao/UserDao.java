package com.user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.user.domain.UsrDto;


public interface UserDao {
	public List<UsrDto> testMapPram(Map map);
	public List<UsrDto> testListPram(List list);
	public List<UsrDto> testArrayPram(String[] usr_keys);
	public List<UsrDto> testMultiPram(@Param("usr_last_name")String usr_last_name,@Param("usr_login")String usr_login);
	public List<UsrDto> testMultiCollectPram(@Param("usr_keys")List usr_keys,@Param("usr_info")Map usr_info);
	public List<UsrDto> testIfAndTrim(@Param("usr_key")String usr_key,@Param("usr_login")String usr_login);
	public void testWhereAndTrim(@Param("usr_key")String usr_key,@Param("usr_pager")String usr_pager,@Param("USR_HOME_POSTAL_ADDRESS")String USR_HOME_POSTAL_ADDRESS);
	public List<UsrDto>  testChoose(@Param("map") Map map);
	public List<UsrDto>  testPagination(@Param("pageSize")Integer pageSize,@Param("pageNo")Integer pageNo);

}
