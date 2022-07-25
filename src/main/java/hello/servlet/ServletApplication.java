package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@ServletComponentScan
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
		int answer = -1;

		int[] nums = {1,2,3,4};


		for(int i=0;i<nums.length;i++){


		}
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("answer " + answer);

	}

}
