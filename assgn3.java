/* smallest and largest integer */
import java.util.*;
public class assgn3{
	public static void main(String[] args){
		Integer i = new Integer();
		i.large_int();
}
}
class Integer{
	void large_int(){
		int a,b,c,d,e;
		int ans1,ans2;

		System.out.println("Please enter 5 intigers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		Scanner sd = new Scanner(System.in);
		b = sd.nextInt();
		Scanner se = new Scanner(System.in);
		c = se.nextInt();
		Scanner sf = new Scanner(System.in);
		d = sf.nextInt();
		Scanner sg = new Scanner(System.in);
		e = sg.nextInt();
		if(a<b && a<c && a<d && a<e)
			ans1 = a;
		else if(b<a && b<c && b<d && b<e)
			ans1 = b;
		else if(c<a && c<b && c<d && c<e)
			ans1 = c;
		else if(d<a && d<c && d<b && d<e)
			ans1 = d;
		else
			ans1 = e;
		if(a>b && a>c && a>d && a>e)
			ans2 = a;
		else if(b>a && b>c && b>d && b>e)
			ans2 = b;
		else if(c>a && c>b && c>d && c>e)
			ans2 = c;
		else if(d>a && d>c && d>b && d>e)
			ans2 = d;
		else
			ans2 = e;
		System.out.println("Smallest of 5 integers is = ");
		System.out.println(ans1);

		System.out.println("Greatest of 5 integers is = " + ans2);
	}
}

	

