package cn.xdl.dao;

import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.User;

public interface UserDao {
	User findUserByNameAndPassword(
			@Param("name")String name,@Param("password")String password);
}
