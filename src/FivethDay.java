public class FivethDay {
    String pharse = "it is time to practice";
    public void count() {
        int a = 0;
        char[] chars = pharse.toCharArray();
        for (char c : chars) {
            if (c == 't') {
                a++;
            }
        }
        System.out.println(pharse + "\nt : " + a);
    }
}

