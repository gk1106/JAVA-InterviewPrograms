package com.program;

public class CheckNumberBinaryOrNot {

	public static void main(String[] args) {
		int num = 101101;
		boolean res = true;
		int copyNumber = num;
		
		while (copyNumber > 0) {
			int last = copyNumber % 10;
			if (last > 1) {
				res = false;break;
			} else {
				copyNumber = copyNumber / 10;
			}
		}

		if (res) {
			System.out.println("Yes! Binary");
		} else {
			System.out.println("No ");
		}

	}

}
