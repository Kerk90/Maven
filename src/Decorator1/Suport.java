/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

import Decorator0.Developer;

/**
 *
 * @author User
 */
public class Suport extends DeveloperDecorator {

    public Suport(Developer developer) {
        super(developer);
    }

    public String supForClient() {
        return "...suport code...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + supForClient();
    }
}
