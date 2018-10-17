// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Exercicio1 {
    public static String solution(String S) {
    	String number = ""; 
    	int v = 0; 
    	int tamanho=0;
    	int group=0;
    	int c = 0;
        // write your code in Java SE 8
        for(int i = 0; i< S.length() ; i++) {
        	if(S.charAt(i) == '0' || S.charAt(i) == '1' || S.charAt(i) == '2' || S.charAt(i) == '3' || S.charAt(i) == '4' ||  
         	   S.charAt(i) == '5' || S.charAt(i) == '6'  || S.charAt(i) == '7' || S.charAt(i) == '8' || S.charAt(i) == '9') {
        		tamanho++;
        	}	
        }
        
        if(tamanho % 3 == 1) {
           group = (tamanho/3) - 1;
         }
        else {
        	c++;
         }
        
        for(int i = 0; i< S.length() ; i++) {
        	if(c == 0 ) {
        		if(S.charAt(i) == '0' || S.charAt(i) == '1' || S.charAt(i) == '2' || S.charAt(i) == '3' || S.charAt(i) == '4' ||  
        	       S.charAt(i) == '5' || S.charAt(i) == '6'  || S.charAt(i) == '7' || S.charAt(i) == '8' || S.charAt(i) == '9') {
        	        number+= S.charAt(i);
        	        v++;
        	        if(group != 0 && v == 3) {
        	           number+= '-';
        	           v=0;
        	           group--;
        	        }
        	        if(group == 0) {
        	        	if(v==2 && i != (S.length() - 1) ) {
        	        	   number+= '-';
              	           v=0;
        	        	}
        	        }
        		}
        	}
        	else {
        		if(S.charAt(i) == '0' || S.charAt(i) == '1' || S.charAt(i) == '2' || S.charAt(i) == '3' || S.charAt(i) == '4' ||  
        		   S.charAt(i) == '5' || S.charAt(i) == '6'  || S.charAt(i) == '7' || S.charAt(i) == '8' || S.charAt(i) == '9') {
        		   number+= S.charAt(i);
        		   v++;
		           if(v == 3 && i != (S.length() - 1)) {
			           number+= '-';
			           v=0;
        			}
        		}
        	}
        }
        
        return number;
    }
    
    public static void main(String[] args) {
		String a = "0 - 22 1985--324";
		
		String saida = solution(a);
		
		System.out.println(saida);
	}
}