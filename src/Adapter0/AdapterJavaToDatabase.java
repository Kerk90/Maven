/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter0;

/**
 *
 * @author User
 */
public class AdapterJavaToDatabase extends JavaAplication implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        saveObject();
    }

    @Override
    public void delete() {
        updateObject();
    }

}
