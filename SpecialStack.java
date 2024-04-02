class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	    
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.isEmpty()){
                return -1;
            }
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int min = 10000;
           while(!s.isEmpty()){
               min = Math.min(s.pop(),min);
           }
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n){
               return true;
           }
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
            if(!s.isEmpty()){
               return false;
           }
           return true;
	}
}