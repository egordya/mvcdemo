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

    public void subtractTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber - secondNumber;
    }

    // SUper cool functions ETC

    public void squareTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber * firstNumber;
    }

    public int getCalculationValue() {
        return calculationValue;
    }
}
