package fr.unilim.iut.spaceinvaders.model;

public class Collision {

	
	
	public boolean detecterCollision(Sprite collisionneur, Sprite collisionne){
		if (collisionParAbscisseEtOrdonne(collisionneur, collisionne)) {
			return true;
		}
		return false;
	}

	private boolean collisionParAbscisseEtOrdonne(Sprite collisionneur, Sprite collisionne) {
		return collisionParOrdonnes(collisionneur, collisionne) && collisionParAbscisse(collisionneur, collisionne);
	}

	private boolean collisionParAbscisse(Sprite collisionneur, Sprite collisionne) {
		return collisionne.abscisseLaPlusADroite()>=collisionneur.abscisseLaPlusAGauche() && collisionne.abscisseLaPlusAGauche()<=collisionneur.abscisseLaPlusADroite();
	}

	private boolean collisionParOrdonnes(Sprite collisionneur, Sprite collisionne) {
		return collisionne.ordonneeLaPlusBasse()<=collisionneur.ordonneeLaPlusHaute() && collisionne.ordonneeLaPlusHaute()>=collisionneur.ordonneeLaPlusBasse();
	}
	

}
