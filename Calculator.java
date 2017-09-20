package multipleOperations;
import java.util.Scanner;
import java.lang.Math;

class Calculator implements Interface1 {
	public void multiply(int x,int y){
		System.out.println("\nMultiplication is : " +(x*y));
	}
	public void divide(int x,int y){
		System.out.println("\nDivide is : " +(x/y));
	}
	public void sum(int x,int y){
		System.out.println("\nSum  is : " +(x+y));	
	}
	public void sub(int x,int y){
		System.out.println("\nSub. is : " +(x-y));	
	}
	public void max(int x,int y){
		if(x>y)
			System.out.println("\nMaximu is : " +x);
		else
			System.out.println("\nmax.. is : " +y);
	}
	public void min(int x,int y){
		if(x>y)
			System.out.println("\nMin is : " +y);
		else
			System.out.println("\nmin. is : " +x);
	}
	public void calc(int x,int y){
		System.out.println("\nsine is : " +Math.sin(x));
		System.out.println("\nsine is : " +Math.cos(y));
	}
	public static void main(String[] args) {
		int x,y,choice;
	    boolean loop=true;
	    Scanner t=new Scanner(System.in);
	    Calculator t1=new Calculator();
	    while(loop==true){
    		System.out.println("\n1.Multiply\n2.Divide\n3.Sum\n4.Subtraction\n5.Maximum\n6.MInimum\n"); 
    		choice=t.nextInt();
    		switch(choice){
    		
    		case 1:System.out.println("\nenter the elements");
    		       x=t.nextInt();
    		       y=t.nextInt();
    		       t1.multiply(x,y);
    		       break;
    		case 2:System.out.println("\nenter the elements");
		           x=t.nextInt();
		           y=t.nextInt();
		           t1.divide(x,y);
    		       break;
    		case 3:System.out.println("\nenter the elements");
		           x=t.nextInt();
		           y=t.nextInt();
		           t1.sum(x,y);
    		       break;
    		case 4:System.out.println("\nenter the elements");
		           x=t.nextInt();
		           y=t.nextInt();
		           t1.sub(x,y);
		           break;
    		case 5:System.out.println("\nenter the elements");
		           x=t.nextInt();
		           y=t.nextInt();
		           t1.max(x,y);
		           break;
    		case 6:System.out.println("\nenter the elements");
		           x=t.nextInt();
		           y=t.nextInt();
		           t1.min(x,y);
		           break;
    		case 7:System.out.println("\nenter the elements");
	               x=t.nextInt();
	               y=t.nextInt();
	               t1.calc(x,y);
	                break;
    		case 8:loop=false;
    		       System.out.println("\nProgram terminated\n");
    		       break;
    		}
    	}

	}

}