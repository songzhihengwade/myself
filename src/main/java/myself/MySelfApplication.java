package myself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.myself.mapper")
public class MySelfApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySelfApplication.class, args);
    }
}
