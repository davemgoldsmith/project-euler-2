package edu.cnm.deepdive;

public class ProjectEuler2 {

	public static void main(String args[]) {
		long n1 = 0, n2 = 1, n3 = 0, i, count = 10000;
		long sum = 0;

		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			if (n3 > 4000000) {
				break;
			}
			System.out.println(" " + n3);
			if (n3 % 2 == 0)
				sum += n3;
			n1 = n2;
			n2 = n3;

		} // for

		System.out.println(sum);

	} // main
} // class