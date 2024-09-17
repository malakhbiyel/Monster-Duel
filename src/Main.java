import Controller.ControllerJeu;
import Model.Joueur;
import Model.ModelJeu;
import Model.Monstre;

public class Main {
    public static void main(String[] args) {
        Monstre monstre1 = new Monstre(15,12,10,"monstre1");
        Monstre monstre2 = new Monstre(15, 10, 15, "monstre2");
        Joueur joueur1 = new Joueur("joueur1" , monstre1);
        Joueur joueur2 = new Joueur("joueur2" , monstre2);
        //System.out.println(joueur1.toString());
        //System.out.println(joueur2.toString());
        ModelJeu model= new ModelJeu(joueur1, joueur2);
        ControllerJeu controller = new ControllerJeu(model);
        ViewJeu view = new ViewJeu(controller);
        view.run();

    }

}