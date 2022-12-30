package swTestingExam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import swTestingExam.demo.controllers.MathController;

@SpringBootApplication
public class SwTestingExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwTestingExamApplication.class, args);
	}

	private MathController contr;
	public void run(){
		this.contr.welcome();
	}
}
