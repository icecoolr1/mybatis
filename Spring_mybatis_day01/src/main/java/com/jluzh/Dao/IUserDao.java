package com.jluzh.Dao;

import com.jluzh.domin.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
   List<User> findAll();

}
