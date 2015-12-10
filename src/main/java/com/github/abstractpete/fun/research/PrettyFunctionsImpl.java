package com.github.abstractpete.fun.research;

/**
 * Created by bcmds on 10.12.2015.
 */
public class PrettyFunctionsImpl implements PrettyFunctions {
    private static long CALL = 0;
    public static void SetCallZero(){
        CALL = 0;
    }
    public static long RecursiveCallSize(){
        return CALL;
    }
    public int Ackermann(int m, int n)
    {
        CALL++;
        return m == 0 ? n + 1 : Ackermann(m - 1, n == 0  ? 1 : Ackermann(m, n - 1));
    }
}
