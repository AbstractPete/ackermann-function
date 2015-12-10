package com.github.abstractpete;

import com.github.abstractpete.fun.research.PrettyFunctions;
import com.github.abstractpete.fun.research.PrettyFunctionsImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bcmds on 10.12.2015.
 */
public class AckermannTests {

    private static int CALL = 0;

    private PrettyFunctions pf;
    @Before
    public void setUp() throws Exception {
        pf = new PrettyFunctionsImpl();
    }

    @Test
    public void testCallAckermann() throws Exception {
        int max_m = 10, max_n = 30;
        for (int i = 0; i < max_m; i++) {
            for (int j = 0; j < max_n; j++) {
                try {
                    PrettyFunctionsImpl.SetCallZero();
                    long startTime = System.nanoTime();
                    int r = pf.Ackermann(i,j);
                    long endTime = System.nanoTime();
                    System.out.println("Total execution time: " + (endTime-startTime) * 1e-9 + "ms");
                    System.out.print(String.format("Recursive Calls:%s; ",PrettyFunctionsImpl.RecursiveCallSize()));
                    System.out.println(String.format("A(%s,%s) = %s",i,j,r));

                }catch (StackOverflowError e){
                    System.out.println("Stack Overflow Error!!!");
                    System.out.print(String.format("Recursive Calls:%s; ",PrettyFunctionsImpl.RecursiveCallSize()));
                    System.out.println(String.format("A(%s,%s)= ?",i,j));
                    return;
                }

            }
        }

        int result = pf.Ackermann(5,0);
       System.out.println(result);
    }
}
