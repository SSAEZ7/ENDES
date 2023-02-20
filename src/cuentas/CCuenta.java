package cuentas;

/**
 * Definimos los atributos y metodos de la clase cuenta
 * 
 * @author Javier Garcia Saez
 *
 */

public class CCuenta {

	/**
	 * Parametro privado nombre
	 */
	private String nombre;
	/**
	 * Parametro privado nombre
	 */
	private String cuenta;
	/**
	 * Parametro priado cuenta
	 */
	private double saldo;
	/**
	 * Parametro privado tipoInteres
	 */
	private double tipoInteres;

	/**
	 * Constructor por defecto sin parametros
	 */
	public CCuenta() {
	}
	

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nom
	 * @param cue
	 * @param sal
	 * @param tipo
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Metodo etado en el que nos devuelve getSaldo();
	 * @return
	 */
	double estado() {
		return getSaldo();
	}

	/**
	 * Metodo retirar con el condicional si cantidad es menor de 0 que salga una Excepcion
	 * si no, sumara getSaldo() más la cantidad ingresada
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Metodo retirar, si cantidad es menor o igual que 0 o estado() es menor que cantidad
	 * saltara una excepcion, si no restara getSaldo() menos la cantidad ingresada
	 * @param cantidad
	 * @throws Exception
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Metodo get que nos devuelve el valor de la variable nombre
	 * @return
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set para cambiar el valor de la variable nombre
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get que nos devuelve el valor de la variable cuenta
	 * @return
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo set para cambiar el valor de la variable cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Metodo get que nos devuelve el valor de la variable saldo
	 * @return
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo set para cambiar el valor de la variable saldo
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo get que nos devuelve el valor de la variable tipoInteres
	 * @return
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Metodo set para cambiar el valor de la variable tipoInteres
	 * @param tipoInteres
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;

	}
}
