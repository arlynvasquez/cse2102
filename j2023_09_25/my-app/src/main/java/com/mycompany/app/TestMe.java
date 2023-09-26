package com.mycompany.app;

public class TestMe {
        private double value = Double.NaN;

        public static void main(String[] args) {
                System.out.println("Hello world!");
        }

        public TestMe() { value = 0.0;}

        public double square() { return value*value; }
        public void setValue(double v) {
                value = v;
        }
        public double getValue() { return value;}

        public void increment() { value += 1;}
        public void decrement() { value -= 1;}
}
