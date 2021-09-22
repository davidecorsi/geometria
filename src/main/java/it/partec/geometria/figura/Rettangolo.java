package it.partec.geometria.figura;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import it.partec.geometria.exception.FiguraException;

public class Rettangolo extends Figura {

	private double base;
	private double altezza;
	
	private static final Logger logger = LogManager.getLogger(Rettangolo.class);
			
	public Rettangolo(double base, double altezza) {
		if(base > 0 && altezza > 0) {
			this.base = base;
			this.altezza = altezza;
			logger.debug("Costruttore rettangolo");
		} else {
			logger.error("Errore nella costruzione del rettangolo");
			throw new FiguraException("I lati devono essere superiori a 0");
		}
	}

	public double getBase() {
		logger.debug("getBase Rettangolo");
		return base;
	}

	public void setBase(double base) {
		logger.trace("Inizio setBase Rettangolo");
		if(base > 0) {
			this.base = base;
			logger.debug("Fine setBase Rettangolo");
		} else {
			throw new FiguraException("La base deve essere superiori a 0");
		}
	}

	public double getAltezza() {
		logger.debug("getAltezza Rettangolo");
		return altezza;
	}

	public void setAltezza(double altezza) {
		logger.trace("Inizio setAltezza Rettangolo");
		if(altezza > 0) {
			this.altezza = altezza;
			logger.debug("Fine setAltezza Rettangolo");
		} else {
			throw new FiguraException("L'altezza deve essere superiori a 0");
		}
	}

	public double getArea() {
		logger.debug("getArea Rettangolo");
		return base * altezza;
	}

	public double getPerimetro() {
		logger.debug("getArea Rettangolo");
		return 2 * (base + altezza);
	}

	public String toString() {
		logger.debug("toString Rettangolo");
		return "base = " + base + ", altezza = " + altezza;
	}

	public boolean equals(Rettangolo altro) {
		logger.debug("equals Rettangolo-Rettangolo");
		return altro != null && this.base == altro.base && this.altezza == altro.altezza;
	}

	public boolean equals(Object o) {
		logger.debug("equals Rettangolo-Object");
		if(o instanceof Rettangolo) {
			return equals((Rettangolo) o);
		} else {
			return false;
		}
	}
}
