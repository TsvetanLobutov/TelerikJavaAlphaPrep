package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class KaspichanNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder result = new StringBuilder();

        BigInteger numberToConvert = new BigInteger(in.nextLine());
        BigInteger n256 = BigInteger.valueOf(256);
        BigInteger zero = BigInteger.valueOf(0);

        Number256Converter converter = new Number256Converter();

        while (true) {

            BigInteger quotient = numberToConvert.divide(n256);
            BigInteger reminder = numberToConvert.mod(n256);

            result.append(converter.Convert(reminder));
            if (quotient.equals(zero)) break;
            numberToConvert = quotient;
        }
        result.reverse();
        System.out.print(result);
    }

    public static class Number256Converter {
        private final char[] smallLetters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        private final char[] capitalLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Number256Converter() {

        }

        String Convert(BigInteger bigNumber) {
            StringBuilder result = new StringBuilder();

            int number = bigNumber.intValue();

            int quotient = number / 26;
            int reminder = number % 26;
            result.append(capitalLetters[reminder]);
            if (quotient > 0) result.append(smallLetters[quotient]);

            return result.toString();
        }
    }
}