package exercice4;

import java.util.Scanner;

public class SommeHarmonie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrer= new Scanner(System.in);
		
		int arret=1;
		do{
			System.out.println("entrer votre nombre ");
		    int n=entrer.nextInt();
			if(n<1 || n>100) {
				 System.out.println("exit...");
				System.exit(0);
			}else {
				harmonieSomme( n);
			}
			
			arret++;
		}while(arret<=5);
		
		entrer.close();
	}
	
	public static void harmonieSomme(int na) {
		double sommeH=1;
		for(double i=2;i<=na;i++) {
			double b=1/i;
			sommeH+=b;
		}
		System.out.println("la somme harmonique est de "+sommeH);
	}

}