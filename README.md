* ## Exercícios de Java :coffee:
Repositório elaborado contendo os 17 exercícios da linguagem java propostos pela docente Adriana Jacinto da disciplina de  Linguagem de Programação I do segundo semestre do curso de Banco de Dados - FATEC - SJC.

* ## Teste de mesa dos códigos elaborados :pencil:

* ### __1 - Idade em dias :calendar:
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a 
idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

| Anos | Meses | Dias | Cálculo dos Dias | Total de Dias |
|---|---|---|---|---|
| 25 | 11 | 15 | (25 * 365) + (11 * 30) + 15 | 9355 |
| 3 | 8 | 22 | (3 * 365) + (8 * 30) + 22 | 1372 |
| 0 | 1 | 5 | (0 * 365) + (1 * 30) + 5 | 35 |
| 1 | 0 | 0 | (1 * 365) + (0 * 30) + 0 | 365 |
| 100 | 0 | 0 | (100 * 365) + (0 * 30) + 0 | 36500 |

* ### __2 - Percentual de votos :inbox_tray:
Escreva um algoritmo em java para ler o número total de eleitores de um município, 
o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
que cada um representa em relação ao total de eleitores.

#### Caso de Teste 1: Valores Normais

| Entrada          | Valor |
|------------------|-------|
| totalEleitores   | 1000  |
| votosBrancos     | 50    |
| votosNulos       | 30    |
| votosValidos     | 920   |

#### Resultado Esperado

| Percentual       | Valor |
|------------------|-------|
| Votos Brancos    | 5%    |
| Votos Nulos      | 3%    |
| Votos Validos    | 92%   |

---

#### Caso de Teste 2: Soma dos Votos Excedendo o Total de Eleitores

| Entrada          | Valor |
|------------------|-------|
| totalEleitores   | 1000  |
| votosBrancos     | 500   |
| votosNulos       | 400   |
| votosValidos     | 200   |

#### Resultado Esperado

Mensagem de erro: "A soma dos votos não pode ser maior que o número total de eleitores"

---

#### Caso de Teste 3: Todos os Votos São Brancos

| Entrada          | Valor |
|------------------|-------|
| totalEleitores   | 1000  |
| votosBrancos     | 1000  |
| votosNulos       | 0     |
| votosValidos     | 0     |

#### Resultado Esperado

| Percentual       | Valor |
|------------------|-------|
| Votos Brancos    | 100%  |
| Votos Nulos      | 0%    |
| Votos Validos    | 0%    |


* ### __3 - Reajuste salarial__  :moneybag:

Escreva um algoritmo em java para ler o salário mensal atual de um funcionário
e o percentual de reajuste. Calcular e escrever o valor do novo salário.

| Entrada (Salário Atual) | Entrada (Percentual) | Cálculo do Reajuste | Novo Salário |
|---|---|---|---|
| 2000 | 10 | 2000 * (10/100) = 200 | 2000 + 200 = 2200 |
| 1550 | 5.5 | 1550 * (5.5/100) = 85.25 | 1550 + 85.25 = 1635.25 |
| 1234.56 | 3.14 | 1234.56 * (3.14/100) = 38.79 | 1234.56 + 38.79 = 1273.35 |
| 0 | 20 | 0 * (20/100) = 0 | 0 + 0 = 0 |
| -100 | 10 | -100 * (10/100) = -10 | -100 + (-10) = -110 |

* ### __4 - Custo carro :blue_car:
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo em java para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

### Caso de Teste 2: Custo de Fábrica com Valores Altos

| Entrada              | Valor |
|----------------------|-------|
| custoFabrica         | 50000 |

#### Resultado Esperado

| Item                 | Valor |
|----------------------|-------|
| Percentual Distribuidor | 28%   |
| Percentual Impostos  | 45%   |
| Custo Final          | R$ 86000 |

---

#### Caso de Teste 3: Custo de Fábrica com Valores Baixos

| Entrada              | Valor |
|----------------------|-------|
| custoFabrica         | 10000 |

#### Resultado Esperado

| Item                 | Valor |
|----------------------|-------|
| Percentual Distribuidor | 28%   |
| Percentual Impostos  | 45%   |
| Custo Final          | R$ 21600 |

* ### __5 - Salário vendedor :money_with_wings:
Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo em java que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

| Número de Carros | Valor Total das Vendas | Salário Fixo | Comissão por Carro | Comissão sobre Vendas | Salário Final |
|------------------|------------------------|--------------|--------------------|----------------------|---------------|
| 5                | 100000                 | 2000         | 100                | 5000                 | 7500          |
| 0                | 50000                  | 1500         | 200                | 2500                 | 4000          |
| 10               | 200000                 | 3000         | 50                 | 10000                | 13500         |


* ### __6 - Fahrenheit para Celsius :shower:
Escreva um algoritmo em java para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

| Fahrenheit | Celsius (Calculado) | Celsius (Esperado) |
|------------|---------------------|---------------------|
| 212        | 100                 | 100                 |
| 32         | 0                   | 0                   |
| 68         | 20                  | 20                  |
| -40        | -40                 | -40                 |

* ### __7 - Comparar com Dez :keycap_ten:
Algoritmo em java para ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

| Entrada (Número) | Saída                        |
|------------------|------------------------------|
| 15               | É MAIOR QUE 10!              |
| 5                | NÃO É MAIOR QUE 10!          |
| 10               | NÃO É MAIOR QUE 10!          |
| -3               | NÃO É MAIOR QUE 10!          |

* ### __8 - Positivo ou negativo :heavy_plus_sign: :heavy_minus_sign:
Algoritmo em java para ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)

| Entrada (Número) | Saída                    |
|------------------|--------------------------|
| 15               | O número é positivo.     |
| -5               | O número é negativo.     |
| 0                | O número é positivo.     |
| -100             | O número é negativo.     |

* ### __9 - Custos das maçãs :apple:
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa em java que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

| Quantidade de Maçãs | Preço Unitário | Custo Total |
|---------------------|---------------|-------------|
| 10                  | 1.30          | 13.00       |
| 12                  | 1.00          | 12.00       |
| 20                  | 1.00          | 20.00       |
| 0                   | 1.30          | 0.00        |

* ### __10 - Cálculo de média :bar_chart:
Algoritmo em java para ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

| Nota 1 | Nota 2 | Média | Resultado                                      |
|--------|--------|-------|------------------------------------------------|
| 8.0    | 7.5    | 7.75  | Parabéns! Você foi aprovado com média 7.75.    |
| 5.0    | 4.5    | 4.75  | Infelizmente você não foi aprovado. Sua média foi 4.75. |
| 6.0    | 6.0    | 6.00  | Parabéns! Você foi aprovado com média 6.00.    |
| 10.0   | 0.0    | 5.00  | Infelizmente você não foi aprovado. Sua média foi 5.00. |

* ### __11 - Idade permitida para votar :underage:
Algoritmo em java para ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

| Ano Atual | Ano de Nascimento | Idade | Resultado                         |
|-----------|------------------|-------|-----------------------------------|
| 2023      | 2008             | 15    | Você não poderá votar este ano. |
| 2023      | 2007             | 16    | Você poderá votar este ano.      |
| 2023      | 2000             | 23    | Você poderá votar este ano.      |
| 2023      | 2025             | -2    | Você não poderá votar este ano. (Idade negativa) |

* ### __12 - Maior valor :1234:
Algoritmo em java para ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

| Valor 1 | Valor 2 | Maior Valor |
|---------|---------|-------------|
| 10      | 5       | 10          |
| 5       | 10      | 10          |
| -3      | 7       | 7           |
| 20      | 20      | (Não considerado) |

* ### __13 - Ordem crescente dos números :1234:
Algoritmo em java para ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

| Valor 1 | Valor 2 | Temp (auxiliar) | Saída            |
|---------|---------|-----------------|------------------|
| 5       | 10      | -               | 5 e 10           |
| 10      | 5       | 10              | 5 e 10           |
| -3      | 7       | -3              | -3 e 7           |
| 7       | -3      | 7               | -3 e 7           |

* ### __14 - Duração partida de Xadrez :horse:
Algoritmo em java para ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

| Hora de Início | Hora de Fim | Duração Calculada | Duração Real |
|----------------|-------------|-------------------|--------------|
| 10             | 15          | 5                 | 5            |
| 22             | 3           | -19               | 5            |
| 0              | 23          | 23                | 23           |

* ### __15 - Calculo salário :dollar:
A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo em java que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

| Horas Trabalhadas | Valor Hora | Horas Extras | Salário Total |
|-------------------|------------|-------------|---------------|
| 160               | 15         | 0           | 2400.00       |
| 180               | 20         | 40          | 3800.00       |
| 150               | 10         | 10          | 1650.00       |
| 120               | 25         | 0           | 3000.00       |

* ### __16 - Gastos do trimestre :money_with_wings:
Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa em java que calcule e imprima a despesa total no trimestre e a média mensal de gastos

| Variável                | Valor Inicial | Valor Final |
|--------------------------|---------------|-------------|
| gastosJaneiro            | 15000         | 15000       |
| gastosFevereiro          | 23000         | 23000       |
| gastosMarco              | 17000         | 17000       |
| gastoTotal              | -             | 55000       |
| mediaMensal             | -             | 18333.33    |

* ### __17 - Cálculo da média LP1 :books:
Programa em java que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.
Fórmula para cálculo de média de LP1.
(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.2).

| Iteração | P1   | E1   | E2   | API  | X   | SUB | Média Ponderada | Fator Ajuste | Média Final |
|----------|----  |----  |----  |----- |---- |-----|---------------- |------------- |-------------|
| 1        | 9.0  | 8.5  | 7.0  | 9.5  | 0.5 | 0.2 | 8.15            | 1            | 8.8         |
| 2        | 6.0  | 5.5  | 6.0  | 7.0  | 0.3 | 0.1 | 5.95            | 0            | 6.25        |
| 3        | 4.0  | 3.5  | 4.0  | 5.0  | 0.2 | 0.1 | 4.75            | 0            | 4.95        |
| 4        | 10.0 | 10.0 | 10.0 | 10.0 | 0   | 0   | 9.5             | 1            | 10          |
| 5        | 5.0  | 5.0  | 5.0  | 5.0  | 0.5 | 0.5 | 5.0             | 0            | 6.0         |
