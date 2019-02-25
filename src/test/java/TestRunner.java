import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Scanner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestRunner {

    public static void main(String[] argv){
        TestRunner runner = new TestRunner();
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to run all tests");
        System.out.println("press 2 to run tests on deal and player");
        System.out.println("press 3 to run misc tests");


        if(sc.nextLine().equals("1")){
            runner.allTests();
        }else if(sc.nextLine().equals("2")){
            runner.playDealTests();
        }else if(sc.nextLine().equals("3")){
            runner.miscTests();
        }


    }

    public void allTests(){
        Result result = JUnitCore.runClasses(suiteClass.class, miscSuiteClass.class);
        System.out.println("All results passed: " + result.wasSuccessful());

        if(!result.wasSuccessful()){
            System.out.println("Failed Tests : ");
            for (Failure failure: result.getFailures()){
                System.out.println(failure.getMessage());
            }
        }
    }
    public void playDealTests(){
        Result result = JUnitCore.runClasses((suiteClass.class));
        System.out.println("All results passed: " + result.wasSuccessful());

        if(!result.wasSuccessful()){
            System.out.println("Failed Tests : ");
            for (Failure failure: result.getFailures()){
                System.out.println(failure.getMessage());
            }
        }
    }

    public void miscTests(){

        Result result = JUnitCore.runClasses((miscSuiteClass.class));
        System.out.println("All results passed: " + result.wasSuccessful());

        if(!result.wasSuccessful()){
            System.out.println("Failed Tests : ");
            for (Failure failure: result.getFailures()){
                System.out.println(failure.getMessage());
            }
        }
    }


}
