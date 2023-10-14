public class Main {
    public static void main(String[] args) {
        // Tipos numéricos inteiros
        byte byteExemplo = 127;
        short shortExemplo = 32000;
        int intExemplo = 2147483647;
        long longExemplo = 9223372036854775807L;

        // Tipos numéricos de ponto flutuante
        float floatExemplo = 3.14f;
        double doubleExemplo = 3.14159265359;

        // Tipo char para caracteres Unicode
        char charExemplo = 'A';

        // Tipo booleano
        boolean booleanExemplo = true;

        // Impressão dos valores
        System.out.println("Exemplos de tipos primitivos em Java:");
        System.out.println("byte: " + byteExemplo);
        System.out.println("short: " + shortExemplo);
        System.out.println("int: " + intExemplo);
        System.out.println("long: " + longExemplo);
        System.out.println("float: " + floatExemplo);
        System.out.println("double: " + doubleExemplo);
        System.out.println("char: " + charExemplo);
        System.out.println("boolean: " + booleanExemplo);

        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);

        boolean x = true;
        boolean y = false;

        // Operador lógico AND (E)
        boolean andResultado = x && y;
        System.out.println("x && y: " + andResultado); // Saída: false

        // Operador lógico OR (OU)
        boolean orResultado = x || y;
        System.out.println("x || y: " + orResultado); // Saída: true

        // Operador lógico NOT (NÃO)
        boolean notResultadoX = !x;
        boolean notResultadoY = !y;
        System.out.println("!x: " + notResultadoX); // Saída: false
        System.out.println("!y: " + notResultadoY); // Saída: true

        // Operador lógico XOR (OU exclusivo)
        boolean xorResultado1 = x ^ x;
        boolean xorResultado2 = x ^ y;
        System.out.println("x ^ x: " + xorResultado1); // Saída: false
        System.out.println("x ^ y: " + xorResultado2); // Saída: true

        int resultado1 = 10 + 5 * 2; // A multiplicação tem precedência, então é avaliada primeiro
        int resultado2 = (10 + 5) * 2; // Usamos parênteses para alterar a precedência

        System.out.println("10 + 5 * 2 = " + resultado1); // Saída: 20
        System.out.println("(10 + 5) * 2 = " + resultado2);

        // Exemplo de criação de Strings
        String nome = "João";
        String sobrenome = "Silva";

        // Exemplo de concatenação de Strings
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome Completo: " + nomeCompleto);

        // Exemplo de uso de Text Block
        String mensagem = """
                        Olá, João!
                        Espero que você esteja bem.
                        Tenha um ótimo dia!""";
        System.out.println(mensagem);
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
        String nomeMaria = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nomeMaria, idade, valor));
        String numeroStr = "42";
        int numeroInt = Integer.parseInt(numeroStr);
        double numeroDouble = Double.parseDouble(numeroStr);

        System.out.println("String para int: " + numeroInt);
        System.out.println("String para double: " + numeroDouble);

        // Convertendo int e double para String
        int outroNumeroInt = 42;
        double outroNumeroDouble = 3.14;

        String numeroStrInt = String.valueOf(outroNumeroInt);
        String numeroStrDouble = String.valueOf(outroNumeroDouble);

        System.out.println("int para String: " + numeroStrInt);
        System.out.println("double para String: " + numeroStrDouble);

        // Convertendo double para int e vice-versa
        double maisUmNumeroDouble = 7.5;
        int maisUmNumeroInt = (int) maisUmNumeroDouble; // Conversão de double para int

        System.out.println("double para int: " + maisUmNumeroInt);

        int maisUmOutroNumeroInt = 25;
        double maisUmOutroNumeroDouble = (double) maisUmOutroNumeroInt; // Conversão de int para double

        System.out.println("int para double: " + maisUmOutroNumeroDouble);
    }





}

