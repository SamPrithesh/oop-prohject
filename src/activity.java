import java.util.Scanner;

public class activity {

    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);

        String name ;
        int mk1;
        int mk2;
        int mk3;
        int total;
        int avg;

        System.out.println("your name");
        name = obj1.next();

        System.out.println("mark 1");
        mk1 = obj1.nextInt();

        System.out.println("mark 2");
        mk2 = obj1.nextInt();

        System.out.println("mark 3");
        mk3 = obj1.nextInt();

        total = mk1+mk2+mk3;
        avg = total/3;

        System.out.println("First name :"+name);
        System.out.println("Mark 01 :"+mk1);
        System.out.println("Mark 02 :"+mk2);
        System.out.println("Mark 03 :"+mk3);
        System.out.println("Total :"+total);
        System.out.println("Average :"+avg);


    }

    //syntax of constructor = classmate + (pass attribute)

}   


