/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystemproject;

import defensesystemproject.controller.MainController;
import defensesystemproject.units.Helicopter;
import defensesystemproject.units.Submarine;
import defensesystemproject.units.Tank;

/**
 *
 * @author aloka
 */
public class DefenseSystemProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MainController mainController = new MainController();
        mainController.setVisible(true);

       
        Helicopter helicopter = new Helicopter();
        Tank tank = new Tank();
        Submarine  submarine = new Submarine();

       
        helicopter.setMainController(mainController);
        tank.setMainController(mainController);
        submarine.setMainController(mainController);

       
        mainController.addObserver(helicopter);
        mainController.addObserver(tank);
        mainController.addObserver(submarine);
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
    }

}
