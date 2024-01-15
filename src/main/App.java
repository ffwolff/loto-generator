package main;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int num, i, j;
        int[] lottery = new int[6];
        Random random = new Random();
        for(i=0; i<lottery.length; i++) {
            num = random.nextInt(60) + 1;

            for(j=0; j<lottery.length; j++) {
                while(num == lottery[j]){
                    num = random.nextInt(60) + 1;
                }
            }

            lottery[i] = num;
        }

        for(i=0; i<lottery.length; i++){
            for(j=i+1; j<lottery.length; j++){
                if (lottery[i] > lottery[j]){
                    num = lottery[i];
                    lottery[i] = lottery[j];
                    lottery[j] = num;
                }
            }
        }

        for(i=0; i<lottery.length; i++){
            System.out.print(lottery[i] + "   ");
        }
    }
}
