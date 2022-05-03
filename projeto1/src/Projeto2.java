import java.sql.SQLOutput;
import java.util.Scanner;

public class Projeto2 {
    public static void main(String[] args) {
        Exe08();
    }

    public static void Exe01() {
        Scanner in = new Scanner(System.in);
        System.out.println("informe um valor!");
        int valor = in.nextInt();

        if (valor > 10) {
            System.out.println("É maior que 10");
        } else if (valor < 10) System.out.println("É menor que 10");
        else {
            System.out.println("Igual a 10");

        }
    }

    public static void Exe02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor!");
        int valor = in.nextInt();

        if (valor >= 0) {
            System.out.println("Valor é positivo");
        } else {
            System.out.println("Valor é negativo");
        }
    }

    public static void Exe03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas maças compradas:");
        int valor = in.nextInt();

        if (valor < 12) {
            System.out.println("Valor é " + valor * 1.30);
        } else {
            System.out.println("Valor é " + valor * 1.0);
        }
    }

    public static void Exe04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int AnoNasc = in.nextInt();
        System.out.println("Qual o ano atual?");
        int AnoAtual = in.nextInt();

        if (AnoAtual - AnoNasc >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }

    public static void Exe05() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva um número");
        int PrimeiroN = in.nextInt();
        System.out.println("Escreva outro número");
        int SegundoN = in.nextInt();

        if (PrimeiroN > SegundoN) {
            System.out.println("O número maior é " + PrimeiroN);
        } else {
            System.out.println("O número maior é " + SegundoN);
        }
    }

    public static void Exe06() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva um número");
        int PrimeiroN = in.nextInt();
        System.out.println("Escreva outro número");
        int SegundoN = in.nextInt();

        if (PrimeiroN > SegundoN) {
            System.out.printf(SegundoN + " e " + PrimeiroN);
        } else {
            System.out.printf(PrimeiroN + " e " + SegundoN);
        }
    }

    public static void Exe07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Horário que começou");
        int Hinicio = in.nextInt();
        System.out.println("Horário que finalizou");
        int Hfim = in.nextInt();

        if (Hinicio > Hfim) {
            System.out.printf("Duração do jogo: %d", 24 - (Hinicio - Hfim));
        } else {
            System.out.printf("Duração do jogo: %d", Hfim - Hinicio);
        }
    }

    public static void Exe08() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de horas trabalhadas");
        int Htrabalhadas = in.nextInt();
        System.out.println("Salário por hora");
        int HSalario = in.nextInt();

        if (Htrabalhadas <= 40) {
            System.out.printf("Salário: %d", HSalario * Htrabalhadas);
        } else {
            System.out.printf("Salário: %.2f", HSalario * Htrabalhadas + (Htrabalhadas - 40) * 0.5);
        }
    }

    public static void Exe09() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nome");
        System.out.println("Altura");
        double Altura = in.nextDouble();
        System.out.println("Sexo");
        String Sexo = in.next();

        //M
        if (sexo = M)


    }
}


