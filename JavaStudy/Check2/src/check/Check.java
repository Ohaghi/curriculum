package check;

import constants.Constants;

public class Check {
	private static String firstName = "萩";
	private static String lastName = "ともみ";

	public static void main(String[] args) {
		printName(firstName, lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}

	public static void printName(String firstName, String lastName) {
		String fullName = firstName + lastName;
		System.out.println("printNameメソッド → " + fullName);

	}

}