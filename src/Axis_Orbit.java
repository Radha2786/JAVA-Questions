public class Axis_Orbit {

    public static void main(String[] args) {
        String st = "radar";
        System.out.println(countPalindromeInString(st));
    }

    static int countPalindromeInString(String str){

        int count = 0;

//        ODD AXIS
        for(int axis = 0 ; axis < str.length() ; axis++){

            for(int orbit = 0 ; (axis - orbit) >= 0 && (axis + orbit) < str.length() ; orbit++){

                if(str.charAt(axis - orbit) != str.charAt(axis + orbit)){
                    break;
                }
                else{
                    count++;
                }
            }
        }

//        EVEN AXIS

        for(double axis = 0.5 ; axis < str.length() ; axis++){

            for(double orbit = 0.5 ; (int) (axis - orbit) >= 0 && (int) (axis + orbit) < str.length() ; orbit++){

                if(str.charAt((int) (axis - orbit)) != str.charAt((int) (axis + orbit))) {
                    break;
                } else {
                    count++;
                }
            }
        }

        return count;
    }



}
