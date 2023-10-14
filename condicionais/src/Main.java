// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int idadeAluno = 16;
        char nota = 'B';

        // Exemplo de uso do if-else para verificar a idade do aluno
        if (idadeAluno >= 18) {
            System.out.println("O aluno é maior de idade.");
        } else {
            System.out.println("O aluno é menor de idade.");
        }

        // Exemplo de uso do switch para avaliar a nota do aluno
        switch (nota) {
            case 'A':
                System.out.println("Excelente! O aluno obteve uma nota A.");
                break;
            case 'B':
                System.out.println("Boa! O aluno obteve uma nota B.");
                break;
            case 'C':
                System.out.println("O aluno obteve uma nota C.");
                break;
            case 'D':
                System.out.println("Precisa melhorar! O aluno obteve uma nota D.");
                break;
            case 'F':
                System.out.println("Reprovado! O aluno obteve uma nota F.");
                break;
            default:
                System.out.println("Nota inválida.");
                break;
        }
    }
}