public class Exercicio2 {
	public static int solution(int[] A) {
		double size = A.length;
		int dif=-2;
		int a;
		int b;
		int u = 0;
		for(int i = 0; i < size-1; i++) {
			for(int j = 1; j< size ; j++) {
				for(int t = 2; t < size; t++) {
					a = A[i];
					b = A[j];
					if(a == b) {
						dif = 0;
					}
					else { 
						if(A[t] < a && b > A[t] && u == 0) {
							dif = A[i] - A[j];
						}
						if(A[t] < a && b > A[t] && u != 0) {
							if((A[i] - A[j]) < dif) {
								dif = A[i] - A[j];
							}
						}
					}
				}
			}
		}
		if(dif > 100000000) {
			return -1;
		}
		return dif;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] B = new int [8];
		B[0] =  0;
		B[1] =  3;
		B[2] =  3;
		B[3] =  7;
		B[4] =  5;
		B[5] =  3;
		B[6] = 11;
		B[7] =  1;
		
		int a = solution(B);	
		
		System.out.println(a);

	}
 
}
