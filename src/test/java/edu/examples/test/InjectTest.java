package edu.examples.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.examples.domain.Plaeer;

/**
 * Указываем кто будет пускать тесты, это будет спринговый пускач
 */
@RunWith(SpringJUnit4ClassRunner.class)
/**
 * Эта аннотация указывает на конфигурацию контекста
 */
@ContextConfiguration(classes=TestConfig.class)
public class InjectTest {
	
	/**
	 * Когда контекст создан, можно пользоваться его содержимым.
	 */
	@Autowired
	@Qualifier("footBall")
	private Plaeer fp;
	
	@Autowired
	@Qualifier("chess")
	private Plaeer cp;
	
	
	@Test
	public void pleerSuccessInjected() {
		assertNotNull(fp);
		assertNotNull(cp);
	}
	
	@Test
	public void footballIsFootball() {
		assertEquals("Goal!", fp.getResult());
	}
	
	@Test
	public void chessIsChess() {
		assertEquals("Checkmate!", cp.getResult());
	}
}
