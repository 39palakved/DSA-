/*order of evaluation of operation */
import java.util.*;
public class assgn2{
	public static void main(String[] args){
		Evolution e = new Evolution();
		e.orderofe();
	}
}
class Evolution{
		void orderofe(){
			int x;
			x=7+3*6/2-1;
			System.out.println(x);
			x=2%2+2*2-2/2;
			System.out.println(x);
			x = (3*9*(3+(9*3/(3))));
			System.out.println(x);
			
		}
}
