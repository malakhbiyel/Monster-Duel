package Model;

public class MonstreDefensif extends Monstre {

    public MonstreDefensif(int vie, int force, int defense, String nom) {
        super(vie, force, defense, nom);
    }

    @Override
    public void subitFrappe(int Force) {
        this.vie-= Force;
        this.defense+= (int)(0.75*Force);
    }

}
