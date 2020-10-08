/**
 * 
 */
package AssignmentSeven;

import java.util.Scanner;

/**
 * @author saideeksha
 *
 */
public class UserMaximum {

	public static Scanner sc=new Scanner(System.in);
	/**
	 * @param args
	 */
	public static Float findMaximum(float a, float b, float c) {
		float max=0;
		Float x=a;
		Float y=b;
		Float z=c;
		if(x.compareTo(y)>0 && x.compareTo(z)>0) {
			max=x;
			System.out.println(x+" is the maximum number");
		}else if(z.compareTo(y)>0 && z.compareTo(x)>0) {
			System.out.println(z+" is the maximum number");
			max=z;
		} else {
			System.out.println(y+" is the maximum number");
			max=y;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Welcome to Test maximum Code");
        
        System.out.println("Enter three variables");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        System.out.println("Maximum number is "+findMaximum(a,b,c));
	}
}
