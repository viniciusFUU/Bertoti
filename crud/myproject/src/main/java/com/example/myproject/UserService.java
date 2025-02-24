package com.example.myproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User updateUserByName(String name, User userDetails) {
        List<User> users = userRepository.findAll();
        User updatedUser = null;
        
        for (User usuario : users) {
            if (name.equals(usuario.getName())) {
                usuario.setName(userDetails.getName());
                updatedUser = usuario;
                break;  
            }
        }
        
        if (updatedUser != null) {
            return userRepository.save(updatedUser); 
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public void deleteUserById(Long id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException("User not Found");
        }

    }
}
