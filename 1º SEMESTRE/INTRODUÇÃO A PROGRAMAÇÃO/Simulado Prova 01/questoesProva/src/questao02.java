
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {

        // ate 29 min arredonda pra pra baixo
        // apos 30 min arredonda pra cima

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o horário de entrada");
        int entradaHora = entrada.nextInt();

        System.out.println("Informe o horário de saída");
        int saidaHora = entrada.nextInt();

        System.out.println("Informe os minutos de entrada");
        int entradaMinutos = entrada.nextInt();

        System.out.println("Informe os minutos de saída");
        int saidaMinutos = entrada.nextInt();

        if (entradaHora < 0 || entradaHora > 23) {
            System.out.println("Horário de entrada inválido");
        }

        if (saidaHora < 0 || saidaHora > 23) {
            System.out.println("Horário de saída inválido");
        }

        if (entradaMinutos < 0 || entradaMinutos > 59) {
            System.out.println("Minutos de entrada inválidos");
        }
        if (saidaMinutos < 0 || saidaMinutos > 59) {
            System.out.println("Minutos de saída inválidos");
        }

        double tarifa1Hora = 3.00;
        double tarifa2Horas = 6.00;
        double tarifa3Horas = 8.00;
        double tarifa4Horas = 11.50;

        int horasTotais = 0;
        int minutosTotais = 0;

if (entradaHora < saidaHora) {
            horasTotais = saidaHora - entradaHora;
}

if (entradaMinutos < saidaMinutos) {
            minutosTotais = saidaMinutos - entradaMinutos;

if (minutosTotais > 29) {
    horasTotais = horasTotais + 1;
}

        switch (horasTotais) {
            case 0:
                System.out.println("Sem tarifa para ser cobrado");
            case 1:
                System.out.println("Tarifa de 1 hora é igual a: " + tarifa1Hora);
                break;
            case 2:
                System.out.println("Tarifa de 1 hora é igual a: " + tarifa2Horas);
                break;
            case 3:
                System.out.println("Tarifa de 1 hora é igual a: " + tarifa3Horas);
                break;
            case 4:
                System.out.println("Tarifa de 1 hora é igual a: " + tarifa4Horas);
                break;
            default:
                System.out.println("Tarifa de " + horasTotais + " horas é igual a: " + (horasTotais - 4) * tarifa4Horas);
        }
        entrada.close();
    }
}}