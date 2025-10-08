// classe pro marco
public class Marco implements Character<Marco> {

    private int focus = 0;   // variavel de foco
    private int energy = 50; // variavel de energia

    private State<Marco> state; // pra pegar state atual

    // inicia marco no estado cooking, e chama enter
    public Marco() {
        this.state = new Studying(this);
        this.state.enter();
    }

    // logica pra aumentar ou diminuir variaveis (math.max serve para não deixar negativo)
    public int getFocus() { return focus; }
    public void addFocus(int v) { focus = Math.max(focus + v, 0); }

    public int getEnergy() { return energy; }
    public void addEnergy(int v) { energy = Math.max(energy + v, 0); }

    // att personagem, baseado no state
    @Override
    public void update() { state.execute(); }

    // logica pra mudar estado do personagem:
    @Override
    public void setState(State<Marco> next) {
        System.out.println("[Marco] mudando estado: " +
                (state == null ? "null" : state.getClass().getSimpleName())
                + " -> " + (next == null ? "null" : next.getClass().getSimpleName()));
        if (state != null) state.leave(); // sai do estado antigo
        state = next;
        if (state != null) state.enter(); // entra no novo estado
    }

    // logar status atual
    @Override
    public void printStats(String status) {
        System.out.println("[Marco] " + status + " | Foco: " + focus + " | Energia: " + energy);
    }
}
