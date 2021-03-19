package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.work();
		CoffeRobot coffeRobot = new CoffeRobot();
		coffeRobot.work();
		RobotDancer robotDancer = new RobotDancer();
		robotDancer.work();
		RobotCoocke robotCoocker = new RobotCoocke();
		robotCoocker.work();
		
		System.out.println();
		
		Robot [] robotArr = new Robot [4];
		robotArr[0] = robot;
		robotArr[1] = coffeRobot;
		robotArr[2] = robotDancer;
		robotArr[3] = robotCoocker;
		for (int i = 0; i < robotArr.length; i++){
            robotArr[i].work();
		}		
		System.out.println();
	
		Animal animal = new Animal("Леопард", 20, 7);
	
		System.out.println(animal);
		animal.setName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println(animal);
	}

}
