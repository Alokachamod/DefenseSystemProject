/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defensesystemproject.interfaces;

import defensesystemproject.enums.Strength;

/**
 *
 * @author aloka
 */
public interface Observer {
    void updateArea(boolean isClear);
    void updateStrength(Strength strength);
    void receiveMessage(String message);
}
