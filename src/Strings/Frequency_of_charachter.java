package Strings;
/*

i/p :-> "hellllloooo"
o/p :->
h = 1
e = 1
l = 5
o = 4
*/
public class Frequency_of_charachter {
    public static void main(String[] args) {
        String str="aansndnsddaaabba";

        for(char ch ='a'; ch<='z';ch++){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count!=0){
                System.out.println( ch+ " has occured " + count);
            }
        }
        }

//    q-2 :-> aansndnsddaaabba

}
