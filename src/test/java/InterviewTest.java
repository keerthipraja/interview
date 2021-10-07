import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
//using unit tests to assert if the code is working accordingly
class InterviewTest {
    Interview in=new Interview();

    @Test
    public  void test() {
        System.out.println("enter no");

        in=new Interview();
       double var= in.calculateBonus(6);
        System.out.println(var);
        assertEquals(var,5);


    }
    @Test
    public void test1()
  {
//  Scanner sc = new Scanner(System.in);
//
//        int deposit = sc.nextInt();
       // System.out.println("enter no");
        double var2=in.calculateBonus(4);
        System.out.println(var2);
       // assertEquals(var2,7);

    }
    }


