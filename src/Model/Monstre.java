package Model;

abstract public class Monstre {
    protected int vie;
    protected int force;

    public Monstre(int vie, int force, int defense, String nom) {
        this.vie = vie;
        this.force = force;
        this.defense = defense;
        this.nom = nom;
    }

    int defense;
    String nom;

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public abstract void subitFrappe(int Force);

    @Override
    public String toString() {
        return " nom='" + nom +"'"+
                ", vie=" + vie +
                ", force=" + force +
                ", defense=" + defense+" ***" ;
    }
}
