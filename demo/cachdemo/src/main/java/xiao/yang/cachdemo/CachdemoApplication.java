package xiao.yang.cachdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CachdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachdemoApplication.class, args);
	}

}
