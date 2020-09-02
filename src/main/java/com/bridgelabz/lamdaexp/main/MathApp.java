package com.bridgelabz.lamdaexp.main;
@FunctionalInterface
interface IMathFunction
{
    int calculate (int a ,int b);
    public static void printResult(int a, int b, String message, IMathFunction fobj )
    {
        System.out.println("result of "+message+" is "+ fobj.calculate(a,b));
    }
}

public class MathApp
{
    public static void main(String[] args)
    {
        //* using method reference instead of lambda function bcz intellij recommend for that
        // * this method implements IMathFunction
        IMathFunction add = Integer::sum;

        //* lambda exp for multiply and division
        //* this method implements IMathFunction
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction divide = (a, b) -> a/b;

        //printing methods add, multiply and divide
        System.out.println("Addition is "+add.calculate(10, 20));
        System.out.println("multiplication is "+multiply.calculate(10, 20));
        System.out.println("divided is "+divide.calculate(100, 20));

        IMathFunction.printResult(5 ,10,"Addition",add);
        IMathFunction.printResult(5 ,10,"multiplication",multiply);
        IMathFunction.printResult(5 ,10,"divide",divide);
    }
}
