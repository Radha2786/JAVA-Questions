package Contests;

public class TotalDistanceTraveled {
    public static void main(String[] args) {
      int  mainTank = 5;
           int additionalTank = 10;
           int ans=0;
           if(mainTank<5){
               System.out.println(mainTank*10);
               return;
           }else{

               while(mainTank>=0 && additionalTank>0){
//                   ans+=mainTank*10;
                   if(mainTank>=5) {


                       mainTank = mainTank - mainTank + 1;
                       ans+=mainTank*10;
                   }else{
                       break;
                   }
                   additionalTank--;
               }
           }
        System.out.println(ans);
    }
}
