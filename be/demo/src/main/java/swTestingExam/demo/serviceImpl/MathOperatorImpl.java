package swTestingExam.demo.serviceImpl;

import swTestingExam.demo.Exceptions.InvalidOperationException;
import swTestingExam.demo.services.MathOperator;

public class MathOperatorImpl implements MathOperator {

    @Override
    public double doMath(double op1, double op2, String operation) throws InvalidOperationException {
        if("/".equals(operation) && op2==(double)0){
            throw new InvalidOperationException("Cannot divide by 0");
        }
        switch (operation){
            case "*":
                return  op1*op2;
            case "+":
                return  op1+op2;
            case "/":
                return  op1/op2;
            case "-":
                return  op1-op2;
            case "**":
                return  Math.pow(op1,op2);
            default:
                throw new RuntimeException("Unknown operation");
        }
    }
}
