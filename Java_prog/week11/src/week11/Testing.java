package week11;

public class Testing {

	public static void main(String[] args) {
		int k = 0;
		int FAC = 1;
		int HAP = 0;
		int J =0;
		
		for(k=2; k<=6; k+=2) {
			J = k*(k-1);
			FAC = FAC * J;
			HAP = HAP + FAC;
	
	}
		System.out.println("2! + 4! + 6!ÀÇ ÇÕ"+","+ HAP);
	}
}