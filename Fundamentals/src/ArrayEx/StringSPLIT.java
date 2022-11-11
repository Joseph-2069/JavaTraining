package ArrayEx;

import java.util.Scanner;

public class StringSPLIT {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter comma seperated marks of 5 Subjects of a student");
	String str = sc.nextLine();
	String [] marks =str.split(",");
	int total =0;
	for(String s: marks) {
		int m =Integer.parseInt(s.trim());
		total = total + m;
	} sc.close();
}
}

//the things outside finally will be skipped
//