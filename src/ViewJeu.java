import Controller.ControllerJeu;

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

    public void run() {
        while (controller.isJeuEnCours()) {

            System.out.println(controller.affichageDebutTourJoueur());
            controller.deroulementTour();
            controller.updateStatusJeu();
        }
        System.out.println("Le vainqueur est : " + controller.getVainqueur().toString());
    }
}