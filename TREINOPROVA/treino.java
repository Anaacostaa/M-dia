import java.lang.management.ThreadInfo;
import java.util.Scanner;

public class treino{
public static void main(String[] args) {
    Float nota1,nota2,media,rec;
    String nome;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o nome: ");
    nome = ler.nextLine();
    System.out.println("Digite nota 1: ");
    nota1 = ler.nextFloat();
    System.out.println("Digite nota 2: ");
    nota2= ler.nextFloat();
    media=(nota1+nota2)/2;
    if (media >= 6) {
        System.out.println(nome+" foi aprovado com média "+media);
    }
     if (media < 6) {
        System.out.println(nome+" ficou em recuperação com média "+media);
        System.out.println("Digite nota da recuperação: ");
        rec = ler.nextFloat();
        if (rec >= 6) {
        System.out.println(nome+" foi aprovado na recuperação com nota "+rec);   
        } else {
            System.out.println(nome+" foi reprovado com nota "+rec);   
        }
    }



    
}
}