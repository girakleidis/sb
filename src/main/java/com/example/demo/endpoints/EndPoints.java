/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.endpoints;

import com.example.demo.entities.User;
import com.example.demo.entities.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author g.irakleidis
 */
@RestController
public class EndPoints {
    
    @Autowired
    private UserRepository ur;
    
    @RequestMapping("/")
    public String someName(){
    return "Hello from SB";}
    
    @RequestMapping("/getjson")
    public String someOtherName(@RequestBody User temp){
        ur.save(temp);
        return "ok";
    }
    
    @RequestMapping("/all")
    public Iterable<User> all(){
    return ur.findAll();}
}
