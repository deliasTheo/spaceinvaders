# Projet SpaceInvaders M2105

## Semaine n°2 : du 26 avril au 2 mai 
### Sprints et fonctionnalités réalisées 
#### Fonctionnalité 1 (en cours)
- Story n°1 : Créer un espace de jeu
Un espace de jeu est créé aux dimensions données (2D) Cet espace de jeu est vide
- Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu
Un nouveau vaisseau est créé Le vaisseau est positionné aux coordonnées transmises Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée. Contraintes : La position souhaitée est transmise par ses coordonnées x et y. Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0) La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)

#### Diagramme de classe
![Diagrammes de classes de la semaine 1](images/Semaine2Diagramme.png)

#### Nuage de mots
![Nuage de mots de la semaine 1](images/Semaine2Nuage.png)


## Semaine n°3 : du 3 au 9 mai

Cette semaine le projet n'a pas avancé

## Semaine n°4 : du 10 au 16 mai
### Sprints et fonctionnalités réalisées 
#### Fonctionnalité 1 
- Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu
Le vaisseau peut maintenant se deplacer vers la droite. Lorsque celui-ci est sur le bord, il est immobile si est censé se deplacer sur la droite
- Story n°4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu
- Le vaisseau peut maintenant se deplacer vers la gauche. Lorsque celui-ci est sur le bord, il est immobile si est censé se deplacer sur la gauche

#### Fonctionnalité 2
- Etape n°1 : Positionner un nouveau vaisseau avec une dimension donnée
Le vaiseau peut maintanant être positionné ou on le veux. De plus nous avons mis en place beaucoup de refactoring afin que le code soit bien lisible
- Etape n°2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu
Ici on a géré deux potentielle "erreur" afin que le vaisseau soit toujours bien positionné. Nous avons vu en effet que nous avions que 2 cas a tester :
  - un test pour une longueur trop grande qui provoque un débordement sur la droite (celui de l'exemple n°1)
  - un test pour une hauteur trop grande qui provoque un débordement vers le haut (celui de l'exemple n°2)
- Etape n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension
Nous pouvons maintenant deplacer le vaisseau vers la droite en tenant compte des dimensions. Nous avons remarqué que les tests étais déjà au vert, nous avons donc juste fait un peu de refactoring
- Etape n°4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension
Tout comme ^récédemment, nous pouvons faire de même vers la gauche, et les test étais au vert. 
En therme de refactoring nous avons notemment crée deux nouvelle classe : dimention et posistion afin que notre code soit plus lisible dans le temps. Toutes les classes ont ainsi subi des modifications allant dans se sens

#### Diagramme de classe

![Diagrammes de classes de la semaine 3](images/Semaine3Diagramme.png)

#### Nuage de mots
![Nuage de mots de la semaine 3](images/Semaine3Nuage.png)

## Semaine n°5 : du 17 au 23 mai
### Sprints et fonctionnalités réalisées 
#### Spike : Prise en main et intégration d'un moteur graphique
- Dans un premier temps il a fallu comprendre le fonctionnement du moteur graphique utilisé. L'auteur de se script est Vincent Thomas, professeur a l'IUT Informatique de Reims.  J'ai donc commencé par tester le moteur graphique, lu la documentation et essayer de changer les touches "q" et "d" par les fleches.
- Une fois le script compris, nous l'avons utilisé afin de l'intégrer à notre projet puis l'adapter afin qu'il respect les règles que nous avions déjà fixé. Notemment un vaisseau peut se déplacer seulement vers la droite et la gauche. Celui-ci ne peut pas non plus dépasser de la fenetre de jeu. 

#### Diagramme de classe du moteur

![Diagrammes de classes de la semaine 4](images/Semaine4Diagramme.PNG)

#### Nuage de mots du moteur
![Nuage de mots de la semaine 4](images/Semaine4Nuage.png)

## Glossaire
- Vaisseau : véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs. 
- Missile : projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.
- Sprite : élément graphique qui peut se déplacer sur l'écran.



