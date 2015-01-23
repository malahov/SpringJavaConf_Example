package edu.examples.congfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.examples.domain.ChessPlaeer;
import edu.examples.domain.FootbollPlaeer;
import edu.examples.domain.Plaeer;

@Configuration
public class ContextConfig {
	
	@Bean
	public Plaeer chess() {
		return new ChessPlaeer();
	}
	
	@Bean
	public Plaeer footBall() {
		return new FootbollPlaeer();
	}
}
