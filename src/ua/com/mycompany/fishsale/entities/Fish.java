/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.mycompany.fishsale.entities;

/**
 *
 * @author Igor Gayvan
 */
public class Fish {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fish(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
