package edu.iit.cs425.service;

import edu.iit.cs425.bean.Document;
import edu.iit.cs425.bean.User;

import java.util.List;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-06
 * @version: 1.0
 **/
public interface UserService {

    /**
     * register
     * @param user a user entity
     */
    public void registerUser(User user);

    /**
     * Login
     * @param email login email
     * @param password login password
     * @return user
     */
    public User login(String email, String password);

    /**
     * Check whether the provided email already exist.
     * @param email an email address
     * @return if not exist,return true, otherwise return false
     */
    public Boolean existsUserEmail(String email);

    /**
     * Save the register user information.
     * @param user an object needs to save
     */
    public void saveUser(User user);

    /**
     * Get document by keyword
     * @param keyword the keyword used to search
     * @return document
     */
    List<Document> getDocByKeyword(String keyword);

    /**
     * Get document by author
     * @param author the keyword used to search
     * @return document
     */
    List<Document> getDocByAuthor(String author);

    /**
     * Get document by title.
     * @param title document title
     * @return document information
     */
    List<Document> getDocByTitle(String title);

    /**
     * Get document by classification.
     * @param classification to classify
     * @return document information
     */
    List<Document> getDocByClassify(String classification);
}
