import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int[] x = Arrays.copyOfRange(new int[]{21,445,124,345,123,42546}, 0, 4);
		for(int i = 0; i < x.length; i ++)
			System.out.println(x[i]);
		new Driver().decimalToBinary(10);
		System.out.println();
		System.out.println(new Driver().reverseString("luffy"));
		System.out.println(new Driver().revString("luffy"));
		System.out.println(new Driver().sumCubes(3));
		System.out.println(new Driver().sumCubesLoop(3));
		System.out.println(new Driver().twoPowerN(4));
		System.out.println(new Driver().findMin(new int[]{21,445,124,345,123,42546}));
	}

	void decimalToBinary(int num) {
		if (num < 2)
			System.out.print(num);
		else {
			decimalToBinary(num / 2);
			System.out.print(num % 2);
		}
	}

	String reverseString(String a) {
		if (a.length() == 1)
			return a;
		else {
			return a.substring(a.length() - 1) + reverseString(a.substring(0, a.length() - 1));
		}
	}
	
	String revString(String a) {
		String done = "";
		char[] chars = a.toCharArray();
		for(int i = chars.length - 1; i >= 0; i--) {
			done += chars[i];
		}
		return done;
	}
	
	int sumCubes(int num) {
		if(num == 1)
			return 1;
		else {
			return num*num*num + sumCubes(num - 1);
		}
	}
	
	int sumCubesLoop(int num) {
		int complete = 0;
		for(int i = num; i >= 1; i--) {
			complete += i*i*i;
		}
		return complete;
	}
	
	int twoPowerN(int n) {
		if ( n == 0)
			return 1;
		else {
			return twoPowerN(n-1) + twoPowerN(n-1);
		}
	}
	
	int findMin(int[] a) {
		if (a.length == 1) 
			return a[0];
		else {
			//int[] copy = a.clone();
			int temp = findMin(Arrays.copyOfRange(a, 0, a.length-1));
			if (temp <= a[a.length - 1])
				return temp;
			else
				return a[a.length - 1];
		}
	}
}
