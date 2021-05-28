package fr.unilim.iut.spaceinvaders;

public abstract class Sprite {

	protected Dimension dimension;
	protected Position origine;
	protected int vitesse;

	public Sprite(Dimension dimension, Position origine, int vitesse) {
		super();
		this.dimension = dimension;
		this.origine = origine;
		this.vitesse = vitesse;
	}

	public Sprite() {
		super();
	}

	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse()<=y) && (y<=ordonneeLaPlusHaute());
	}

	public int ordonneeLaPlusBasse() {
		return this.origine.ordonnee()-this.dimension.hauteur()+1;
	}

	public int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse()+this.dimension.longueur()-1;
	}

	public void seDeplacerVersLaDroite() {
		this.origine.changerAbscisse(this.origine.abscisse()+vitesse);
		
	}

	public void seDeplacerVersLaGauche() {
		 this.origine.changerAbscisse(this.origine.abscisse()-vitesse);
		
	}

	public int abscisseLaPlusAGauche() {
	    return this.origine.abscisse();
	}

	public void positionner(int x, int y) {
		this.origine.changerAbscisse(x);
		this.origine.changerOrdonnee(y);
	}
	
	public int longueur() {
        // TODO Auto-generated method stub
        return this.dimension.longueur();
    }

    public int hauteur() {
        // TODO Auto-generated method stub
        return this.dimension.hauteur();
    }

}