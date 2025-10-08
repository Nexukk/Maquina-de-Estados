// interface que represneta estado generico do personagem
public interface State<C extends Character<C>> {

    // return no personagem associado ao estdo
    C getCharacter();

    // loga status do personagem
    void printStats(String status);

    // assim que entra no estado chama:
    void enter();
    // a cada ciclo:
    void execute();
    // ao sair do estado:
    void leave();
}
