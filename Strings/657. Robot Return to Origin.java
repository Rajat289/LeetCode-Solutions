class Solution {
    public boolean judgeCircle(String moves) {
        int ucount=0;
        int dcount=0;
        int lcount=0;
        int rcount=0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='U')ucount++;
            else if(ch=='D')dcount++;
            else if(ch=='L')lcount++;
            else rcount++;
        }
        if(ucount == dcount && lcount == rcount){
            return true;
        }
        return false;
    }

}
