/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

import Decorator0.Developer;
import Decorator0.PhpDeveloper;

/**
 *
 * @author User
 */
public class Task {

    public static void main(String[] args) {
        Developer developer = new TesterPHPDeveloper(new PhpDeveloper());
        System.out.println(developer.makeJob());
    }

}
