package edu.examples.test;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.examples.domain.ChessPlaeer;
import edu.examples.domain.FootbollPlaeer;
import edu.examples.domain.Plaeer;

/**
 * Описание конфигурации для тестов не отличается от описания конфигурации для приложения.
 * 
 * @author sergey.malahov
 *
 */
@Configuration
public class TestConfig {
	
	@Bean
	public Plaeer chess() {
		return new ChessPlaeer();
	}
	
	@Bean
	public Plaeer footBall() {
		return new FootbollPlaeer();
	}
	
	@Bean
	public Plaeer random() {
		int r = new Random().nextInt();
		if(r % 2 != 0) {
			return chess();
		} else {
			return footBall();
		}
	}
}
