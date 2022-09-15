import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 
 * Given with the array and the value of k
 * ar[i]+ar[j]=k
 * i!=j
 */

class Pair{
	int element;
	int index;
	public Pair(int element, int index) {
		super();
		this.element = element;
		this.index = index;
	}
	
}
public class IceCreamParlour {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader
				(new InputStreamReader(System.in));
		//n k
		//a1 a2 a3.....an
		 String [] s= br.readLine().split(" ");
		 int n=Integer.parseInt(s[0]);
		 int k=Integer.parseInt(s[1]);
		 int ar[]=new int[n];
		 s= br.readLine().split(" ");
		 for(int i=0;i<n;i++) {
			 ar[i]=Integer.parseInt(s[i]);
		 }
		 
		 Pair pairArray[]=new Pair[n];
		 for(int i=0;i<n;i++) {
			 Pair pair=new Pair(ar[i],i);
			 		pairArray[i]=pair;
		 }
		 //BB,IS,SS will fail --> N^2
		 //Internally use QS
		 java.util.Arrays.sort(pairArray, (p1,p2)-> 
		 Integer.compare(p1.element,p2.element));
		 int left=0;
		 int right=n-1;
		 int res[]={-1,-1};
		 while(left<right) {
			 if(pairArray[left].element+pairArray[right].element>k) {
				 right--;
			 }
			 else if(pairArray[left].element+pairArray[right].element<k) {
				 left++;
			 }
			 else {
				 res[0]= pairArray[left].index;
				 res[1]=pairArray[right].index;
				 break;
			 }
		 }
		 Arrays.sort(res);
		 System.out.println(res[0]+" "+res[1]);
	}
}
