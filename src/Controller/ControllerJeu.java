package Controller;

import Model.Joueur;
import Model.ModelJeu;

public class ControllerJeu {
    public ModelJeu getModel() {
        return model;
    }

    private final ModelJeu model;
    private boolean jeuEnCours = true;
    private Joueur vainqueur;


    public ControllerJeu(ModelJeu model) {
        this.model = model;
    }

    public void deroulementTour(){
       if (this.model.JoueurActifFrappe(this.model.getJoueurActuel().getMonstre().getForce())){
           this.jeuEnCours = false;
           this.vainqueur = this.model.getJoueurCible();
       }
       else
           this.jeuEnCours = true;
    }
    public void updateStatusJeu() {
        if (this.jeuEnCours) {
            this.model.tourSuivant();
        }
    }
    public Joueur affichageDebutTourJoueur(){
        return this.model.getJoueurActuel();
    }

    public Joueur getVainqueur() {
        return vainqueur;
    }

    public boolean isJeuEnCours() {
        return jeuEnCours;
    }


}
