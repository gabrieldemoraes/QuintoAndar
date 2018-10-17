
public class Exercicio3 {
	 public static int solution(int[] T) {
		 int size = T.length;
		 int eq=0;
		 int r;
		 int result; 
		 for(int i = 1; i < size ; i++) {
			 if(T[i-1] == T[i]) {
				 eq++;
			 }
		 }
		 
		 if(eq < size) {
			 if(eq > (size /2)) {
				 return ((size-eq)-1);
			 }
			 r = (size/2) - eq;
			 result = eq + r;
			 return result;
		 }
		 else {
			 return size/2;
		 }
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] B = new int [11];
		B[0] =  80;
		B[1] =  80;
		B[2] =  1000000;
		B[3] =  80;
		B[4] =  80;
		B[5] =  80;
		B[6] =  80;
		B[7] =  80;
		B[8] =  80;
		B[9] =  123456789;
		
		
		
		int r = solution(B);
		System.out.println(r);
	}

}
