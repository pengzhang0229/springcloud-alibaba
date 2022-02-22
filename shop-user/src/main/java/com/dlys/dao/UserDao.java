package com.dlys.dao;

import com.dlys.daomain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserDao.
 *
 * @author admin
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
