/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author g.irakleidis
 */
@RestController
public class EndPoints {
    
    @RequestMapping("/")
    public String someName(){
    return "Hello from SB";}
    
}
