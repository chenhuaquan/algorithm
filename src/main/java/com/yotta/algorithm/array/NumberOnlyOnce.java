package com.yotta.algorithm.array;

public class NumberOnlyOnce {
    
    public static void main( String[] args )
    {
        System.out.println( "NumberOnlyOnce" );
        int[] numbers = {1, 4, 3, 4, 2, 2, 3};
        
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] ^= numbers[i];
        }
        System.out.println(numbers[0]);
    }
}
