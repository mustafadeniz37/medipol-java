package assignment_04;

import ignore.TestingUtils;

public class App {
	public static boolean birdsSinging(int temp, boolean isSummer) {
		int ustlimit = 0;

		if(isSummer == true) {
			ustlimit = 90;
		}
		else {
			ustlimit = 100;
		}

		if(temp >= 60 && temp <= ustlimit) {
			return true;
		}
		else return false;
	}

	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}


