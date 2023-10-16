// Java Program to find factorial of a number till 100, using BigInteger


import java.io.*;
import java.math.BigInteger;

class Codechef {
    public static void main(String[] args) throws IOException {
        int  n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter Value of n");
            n = Integer.parseInt(in.readLine());
            BigInteger f = BigInteger.ONE; 

            for (int i = 2; i <= n; i++) {
                f = f.multiply(BigInteger.valueOf(i)); 
            }

            System.out.println(f);
        
    }
}
