package swTestingExam.demo.services;

import swTestingExam.demo.Exceptions.InvalidOperationException;

public interface MathOperator {
     double doMath (double op1, double op2, String operation) throws InvalidOperationException;
}
