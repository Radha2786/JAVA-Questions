class Solution {
    public String smallestNumber(String st) {
        int count = 1;
        int n = st.length();
        int[] arr = new int[n + 1];

        for(int i = 0 ; i <= st.length() ; i++){

            if(i == st.length() || st.charAt(i) == 'I'){

                arr[i] = count;
                count++;

                int j = i-1;
                while(j >= 0 && st.charAt(j) != 'I'){
                    arr[j] = count;
                    count++;
                    j--;
                }
            }
        }

        String ans = "";
        for(int i : arr){
            ans += i;
        }

        return ans;
    }
}
