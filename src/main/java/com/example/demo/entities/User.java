/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author g.irakleidis
 */
@Entity
public class User {
    
    @Id
    private int id;
    private String name;
    private int yob;
}
