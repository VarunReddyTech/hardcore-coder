package com.hardcore.coder;

import com.hardcore.coder.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HardcoreCoder1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HardcoreCoder1Application.class, args);

		ProductService service = context.getBean(ProductService.class);


	}

}
