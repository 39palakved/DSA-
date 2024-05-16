import java.util.Scanner; 
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Scanner sc=new Scanner(System.in);
        Long A,B;
        System.out.println("enter A");
        Long A=sc.nextLong();
        System.out.println("enter B");
        Long B=sc.nextLong();
        
        Long tA=A;
        LOng tB=B;
        
        while(A%B!=0)
        {
            int r=A%B;
            A=B;
            B=r;
        }
        int lcm=(tA*tB)/B;
        
        System.out.println("LCM : "+lcm);
        System.out.println("GCD : "+B);
        
    }
}