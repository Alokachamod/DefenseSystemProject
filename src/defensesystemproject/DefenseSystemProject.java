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
// 1. Controller එක හදනවා
        MainController mainController = new MainController();
        mainController.setVisible(true);

        // 2. Units 3 හදනවා
        Helicopter helicopter = new Helicopter();
        Tank tank = new Tank();
        Submarine  submarine = new Submarine();

        // 3. Units 3ට Controller එක කවුද කියලා අඳුන්වලා දෙනවා (SuperDefence එකේ setMainController හරහා)
        helicopter.setMainController(mainController);
        tank.setMainController(mainController);
        submarine.setMainController(mainController);

        // 4. Controller එකේ Array එකට මේ 3 දෙනාව add කරනවා
        mainController.addObserver(helicopter);
        mainController.addObserver(tank);
        mainController.addObserver(submarine);

        // 5. Units 3ම පෙන්නනවා
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
    }

}
