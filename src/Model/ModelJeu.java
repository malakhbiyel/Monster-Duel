package Model;

public class ModelJeu {

    private Joueur joueur1;
    private Joueur joueur2;

    public ModelJeu(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    @Override
    public String toString() {
        return "ModelJeu{" +
                "joueur1=" + joueur1 +
                ", joueur2=" + joueur2 +
                '}';
    }
}
