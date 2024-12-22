#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchetypeSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchetypeSpringbootApplication.class, args);
    }

}