/**
 * 
 */
package AssignmentSeven;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author saideeksha
 *
 */
public class UserMaximum <E extends Comparable<E>> {

	E x,y,z;
	E max;
	public static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
    
	public UserMaximum() {
		
	}
	
	public E printMax(){
		return this.max;
	}
	
	public E findMaximum(E ...values) {
		Arrays.sort(values);
		this.max=values[values.length-1];
		return max;
	}

	public void toPrintMaximum() {
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Test maximum Code");
	}
}
