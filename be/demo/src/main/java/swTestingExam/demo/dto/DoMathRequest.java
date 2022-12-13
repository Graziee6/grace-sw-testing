package swTestingExam.demo.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class DoMathRequest {
    private double op1;
    private double op2;
    private String operation;
}
