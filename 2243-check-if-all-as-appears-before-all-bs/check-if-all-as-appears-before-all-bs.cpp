class Solution {
public:
    bool checkString(string s) {
        bool foundb = false;
        for(char ch : s){
            if(ch == 'b'){
                foundb = true;
            }
            if(ch == 'a' && foundb){
                return false;
            }
        }
        return true;
    }
};