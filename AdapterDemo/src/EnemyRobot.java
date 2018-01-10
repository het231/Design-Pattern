/*this is the adaptee  class we have which have different methods than client wants
we use adapter to send method calls to objects
that use interface to the right methods defined in our adaptee class */

import java.util.Random;

public class EnemyRobot {
		Random generator = new Random();
		
		public void smashWithHands(){
			
			int attackDamage = generator.nextInt(10) + 1;
			System.out.println("Enemy RObot does " + attackDamage +  "damage with hands");
			
		}
		public void  moveForward() {
			
			int movement  = generator.nextInt(10) +1;
			System.out.println("Enemy Robot walks" + movement+  "steps");
		}
		
		public void reactToHuman(String driverName) {
			
				System.out.println("Enemy robot react to "+  driverName);
		}
}
