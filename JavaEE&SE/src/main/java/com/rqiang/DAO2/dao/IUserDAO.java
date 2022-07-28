package com.rqiang.DAO2.dao;

import com.rqiang.DAO2.vo.User;

public interface IUserDAO {
    /**
     * 用户登陆验证
     * @param user 传入VO对象
     * @return 验证的操作结果
     * @throws Exception
     */
    public boolean findLogin(User user) throws Exception;
}
