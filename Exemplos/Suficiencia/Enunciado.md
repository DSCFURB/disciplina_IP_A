<!-- #### Prova de Suficiência: envio do enunciado <https://github.com/dalton-reis/disciplinaIpPrivado/projects/2#card-78318331> -->

# Introdução à Programação - Prova de Suficiência  

- A prova de suficiência abrange todo o conteúdo da disciplina (6/8 créditos). 
- O conteúdo é o que consta no Plano de Ensino da disciplina (disponível no AVA3). 
- As únicas estruturas de dados permitidas para a solução de problemas são strings e vetores. Nenhuma outra estrutura ou biblioteca é permitida, a não ser o uso do "import java.util.Scanner;" para fazer uso de "Scanner teclado = new Scanner(System.in);" e fazer leituras do teclado.  
- A prova de suficiência da disciplina de Introdução à Programação deve ser cumprida individualmente.  
- Caso você atingir nota 6 ou superior, esta será sua média da disciplina e você não poderá mais cursar a disciplina, nem aumetar sua média.
- Caso sua nota não atinga média 6, você deverá cursar a disciplina sem nenhum dano em relação a sua nota.

Prazo máximo para entrega: 28/fevereiro às 11 horas (sábado)  

## Questão 1 (4,0)
Elabore um algoritmo que receba como entrada um valor inteiro em reais (sem centavos) e determine:

- Quantas notas de R$100,00 podem ser utilizadas;

- Quantas notas de R$50,00 podem ser utilizadas;

- Quantas notas de R$20,00 podem ser utilizadas;

- Qual é o valor restante que não pode ser representado por essas notas.

Considere que:

- O valor informado será sempre um número inteiro positivo.

- O cálculo deve utilizar a maior quantidade possível de notas de maior valor primeiro (100 → 50 → 20).

- O valor restante pode ser qualquer número menor que 20.

### Requisitos obrigatórios

Antes de implementar o programa em Java, o aluno deve:

- Construir o fluxograma completo da solução.

- **(2,5)** O fluxograma deve conter: 

    - Entrada de dados

    - Processamento sequencial

    - Cálculo do restante utilizando operador de divisão inteira e módulo

    - Saída dos resultados

- **(1,5)** O código-fonte em Java deve:

    - Ser fiel ao fluxograma apresentado.

    - Seguir exatamente a mesma sequência lógica.

    - Não pode conter estruturas adicionais que não estejam representadas no fluxograma.


### EXEMPLO

| Entrada (Valor em R$) | Notas de 100 | Notas de 50 | Notas de 20 | Valor Restante |
| --------------------- | ------------ | ----------- | ----------- | -------------- |
| 1550                  | 15           | 1           | 0           | 0              |
| 99                    | 0            | 1           | 2           | 9              |
| 20                    | 0            | 0           | 1           | 0              |
| 18                    | 0            | 0           | 0           | 18             |

## Questão 2 (6,0)

Implemente um programa em Java que simule uma mochila com capacidade máxima para **10 posições**.

A mochila deverá ser representada por um **vetor de inteiros**, em que cada valor representa o peso de um item.

(0,5) Antes de exibir o menu, o programa deverá solicitar que o usuário digite a palavra: "INICIAR"
O programa somente deverá prosseguir para o menu se o usuário digitar "INICIAR", mas deverá desconsiderar maiúsculas ou minúsculas.
Caso contrário, o programa deverá continuar solicitando a palavra até que o valor correto seja informado.

Ao iniciar, o programa deverá apresentar o seguinte menu, recebendo a opção como *char*:

a - Adicionar peso na mochila <br />
b - Remover peso da mochila <br />
c - Listar pesos da mochila<br />
d - Ordenar mochila em ordem decrescente<br />
e - Verificar se um peso existe na mochila<br />
f - Sair

O menu deverá ser executado dentro de um `do..while` (0,5), encerrando somente quando o usuário digitar "f".

A estrutura de decisão deve ser implementada utilizando `switch-case` (0,5).

### Funcionalidades
(0,5) a - Adicionar peso <br />

    - Solicitar um valor inteiro.
    - Inserir na próxima posição disponível do vetor.
    - Caso a mochila esteja cheia, informar ao usuário.

(1,0) b – Remover peso <br />

    - Solicitar um valor inteiro.
    - Remover a primeira ocorrência encontrada.
    - Após remover, reorganizar o vetor para não deixar posições vazias intermediárias.
    - Caso o valor não exista, informar ao usuário.

(0,5) c – Listar pesos <br />

    - Exibir todos os valores atualmente armazenados na mochila.

(1,5) d – Ordenar mochila <br />

    - Ordenar o vetor em ordem decrescente (do maior para o menor).
    - A ordenação deve ser implementada manualmente.
    - Não é permitido utilizar Arrays.sort() ou métodos prontos de ordenação.

(0,5) e– Verificar existência <br />

    - Solicitar um valor inteiro.
    - Informar se o valor está ou não presente no vetor.

(0,5) f – Sair <nr />
    
    - Encerrar o programa

### Requisitos
- O vetor deve ser declarado no `construtor` da classe
- No método `main()` deve ser chamado somente a instância da classe
- Cada funcionalidade do menu deve ser implementada em um método separado.
- O vetor deve ser passado como parâmetro para os métodos.
- Não é permitido utilizar variáveis globais ou atributos de classe.
- Não é permitido utilizar bibliotecas prontas para ordenação.
- **O descumprimento dos requisitos obrigatórios implicará desconto na nota.**

## Forma de envio

Após a conclusão da prova, seguir os seguintes passos:
- Informar a professora que finalizou
- A professora irá ligar o cabo de rede do computador
- Enviar SOEMNTE os arquivos .java para o e-mail lpa@furb.br
- Aguardar para fazer a arguição oral da prova
