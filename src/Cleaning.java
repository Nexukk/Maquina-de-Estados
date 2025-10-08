// pollo limpando
public class Cleaning extends AbstractState<Pollo> {

    // recebe personagem, e passa para super
    public Cleaning(Pollo pollo) {
        super(pollo);
    }

    // chamado ao entrar no estado
    @Override
    public void enter() {
        System.out.println("[Cleaning] Pollo começa a limpar.");
    }

    // a cada ciclo:
    @Override
    public void execute() {
        // diminui o timer enquanto limpa
        getCharacter().addTimer(-1);

        // loga status
        printStats("Limpando...");

        // se timer for 0, troca pra cooking
        if (getCharacter().getTimer() <= 0) {
            getCharacter().setState(new Cooking(getCharacter()));
        }
    }

    // chamado quando trocar de estado
    @Override
    public void leave() {
        System.out.println("[Cleaning] Limpeza finalizada.");
    }
}
