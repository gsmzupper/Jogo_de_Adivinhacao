1# Jogo de Adivinhação
2
3Bem-vindo ao **Jogo de Adivinhação**, um jogo interativo desenvolvido em Java, onde o objetivo é adivinhar números gerados aleatoriamente. O jogo oferece diferentes níveis de dificuldade e mantém um registro de acertos, erros e pontuação final.
4
5## Funcionalidades
6
7- **Três níveis de dificuldade**:
8  - **Fácil**: Números entre 1 e 10.
9  - **Intermediário**: Números entre 1 e 50.
10  - **Difícil**: Números entre 1 e 100.
11- **Pontuação**:
12  - Cada acerto vale 10 pontos.
13- **Histórico de jogadas**:
14  - Exibe os números acertados e errados ao final do jogo.
15- **Opção de sair a qualquer momento**.
16
17## Como Jogar
18
191. Ao iniciar o jogo, você será apresentado com a opção de começar ou sair:
20   - Digite `1` para começar a jogar.
21   - Digite qualquer outro número para sair.
22
232. Escolha o nível de dificuldade:
24   - Digite `1` para o modo **Fácil**.
25   - Digite `2` para o modo **Intermediário**.
26   - Digite `3` para o modo **Difícil**.
27   - Digite `0` para sair do jogo.
28
293. Após escolher o nível, tente adivinhar o número gerado aleatoriamente dentro do intervalo correspondente ao nível selecionado:
30   - Digite seu palpite.
31   - Digite `0` a qualquer momento para encerrar o jogo.
32
334. Ao final do jogo, será exibido:
34   - Sua pontuação final.
35   - Os números que você acertou.
36   - Os números que você errou.
37
38## Exemplo de Execução
39
40```plaintext
41Bem-vindo ao nosso jogo de adivinhação. 
42Digite (1) para começar a jogar ou digite qualquer número para finalizar o jogo.
431
44Parabéns pela sua escolha.
45Digite (1) para jogar no modo fácil;
46Digite (2) para jogar no modo intermediário;
47Digite (3) para jogar no modo difícil; 
48Digite (0) para sair do jogo.
49Qual é a sua opção?
501
51O jogo começou! Tente adivinhar o número entre 1 e 10.
52Digite seu palpite (ou 0 para sair): 5
53Que pena! Você errou. O número era 7
54Digite seu palpite (ou 0 para sair): 7
55Parabéns! Você acertou!
56Digite seu palpite (ou 0 para sair): 0
57
58Fim de jogo!
59Pontuação final: 10 pontos.
60Números acertados: [7]
61Números errados: [5]
Requisitos
Java: Certifique-se de ter o Java instalado em sua máquina. Você pode verificar a instalação com o comando:
1java -version
Como Executar
1. 
Clone este repositório:
1git clone https://github.com/gsmzupper/Jogo_de_Adivinhacao.git
2. 
Navegue até o diretório do projeto:
1cd Jogo_de_Adivinhacao
3. 
Compile o código:
1javac Adivinhacao.java
4. 
Execute o jogo:
1java Adivinhacao
Estrutura do Código
Classe Principal: Adivinhacao
Contém o método main para iniciar o jogo.
Métodos de Dificuldade:
facil(): Configura o jogo para números entre 1 e 10.
intermediario(): Configura o jogo para números entre 1 e 50.
avancado(): Configura o jogo para números entre 1 e 100.
Método de Jogo:
jogo(int min, int max): Lógica principal do jogo, incluindo geração de números aleatórios, registro de acertos e erros, e cálculo da pontuação.

Divirta-se jogando e boa sorte!