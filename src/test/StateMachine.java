package test;

public class StateMachine {

    // Definieren der Zustände
    public enum State {
        Idle,
        Running,
        Paused
    }

    // Aktueller Zustand der Fsm
    private State currentState;

    // Konstruktor
    public StateMachine() {
        // Initialer Zustand ist Idle
        this.currentState = State.Idle;
    }

    //Methode zum Bearbeiten der Eingabe und Zustand zu wechseln
    public void handleEvent(String event) {
        switch (currentState) {
            case Idle:
                if (event.equals("Idle")){
                    currentState = State.Running;
                    System.out.println("Ungültiges Ereignis im Zustand Idle");
                } else {
                    currentState = State.Running;                    System.out.println("Zustand geändert: Running");
                }
                break;

            case Running:
                if (event.equals("pause")) {
                    currentState = State.Paused;
                    System.out.println("Zustand geändert: PAUSED");
                } else if (event.equals("stop")) {
                  currentState = State.Idle;
                  System.out.println("Zustand geändert: Idle");
                } else {
                    System.out.println("Ungültiges Ereignis im Zustand RUNNING");
                }
                break;

            case Paused:
                if (event.equals("resume")) {
                    currentState = State.Running;
                    System.out.println("Zustand geändert: Running");
                } else if (event.equals("stop")) {
                    currentState = State.Idle;
                    System.out.println("Zustand geändert IDLE");
                } else {
                    System.out.println("Ungültiges Ereignis im Zustand PAUSED");
                }
                break;

            default:
                System.out.println("Unbekannter Zustand");
        }
    }

    // Aktuellen Zustand abrufen
    public State getCurrentState() {
        return currentState;
    }

    // Main-Methode zum Testen der FSM
    public static void main(String[] args) {
        StateMachine fsm = new StateMachine();

//Beispielhafte Ereignisse
        fsm.handleEvent("start"); // Zustand ändert sich zu RUNNING
        fsm.handleEvent("pause"); // Zustand ändert sich zu PAUSED
        fsm.handleEvent("resume"); // Zustand ändert sich zu RUNNING
        fsm.handleEvent("stop");  // Zustand ändert sich zu IDLE
    }
}