package edu.iit.cs425.controller;

import edu.iit.cs425.bean.Document;
import edu.iit.cs425.bean.User;
import edu.iit.cs425.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description: Handling all user requests from the web
 * @author: Xue Zhang
 * @date: 2021-12-03
 * @version: 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserServlet {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/toregister")
    public String userToRegister() {
        System.out.println("user to be register.....");
        return "register";
    }

    @RequestMapping("/tologin")
    public String userToLogin() {
        System.out.println("user to login.....");
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String userRegister(User user) {
        System.out.println("user to register....");
        System.out.println(user);
        if(userService.existsUserEmail(user.getEmail())) {
            System.out.println("user email already exists.");
            return "register";
        } else {
            userService.saveUser(user);
            return "login";
        }
    }

    @RequestMapping("/login")
    public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password){
        System.out.println("userLogin");
        System.out.println(email);
        System.out.println(password);
        User user = userService.login(email, password);
        if(user != null){
            if(user.getRole().equals("member")) {
                return "member";
            } else if(user.getRole().equals("librarian")) {
                System.out.println("librarian login");
                return "librarian";
            }
            return "success";
        } else{
            return "redirect:login";
        }
    }

    @RequestMapping("/librarian/enter")
    public String enterManagement(){
        return "management";
    }

    @RequestMapping("/search")
    public String userSearch(){
        return "search";
    }

    @RequestMapping(value = "/advance", method = RequestMethod.POST)
    public String userAdvanceSearch(@RequestParam("keyword") String keyword,
                                    @RequestParam("author") String author,
                                    @RequestParam("keyword") String title,
                                    @RequestParam("keyword") String classification, Model model) {
        List<Document> document1 = userService.getDocByKeyword(keyword);
        List<Document> document2 = userService.getDocByAuthor(author);
        List<Document> document3 = userService.getDocByTitle(title);
        List<Document> document4 = userService.getDocByClassify(classification);

        return "doclist";
    }
}
