public class ForthDay {

    public void change() {
        int[] numbers = { 1, 3, 4, 5, 6 , 7 , 8  , 9 , 7, 9};

            for (int i : numbers){
                if (i%2 == 0){

                    System.out.println("even : " + i);}}
            for (int i : numbers){
            if (i% 2 == 1 ) {
                System.out.println("odd : " + i);}}
    }
}
