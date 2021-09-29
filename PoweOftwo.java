public class PoweOftwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // cou 0 to N
        int i = 0;
        // ith pow of 2
        int ptwo = 1;
        // repeat until i equals n
        while (i <= n) {
            // print out the power of two
            System.out.println(i + " " + ptwo);
            // double to get the next one
            ptwo = 2 * ptwo;
            i = i + 1;
        }
    }
}
