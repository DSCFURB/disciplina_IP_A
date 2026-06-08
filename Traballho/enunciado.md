# Trabalho Prático – Jogo da Ilha dos Tesouros

## 1. Objetivo

Desenvolver um jogo em Java, executado via **Console**, utilizando os conteúdos estudados na disciplina de Introdução à Programação.

O trabalho deve obrigatoriamente envolver:

- variáveis;
- estruturas condicionais;
- laços de repetição;
- vetores;
- métodos;
- comparação de valores do tipo `String`;
- entrada e saída de dados via Console.

O programa deve ter **no máximo duas classes**:

1. uma classe principal, por exemplo `Main`;
2. uma classe secundária, por exemplo `JogoTesouro`.

---

## 2. Descrição do jogo

O jogo se chama **Ilha dos Tesouros**.

O jogador está em uma ilha representada por um vetor de posições. Cada posição pode conter um tesouro, uma armadilha ou estar vazia.

Os tesouros e as armadilhas devem ser representados por valores do tipo `String`.

Tipos de tesouros:

```java
"OURO"
"DIAMANTE"
"RUBI"
```

Tipos de armadilhas:

```java
"BURACO"
"COBRA"
"ESPINHOS"
```

Posições vazias devem ser representadas por:

```java
"VAZIO"
```

O objetivo do jogador é explorar posições da ilha, encontrar tesouros, evitar armadilhas e fazer a maior pontuação possível antes que as tentativas acabem.
O tesouro deve ser populado de forma randômica.

---

## 3. Menu obrigatório

O jogo deve apresentar um menu via Console, permitindo que o jogador escolha a ação desejada.

Menu:

```text
===== ILHA DOS TESOUROS =====
1 - Mostrar instruções
2 - Mostrar mapa
3 - Jogar
4 - Mostrar status
5 - Sair
Escolha uma opção:
```

O menu deve funcionar dentro de um laço de repetição e deve ser exibido novamente após cada ação, enquanto o jogo não tiver terminado e o jogador não escolher sair.

### Opções obrigatórias do menu

#### 1 - Mostrar instruções

Deve exibir as regras básicas do jogo, explicando:

- como escolher uma posição;
- quais são os tipos de tesouros;
- quais são os tipos de armadilhas;
- como funciona a pontuação;
- quantas tentativas o jogador possui.

#### 2 - Mostrar mapa

Deve mostrar o mapa da ilha, indicando apenas quais posições já foram exploradas.

O conteúdo real das posições ainda não exploradas não deve ser exibido.

Exemplo:

```text
Mapa da ilha:
[0] ?
[1] EXPLORADO
[2] ?
[3] ?
[4] EXPLORADO
```

#### 3 - Jogar

Deve solicitar ao jogador uma posição da ilha para explorar.

O programa deve validar se:

- a posição existe;
- a posição ainda não foi explorada;
- o jogo ainda possui tentativas disponíveis.

Depois da jogada, o programa deve informar o que foi encontrado e atualizar a pontuação.

Se o jogo encerrar (vencer ou acabarem as jogadas) o jogo deve pedir se o jogador deseja iniciar nova partida.

#### 4 - Mostrar status

Deve mostrar a situação atual do jogador, incluindo:

- pontuação atual;
- quantidade de tentativas restantes;
- quantidade de tesouros encontrados;
- quantidade de armadilhas encontradas;
- quantidade de posições vazias exploradas.

#### 5 - Sair

Deve encerrar o jogo, mesmo que ainda existam tentativas disponíveis.

---

## 4. Regras do jogo

1. O jogo deve possuir um vetor de `String` com, no mínimo, **15 posições**.
2. Cada posição do vetor representa um local da ilha.
3. O vetor deve conter diferentes tipos de tesouros, armadilhas e posições vazias.
4. O jogador deve escolher as ações por meio de um menu.
5. Para jogar, o jogador deve informar pelo Console qual posição deseja explorar.
6. O jogador não pode explorar a mesma posição mais de uma vez.
7. O programa deve validar se a posição informada é válida.
8. O programa deve informar o que foi encontrado na posição escolhida.
9. O jogo deve terminar quando:
   - acabarem as tentativas; ou
   - todos os tesouros forem encontrados; ou
   - o jogador escolher a opção sair.
10. O jogador tem no máximo 8 jogadas.
11. Ao final do jogo, o programa deve perguntar se o jogador deseja reiniciar a partida.

---

## 5. Reinício do jogo

Quando o jogo terminar, o programa deve perguntar ao jogador se ele deseja jogar novamente.

Exemplo:

```text
Deseja jogar novamente? (S/N):
```

Se o jogador escolher `S`, o programa deve reiniciar os dados da partida, incluindo:

- pontuação;
- tentativas;
- posições exploradas;
- quantidade de tesouros encontrados;
- quantidade de armadilhas encontradas;
- quantidade de posições vazias exploradas.

Se o jogador escolher `N`, o programa deve encerrar.

A resposta deve ser comparada utilizando `String`, por exemplo:

```java
if (resposta.equals("S")) {
    // reinicia o jogo
}
```

Também é permitido aceitar `s`, desde que a comparação seja feita corretamente.

---

## 6. Pontuação obrigatória

Cada tipo de tesouro e armadilha deve alterar a pontuação do jogador de forma diferente.

Pontuação:

| Item encontrado | Tipo | Pontuação |
|---|---|---:|
| `"OURO"` | Tesouro | +10 pontos |
| `"DIAMANTE"` | Tesouro | +20 pontos |
| `"RUBI"` | Tesouro | +15 pontos |
| `"BURACO"` | Armadilha | -5 pontos |
| `"COBRA"` | Armadilha | -10 pontos |
| `"ESPINHOS"` | Armadilha | -7 pontos |
| `"VAZIO"` | Nenhum | 0 pontos |

A comparação dos itens deve ser feita utilizando comparação de `String`, por exemplo:

```java
if (item.equals("OURO")) {
    // soma pontos do ouro
}
```

Não será aceito comparar `String` com `==`.

---

## 7. Requisitos obrigatórios

O programa deve conter obrigatoriamente:

1. Um vetor de `String` representando a ilha.
2. Um vetor auxiliar para controlar quais posições já foram exploradas.
3. Laço de repetição para controlar o menu.
4. Laço de repetição para controlar as jogadas.
5. Métodos para organizar o programa.
6. Comparação de `String` usando `.equals()`.
7. Validação para impedir posições inválidas.
8. Validação para impedir posições repetidas.
9. Contagem de tesouros encontrados.
10. Contagem de armadilhas encontradas.
11. Cálculo da pontuação final.
12. Opção de mostrar mapa.
13. Opção de mostrar status.
14. Pergunta para reiniciar o jogo ao final.
15. Execução totalmente via Console.
16. O tesouro deve ser populado de forma randômica.

---

## 8. Sugestões de métodos

O programa deve ser organizado em métodos. Sugestões:

```java
exibirMenu()
lerOpcaoMenu()
exibirInstrucoes()
inicializarIlha()
inicializarControleExplorado()
mostrarMapaExplorado()
mostrarStatus()
lerPosicao()
posicaoValida()
posicaoJaExplorada()
verificarJogada()
calcularPontuacao()
contarTesourosNaIlha()
verificarFimDeJogo()
perguntarSeDesejaReiniciar()
reiniciarJogo()
mostrarResultadoFinal()
```

Os nomes dos métodos podem ser diferentes, desde que o programa esteja organizado e compreensível. Lembra-se que aqui não constam os parâmetros e tipo de retorno.

---

## 9. Mapa explorado

Durante o jogo, o programa deve permitir que o jogador visualize quais posições já foram exploradas.

Exemplo:

```text
Mapa da ilha:
[0] ?
[1] EXPLORADO
[2] ?
[3] ?
[4] EXPLORADO
```

O conteúdo real das posições ainda não exploradas não deve ser mostrado ao jogador.

Opcionalmente, para posições já exploradas, o programa pode mostrar o item encontrado, por exemplo:

```text
[1] OURO
[4] COBRA
```

---

## 10. Exemplo de execução

```text
Bem-vindo ao jogo Ilha dos Tesouros!

A ilha possui 15 posições, numeradas de 0 a 14.
Você possui 8 tentativas para encontrar os tesouros.

===== ILHA DOS TESOUROS =====
1 - Mostrar instruções
2 - Mostrar mapa
3 - Jogar
4 - Mostrar status
5 - Sair
Escolha uma opção: 2

Mapa da ilha:
[0] ?
[1] ?
[2] ?
[3] ?
[4] ?
[5] ?
[6] ?
[7] ?
[8] ?
[9] ?
[10] ?
[11] ?
[12] ?
[13] ?
[14] ?

===== ILHA DOS TESOUROS =====
1 - Mostrar instruções
2 - Mostrar mapa
3 - Jogar
4 - Mostrar status
5 - Sair
Escolha uma opção: 3

Escolha uma posição: 3
Você encontrou OURO! +10 pontos.

===== ILHA DOS TESOUROS =====
1 - Mostrar instruções
2 - Mostrar mapa
3 - Jogar
4 - Mostrar status
5 - Sair
Escolha uma opção: 3

Escolha uma posição: 7
Você encontrou uma armadilha: COBRA! -10 pontos.

===== ILHA DOS TESOUROS =====
1 - Mostrar instruções
2 - Mostrar mapa
3 - Jogar
4 - Mostrar status
5 - Sair
Escolha uma opção: 4

Status atual:
Pontuação: 0 pontos
Tentativas restantes: 6
Tesouros encontrados: 1
Armadilhas encontradas: 1
Posições vazias exploradas: 0

===== ILHA DOS TESOUROS =====
1 - Mostrar instruções
2 - Mostrar mapa
3 - Jogar
4 - Mostrar status
5 - Sair
Escolha uma opção: 3

Escolha uma posição: 3
Essa posição já foi explorada. Escolha outra.

Fim de jogo!

Tesouros encontrados: 1
Armadilhas encontradas: 1
Posições vazias exploradas: 0
Pontuação final: 0 pontos

Você perdeu. Tente novamente!

Deseja jogar novamente? (S/N): N
Jogo encerrado.
```

---

## 11. Restrições

1. O trabalho deve ser feito em Java.
2. O programa deve executar apenas via Console.
3. Não é permitido utilizar interface gráfica.
4. O programa deve ter no máximo duas classes.
5. Não é permitido utilizar listas, `ArrayList`, arquivos, banco de dados ou bibliotecas externas.
6. Não é permitido utilizar recursos avançados não estudados em aula.
7. A comparação de textos deve ser feita com `.equals()`.
8. O código deve ser explicado pelo aluno durante a apresentação.

---

## 12. Critérios de avaliação

| Critério | Pontuação sugerida |
|---|---:|
| Funcionamento geral do jogo | 1,0 |
| Uso correto de vetor de `String` | 1,0 |
| Uso de vetor auxiliar para posições exploradas | 0,8 |
| Uso adequado de laços de repetição | 0,8 |
| Implementação do menu de opções | 0,8 |
| Uso adequado de métodos | 1,2 |
| Comparação correta de `String` com `.equals()` | 1,0 |
| Validação de posição inválida | 0,6 |
| Validação de posição repetida | 0,6 |
| Cálculo correto da pontuação | 0,8 |
| Reinício do jogo ao final | 0,6 |
| Organização, clareza e indentação do código | 0,8 |
| Apresentação e explicação do código | 1,0 |
| **Total** | **10,0** |

---

## 13. Observação importante

O objetivo do trabalho não é apenas fazer o jogo funcionar. O aluno deve conseguir explicar o código desenvolvido, principalmente:

- como o vetor da ilha foi criado;
- como o vetor de posições exploradas é utilizado;
- como o menu é controlado;
- como as `String` são comparadas;
- como a pontuação é calculada;
- como o jogo verifica se terminou;
- como o jogo é reiniciado.
