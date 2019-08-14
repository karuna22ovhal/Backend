package com.cognizant.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.User;

@Repository
public interface UserDao extends CrudRepository<User,Integer> {

	User findDistinctByUsernameAndPassword(String username, String password);

	User findByUsername(String username);

}
