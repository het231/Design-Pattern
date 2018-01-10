import java.util.Random;

/*this class implements our interface correctly 
 our job is to make classes using methods of enemyattacker to work with the Interface*/
public class EnemyTank implements EnemyAttacker {

			Random generator = new Random();
	@Override
	public void fireWeapon() {
		
			int attackDamage = generator.nextInt(10) + 1;
			System.out.println("EnemyTank Does " + attackDamage +  "damage");
		
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
			
			int movement = generator.nextInt(10) + 1;
			System.out.println("EnemyTank Moves " + movement +  "steps");
	}

	@Override
	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
			
			System.out.println("Driver of tank is:" + driverName);
	}
	
	
}
