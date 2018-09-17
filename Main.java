import java.util.*;
public class Main { 
	 static int gcd(int a, int b) 
	    { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    } 

	public static void main(String[] args) { 
		Scanner s=new Scanner (System.in);
		int l=s.nextInt();
		int r=s.nextInt();
		int x=s.nextInt();
		int y=s.nextInt();
		int ans=0;
		int temp1=l%x;
		ArrayList<Integer>g=new ArrayList<Integer>();
		for(int i=(l+temp1);i<=r;i=i+x) {
			g.add(i);
		}
		for(int i=0;i<g.size();i++) {
			for(int j=0;j<g.size();j++) {
				int c=g.get(i);
				int d=g.get(j);
				int k=(c*d);
				int b=gcd(c,d);
				if(k/b==y&&b==x) {
					ans=ans+1;
					//System.out.println(c+" "+d);
				}
			}
		}
		System.out.println(ans);
		
	} 
} 