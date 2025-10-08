// marco estudando
public class Studying extends AbstractState<Marco> {

    // recebe personagem e passa pra super
    public Studying(Marco marco) {
        super(marco);
    }

    // chamado ao entrar no estado
    @Override
    public void enter() {
        System.out.println("[Studying] Vamos estudar!");
    }

    // a cada ciclo:
    @Override
    public void execute() {
        // aumenta foco, diminui energia enquanto estuda
        getCharacter().addFocus(3);
        getCharacter().addEnergy(-5);

        // loga status
        printStats("Estudando...");

        // se energia baixa, muda pra descansar
        if (getCharacter().getEnergy() <= 20) {
            getCharacter().setState(new Resting(getCharacter()));
        }
        // se foco alto, muda pra jogar
        else if (getCharacter().getFocus() >= 20) {
            getCharacter().setState(new Gaming(getCharacter()));
        }
    }

    // chamado quando trocar de estado
    @Override
    public void leave() {
        System.out.println("[Studying] Pausando estudo.");
    }
}
