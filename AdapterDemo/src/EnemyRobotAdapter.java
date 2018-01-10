/*the adapter must provide an alternative way  action fro method that to be implemented.
this adapter does this by containing object of the same type of "enemy robot" 
all calls to enemyattacker methods are sent insted to use methods used by enemy robot*/
import java.util.Random;
public class EnemyRobotAdapter implements EnemyAttacker {

		EnemyRobot robot ;
		public  EnemyRobotAdapter(EnemyRobot newRobot) {
			// TODO Auto-generated constructor stub
			robot = newRobot;
		}
		
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
			robot .smashWithHands();
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		robot.moveForward();
	}

	@Override
	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
		robot.reactToHuman(driverName);
	}
	
	
}
