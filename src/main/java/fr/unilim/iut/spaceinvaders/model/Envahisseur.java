package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {
	private boolean sensDeplacementEstVersLaDroite;

	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
	}

	public boolean sensDeplacementEstVersLaDroite() {
		return this.sensDeplacementEstVersLaDroite;
	}

	public void mettreSensDeplacementVersLaDroite(boolean versLaDroite) {
		this.sensDeplacementEstVersLaDroite = versLaDroite;
	}

}
