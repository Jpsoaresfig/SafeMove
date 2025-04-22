import java.util.Scanner;

public class TesteRhua {
    public static void main(String[] args) {
        //faça um input de um aluno recebendo a nota e o nome
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        //diga se ele foi aprovado (7) ou se foi reprovado e caso seja reprovado diga o quanto falta para passar    
        if (nota >= 7) {
            System.out.println(nome + " foi aprovado!");
        } else {
            double falta = 7 - nota;
            System.out.println(nome + " foi reprovado! Falta " + falta + " para passar.");
        }sc.close();
    }
}