import Controller.ControllerJeu;
import Model.Joueur;
import Model.ModelJeu;
import Model.MonstreDefensif;
import Model.MonstreOffensif;

public class Main {
    public static void main(String[] args) {
        MonstreDefensif monstre1 = new MonstreDefensif(15, 12, 10, "monstre1");
        MonstreOffensif monstre2 = new MonstreOffensif(15, 10, 15, "monstre2");
        Joueur joueur1 = new Joueur("joueur1" , monstre1);
        Joueur joueur2 = new Joueur("joueur2" , monstre2);
        ModelJeu model= new ModelJeu(joueur1, joueur2);
        ControllerJeu controller = new ControllerJeu(model);
        ViewJeu view = new ViewJeu(controller);
        view.run();
    }

}