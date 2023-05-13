package Contests;

public class Number_of_citizens {
    public static void main(String[] args) {
        String details[] = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};

        int ans = Citizens(details);
        System.out.println(ans);

    }
    static int count=0;


    static int Citizens(String[] details) {

        for (int i = 0; i < details.length; i++) {
            String str1 = details[i];


            if (str1.charAt(11) >= 54 && str1.charAt(12) > 48) {
                count++;
            }
            if(str1.charAt(12)==48 && str1.charAt(11)>54){
                count++;
            }
        }
        return count;
    }
}
