 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
         long holder = 1;
        for(int i = 2; i <= value; i++) {
            holder *= i;
        } 
        BigInteger result = BigInteger.valueOf(holder);
        return result;
    }

}
