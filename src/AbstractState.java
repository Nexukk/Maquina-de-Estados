// clase abstrata pra implementar a interface State - base para os estados de personagem
public abstract class AbstractState<C extends Character<C>> implements State<C> {

    // referencia pro personagem da vez
    private C character;

    // construtor recebe o personagem e associa ao estado
    public AbstractState(C character) {
        this.character = character;
    }

    // return personagem da vez
    @Override
    public C getCharacter() {
        return character;
    }

    // imprime status do personagem atual (por meio da string)
    @Override
    public void printStats(String status) {
        character.printStats(status);
    }

    // metodo pro estado comecar
    @Override
    public void enter() { }

    // metodo pro estado terminar
    @Override
    public void leave() { }
}
