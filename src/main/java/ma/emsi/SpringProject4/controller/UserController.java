package ma.emsi.SpringProject4.controller;

import ma.emsi.SpringProject4.dao.UserRepository;
import ma.emsi.SpringProject4.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/index")
    public String users(Model model){
        List<User> users=userRepository.findAll();
        model.addAttribute("listUsers", users);
        return "users";
    }


    @GetMapping("/delete")
    public String delete(Long id){
        userRepository.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    }

}
