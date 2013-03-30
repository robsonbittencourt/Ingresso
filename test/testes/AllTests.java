package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBilheteriaCrianca.class, TestBilheteriaEstudante.class,
		TestBilheteriaIdoso.class })
public class AllTests {

}
