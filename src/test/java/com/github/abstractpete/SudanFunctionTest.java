package com.github.abstractpete;

import com.github.abstractpete.fun.research.PrettyFunctions;
import com.github.abstractpete.fun.research.PrettyFunctionsImpl;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by bcmds on 10.12.2015.
 */
public class SudanFunctionTest {
    private PrettyFunctions pf;
    @Before
    public void setUp() throws Exception {
        pf = new PrettyFunctionsImpl();

    }

    @Test
    public void testSudanFunctionOfNeq0() throws Exception {
        int max_n = 8,max_m = 8;
        for (int i = 0; i < max_n ; i++) {
            for (int j = 0; j < max_m; j++) {

                long result =  pf.Sudan(0,j,i);
                System.out.print(result + "\t");
            }
            System.out.print("\n");
        }

    }


    @Test
    public void testSudanFunctionOfNeq1() throws Exception {
        int max_n = 7,max_m = 7;
        for (int i = 0; i < max_n ; i++) {
            for (int j = 0; j < max_m; j++) {
                long result =  pf.Sudan(1,j,i);
                System.out.print(result + "\t");
            }
            System.out.print("\n");
        }


    }

    @Test
    public void testSudanFunctionOfNeq2() throws Exception {
        /*int max_n = 3,max_m = 6;
        for (int i = 0; i < max_n ; i++) {
            for (int j = 0; j < max_m; j++) {
                long result =  pf.Sudan(2,j,i);
                System.out.print(result + "\t");
            }
            System.out.print("\n");
        }*/


        int max_n = 3,max_m = 6;
        for (int i = 0; i < max_n ; i++) {
            for (int j = 0; j < max_m; j++) {
                BigInteger result =  pf.Sudan(2,new BigInteger(String.valueOf(j)),new BigInteger(String.valueOf(i)));
                System.out.print(result + "\t");
            }
            System.out.print("\n");
        }

    }
}
