package edu.iit.cs425.service.impl;

import edu.iit.cs425.bean.Document;
import edu.iit.cs425.bean.User;
import edu.iit.cs425.dao.UserMapper;
import edu.iit.cs425.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-06
 * @version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Autowired
    public void setDocumentMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void registerUser(User user) {
        userMapper.createUser(user);
    }

    @Override
    public User login(String email, String password) {
        User newUser = userMapper.queryUserByUserEmailAndPassword(email, password);
        if(newUser != null) {
            System.out.println("success login");
        } else {
            System.out.println("email and password mismatch.");
        }
        return newUser;
    }

    @Override
    public Boolean existsUserEmail(String email) {
        return userMapper.queryUserByUserEmail(email) != null;
    }

    @Override
    public void saveUser(User user) {
        userMapper.createUser(user);
    }

    @Override
    public List<Document> getDocByKeyword(String keyword) {
        return userMapper.queryDocByKeyword(keyword);
    }

    @Override
    public List<Document> getDocByAuthor(String author) {
        return userMapper.queryDocByAuthor(author);
    }

    @Override
    public List<Document> getDocByTitle(String title) {
        return userMapper.queryDocByTitle(title);
    }

    @Override
    public List<Document> getDocByClassify(String classification) {
        return userMapper.queryDocByClassify(classification);
    }
}
