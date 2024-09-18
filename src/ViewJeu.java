import Controller.ControllerJeu;
import Model.Joueur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewJeu {
    public ControllerJeu controller;

    public ViewJeu(ControllerJeu controller) {
        this.controller = controller;
    }

    public void aurevoir(){
        System.out.println("Au revoir ! ");
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (controller.isJeuEnCours()) {
            System.out.println("Que voulez vous faire ?");
            System.out.println("1 - Frapper votre adversaire");
            System.out.println("2 - Afficher les statistiques de votre adversaire");
            System.out.println("3 - Quitter le jeu");

           try { int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println(controller.affichageDebutTourJoueur());
                    controller.deroulementTour();
                    controller.updateStatusJeu();
                    Joueur vainqueur = controller.getVainqueur();
                    if (vainqueur != null) {
                        System.out.println("Le vainqueur est : " + vainqueur);
                    } else {
                        System.out.println("Aucun vainqueur pour le moment.");
                    }
                    break;

                case 2:
                    System.out.println(this.controller.getModel().getJoueurCible().toString());
                    break;

                case 3:
                    aurevoir();
                    return;

                default:
                    System.out.println("Choix invalide! Veuillez réessayer.");
                    break;
            }
        } catch(InputMismatchException e){
               System.out.println("Entrée invalide. Veuillez entrer un nombre.");
               scanner.next();
           }
        }
    }
}
