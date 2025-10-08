// pollo cozinhando
public class Cooking extends AbstractState<Pollo> {

    // recebe personagem e passa pra super
    public Cooking(Pollo pollo) {
        super(pollo);
    }

    // chamado ao entrar no estado
    @Override
    public void enter() {
        System.out.println("[Cooking] Pollo começa a cozinhar.");
    }

    // a cada ciclo:
    @Override
    public void execute() {
        // aumenta o timer enqnt cozinha
        getCharacter().addTimer(1);

        // loga status
        printStats("Cozinhando...");

        // se timer for 0, troca pra cleaning
        if (getCharacter().getTimer() >= 3) {
            getCharacter().setState(new Cleaning(getCharacter()));
        }
    }

    // chamado quando trocar de estado
    @Override
    public void leave() {
        System.out.println("[Cooking] Comida pronta!");
    }
}
