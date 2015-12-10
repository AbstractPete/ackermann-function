package com.github.abstractpete.fun.research;

<<<<<<< HEAD
import java.math.BigInteger;

=======
>>>>>>> origin/master
/**
 * Created by bcmds on 10.12.2015.
 */
public class PrettyFunctionsImpl implements PrettyFunctions {
<<<<<<< HEAD
    private static long CALL_ACKERMANN = 0;
    public static void SetCallZero(){
        CALL_ACKERMANN = 0;
    }
    public static long RecursiveCallSize(){
        return CALL_ACKERMANN;
    }
    @Override
    public int Ackermann(int m, int n) {
        CALL_ACKERMANN++;
        return m == 0 ? n + 1 : Ackermann(m - 1, n == 0  ? 1 : Ackermann(m, n - 1));
    }

    @Override
    public long Sudan(int f,long m, long n) {
        if (f == 0) return m + n;
        int _f = f - 1;
        if(_f >= 0 & n == 0 ) return  m;
        else{
            long sudan = Sudan(_f +1 ,m,n-1);
            return Sudan(_f,sudan,sudan + n);
        }
    }

    @Override
    public BigInteger Sudan(int f, BigInteger m, BigInteger n) {
        if (f == 0) return m.add(n);
        int _f = f - 1;
        if(_f >= 0 & n.equals(new BigInteger("0")) ) return  m;
        else{
            BigInteger sudan = Sudan(_f + 1 ,m ,n.subtract(new BigInteger("1")));
            return Sudan(_f,sudan,sudan.add(n));
        }
    }
=======
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
>>>>>>> origin/master
}
