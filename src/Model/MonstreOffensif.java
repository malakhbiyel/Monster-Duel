package Model;

public class MonstreOffensif extends Monstre {

    public MonstreOffensif(int vie, int force, int defense, String nom) {
        super(vie, force, defense, nom);
    }

    @Override
    public void subitFrappe(int Force) {
        this.vie -= Force;
        this.force-= (int) (Force*0.5);
    }

}
