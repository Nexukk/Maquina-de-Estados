// interface generica pra representar um peronagem - tipo generico pro personagem reconhecer proprio tipo
public interface Character<C extends Character<C>> extends CharacterBase {

    // muda o status atual de um personagem específico
    void setState(State<C> state);
}

