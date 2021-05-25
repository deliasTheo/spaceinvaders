package fr.unilim.iut.spaceinvaders;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

	 private SpaceInvaders jeu;

    public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
        this.jeu = spaceInvaders;
    }
	
	@Override
	public void dessiner(BufferedImage image) {
		Graphics2D crayon = (Graphics2D) image.getGraphics();
		

        crayon.setColor(Color.gray);
        crayon.fillRect(jeu.vaisseau.abscisseLaPlusAGauche(), jeu.vaisseau.ordonneeLaPlusBasse(), 
        		jeu.vaisseau.dimension.longueur, jeu.vaisseau.dimension.hauteur);

	}

}
