public class Ex1Week32 {
	public static void main(String [] nilaiTerima) {
		int noInt = 123;
		int noInt2 = 102;
		double noDouble = 123.456;

		//format
		System.out.format("%d", noInt); //keluarkan apa yang kita nak
		System.out.format("%6d", noInt); //ada space yang dikira
		System.out.format("%6d %4d", noInt, noInt2); //123 123 123 102
		System.out.format("%4d",noInt2); //123   123   123  102 102
		System.out.format("RM%7.2f",noDouble); //123.46 2 titik perpuluhan //7 tempat 

		//printf
		System.out.printf("\nRM%7.3f dan %6d",noDouble, noInt); //nak mencantikkan
	}
}