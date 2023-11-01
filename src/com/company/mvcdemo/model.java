package com.company.mvcdemo;

public class model {

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    public void multiplyTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber * secondNumber;
    }

    public void divideTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber / secondNumber;
    }

    // Take absolute value
    public void abs(int firstNumber){
        calculationValue = Math.abs(firstNumber);
    }

    public int getCalculationValue() {
        return calculationValue;
    }
}
