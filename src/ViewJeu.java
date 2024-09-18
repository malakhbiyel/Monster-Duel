import Controller.ControllerJeu;
import Model.Joueur;

import java.util.Scanner;

public class ViewJeu {
    public ControllerJeu controller;

    public ViewJeu(ControllerJeu controller) {
        this.controller = controller;
    }

    public ControllerJeu getController() {
        return controller;
    }

    public void setController(ControllerJeu controller) {
        this.controller = controller;
    }

    public void aurevoir(){
        System.out.println("Au revoir ! ");
    }

    public void run() {
        while (controller.isJeuEnCours()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Voulez vous continuer le jeu ? (O/N)");
            String choix = scanner.nextLine();
            if (choix.equals("O")) {
                aurevoir();
                break;
            }
            else {
                System.out.println(controller.affichageDebutTourJoueur());
                controller.deroulementTour();
                controller.updateStatusJeu();
                Joueur vainqueur = controller.getVainqueur();
                if (vainqueur != null) {
                    System.out.println("Le vainqueur est : " + vainqueur.toString());
                } else {
                    System.out.println("Aucun vainqueur pour le moment.");
                }

            }
        }
    }
}