package beecrowd.beginner;



//Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, corresponding to 4 scores obtained by a student.
// Calculate the average with weights 2, 3, 4 e 1 respectively, for these 4 scores and print the message
// "Media: " (Average), followed by the calculated result. If the average was 7.0 or more, print the message "Aluno aprovado."
// (Approved Student). If the average was less than 5.0, print the message: "Aluno reprovado." (Reproved Student).
// If the average was between 5.0 and 6.9, including these, the program must print the message "Aluno em exame." (In exam student).
//
//In case of exam, read one more score. Print the message "Nota do exame: " (Exam score) followed by the typed score.
// Recalculate the average (sum the exam score with the previous calculated average and divide by 2) and print the message
// “Aluno aprovado.” (Approved student) in case of average 5.0 or more) or "Aluno reprovado." (Reproved student)
// in case of average 4.9 or less. For these 2 cases (approved or reproved after the exam) print the message "Media final: "
// (Final average) followed by the final average for this student in the last line.
//Input
//
//The input contains four floating point numbers that represent the students' grades.
//Output
//
//Print all the answers with one digit after the decimal point.

import java.util.Scanner;

public class Average3 {

    private static final int P1 = 2;
    private static final int P2 = 3;
    private static final int P3 = 4;
    private static final int P4 = 1;

    private static final double avarageToAprove = 7.0;
    private static final double avarageToReprove = 5.0;
    private static final double avarageToAproveOfNewExame = 5.0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var N1 = scanner.nextDouble();
        var N2 = scanner.nextDouble();
        var N3 = scanner.nextDouble();
        var N4 = scanner.nextDouble();

        var avarage = ((N1*P1) + (N2*P2) + (N3*P3) + (N4*P4))/(P1+P2+P3+P4);
        System.out.println("Media: " + format(avarage, 1));


        if(avarage >= avarageToAprove){
            System.out.println("Aluno aprovado.");
        }else if(avarage < avarageToReprove){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");
            var exameNote = scanner.nextDouble();
            System.out.println("Nota do exame: " + format(exameNote, 1));

            var newAvarage = (avarage + exameNote) / 2;

            if(newAvarage >= avarageToAproveOfNewExame){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + format(newAvarage, 1));
        }


    }

    static float format(double valor, int qtdCasas) {
        double fator = (double) Math.pow(10, qtdCasas);
        return (float) (Math.floor(valor * fator) / fator);
    }

}
