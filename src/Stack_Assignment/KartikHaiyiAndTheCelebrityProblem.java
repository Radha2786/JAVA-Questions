package Stack_Assignment;
import java.util.*;
public class KartikHaiyiAndTheCelebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 4;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

//        int[][] arr = {{0, 0, 1, 0},
//                {0 ,0 ,1 ,0},
//                {0 ,0, 0, 0},
//                {0 ,0 ,1 ,0}
//        };
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    stack.push(j);
                }
            }
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        Integer[] ans = new Integer[list.size()];
        ans = list.toArray(ans);
        int max=Integer.MIN_VALUE;
       for(int i=0;i<ans.length-1;i++){
           int count=0;
           for(int j=i+1;j<ans.length;j++){
               if(ans[i]==ans[j]){
                   count++;
               }

           }
           if(count>max){
               max=count;
           }
       }
        System.out.println(max);

    }
}

