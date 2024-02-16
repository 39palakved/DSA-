
string ReverseSort(string str){
    //complete the function here
    string s="";
    sort(str.begin(),str.end());
    for(int i=str.size()-1;i>=0; i--){
        s+=str[i];
    }
   return s;  
}