import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0){
            String arr[]= new String[8];
            String ans="";
            for(int i=0; i<8;i++){
            arr[i]=sc.next();
            
            }
           for(String s:arr){
               for(char ch:s.toCharArray()){
                   if((ch>='a'&& ch<='z') || (ch<='A' && ch>='Z')){
                       ans+=ch;
                   }
               }
           }
           System.out.println(ans); 
           t--;
        }
    }
}