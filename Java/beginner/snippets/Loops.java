/**
 * Created by hajar on 2016-09-13.
 */
public class Loops {
    public static void main(String[] args){

        System.out.println("For loop");
        for(int i=1;i <= 10; i++){
            System.out.println(i);
        }

        System.out.println();

        System.out.println("While loop");
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println();

        System.out.println("Do while");
        int j = 1;
        do {
            System.out.println(j++);
        }while(j <= 10);


    }
}
