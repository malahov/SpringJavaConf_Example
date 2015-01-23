package edu.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.examples.congfig.ContextConfig;
import edu.examples.domain.FootbollPlaeer;
import edu.examples.domain.Plaeer;

public class Main {

	public static void main(String[] args) {
		// Создаем spring контекст описанный в ContextConfig с помощью аннотаций
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ContextConfig.class);
		// Берем бин по имени
		Plaeer p = (Plaeer)ctx.getBean("chess");
		System.out.println(p.getResult());
		// Берем бин по классу
		p = ctx.getBean(FootbollPlaeer.class);
		System.out.println(p.getResult());		
	}

}
