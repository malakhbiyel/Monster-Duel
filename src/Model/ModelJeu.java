package Model;

public class ModelJeu {

    private final Joueur joueur1;
    private final Joueur joueur2;
    private  Joueur joueurActuel;
    public Joueur joueurCible;



    public ModelJeu(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.joueurActuel = joueur1;
        this.joueurCible = joueur2;
    }

    public boolean JoueurActifFrappe(int force){
        return this.joueurActuel.frapperAutreJoueur(this.joueurCible, force);
    }

    public void tourSuivant(){
        Joueur temp=this.joueurActuel;
        this.joueurActuel=this.joueurCible;
        this.joueurCible=temp;
    }

    @Override
    public String toString() {
        return "ModelJeu=>" +
                "joueur1=" + joueur1 +
                ", joueur2=" + joueur2 +
                '}';
    }

    public Joueur getJoueurActuel() {
        return joueurActuel;
    }

    public Joueur getJoueurCible() {
        return joueurCible;
    }
}
