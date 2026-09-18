# Lista de Exercícios 02 — Programação Orientada a Objetos

Um arquivo `.java` por exercício, todos testados e rodando. Em cada arquivo, a classe
com o `main` vem primeiro e as classes de modelo vêm logo abaixo.

## Como compilar e executar

Exercícios 1 a 4 e 6 a 15 (a partir da pasta `lista02`):

```
javac Exercicio01.java
java Exercicio01
```

Ou, com Java 11+, direto pelo código-fonte:

```
java Exercicio01.java
```

Exercício 5 (usa dois pacotes), a partir da pasta `exercicio05`:

```
javac sensor/Sensor.java aplicacao/TesteSensor.java
java aplicacao.TesteSensor
```

Se você for colar isso em uma IDE (Eclipse, IntelliJ, NetBeans), o mais prático é criar
uma classe por arquivo, com o mesmo nome da classe.

Os comentários e as strings estão sem acentuação de propósito: evita erro de encoding
na hora de compilar pelo terminal no Windows. Se o seu professor pedir, é só acentuar.

## O que cai em cada exercício

**Parte 1 — Encapsulamento e níveis de acesso**

1. `Livro` — o básico: atributos `private` + `get`/`set`. O `get` lê, o `set` escreve.
2. `Produto` — o `set` não é uma porta aberta: é onde a classe recusa valor inválido.
3. `Funcionario` — `getSalarioTotal` é atributo **derivado**: calculado na hora, nunca
   guardado. Se fosse atributo, ficaria desatualizado quando o bônus mudasse.
4. `ContaBancaria` — `saldo` tem `get` e não tem `set`. A única forma de mexer no saldo
   é passando pelas regras de `depositar` e `sacar`.
5. `Sensor` — `public` enxerga de qualquer pacote, `private` só dentro da própria classe.
   A classe de teste está em outro pacote e só consegue chamar `lerValor()`. Há duas
   linhas comentadas no `TesteSensor` que, se descomentadas, dão erro de compilação —
   vale descomentar uma vez só para ver o erro acontecer.

**Parte 2 — Construtores e sobrecarga**

6. `Retangulo` — o construtor garante que o objeto já nasce completo e válido.
7. `Cliente` — três construtores encadeados por `this(...)`. Só o construtor completo
   atribui de fato; os outros delegam para ele.
8. `Data` — mesma ideia: o construtor de um parâmetro chama o de três, com padrão 1/1.
9. `Calculadora` — sobrecarga é o mesmo nome com listas de parâmetros diferentes.
   Quem escolhe a versão é o compilador, pelo tipo e pela quantidade dos argumentos.
10. `Ingresso` — a versão com teto de desconto reaproveita a versão simples em vez de
    repetir a conta.

**Parte 3 — toString, igualdade e referência**

11. `Musica` — sem `toString`, o `println` mostraria `Musica@1b6d3586`. Repare que a
    lista também usa o `toString` de cada elemento.
12. `Ponto` — `==` compara **referência** (é o mesmo objeto na memória?), `equals`
    compara **conteúdo**. `p3 = p1` faz as duas variáveis apontarem para o mesmo objeto.
13. `Aluno` — o `HashSet` usa primeiro o `hashCode` (para achar o balde) e depois o
    `equals` (para confirmar). Sem os dois, ele cai na identidade do objeto e aceita a
    duplicata. Para mostrar os dois resultados numa execução só, deixei uma classe
    gêmea `AlunoSemEquals` no mesmo arquivo. Se o professor quiser exatamente o que o
    enunciado pede, é só comentar `equals` e `hashCode` da classe `Aluno` e rodar de novo:
    o resultado passa de 1 para 2.
14. `Veiculo` — o ponto do exercício: Java passa a **referência por valor**. Alterar o
    objeto recebido afeta o original (a placa vira `AAA0A11`); dar `new` e reatribuir o
    parâmetro só mexe na cópia local, então a placa continua `AAA0A11` no fim.
15. `Usuario` — a senha vinda do `Scanner` é um objeto novo em tempo de execução, então
    `==` dá `false` mesmo com o texto certo. Para texto, sempre `equals`.

## Saídas esperadas

- Ex. 4: 0,00 → 1000,00 → 600,00 → 600,00 (o saque de 5000 é recusado)
- Ex. 12: `false / true`, `true / true`, `false / true`
- Ex. 13: 1 com `equals` e `hashCode`, 2 sem eles
- Ex. 14: `XYZ1A23` → `AAA0A11` → `AAA0A11`
- Ex. 15: `==` dá `false`, `equals` dá `true`
