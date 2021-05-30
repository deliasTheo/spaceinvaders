package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.model.Collision;
import fr.unilim.iut.spaceinvaders.model.Dimension;
import fr.unilim.iut.spaceinvaders.model.Position;
import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;

public class CollisionTest {
	
	private SpaceInvaders spaceinvaders;
	private Collision collision;

    @Before
    public void initialisation() {
	    spaceinvaders = new SpaceInvaders(15, 10);
	    collision = new Collision();
    }
    
    @Test
    public void test_PasDeCollisionDetecte() {
        spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(2, 2), new Position(7, 9), 1);
        spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(2, 2), new Position(7, 1), 1);
        assertEquals(false, collision.detecterCollision(spaceinvaders.recupererVaisseau(), spaceinvaders.recupererEnvahisseur()));
    }
    
    @Test
    public void test_collisionLaPlusNormal() {
    	spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(5, 4), new Position(6, 3), 1);
        spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(5, 2), new Position(7, 2), 1);
		
				
		assertEquals(true,collision.detecterCollision(spaceinvaders.recupererEnvahisseur(),spaceinvaders.recupererEnvahisseur()));
		
    }
    
    @Test
    public void test_DetectionCollision_ParLaDroite() {
        spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3, 2), new Position(6, 2), 1);
        spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(3, 2), new Position(7, 1), 1);
        assertEquals(true, collision.detecterCollision(spaceinvaders.recupererVaisseau(), spaceinvaders.recupererEnvahisseur()));
    }
    
    @Test
    public void test_DetectionCollision_ParLaGauche() {
        spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3, 2), new Position(8, 1), 1);
        spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(3, 2), new Position(7, 1), 1);
        assertEquals(true, collision.detecterCollision(spaceinvaders.recupererVaisseau(), spaceinvaders.recupererEnvahisseur()));
    }
    
    @Test
    public void test_DetectionCollision_ParLeBas() {
        spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(4, 3), new Position(8, 2), 1);
        spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(4, 3), new Position(7, 3), 1);
        assertEquals(true, collision.detecterCollision(spaceinvaders.recupererVaisseau(), spaceinvaders.recupererEnvahisseur()));
    } 
    
    @Test
    public void test_DetectionCollision_ParLeHaut() {
        spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(4, 3), new Position(8, 4), 1);
        spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(4, 3), new Position(7, 3), 1);
        assertEquals(true, collision.detecterCollision(spaceinvaders.recupererVaisseau(), spaceinvaders.recupererEnvahisseur()));
    }
    
    @Test
    public void test_DetectionCollision_EnvahisseurMissile() {
        spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(10, 3), new Position(0, 9), 1);
        spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(10, 2), new Position(0, 5), 1);
        spaceinvaders.tirerUnMissile(new Dimension(3, 2), 2);
        spaceinvaders.deplacerMissile();
        
        assertEquals(true, collision.detecterCollision(spaceinvaders.recupererMissile(),spaceinvaders.recupererEnvahisseur()));
    }
	
}
