/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class FirstListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("О нет, не делай этого!!!");
    }
}
