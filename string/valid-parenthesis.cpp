class Solution {
public:
    bool isValid(string s) {
        int a = 0,b=0,c=0;
        int len = s.length();
        stack<char> charstack;        
        for(int i=0;i<len;i++){            
            if(s[i]=='{'|| s[i]=='('||s[i]=='[')
                charstack.push(s[i]);
            else if(s[i]=='}'|| s[i]==')'||s[i]==']'){
                if(charstack.empty())
                    return false;
                else if((s[i]=='}' && charstack.top()!='{')|| (s[i]==']' && charstack.top()!='[')|| (s[i]==')' && charstack.top()!='(' ))
                    return false;
                charstack.pop();
        }}
        return charstack.empty();
    }
};                   
                                  
