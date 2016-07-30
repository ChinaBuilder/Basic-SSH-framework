package com.kaishengit.Service;


import com.kaishengit.dao.UserDao;
import com.kaishengit.pojo.Role;
import com.kaishengit.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;

@Transactional
@Named
public class UserService {

    @Inject
    private UserDao userDao;


    /**
     * 根据账号查找用户
     * @param account
     * @return
     */
    public User findUserByName(String account) {

        return userDao.findUserByName(account);
    }



    public Role findRoleByRoleid(Integer roleid) {
        return userDao.findRoleById(roleid);
    }
}
