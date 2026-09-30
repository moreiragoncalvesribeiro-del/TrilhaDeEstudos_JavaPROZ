
    import java.util.Scanner;
public class lotacaoDoOnibus {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ( "Qual é a quantidade de pessoas no onibus:");
        int passageiros = scanner.nextInt();
        System.out.println ( "Quantas pessoas que vão entrar:");
        int passageirosentrar = scanner.nextInt();

        int soma = passageirosentrar + passageiros;

if (soma <= 40) {
    System.out.println("onibus lotado!");
}else {
    System.out.println("assentos disponiveis");
}

scanner.close();
    }}