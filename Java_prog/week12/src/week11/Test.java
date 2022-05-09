package week11;

public class Test {

	public static void main(String[] args) {
		int k = 0;
		int ODD = 0;
		int EVEN = 0;
		
		while(k <10) {
			k ++;
			ODD += k;
			k ++;
			EVEN += k;
	}
		System.out.println("È¦¼ö"+ODD+","+"Â¦¼ö"+EVEN);
	}
}
