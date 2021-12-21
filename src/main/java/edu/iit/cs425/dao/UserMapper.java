package edu.iit.cs425.dao;

import edu.iit.cs425.bean.Document;
import edu.iit.cs425.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-06
 * @version: 1.0
 **/
public interface UserMapper {
    Integer createUser(User user);

    User queryUserByUserEmail(@Param(value ="email") String email);

    User queryUserByUserEmailAndPassword(@Param(value = "email") String email, @Param(value = "password") String password);

    Integer updateUser(User user);

    User queryUserById(Integer id);
    List<User> queryUserByRole(String role);
    User queryUserByEmail(String email);

    List<Document> queryDocByKeyword(@Param(value = "keyword") String keyword);

    List<Document> queryDocByAuthor(@Param(value = "author") String author);

    List<Document> queryDocByTitle(@Param(value = "title") String title);

    List<Document> queryDocByClassify(@Param(value = "classification") String classification);
}
