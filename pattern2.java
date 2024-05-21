class Solution {

    void printTriangle(int n) {
        // code here
        int l=n;
        for(int i=0; i<n; i++){
            for(int k=0; k<l-1; k++){
                System.out.print(" ");
            }
            for(int j=0; j<(i*2)+1 ; j++){
                System.out.print("*");
                
            }
            System.out.println();
             l--;
        }
    }
}