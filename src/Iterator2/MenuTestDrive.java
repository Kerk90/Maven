/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
