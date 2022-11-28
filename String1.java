package Basic;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner s=new Scanner(System.in);
		//String str=s.nextLine();
		String str="krupa rani";
		
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].charAt(0));
			
		}

	}

}
