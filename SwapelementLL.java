class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
      
        Node temp = head;
        while(temp!=null && temp.next!=null){
            int val = temp.data;
            temp.data = temp.next.data;
            temp.next.data = val;
           
            temp =temp.next.next;
        }
        
       Node  j= head;
       while(j!=null){
           System.out.print(j.data+" ");
           j=j.next;
       }
    
       return null; 
    }
}