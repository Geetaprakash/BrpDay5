import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args){
        //take a user input
        Scanner num= new Scanner(System.in);
        Random random=new Random();
        System.out.print("number of time to flip coin:");
       //read values
        int n=num.nextInt();
        int head=0,tail=0;
        for(int i=1;i<=n;i++){
            int r=random.nextInt(2);
            if(r==1){
                tail++;
                System.out.println("Tails");
            }else {
                head++;
                System.out.println("Heads");
            }
        }
        float headper,tailsper;
        //calculate percentage
        headper=(float) head/n *100;
        tailsper=(float) tail/n*100;
        System.out.println("percentage of head & tails");
        System.out.println("percentage of Head" +headper);
        System.out.println("percentage of Tails:"+tailsper);
    }
}
