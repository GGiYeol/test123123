package ps10818;

import java.util.Arrays;
import java.util.Scanner;

public class Giyeol_10818 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է¹��� ���� ������?");
		int n = scan.nextInt();

		int[] arr = new int[n];
		System.out.println("�Է����ּ���");
		
		for(int m = 0; m<n; m++) {
			arr[m] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);
		
	}

}




