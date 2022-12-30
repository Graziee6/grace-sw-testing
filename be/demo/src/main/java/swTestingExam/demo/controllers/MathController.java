package swTestingExam.demo.controllers;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import swTestingExam.demo.Exceptions.InvalidOperationException;
import swTestingExam.demo.dto.DoMathRequest;
import swTestingExam.demo.services.MathOperator;

@RestController
@RequestMapping("/")
public class MathController  {
    private DoMathRequest doMathRequest;

    @GetMapping("/")
    public String welcome(){
        return "Welcome to SimpC";
    }

    @PostMapping("/calc")
    public double doMath(@PathVariable String operations, @PathVariable double oper1, @PathVariable double oper2) throws InvalidOperationException {
        double calcResponse = this.doMathRequest.doMathOp();
        return calcResponse;
    }
}
