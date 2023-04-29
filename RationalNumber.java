import java.util.Scanner;

public class RationalNumber {

    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public RationalNumber add(RationalNumber other) {
        int numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        return new RationalNumber(numerator, denominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        return new RationalNumber(numerator, denominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return new RationalNumber(numerator, denominator);
    }

    public RationalNumber divide(RationalNumber other) throws ArithmeticException {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;
        return new RationalNumber(numerator, denominator);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public RationalNumber abs() {
        return new RationalNumber(Math.abs(numerator), Math.abs(denominator));
    }

    public boolean equals(RationalNumber other) {
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    public boolean isGreaterThan(RationalNumber other) {
        return this.numerator * other.denominator > other.numerator * this.denominator;
    }

    public boolean isLessThan(RationalNumber other) {
        return this.numerator * other.denominator < other.numerator * this.denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}


