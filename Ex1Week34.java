import java.util.Scanner;

public class Ex1Week34 {
	public static void main(String [] nilaiTerima){

		//String nama;
		//int nombor;
		//double noDouble;
		

		//Scanner input = new Scanner(System.in);

		//experiment tukar position

		//System.out.println("Enter a number: ");
		//nombor = input.nextInt();
		//System.out.println("Number is " + nombor);

		//nextLine terima semua (enter,space) sbb tu lompat
		//kekurangan java kena tambah input.nextLine();
		//input.nextLine();
		//System.out.println("Enter a name: ");
		//nama = input.next(); //or .nextLine() //keluar satu je ayat
		//nama = input.nextLine(); //lompat terus ke double 
		//System.out.println("Name is " + nama);

		//System.out.println("Enter a double number: ");
		//noDouble = input.nextDouble();
		//System.out.println("Number is " + noDouble);

		//ternary
		//int noInt =10;

		//if (noInt == 10)
		//System.out.println("sama");
		//else
		//System.out.println("tak sama"); //keluar sama

		//pakai ternary pendekkan
		//System.out.println(noInt == 10 ? "sama" : "tak sama"); 

	    int noInt =10, x;
	    if (noInt == 10)
	    	x = 3;
	    else
	    	x = 19;

	    //ternary dia
	    x = noInt == 10 ? 3 : 19;
	    System.out.println("x is " + x);
		
	}
}