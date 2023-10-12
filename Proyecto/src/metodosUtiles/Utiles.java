package metodosUtiles;

import org.testng.Reporter;

public class Utiles {
	public static void reportes(String mensaje) {
		Reporter.log(mensaje);
		System.out.println(mensaje);
	}
}
