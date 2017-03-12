package com.hospital.dao.impl;

import com.hospital.entity.User;
import com.hospital.dao.UserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by Jimmy on 2017/3/11.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public User load(Long id) {
        return (User)getCurrentSession().load(User.class,id);
    }

    public User get(Long id) {
        return (User)getCurrentSession().get(User.class,id);
    }

    public List<User> findAll() {
        return null;
    }

    //�������ݣ�
    public void persist(User entity) {
        getCurrentSession().persist(entity);
    }

    //��������
    public Long save(User entity) {
        return (Long)getCurrentSession().save(entity);
    }

    //��������
    public void saveOrUpdate(User entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    //ɾ������
    public void delete(Long id) {
        User user = load(id);
        getCurrentSession().delete(user);
    }

    //����
    public void flush() {
        getCurrentSession().flush();
    }
}