package Stack_Assignment;

public class KartikBhaiyaAndTheCelebrityProblem {
    public static void main(String[] args) {
        int[][] arr ={{0,0,1,0},
                {0,0,1,0},
                {0,0,0,0},
                {0,0,1,0}};
    }

//    BRUTE FORCE
    static int celebrity(int arr[][], int n)
    {
        int count = 0;
        int candidate = 0;
        for(int i = 0 ; i < arr.length ; i++){

            boolean isValid = true;
            for(int j = 0 ; j < arr.length ; j++){
                if(i == j){
                    continue;
                }

                if(arr[i][j] == 1){
                    isValid = false;
                    break;
                }
            }

            if(isValid){
                count++;
                candidate = i;
                if(count == 2){
                    return -1;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(i == candidate){
                continue;
            }

            if(arr[i][candidate] == 0){
                return -1;
            }
        }

        return candidate;
    }


}
