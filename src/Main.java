import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a + b);
		
		
		
		a = in.nextInt();
		int h = in.nextInt();
		System.out.println(a * h / 2.0);
		
		
		a = in.nextInt();
		b = in.nextInt();
		System.out.println(a % b);
		
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		System.out.println(str1 + "_" + str2);
		
		
		b = in.nextInt();
		double d = in.nextDouble();
		System.out.println(d / b);
		
		
		str1 = in.nextLine();
		str2 = in.nextLine();
		System.out.println(str1.contains(str2));
		
		
		str1 = in.nextLine();
		int N = in.nextInt();
		System.out.println(str1.charAt(N));
		
		
		str2 = in.nextLine();
		System.out.println(str2.equals("Hello"));
	}

}
