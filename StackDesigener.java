public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
{
    //Your code here
    Stack <Integer> s = new Stack();
    for(int i=0; i<arr.size();i++){
        s.push(arr.get(i));
    }
    return s;
    
}

public static void _pop(Stack<Integer>s)
{
    //Your code here
    
    while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
    }
    
}