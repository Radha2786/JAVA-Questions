public class Basics {
    public static void main(String[] args) {
        String st = "loveleetcode";
        System.out.println(firstUniqChar(st));
    }

    static int firstUniqChar(String s) {

        int index=-1;
        for(int i=0;i<s.length();i++){
            boolean flag = true;
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    flag= false;
                    break;
                }
            }
            if(flag){
                index =i;
                // System.out.println(i);
                return index;
            }
        }
        return index;
    }
}
