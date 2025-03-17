import java.util.Arrays;
public class firstDay {
    public void ar (){
            int[] num1 = {3, 5, 6, 7, 8, 9, 4};
            int[] num2 = new int[7];
            int[] num3 = new int[7];


            // answer question number 1
            for (int i = 0 ; i < num1.length ; i++ ){
                num2[i] = num1[i];
                System.out.println(Arrays.toString(num2));
            }

            System.out.println("----------------------------");

            // answer question number 2
            int a = num1.length - 1 ;
            for (int j = 0 ; j < num1.length ; j++){
                num3[j]  =num1[a--];
                System.out.println(Arrays.toString(num3));

            }

        }
    }

