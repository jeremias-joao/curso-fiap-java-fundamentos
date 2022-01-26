package com.fiap.aula10;

public interface Transferivel {
	
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);
	
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);
	
	
	default boolean realizarTransferenciaInternna(
			int nrAgenciaDestino, int nrContaDestino, double valor) {
		return true;
	}
}
