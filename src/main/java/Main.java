import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.partec.geometria.exception.FiguraException;
import it.partec.geometria.figura.Quadrato;
import it.partec.geometria.figura.Rettangolo;

public class Main {

	private static final Logger logger = LogManager.getRootLogger();

	public static void main(String[] args) {
		logger.info("Costruzione primo rettangolo");
		Rettangolo rettangolo1 = new Rettangolo(3, 5);
		Rettangolo rettangolo2 = null;
		try {
			logger.info("Costruzione secondo rettangolo");
			rettangolo2 = new Rettangolo(3, -1);
		} catch(FiguraException e) {
		}
		logger.info("Costruzione primo quadrato");
		Quadrato quadrato1 = new Quadrato(3);
		Quadrato quadrato2 = null;
		try {
			logger.info("Costruzione secondo quadrato");
			quadrato2 = new Quadrato(-1);
		} catch(FiguraException e) {
		}
		rettangolo1.haPerimetroMaggiore(quadrato1);
		quadrato1.haAreaMaggiore(rettangolo1);
		if(quadrato2 != null && quadrato2.getLato() > 2) {
			logger.debug("verifico se il quadrato2 ha l'area maggiore rispetto al rettangolo1");
			quadrato2.haAreaMaggiore(rettangolo1);
		}
		if(rettangolo2 != null && rettangolo2.getBase() > 2) {
			logger.debug("verifico se il rettangolo2 ha l'area maggiore rispetto al quadrato1");
			rettangolo2.haAreaMaggiore(quadrato1);
		}
	}
}
