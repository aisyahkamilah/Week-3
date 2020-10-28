public class Ex1Week33 {
	public static void main(String [] nilaiTerima) {

		//int noInt = 0; //declare n initialize
		//System.out.println("Nombor int " + noInt);

		//int [] tataInt = new int[4]; //declare

		//for(int i=0; i<nilaiTerima.length; i++) {
			//System.out.println(tataInt[i]); //kena letak default value =0

		//int noInt = '10'; //error

		//char charSaya = 53; //5saja //asci code
		//System.out.println("Char " + charSaya);

		//final adalah constant variable
		//final char CHARSAYA = 53; //final=const
		//final static char CHARSAYA = 53; //final static / static final
		//System.out.println("Char " + CHARSAYA);
		//CHARSAYA = 100;
		//System.out.println("Char " + CHARSAYA);

		int [] tataInt = {10, 20, 30, 40};
		for(int i=0; i<nilaiTerima.length; i++) {
			System.out.println(tataInt[i]); 
		}

		for ( int t : tataInt ) {
			System.out.println("for each: " + t);
		}
	}
}