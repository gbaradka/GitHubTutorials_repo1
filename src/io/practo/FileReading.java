package io.practo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
//		File f = new File("C:\\Users\\Admin\\Desktop\\new1.txt");
//		Scanner sc = new Scanner(f);
//		sc.useDelimiter("\\z");
//		System.out.println(sc.next());
//		
		
		
//		to remove all things apart from Digits..
		String s="ram g@$%^$^%anesh *(*)ba()*&^&%r rad$5453#@!ra";
	    System.out.println(s);
	    /* You don't need the + because you are using the replaceAll method */
	    s = s.replaceAll("\\D", "");  // or you can also use [0-9]
	    System.out.println(s);
	    
	    char[] c = s.toCharArray();
	    int sum=0;
	    for(int i=0; i<c.length; i++) {
	    	int digit = c[i] - '0';
	    	sum = sum+digit;
	    }
	    System.out.println("sum of all digits: "+sum);

	}

}
