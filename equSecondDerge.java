package exercice43;

import java.util.Scanner;

public class equSecondDerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrer=new Scanner(System.in);
		System.out.println("entrer le coefficient A de aX2");
		int a=entrer.nextInt();
		
		System.out.println("entrer le coefficient B de bx");
		int b=entrer.nextInt();
		
		System.out.println("entrer le coefficient c");
		int c=entrer.nextInt();
		deltaValeurEqu(a,b,c);
		
	}
	
	public static void deltaValeurEqu(int a,int b,int c) {
		int delta=((b*b)-4*a*c);
		double rdelta=Math.sqrt(delta);
		System.out.println("valeur de delta "+rdelta);
		if(rdelta==0) {
			double X0=-b/(2*a);
			System.out.println("on a une solution double x0= "+X0);
		}
		else if (rdelta>0) {
			double X1=(-b-rdelta)/(2*a);
			double X2=(-b+rdelta)/(2*a);
			System.out.println("on deux solution X1= "+X1+"\n et  X2 "+X2);
		}else {
			System.out.println("Pas de solution");
		}
	}
}
