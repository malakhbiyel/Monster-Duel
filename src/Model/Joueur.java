package Model;

public class Joueur {
    private final String nom;
    private final Monstre monstre;

    public Joueur(String nom, Monstre monstre) {
        this.nom = nom;
        this.monstre = monstre;
    }

    public boolean subitFrappe(Joueur attaquant, int forceFrappe) {
            this.monstre.subitFrappe(forceFrappe);
        return this.monstre.getVie() < 0;
    }

    public boolean frapperAutreJoueur(Joueur cible, int forceFrappe) {
        return this.subitFrappe(cible, forceFrappe);

    }
    @Override
    public String toString() {
        return "*** Joueur=>" +
                " nom='" + nom + '\'' +
                ", monstre=>" + monstre;
    }

    public Monstre getMonstre() {
        return monstre;
    }

}
