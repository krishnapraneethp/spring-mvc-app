package demo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({"demo.spring.mvc"})
public class AppConfig {
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public ModelAndView getModeAndView() {
		return new ModelAndView();
		
	}
}
