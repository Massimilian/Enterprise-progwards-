package org.maslov.beans;

import java.math.BigInteger;

public class AdvancedCalculator implements ICalculator {

    @Override
    public int sum(int a, int b) {
        BigInteger aa = new BigInteger(String.valueOf(a));
        BigInteger bb = new BigInteger(String.valueOf(b));
        BigInteger result = aa.add(bb);
        if (this.testResult(result)) {
            return a + b;
        } else {
            throw new RuntimeException("Overflow");
        }
    }


    @Override
    public int diff(int a, int b) {
        return this.sum(a, b * -1);
    }

    @Override
    public int div(int a, int b) {
        BigInteger aa = new BigInteger(String.valueOf(a));
        BigInteger bb = new BigInteger(String.valueOf(b));
        BigInteger result = aa.divide(bb);
        if (this.testResult(result)) {
            return a / b;
        } else {
            throw new RuntimeException("Overflow");
        }
    }

    @Override
    public int mult(int a, int b) {
        if (b != 0) {
            BigInteger aa = new BigInteger(String.valueOf(a));
            BigInteger bb = new BigInteger(String.valueOf(b));
            BigInteger result = aa.multiply(bb);
            if (this.testResult(result)) {
                return a * b;
            } else {
                throw new RuntimeException("Overflow");
            }
        } else {
            throw new RuntimeException("Null cannot be divider!");
        }
    }

    private boolean testResult(BigInteger l) {
        return l.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) <= 0 &&
                l.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) >= 0;
    }

}
