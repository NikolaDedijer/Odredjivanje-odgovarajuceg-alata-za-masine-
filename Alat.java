package sav;

import java.util.*;

public class Sav {
	
	public static void main (String[]args) {
		
		System.out.println("Postojece debljine lima su 0.5, 0.6, 0.8, 1.0, 1.2, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 6.0, 8.0, 10.0");
		System.out.println("Unesite zeljenu debljinu za prikaz");
		
		Scanner tastatura = new Scanner(System.in);
		int n = tastatura.nextInt();
		
		if (n==0.5) {
			System.out.println("materijal              ms                    ss");
			System.out.println("otvor matrice     12.16.20.25.32       12.16.20.25.32");
			System.out.println("Min.unut.ugao    8.10,5.13.16,5.21    8.10,5.13.16,5.21");
		}

		else if (n==0.6) {
			System.out.println("materijal              ms                    ss");
			System.out.println("otvor matrice     12.18.20.25.32       12.16.20.27.32");
			System.out.println("Min.unut.ugao    8.10,5.13.16,5.21    8.10,5.13.16,5.21");
		}
		else if (n==0.8) {
			System.out.println("materijal              ms                    ss");
			System.out.println("otvor matrice     12.16.22.25.32       12.16.20.25.34");
			System.out.println("Min.unut.ugao    8.10,5.13.16,5.21    8.10,5.13.16,5.21");
		}
		else if (n==1.0) {
			System.out.println("materijal              ms                    ss");
			System.out.println("otvor matrice     14.16.20.25.32       14.16.20.25.32");
			System.out.println("Min.unut.ugao    8.10,5.13.16,5.21    8.10,5.13.16,5.21");
		}
	}
