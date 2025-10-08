// marco jogando
public class Gaming extends AbstractState<Marco> {

    // recebe personagem e passa pra super
    public Gaming(Marco marco) {
        super(marco);
    }

    // chamado ao entrar no estado
    @Override
    public void enter() {
        System.out.println("[Gaming] Hora do game!");
    }

    // a cada ciclo:
    @Override
    public void execute() {
        // diminui foco e energia enquanto joga
        getCharacter().addFocus(-4);
        getCharacter().addEnergy(-6);

        // loga status
        printStats("Jogando...");

        // se energia baixa, muda pra descansar
        if (getCharacter().getEnergy() <= 10) {
            getCharacter().setState(new Resting(getCharacter()));
        }
        // se foco zero, muda pra estudar
        else if (getCharacter().getFocus() <= 0) {
            getCharacter().setState(new Studying(getCharacter()));
        }
    }

    // chamado quando trocar de estado
    @Override
    public void leave() {
        System.out.println("[Gaming] Saindo do jogo.");
    }
}
