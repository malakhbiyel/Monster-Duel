package Controller;

import Model.Joueur;
import Model.ModelJeu;

public class ControllerJeu {
    private ModelJeu model;
    private boolean jeuEnCours = true;


    public ControllerJeu(ModelJeu model) {
        this.model = model;
    }

    public void deroulementTour(){
       if (this.model.JoueurActifFrappe(this.model.getJoueurActuel().getMonstre().getForce())){
           this.jeuEnCours = false;
       }
       else
           this.jeuEnCours = true;
    }
    public boolean updateStatusJeu() {
        if (this.jeuEnCours) {
            this.model.tourSuivant();
            return true;}
        else return false;
    }
    public Joueur affichageDebutTourJoueur(){
        return this.model.getJoueurActuel();
    }
}
