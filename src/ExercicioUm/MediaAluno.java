package ExercicioUm;

public class MediaAluno {
    public static void main(String[] args) {
        int nota1 = 8, nota2 = 6, nota3 = 7, nota4 = 5, media;
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >=7){
            System.out.print("Aluno aprovado!!");
        }else {
            System.out.print("Aluno reprovado!!");
        }

    }
}
