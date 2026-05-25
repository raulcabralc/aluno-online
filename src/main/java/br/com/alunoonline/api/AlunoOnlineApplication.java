package br.com.alunoonline.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.alunoonline.api")
public class AlunoOnlineApplication {
    public static void main(String[] args) {
		SpringApplication.run(AlunoOnlineApplication.class, args);
	}
}
