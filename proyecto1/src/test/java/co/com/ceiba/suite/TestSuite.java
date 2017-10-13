package co.com.ceiba.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import co.ceiba.service.integracion.NotifyPersonServiceTest;

/**
 * Suite de pruebas
 * 
 * @author Alexander Galvis Grisales <br>
 * @version 1.0
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ NotifyPersonServiceTest.class, co.ceiba.service.unitaria.NotifyPersonServiceTest.class })
public class TestSuite {
	/* empty class */
}
