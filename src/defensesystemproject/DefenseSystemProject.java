/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystemproject;

import defensesystemproject.controller.MainController;
import defensesystemproject.enums.Strength;
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
        
        helicopter.updateStrength(Strength.LOW);
        tank.updateStrength(Strength.LOW);
        submarine.updateStrength(Strength.LOW);
        
        
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        
        mainController.setLocation(0, 0);

        
        helicopter.setLocation(screenWidth - helicopter.getWidth(), 0);

        tank.setLocation(0, screenHeight - tank.getHeight() - 40); 

        submarine.setLocation(screenWidth - submarine.getWidth(), screenHeight - submarine.getHeight() - 40);
    }

}
