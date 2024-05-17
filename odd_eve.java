class Geeks {
    static void countOddEven(int arr[], int n) {

        // Your code here
        int odd=0;
        int even =0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
               even++;  
            }
            else{
                odd++;
            }
        }
        System.out.print(odd +" " +even);
        
    }
}