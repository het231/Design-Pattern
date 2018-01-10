
public class TestEnemyAttackers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			EnemyTank rTank = new EnemyTank();
			EnemyRobot fredTheRobot = new EnemyRobot();
			EnemyAttacker robotadapter = new  EnemyRobotAdapter(fredTheRobot);
			
			System.out.println("The robot ");
			
			fredTheRobot.reactToHuman("het");
			fredTheRobot.moveForward();
			fredTheRobot.smashWithHands();
			System.out.println();
			
			System.out.println("the enemy tank");
			rTank.assignDriver("rahul");
			rTank.driveForward();
			rTank.fireWeapon();
			System.out.println();
			
			System.out.println("the robot adapter");
			
			robotadapter.assignDriver("tejas");
			robotadapter.fireWeapon();
			robotadapter.driveForward();
			
			
	}

}
