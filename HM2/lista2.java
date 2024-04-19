package HM2;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int numero_entrada;
        int numero_processado;
    Scanner leitor = new Scanner(System.in);
        numero_entrada = leitor.nextInt();
        System.out.println("Insira o número desejado:");
        numero_processado = numero_entrada % 2;
        if (numero_processado == 0) {
            System.out.println(" O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int numero_entrada;
        int numero_fixo = 30;
        int distancia = 0;
    Scanner leitor = new Scanner(System.in);
        numero_entrada = leitor.nextInt();
        System.out.println("Insira um número de 0 a 100:");
        if (numero_entrada >= numero_fixo) {
            while (numero_entrada >= numero_fixo) {
                numero_fixo++;
                distancia++;
            distancia--;
            System.out.println("A distância é de:" + distancia); }
        else {
            distancia = numero_fixo - numero_entrada;
            System.out.println("A distância é de:" + distancia);
            }
        }
    }
}

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        double media;
        double media_processada;
    Scanner leitor = new Scanner(System.in);
        media = leitor.nextInt();
        System.out.println("Insira a média:");
        if (media <= 1.0) {
            if (media <= 0.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }

        } else if (media <= 2.0) {
            if (media <= 1.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 3.0) {
            if (media <= 2.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 4.0) {
            if (media <= 3.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 5.0) {
            if (media <= 4.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 6.0) {
            if (media <= 5.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 7.0) {
            if (media <= 6.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 8.0) {
            if (media <= 7.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 9.0) {
            if (media <= 8.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        } else if (media <= 10.0) {
            if (media <= 9.5) {
                media_processada = Math.floor(media);
                System.out.println(media_processada);
            } else {
                media_processada = Math.ceil(media);
                System.out.println(media_processada);
            }
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double b;
        double a;
        double c;
    Scanner leitor = new Scanner(System.in);
        a = leitor.nextInt();
        System.out.println("Insira a média:a");
        b = leitor.nextInt();
        System.out.println("Insira a média:b");
        c = leitor.nextInt();
        System.out.println("Insira a média:c");
        double[] numeros = {a, b, c};
        Arrays.sort(numeros);
        System.out.println(numeros);
    }
}

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        double salarioBruto;
        double horas;
        double salarioBrutoProcessado;
        double horasAdicionas;
        double salarioLiquido;
        double valorHoras;
        double valorHorasProcessadas;
        double horasBase;
        double horasProcessadas;
    Scanner leitor = new Scanner(System.in);
        salarioBruto = nextDouble();
        System.out.println("Insira o salario bruto:")
        horas = nextInt();
        System.out.println("Insira a quantidade de horas trabalhadas:")
        if (salarioBruto <= 800.00){
            if (160 < horas){
                horasAdicionais = horas - 160;
                valorHoras = salarioBruto / horas;
                horasBase = valorHoras * 160;
                valorHorasProcessadas = valorHoras * 1.5;
                horasProcessadas = valorHorasProcessadas * horasAdicionas;
                salarioLiquido = horasProcessadas + horasBase;
                System.out.println("O salario liquido é de:" + salarioLiquido); 
            }else{
                salarioLiquido = salarioBruto
                System.out.println("O salario liquido é de:" + salarioLiquido)}}
        else if (800.00 <= salarioBruto <= 1600.00){
            if (160 < horas) {
                horasAdicionais = horas - 160;
                valorHoras = salarioBruto / horas;
                horasBase = valorHoras * 160;
                valorHorasProcessadas = valorHoras * 1.5;
                horasProcessadas = valorHorasProcessadas * horasAdicionas;
                salarioBrutoProcessado = horasProcessadas + horasBase;
                salarioLiquido = salarioBrutoProcessado * 0.87;
                System.out.println("O salario liquido é de:" + salarioLiquido);}
            else {
                salarioLiquido = salarioBruto * 0.87;
                System.out.println("O salario liquido é de:" + salarioLiquido);
            }
        } 
        }else

    {
        if (160 < horas) {
            horasAdicionais = horas - 160;
            valorHoras = salarioBruto / horas;
            horasBase = valorHoras * 160;
            valorHorasProcessadas = valorHoras * 1.5;
            horasProcessadas = valorHorasProcessadas * horasAdicionas;
            salarioBrutoProcessado = horasProcessadas + horasBase;
            salarioLiquido = salarioBrutoProcessado * 0.87;
            System.out.println("O salario liquido é de:" + salarioLiquido);
        } else {
            salarioLiquido = salarioBruto * 0.87;
            System.out.println("O salario liquido é de:" + salarioLiquido);
        }

    }
}