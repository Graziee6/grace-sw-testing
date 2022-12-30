package swTestingExam.demo.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import swTestingExam.demo.Exceptions.InvalidOperationException;
import swTestingExam.demo.serviceImpl.MathOperatorImpl;

@Data
@AllArgsConstructor
public class DoMathRequest {
    private double op1;
    private double op2;
    private String operation;
    private MathOperatorImpl mathOp;

    public double doMathOp() throws InvalidOperationException {
        return this.mathOp.doMath(this.op1, this.op2, this.operation);
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
