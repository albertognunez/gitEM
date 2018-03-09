package etsisi.ems.ejemplogit;

import java.time.LocalDate;

public class Debito extends Tarjeta {
	public Debito(String numero, String titular, LocalDate fechaCaducidad) {
		super(numero, titular, fechaCaducidad);
	}

	public void retirar(double x) throws Exception {
		this.mCuentaAsociada.retirar("Retirada en cajero automático", x);
	}

	public void ingresar(double x) throws Exception {
		this.mCuentaAsociada.retirar("Ingreso en cajero automático", x);
	}

	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		this.mCuentaAsociada.retirar("Compra en :" + datos, x);
	}

	public double getSaldo() {
		return mCuentaAsociada.getSaldo();
	}
}