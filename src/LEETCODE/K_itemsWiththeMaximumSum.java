package LEETCODE;

public class K_itemsWiththeMaximumSum {
    public static void main(String[] args) {
        int numOnes = 3, numZeros = 2, numNegOnes = 0, k = 4;
         int choosen = 0;
         int sum1=0;
         for(int i=0;i<numOnes;i++){
             sum1+=1;
             choosen++;
             if(choosen==k){
                 System.out.println(sum1);
                 break;
             }
         }
         for(int j=0;j<numZeros;j++){
            sum1+=0 ;
            choosen++;
             if(choosen==k){
                 System.out.println(sum1);
                 break;
             }

        }
        for(int j=0;j<numNegOnes;j++){
            sum1+=-1;
            choosen++;
            if(choosen==k){
                System.out.println(sum1);
                break;
            }

        }
    }
}
