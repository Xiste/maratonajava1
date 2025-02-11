# Java: Introdução

Java é uma linguagem de programação orientada a objetos amplamente utilizada para o desenvolvimento de aplicações, desde sistemas desktop até aplicações web e móveis. Criada pela Sun Microsystems em 1995 e atualmente mantida pela Oracle, Java é conhecida por sua portabilidade e robustez.

## Como o Java funciona?

O funcionamento do Java baseia-se no conceito de "Write Once, Run Anywhere" (Escreva uma vez, execute em qualquer lugar). Isso é possível graças à sua arquitetura baseada em máquina virtual:

1. **Código-fonte:** Você escreve o código em arquivos com extensão `.java`.
2. **Compilação:** O compilador Java (`javac`) converte o código-fonte em bytecode, que é armazenado em arquivos `.class`. O bytecode é um código intermediário independente de plataforma.
3. **Execução:** A Java Virtual Machine (JVM) interpreta ou compila o bytecode para o código nativo da máquina em que está sendo executado.

A JVM é a chave para a portabilidade do Java, pois cada sistema operacional tem sua própria implementação da JVM. Isso permite que o mesmo bytecode funcione em diferentes plataformas sem modificações.

![compilacaojava.png](compilacaojava.png)

## Tipos Primitivos em Java

Java possui oito tipos primitivos, que são usados para armazenar valores simples. Esses tipos são:

1. **byte**: Um inteiro de 8 bits. Exemplo: `byte b = 100;`
2. **short**: Um inteiro de 16 bits. Exemplo: `short s = 1000;`
3. **int**: Um inteiro de 32 bits. Exemplo: `int i = 100000;`
4. **long**: Um inteiro de 64 bits. Exemplo: `long l = 100000L;`
5. **float**: Um número de ponto flutuante de 32 bits. Exemplo: `float f = 10.5f;`
6. **double**: Um número de ponto flutuante de 64 bits. Exemplo: `double d = 10.5;`
7. **char**: Um caractere Unicode de 16 bits. Exemplo: `char c = 'A';`
8. **boolean**: Um valor booleano (`true` ou `false`). Exemplo: `boolean flag = true;`

## Operadores Aritméticos em Java

Os operadores aritméticos são usados para realizar operações matemáticas básicas.

1. **+ (Adição)**: Soma dois valores.
    - Exemplo: `int soma = 10 + 5; // soma será 15`

2. **- (Subtração)**: Subtrai o segundo valor do primeiro.
    - Exemplo: `int diferenca = 10 - 5; // diferenca será 5`

3. **\* (Multiplicação)**: Multiplica dois valores.
    - Exemplo: `int produto = 10 * 5; // produto será 50`

4. **/ (Divisão)**: Divide o primeiro valor pelo segundo.
    - Exemplo: `int quociente = 10 / 5; // quociente será 2`

5. **% (Módulo)**: Retorna o resto da divisão do primeiro valor pelo segundo.
    - Exemplo: `int resto = 10 % 3; // resto será 1`

6. **++ (Incremento)**: Incrementa o valor de uma variável em 1.
    - Exemplo: `int i = 5; i++; // i será 6`

7. **-- (Decremento)**: Decrementa o valor de uma variável em 1.
    - Exemplo: `int i = 5; i--; // i será 4`

## Operadores Lógicos em Java

Os operadores lógicos são usados para realizar operações lógicas entre expressões booleanas. 

1. **&& (E lógico)**: Retorna `true` se ambas as expressões forem verdadeiras.
    - Exemplo: `boolean result = (5 > 3) && (10 < 20); // result será true`

2. **|| (OU lógico)**: Retorna `true` se pelo menos uma das expressões for verdadeira.
    - Exemplo: `boolean result = (5 > 3) || (10 > 20); // result será true`

3. **! (NÃO lógico)**: Inverte o valor da expressão booleana.
    - Exemplo: `boolean result = !(5 > 3); // result será false`

4. **^ (OU exclusivo)**: Retorna `true` se as expressões forem diferentes (uma verdadeira e outra falsa).
    - Exemplo: `boolean result = (5 > 3) ^ (10 > 20); // result será true`