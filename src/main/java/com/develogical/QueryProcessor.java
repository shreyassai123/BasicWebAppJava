package com.develogical;

public class QueryProcessor {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.contains("your name")) {
            return "RobTest";
        }

        if (query.contains("What is") && query.contains("plus")) {
            String[] words = query.split(" ");
            int num1 = Integer.parseInt(words[2]); 
            int num2 = Integer.parseInt(words[4]);  
            int num3 = Integer.parseInt(words[6]);  

            int sum = num1 + num2 + num3;
            return String.valueOf(sum);
        }

        if(query.contains("Which of the following numbers are primes:")) {
            
        }

        return "";
    }

}