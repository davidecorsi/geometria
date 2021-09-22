package it.partec.geometria.figura;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Quadrato extends Rettangolo {

	private static final Logger logger = LogManager.getLogger(Rettangolo.class);

	public Quadrato(double lato) {
		super(lato, lato);
		logger.debug("Costruttore rettangolo");
	}

	public double getLato() {
		logger.debug("getLato Quadrato");
		return getBase();
	}

	public void setLato(double lato) {
		logger.trace("Inizio setLato Quadrato");
		super.setBase(lato);
		super.setAltezza(lato);
		logger.debug("Fine setLato Quadrato");
	}

	public String toString() {
		logger.debug("toString Quadrato");
		return "lato = " + getLato();
	}

	public void setBase(double lato) {
		logger.trace("Inizio setBase Quadrato");
		super.setBase(lato);
		logger.debug("Fine setBase Quadrato");
	}

	public void setAltezza(double lato) {
		logger.trace("Inizio setAltezza Quadrato");
		super.setAltezza(lato);
		logger.debug("Fine setAltezza Quadrato");
	}
}
