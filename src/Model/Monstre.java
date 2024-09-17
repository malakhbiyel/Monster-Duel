package Model;

public class Monstre {
    private int vie;
    private int force;

    public Monstre(int vie, int force, int defense, String nom) {
        this.vie = vie;
        this.force = force;
        this.defense = defense;
        this.nom = nom;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    int defense;
    String nom;

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void subitFrappe(int Force){
        this.vie -= Force;
    }

    @Override
    public String toString() {
        return "Monstre{" +
                ", vie=" + vie +
                ", force=" + force +
                ", defense=" + defense +
                ", nom='" + nom + '\'' +
                '}';
    }
}
