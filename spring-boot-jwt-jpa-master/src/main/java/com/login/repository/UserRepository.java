package com.login.repository;
import com.login.model.UserDao;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}