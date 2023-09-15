package com.mega.notion;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class NotionApplication {

	public static void main(String[] args) {
		log.info("============================================ START !!!! ============================================");
		SpringApplication.run(NotionApplication.class, args);
	}

}
