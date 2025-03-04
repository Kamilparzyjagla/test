package Praktikumsaufgaben;

public class AmpelStateMachine {

    // Definieren der Zustände
    public enum State {
        Grün,
        Orange,
        Rot,
        Rot_Orange,
        blinkend_Orange,
        aus
    }

    // Aktueller Zustand der Fsm
    private State currentState;

    // Konstuktor
    public AmpelStateMachine() {
        // Initialer Zustand ist Orange
        this.currentState = State.Rot;
    }

    // Methodezum Bearbeiten der Eingabe und Zustand zu wechseln
    public void handleEvent(String event) {
        switch (currentState) {
            case Rot:
                if (event.equals("Rot")) {
                    currentState = State.Grün;
                    System.out.println("Ungültiges Ereignis im Zustand Rot ");
                } else {
                    currentState = State.Grün;
                    System.out.println("Zustand geändert: Grün");
                }
                break;

            case Grün:
                if (event.equals("pause")) {
                   currentState = State.Rot;
                   System.out.println("Zustand geändert: Orange");
                } else if (event.equals("stop")) {
                    currentState = State.Rot;
                    System.out.println("Zustand geändert: Rot");
                } else {
                    System.out.println("Ungültiges Ereignis im Zustand GRÜN");
                }
                break;

            case Orange:
                    if (event.equals("resume")) {
                        currentState = State.Grün;
                        System.out.println("Zustrand geändert: Grün");
                    } else if  (event.equals("stop")) {
                        currentState = State.Rot;
                        System.out.println("Ungültiges Ereignis im Zustand Orange");
                    }
                    break;

            default:
                System.out.println("unbekannter Zustand");
        }
    }

    // Aktuellen Zustand abrufen
    public State getCurrentState() {
        return currentState;
    }

    // Main-Methode zum Testen der FSM
    public static void main(String[] args) {
        AmpelStateMachine fsm = new AmpelStateMachine();

        //Beispielhafte Ereignisse
        fsm.handleEvent("einschalten"); // Zustand ändert sich zu GRÜN
        fsm.handleEvent("wechselt zu Orange"); // Zustand ändert sich zu Orange
        fsm.handleEvent("wechselt zu Rot"); // Zustand ändert sich zu Rot
        fsm.handleEvent("wechselt zu Rot-Orange"); // Zustand ändert sich zu Rot-Orange
                }
        }
