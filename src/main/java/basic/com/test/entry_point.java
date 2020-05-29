
package basic.com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication

public class entry_point{ //extends SpringBootServletInitializer {
	/*@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
	    return builder.sources(entry_point.class);
	  }
*/
	public static void main(String[] args) {
		SpringApplication.run(entry_point.class, args);
		System.out.println("running 11111........");
		
	}

	
}
