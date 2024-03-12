class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList <Integer> list = new ArrayList<>();
     int level=1;
     view(root,level,list);
     return list;
    }
    int maxlevel=0;
    void view(Node root, int level, ArrayList<Integer>list){
        if(root==null){
            return;
        }
          if(maxlevel<level){
          list.add(root.data);
          maxlevel=level;
          }
        
          
        
        view(root.left,level+1,list);
        view(root.right,level+1,list);
        }

    }
