import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class JavaProgressivo {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //exe01();
        //exe02();
        //exe03();
        //exe04()
        //exe05();
        //exe06();
        //exe07();
        //exe08();
        //exe09();
        //exe10();
        //exe11();
        //exe12();
        //exe13();
        exe14();
    }

    public static void exe01() {
        System.out.println("Informe um número");
        String numero = String.valueOf(in.nextInt());
        String inverso = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            inverso = String.valueOf(numero.charAt(i));
            System.out.printf(String.valueOf(numero.charAt(i)));
        }
    }

    public static void exe02() {
        int maior = 0, menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (parada != 0) {
            System.out.println("Informe um número (0 para sair)");
            parada = in.nextInt();

            if (primeiro) {
                menor = parada;
                maior = parada;
                primeiro = false;

            } else {
                if (parada > maior) {
                    maior = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }
            }

        }
        System.out.println("Maior valor informado:" + maior);
        System.out.println("Menor valor informado:" + menor);
    }

    public static void exe03() {
        Random r = new Random();
        int randomico = r.nextInt(101);
        while (true) {
            System.out.println("Informe um número: ");
            int valorInformado = in.nextInt();

            if (valorInformado == randomico) {
                System.out.println("Acertou");
                break;
            } else if (valorInformado > randomico) {
                System.out.println("Chutou muito alto");
            } else {
                System.out.println("Chutou muito baixo");

            }
        }
    }

    public static void exe04() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.print("");
    }

    public static void exe05() {
        System.out.println("Digite algo");
        String algo = in.nextLine();
        System.out.println("Length: " + algo.length());
        System.out.println("Empty: " + algo.isEmpty());
        System.out.println("Uppercase: " + algo.toUpperCase());
        System.out.println("Lowercase: " + algo.toLowerCase());
    }

    public static void exe06() {
        System.out.println("Informe algo: ");
        String primeiro = in.nextLine();
        System.out.println("Informe outra coisa: ");
        String segundo = in.nextLine();

        //Compara se são iguais
        if (primeiro.equals(segundo)) {
            System.out.println("Iguais");

            //equalsignorecase = Ignora as maisculas
        } else if (primeiro.equalsIgnoreCase(segundo)) {
            System.out.println("São iguais idependente do texto");

        } else {
            System.out.println("Não igual");
        }
    }

    public static void exe07() {
        System.out.println("Digite uma palavra: ");
        String primeiro = in.nextLine();
        System.out.println("Digite outra palavra :");
        String segundo = in.nextLine();

        if (primeiro.contains(segundo)) {
            System.out.println(segundo + " faz parte " + primeiro);
        } else if (segundo.contains(primeiro)) {
            System.out.println(primeiro + " faz parte " + segundo);
        } else {
            System.out.println("Não faz parte");
        }
    }

    public static void exe08() {
        System.out.println("Digite uma palavra: ");
        String primeiro = in.nextLine();
        System.out.println("Digite outra palavra :");
        String segundo = in.nextLine();
        if (primeiro.startsWith(segundo)) {
            System.out.println(segundo + " é prefixo de " + primeiro);
        } else if (segundo.startsWith(primeiro)) {
            System.out.println(segundo + " é prefixo de " + primeiro);
        } else {
            System.out.println("As strings não se iniciam");
        }
    }

    public static void exe09() {
        System.out.println("Digite uma palavra: ");
        String primeiro = in.nextLine();
        System.out.println("Digite outra palavra :");
        String segundo = in.nextLine();
        if (primeiro.endsWith(segundo)) {
            System.out.println(segundo + " é sufixo de " + primeiro);
        } else if (segundo.endsWith(primeiro)) {
            System.out.println(segundo + " é sufixo de " + primeiro);
        } else {
            System.out.println("As strings não são sufixo uma da outra");
        }

    }

    // Escrever uma palavra e localizar onde ela começa
    public static void exe10() {
        System.out.println("Digite uma palavra: ");
        String primeiro = in.nextLine();
        System.out.println("Digite outra palavra :");
        String segundo = in.nextLine();

        //Hehahahahehe - ha = he'ha'hahahehe - 2
        // Lembrando que começa em 0 1 2 3....
        int posição = primeiro.indexOf(segundo);
        System.out.println("A posição de " + segundo + " em " + primeiro + " é " + posição);
    }

    public static void exe11() {
        // replace() - substituir
        //lala#lwve#-rwgra22lalang!#<3

        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    public static void exe12() {
        System.out.println("Informe a quantidade de números: ");

        // Se o usuario colocar 12, vou criar uma lista com 12 posições
        int nums = in.nextInt();
        int[] numeros = new int[nums];

        for (int i = 0; i < nums; i++) {

            System.out.println("Informe um número: ");
            numeros[i] = in.nextInt();
        }
        int somarPar = 0, somarImpar = 0;
        // ir até o maximo
        for (int valor : numeros) {

            // se é divisivel por 2 é par
            if (valor % 2 == 0) {
                somarPar += valor;
            } else {
                somarImpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: " + somarPar);
        System.out.println("Soma dos valores ímpares: " + somarImpar);
    }

    public static void exe13() {
        System.out.println("Informe a quantidade de palavras: ");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        in.nextLine();
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("Informe um número > 0: ");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exe14() {
        // take two integer lists as input and return a new list with all values of the first list that are not in the second list
        System.out.println("Informe a quantidade de números da primeira lista: ");
        int nums = in.nextInt();
        int[] numeros1 = new int[nums];
        for (int i = 0; i < nums; i++) {

            System.out.println("Informe um número: ");
            numeros1[i] = in.nextInt();

        }
        System.out.println("Informe outra quantidade de números para segunda lista: ");
        int nums2 = in.nextInt();
        int[] numeros2 = new int[nums2];
        for (int j = 0; j < nums; j++) {

            System.out.println("Informe um número: ");
            numeros2[j] = in.nextInt();
        }
        for(int valor1 : numeros1) {
            boolean achou = false;
            for(int valor2 : numeros2) {
            if(valor1 == valor2) {
                achou = true;
                break;
            }
            }
            if(!achou) {
                System.out.println(valor1);
            }
        }
    }
}
//public static void exe14() {
    /*write a program that allows a user to enter numbers save the numbers in an array. Ask the user now for two idices (position in the array
    swap the elements at these potions and print the resulting list. if the user enters a -1,
    stro and print the list*/
