[Plano de Ensino]: <https://ava3.furb.br/course/view.php?id=36814&section=1> "Plano de Ensino"  
[Apresentação do Professor]: <https://github.com/dalton-reis/dalton-reis> "Apresentação do Professor"  
[Monitoria]: <https://www.icloud.com/numbers/0d1vcb8BP5o91bzCLfwnVv80w#Monitores_2025_1> "Monitoria"  

# Algumas anotações das aulas

Deseja conhecer um pouco mais sobre o setor de informática na região ..  
Se inscreva e assista os PodCasts <https://linktr.ee/vishubfurb>  
![DebugadosCompilados](imgs/DebugadosCompilados.png "DebugadosCompilados")  

## Rabiscos

![aulaRabiscos](aulaRabiscos.drawio.svg)

## Introdução à Programação - Unidade 1

## Aula

- Avisos: os avisos serão feitos todos pelo Teams

## [Materiais FURB](<https://github.com/dalton-reis/dalton-reis/blob/main/_._/furb.md> "Materiais FURB")  

## [Apresentação do Professor]

## [Plano de Ensino]

Ler com **muita ATENÇÃO**, e em caso de dúvida me questionem.

- Quantidade de créditos: 6 + 1 (atividades em casa)
- Sala de aula invertida
- Divisão das unidades e conteúdo de cada unidade
- Avaliações: prazos nas atividades no AVA3 dentro das unidades, e no cronograma
- Referências bibliográficas: algumas, usem o mostrado em aula .. cuidado para não perder o foco
  
## Conteúdo

### Apoio

- links gerais de toda a disciplina
  - cronograma: divisão das unidades, qual conteúdo, prazos de entrega
  - repositório: todo o conteúdo da disciplina e os exercícios das atividades práticas
  - horário da monitória: [Monitoria]  

### Unidade 1

- link do Conteúdo
- atividade: questionário
- ambiente de desenvolvimento

## Ambiente de Desenvolvimento

- Java OpenJDK
- IDE (ambiente de desenvolvimento) VSCode

------

## Visão Geral do Conteúdo

- muitas palavras novas que serão explicadas mais para frente
- vai parecer algo muito abstrato

### Pensamento Computacional

De uma forma geral a resolução de problemas computacionais se apoiam nesses *pilares*:

![alt text](imgs/PensamentoComputacional_pilares.png)

Se utilizam desses *pilares* para desenvolver o *algoritmo*, que pode ser **facilmente** traduzido para uma linguagem de programação. Pois quando se tem o *algoritmo*, já se tem toda lógica definida.  

### Algoritmos

- problema: algo (as vezes imaginável) para ser resolvido
- desenvolvimento da ideia
- formalização da ideia
- codificação: linguagem de programação
- testes
- arrumar problemas encontrados
- testes
- usar ... 😉 ... e rezar para o usuário não aparecer com novos problemas, mas sim com novas necessidades

#### Algumas dicas

##### Desenvolvimento da ideia / Formalização da ideia

- praticar, praticar, ... praticar ..

    ![CerebroAprende](imgs/CerebroAprende.png "CerebroAprende")

- aprender com problemas já resolvidos
- resolveu, se der tempo, não poderia resolver da  melhor forma
- não desista, nunca, jamais ... desistiu, volte a insistir

    ![Nunca Desista](imgs/NuncaDesista.png "Nunca desista. Sapo resistindo bravamente para não ser engolido pela cegonha")

- divisão e conquista ... subdividir em rotinas
- Etapas: Entrada / Processo / Saída

![Imagem das etapas: Entrada, Processo e Saída](imgs/EPS.png "Imagem das etapas: Entrada, Processo e Saída")

##### Codificação: linguagem de programação

- Exemplo, algo parecido com formalismo usado na Matemática (mas a computação é melhor 😉 )

  ![\Large 3+4=x](https://latex.codecogs.com/svg.latex?\Large&space;3+4=x)

  ![\Large 4+3=x](https://latex.codecogs.com/svg.latex?\Large&space;4+3=x)

  ![\Large 1+4+3-1=y](https://latex.codecogs.com/svg.latex?\Large&space;1+4+3-1=y)

  ![\Large \Large&space;1+4+3-1+\sqrt{9}+\int_{a}^{b}dx=z](https://latex.codecogs.com/svg.latex?\Large&space;1+4+3-1+\sqrt{9}+\int_{a}^{b}dx=z)

  ![\Large \Large&space;1+4+3-1+\sqrt{9}=a](https://latex.codecogs.com/svg.latex?\Large&space;1+4+3-1+\sqrt{9}=a)

  ![\Large \Large&space;a+\int_{a}^{b}dx=z](https://latex.codecogs.com/svg.latex?\Large&space;a+\int_{a}^{b}dx=z)

- Exemplo, na Computação, uma representação gráfica:

    Fluxograma de uma rotina condicional simples

Diagrama de estados de uma rotina condicional simples  
![ExemploCondicionalSimples](https://www.plantuml.com/plantuml/svg/ROr12u8m68Rl-nKlEsammLiTDWmpakXYtK92sYSDvXGtevyV9j6bw_i-F4_cGpE6gRCeNjGDjizxfytTzAwnPzCDbZm3ebKC8HIuqOqcIAGR3WQO5ZnQDYMHhcEEy237042eQnWdgi79tqTwqXXjzMH37_Fb5mfIoghObLMHNsxveSYFKahCOhAUljIrRQod-YyyeqwRbYs-Nof9zkKfIJuj8LIqYbb6Ja-TVGC0 "ExemploCondicionalSimples")  

    Fluxograma de uma rotina para achar o menor valor entre três valores

Diagrama de estados de uma rotina para achar o menor valor entre três valores  
![ExemploMetodoOrdenarTresValoresA](https://www.plantuml.com/plantuml/svg/VOvD3e8m48NNxIachbfS0JlG11SkYHlZdiWOIVf3feLu7u_YnKmRWcBKtRoPzzutbVCD-K4hsDzGzyhMw6rh3zIYQUX8w4wDieHknrcqSiQWK4XY3FjK1ZtBR2bpMKPx53KQIq5t5n1J6ZPRc8AG9FiaWSz3BYNuAneGhjEI0sFihGucLrg62og78CpZRiCRRvnihakNdEmVvnieYw05wPSrdwocxIxnkpWmSDxsd1NepeGZabZfa2fMi8PNYInvXQOTj7e2 "ExemploMetodoOrdenarTresValoresA")  
![ExemploMetodoOrdenarTresValoresB](https://www.plantuml.com/plantuml/svg/fP5BQiCm48RNqYa6hso7BYJld0P28SlGJUdUL1CgiAGWEQ7twL5wiIBv8JknIg0xpUkR-N_jNTVOxg9QE7oXEhVcY9qHvjKAr8rzi-ZUczPOT2-KX5PAIDsYpQy-pGfAo1JnHLGLMzyRtaVKnb92Xa18CmMDDDOtoXFa0nIUTp00eImFPGctXQeeeFj43RcJoc-Txu6XYNbiuFQmsVJDy3Gjf1cdUIZ46yTy5QZOEeHS_toR9A1A07WFq4AUADoHeWtnNhQqWQTi0B9kHBynEi7-S69D2UihAI_kp4YxiS9W0sFqOq5BAQgIYlZ_5F775V775Kr_7Hu4N6VEbDJeFYnUqUQPyk9go3PHwYQ39r1-uImlfEdpVb_C-wZOqZrgSL7jBm00 "ExemploMetodoOrdenarTresValoresB")  

## Como fica na prática

- irei demonstrar usando o nosso ambiente de desenvolvimento (Java+VSCode), mas não se preocupem ... hoje não iremos estudar este ambiente ... é só para demonstrar o processo de **Solução de Problemas**:
  - entender o problema​
  - verificar as entradas
  - identificar saídas
  - definir processos
  - descrever solução formalmente
  - testar

Também vamos assumir uma forma simples de entrar com os valores ..

ATENÇÃO: lembrem de irem instalando o "Ambiente de Desenvolvimento Prático" ..

------

### Exemplos de Enunciados

#### Enunciado A  

As vezes o enunciado pode ter "gorduras" ...  

    Era uma vez, uma pessoa que estava na praia. Esta pessoa conhecia um professor  
    e este professor tinha um problema para resolver. O seu problema era que ele  
    tinha que considerar uma situação que ele poderia ter 3 notas de um aluno e  
    com elas poderia calcular a média deste aluno.  

Ou ainda um enunciado "magrinho", mas as vezes se tem situações com falta de informações que não permitem solucionar o problema ... no caso, quantas notas para calcular a média?  

    Considerando que um professor tem notas de um aluno, calcule média do aluno.  

Uma aceitável e se ter uma descrição sucinta, mas que tenha todas as informações necessárias para poder resolver o problema.  

    Um professor deseja calcular a média de um aluno. O professor tem o nome e as  
    3 notas do aluno e a média deve ser calculada de forma aritmética.​  

Então vamos para primeira etapa:  

- entender o problema​: Se pergunte, você consegue resolver este problema sem o uso do computador? Caso não consiga, bem provável é porque você não entendeu o enunciado ou falta informações, conhecimento, de como resolver o problema.  

    Média aritmética:

  ![\normalsize&space;\frac{7+8+9}{3}\=8](https://latex.codecogs.com/svg.latex?\normalsize&space;\frac{7+8+9}{3}\=8)  

Uma forma de ajudar a entender o problema é extrair do enunciado:  

- as entradas  
- as saídas  
- e definir os processos  

**Então tente separar em:**  

Desnecessário __  

    Um professor deseja   
    O professor tem o nome  

Não usado __  

    nome  

Entrada __  
    // ter as 3 notas  
    Nota1 = 7  
    Nota2 = 8  
    Nota3 = 9  

Processo __  
    // Calcular a média  
    media = (nota1 + nota2 + nota3) / 3  

Saída __  
    // escrever a média  
    escrever(media)  

Bom, depois destas etapas vamos para:  

- descrever solução formalmente  

 .. vou mostrar como é no nosso ambiente  

descrever solução formalmente __  

    código em Java  

E por fim, e muito importante  

- testar: Para testar se precisa ter valores de **entrada**, e principalmente saber quais valores de **saída** serão gerados com estas **entradas**.  

| Entrada                               | Saída       |  
| ------------------------------------- | ----------- |  
| Nota1 = 5.0, Nota2 = 7.0, Nota3 = 9.0 | Média = 7.0​ |  
| Nota1 = 4.0, Nota2 = 6.0, Nota3 = 5.0 | Média = 5.0​ |  
| Nota1 = 7.0, Nota2 = 5.0, Nota3 = 1.5 | Média = 4.5​ |  

#### Enunciado B  

Mais um problema a ser resolvido ...  

    Modele a solução de um problema para calcular a área de uma sala retangular.  
    Considere que as medidas estão expressas em metros.  

Então vamos para primeira etapa:  

- entender o problema​: faça o cálculo na "mão". Use os valores de testes (abaixo) para verificar se seu calculo está certo.  

![Calculo da área de um retângulo](imgs/calculoAreaRetangulo.drawio.svg "Calculo da área de um retângulo")  

**Então tente separar em:**  

Desnecessário __  

    Modele a solução de um problema para  
    de uma sala  
    Considere que as medidas estão expressas em metros.  

Não usado __  

    metros  

Entrada __  
    // ter a largura e altura  
    altura = 3  
    largura = 5  

Processo __  
    // calcular a área  retangular  
    area = largura x altura  

Saída __  
    // escrever a área  
    escrever(area)  

descrever solução formalmente __  

    código em Java  

- testar  

| Entrada                        | Saída      |  
| ------------------------------ | ---------- |  
| largura = 10, comprimento = 10 | área = 100​ |  
| largura =  5, comprimento =  7 | área =  35​ |  
| largura =  3, comprimento = 90 | área = 270​ |  

## Ambiente de Desenvolvimento Prático - Apoio

- [ ] [Ambiente de Desenvolvimento Prático](IDE.md "Ambiente de Desenvolvimento Prático").  
