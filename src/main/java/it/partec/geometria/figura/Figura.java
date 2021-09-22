package it.partec.geometria.figura;

public abstract class Figura implements Comparable<Figura> {

	public abstract double getArea();

	public abstract double getPerimetro();

	public boolean haAreaMaggiore(Figura altra) { // metodo concreto
		return this.getArea() > altra.getArea();
	}

	public boolean haPerimetroMaggiore(Figura altra) { // metodo concreto
		return this.getPerimetro() > altra.getPerimetro();
	}

	public int compareTo(Figura f) { // metodo concreto
		if(this.getArea() > f.getArea()) {
			return 1;
		} else if(this.getArea() < f.getArea()) {
			return -1;
		}
		return 0;
	}
}
