// marco descansando
public class Resting extends AbstractState<Marco> {

    // recebe personagem e passa pra super
    public Resting(Marco marco) {
        super(marco);
    }

    // chamado ao entrar no estado
    @Override
    public void enter() {
        System.out.println("[Resting] Tirando um descanso...");
    }

    // a cada ciclo:
    @Override
    public void execute() {
        // aumenta energia enquanto descansa
        getCharacter().addEnergy(8);

        // loga status
        printStats("Descansando...");

        // se energia alta, decide próximo estado
        if (getCharacter().getEnergy() >= 40) {
            if (getCharacter().getFocus() < 10) {
                getCharacter().setState(new Studying(getCharacter())); // pouco foco → estudar
            } else {
                getCharacter().setState(new Gaming(getCharacter())); // foco ok → jogar
            }
        }
    }

    // chamado quando trocar de estado
    @Override
    public void leave() {
        System.out.println("[Resting] Pronto para voltar.");
    }
}
