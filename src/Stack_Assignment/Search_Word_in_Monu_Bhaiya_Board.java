//        Scanner sc = new Scanner(System.in);
//        int M = sc.nextInt();
//        int N = sc.nextInt();
//        char[][] arr = new char[M][N];
//        for(int i=0;i<M;i++){
//            for(int j=0;i<N;j++){
//                arr[i][j]=sc.next().charAt(0);
//            }
//        }
//        // enter length of word list
//        int K = sc.nextInt();
//        String[] str = new String[K];
//        for(int i=0;i<K;i++){
//            str[i]=sc.next();
//        }









package Stack_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_Word_in_Monu_Bhaiya_Board {
    public static void main(String[] args) {
        char[][] board = {{'o', 'a', 'b', 'n'}, {'o', 't', 'a', 'e'}, {'a', 'h', 'k', 'r'}, {'a', 'f', 'l', 'v'}};
        ArrayList<String> list = new ArrayList<>();
        String[] words = {"oa", "oaa"};
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(is_Present(word,board)){
                list.add(word);
            }
        }
        System.out.println(list);
    }

//    boolean flag = false;
            public static boolean is_Present(String word,char[][] board){
            for (int j = 0; j < board.length; j++) {
                    for (int k = 0; k < board[0].length; k++) {
                        if (board[j][k] == word.charAt(0)) {
                            if (search(board, j, k, 0, word)) {
//                                list.add(word);
//                                flag = true;
                                return true;
                            }
                        }

                    }

                }
            return false;
            }

//        System.out.println(list);
        

    public static boolean search(char[][] board,int cr,int cc,int idx,String word){
        if(idx==word.length()){
            return true;
        }
        if(cr<0 || cr== board.length || cc<0 || cc== board[0].length || board[cr][cc]!=word.charAt(idx)){
            return false;
        }
        int[] r = {-1,1,0,0};
        int[] c = {0,0,1,-1};
        board[cr][cc]='*';
        // calls for 4 directions
        for(int i=0;i<c.length;i++){
            boolean ans=search(board,cr+r[i],cc+c[i],idx+1,word);
            if(ans==true){
                board[cr][cc]=word.charAt(idx);
                return true;
            }
        }
        board[cr][cc]=word.charAt(idx);
        return false;
    }
}
