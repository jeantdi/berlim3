package jeanzn;
import robocode.*;
import java.awt.Color;

/**
 * Jeanzn - a class by (jeanzn ag)
 */
public class Berlim extends Robot {
   public void run () {
   setColors(Color.orange,Color.black,Color.lightGray,Color.white,Color.green);
   while(true) {
         ahead(100);
         back(40);
         turnRight(50);
         turnLeft(90);
   } 
 }
   public void onScannedRobot(ScannedRobotEvent e){
   fire(1);
	  }
   //colisão com a parede
   public void onHitWall(HitWallEvent e) {
	   back(50);
	   turnRight(90);
   }
	}