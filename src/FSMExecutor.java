import java.util.ArrayList;
import java.util.List;

// classe pra executar FSM
public class FSMExecutor {

    public static void main(String[] args) {

        // lista de agentes para serem att
        List<CharacterBase> agents = new ArrayList<>();

        // criação dos personagens
        Marco marco = new Marco();
        Pollo pollo = new Pollo();

        // atribui personagens à lista agentes
        agents.add(marco);
        agents.add(pollo);

        int cycles = 25; // nro de ciclos

        // loop principal
        for (int i = 0; i < cycles; i++) {
            System.out.println("\n--- Ciclo " + (i+1) + " ---");

            // para cada um da lista:
            for (CharacterBase agent : agents) {
                agent.update(); // executa status atual
            }

            // log para interação, pollo cozinha = marco focou
            if (pollo.getTimer() == 3) {
                System.out.println("[Interação] Pollo fez comida! Marco ganha +5 de foco.");
                marco.addFocus(5);
                pollo.addTimer(-1); // diminui o timer pra evitar duplicação de evento
            }

            // pausa p dar pra lerkkkk
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\n--- Execução finalizada ---");
    }
}
