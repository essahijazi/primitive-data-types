public class Main {

	public static void main(String[] args) {
		
		/*
		 * integer data types
		 */
		
		byte lettersInAlphabet = 26;
		short daysInYear = 356;
		int annualSalary = 95000;
		//longs are expressed with a trailing 'L' at the end
		long nationalDebt = 299000000000L; 
		
		System.out.println("There are " + lettersInAlphabet +  " letters in "
				+ "the English Alphabet");
		
		System.out.println("There are " + daysInYear +  " days in a year.");
		
		System.out.println("My annual salary is $" + annualSalary);
		
		System.out.println("The national debt is a whopping $" + nationalDebt);
		
		
		
		
		/*
		 * floating point data types
		 * */
		
		float pi = 3.14159265359f;
		//doubles can be expressed with or without a trailing 'd' at the end
		double atomWidthInMeters = 0.0000000001d;
		atomWidthInMeters  =0.0000000001;
		
		System.out.println("The ratio between a circles circumference and its"
				+ "diameter is " + pi);
		
		System.out.println("An atom's width in meters is " + atomWidthInMeters + "m");
		
		
		
		
		/*
		 * character data type
		 * */
		
		char regularU = 'U';
		char accentedU = '\u00DA'; //Unicode represented using 4-digit hex value
		
		System.out.println("This is a regular " + regularU);
		System.out.println("This is an accented " + accentedU);
		
		
		
		
		/*
		 * boolean data type
		 * */
		
	
		boolean iLoveJava = true;
		boolean isJavaBoring = false;
		
		System.out.println("I love Java: " + iLoveJava);
		System.out.println("Java is boring: " + isJavaBoring);
		
		
	}

}
