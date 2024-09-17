package Model;

public class Joueur {
    private String nom;
    private Monstre monstre;

    public Joueur(String nom, Monstre monstre) {
        this.nom = nom;
        this.monstre = monstre;
    }

    public boolean subitFrappe(Joueur attaquant, int forceFrappe) {
            this.monstre.subitFrappe(forceFrappe);
            if (this.monstre.getVie()<0) return true;
            else return false;
    }

    public boolean frapperAutreJoueur(Joueur cible, int forceFrappe) {
        if (this.subitFrappe(cible, forceFrappe)) {
            return true;
        }
        else return false;

    }
    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", monstre=" + monstre +
                '}';
    }

    public Monstre getMonstre() {
        return monstre;
    }

    public void setMonstre(Monstre monstre) {
        this.monstre = monstre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
