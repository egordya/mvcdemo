package com.company.mvcdemo;

public class Main {

    public static void main(String[] args) {

        view theView = new view();
        model theModel = new model();
        controller theContorller = new controller(theView, theModel);
        theView.setVisible(true);
        }
}
