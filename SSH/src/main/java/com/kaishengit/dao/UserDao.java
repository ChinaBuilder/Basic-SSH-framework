package com.kaishengit.dao;


import com.kaishengit.pojo.Role;
import com.kaishengit.pojo.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserDao {

    @Inject
    private  SessionFactory sessionFactory;

    public Session getSession(){
        Session session = sessionFactory.getCurrentSession();
       return session;
    }

    /**
     * 根据账号查找用户
     * @param account
     * @return
     */
    public User findUserByName(String account) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("account",account));
        User user = (User) criteria.uniqueResult();
        return user;
    }

    /**
     * 根据id查找角色
     * @param roleid
     * @return
     */
    public Role findRoleById(Integer roleid) {
        return (Role) getSession().get(Role.class,roleid);
    }
}
