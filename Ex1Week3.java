public class Ex1Week3 {
	public static void main(String [] nilaiTerima) {
		//System.out.println("Nilai 1: " + nilaiTerima[0]);
		//System.out.println("Nilai 1: " + nilaiTerima[1]);
		//System.out.println("Nilai 1: " + nilaiTerima[2]);

		//javac Ex1Week3.java
		//java Ex1Week3 aisyah kamilah comel (3string)
		//kalau lebih takpe, kurang tak oleh

		int sum = 0;

		for(int i=0; i<nilaiTerima.length; i++) {
			System.out.println("Nilai: " + nilaiTerima[i]);
			//java Ex1Week3 aisyah kamilah 
			//java Ex1Week3 10 20 30

			//wrapper class
			sum += Integer.parseInt(nilaiTerima[i]);
			System.out.println("Nilai sum: " + sum);
			//java Ex1Week3 10 20 30
		}
	}
}