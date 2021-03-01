package com.generic.lib;

import java.util.Random;

public class JavaUtils {
	
	
	/**
	 * used to generate Random number  start from 0 to 10000
	 * @return
	 */
	public int  generateRandomNum() {
		Random random = new Random();
		 int randomInt = random.nextInt(10000);

		 return randomInt;
	}

}
