public class ThirdDay {
    public int q=5;//the number that we want
    public void pattern(){
        for(int i=1 ; i<=q ; i++){ //number from straight
            for(int j=q ; j>0 ; j--){//number from across
                    if (i == j)
                        System.out.println("*");
                    else
                        System.out.println(j);
            }
            System.out.println();
        }
    }
}
