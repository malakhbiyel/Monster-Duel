package Model;

public class Monstre {
    private int vie;
    private final int force;

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



    public void subitFrappe(int Force){
        this.vie -= Force;
    }

    @Override
    public String toString() {
        return " nom='" + nom +"'"+
                ", vie=" + vie +
                ", force=" + force +
                ", defense=" + defense+" ***" ;
    }
}
