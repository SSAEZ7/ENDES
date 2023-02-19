package Tarea03;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CCuentaTest {
	
	CCuenta miCuenta = new CCuenta();
	
	@ParameterizedTest
	@CsvSource({"-5,1","-3,2","7,0"})
	@DisplayName("Caja Blanca - Ingresar")
	void testIngreso(double cant, int resul) {
		assertEquals(resul,miCuenta.ingresar(cant));
	
	
	}

}
