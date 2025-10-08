// interface basica para cada personagem
public interface CharacterBase {

    // metodo pra att o personagem/ciclo
    void update();

    // recebe a string que descreve o state atual, e chama pra mandar log
    void printStats(String status);
}
