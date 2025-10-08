# Máquina de Estados – João Vitor Faria Crema & Pedro Baldissera

Projeto em Java, implementando **Finite State Machine (FSM)** com 2 agentes. Feito para matéria: Inteligência Artificial e Ilusão de Inteligência em Jogos

---

## Descrição dos Agentes

### Marco
tem 3 estados:
- **Studying:** aumenta foco, diminui energia; 
- **Gaming:** gasta foco e energia;
- **Resting:** recupera energia, e depois troca para: estudar ou jogar (depende do foco atual);  

### Pollo
troca entre 2 estados:
- **Cooking:** aumenta o timer enquanto cozinha  
- **Cleaning:** diminui o timer e volta a cozinhar  

Interação bonus: *Quando Pollo termina de cozinhar (timer = 3), Marco ganha +5 de foco.*

---

## Como Compilar e Rodar
- Abra o IntelliJ com todos os arquivos do git
- Execute o *FSM Executor*
