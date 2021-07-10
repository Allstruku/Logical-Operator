
public class logicalOperatorExam {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		// because b2 is false even if b1 is true, the returned result will be false. Logical AND operator
		System.out.println(b1 && b3);
		// because both b1 and b3 are true, the returned result will be true. Logical AND operator
		System.out.println(b1 || b2);
		// because b1 is true even if b2 is false, the returned result will be true. Logical OR operator
		System.out.println(b2 || b2);
		// because b2 is false, both right and left hand side of the Logical OR operator is false, meaning that the returned
		// result will be false. Logical OR operator
		
		
// Example
		int score = 40;
		if (score <= 100 && score >= 70) {
			System.out.println("성공하셨습니다");
		} else {
			System.out.println("실패하셨습니다");
		}

		System.out.println(b1 ^ b2);
		// because b1 and b2 are different results (true and false), the exclusive OR operator will return the result of true.
		System.out.println(b1 ^ b3);
		// because b1 and b3 are the save results (true), the exclusive OR operator will return the result of false.
		System.out.println(!b1);
		// though b1 is originally true, the logical NOT operator at the front of the variable will return the result of the
		// opposite as false.
		System.out.println(!b2);
		// though b2 is originally false, the logical NOT operator at the front of the variable will return the result of the
		// opposite as true.
	}
}
