// classe pro pollo
public class Pollo implements Character<Pollo> {

    private int timer = 0; // variavel privada pra controlar tempo da ação
    private State<Pollo> state; // pra pegarstate atual

    // inicia pollo no estado cooking, e chama entre
    public Pollo() {
        this.state = new Cooking(this);
        this.state.enter();
    }

    // get e logica pra aumentar o tempo
    public int getTimer() { return timer; }
    public void addTimer(int t) { this.timer += t; }

    // att personagem, baseado no state
    @Override
    public void update() { state.execute(); }

    // logica pra mudar estado do personagem:
    @Override
    public void setState(State<Pollo> next) {
        System.out.println("[Pollo] mudando estado: " +
                (state == null ? "null" : state.getClass().getSimpleName())
                + " -> " + (next == null ? "null" : next.getClass().getSimpleName()));
        if (state != null) state.leave(); // sai do estado antigo
        state = next;
        if (state != null) state.enter(); // entra no novo estado
    }

    // logar status atual
    @Override
    public void printStats(String status) {
        System.out.println("[Pollo] " + status + " | Timer: " + timer);
    }
}
