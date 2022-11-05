import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // system menu
        System.out.print("대상을 입력해주세요 : ");
        String target = scanner.next();
        System.out.print("프로그램명을 입력해주세요 : ");
        String program = scanner.next();

        // iv initialization
        int[][] answerChart = new int[7][5];
        int answer;
        double answered = 0.0;
        int add = 0;

        // input answers
        do {
            answered++;
            for (int i = 0; i < 7; i++) {
                System.out.print(i+1 + "번 문항 : ");

                try {
                    answer = scanner.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("정수입력 오류. 다시 입력");
                    scanner.next();
                    i--;
                    continue;
                }

                switch (answer) {
                    case 1:
                        answerChart[i][0]++;
                        break;
                    case 2:
                        answerChart[i][1]++;
                        break;
                    case 3:
                        answerChart[i][2]++;
                        break;
                    case 4:
                        answerChart[i][3]++;
                        break;
                    case 5:
                        answerChart[i][4]++;
                        break;
                    default:
                        System.out.println("범위(1~5)를 벗어났습니다.\n다시 입력하세요.");
                        i--;
                        continue;
                }
            }
            System.out.print("학생을 더 추가 = 0 / 종료 = -1 : ");
            add = scanner.nextInt();
        } while (add == 0);

        // output answers
        System.out.println();
        System.out.println("<<< 결과 >>>");
        System.out.println("대상 : " + target);
        System.out.println("프로그램 : " + program);
        System.out.println("인원 수 : " + answered);
        for (int i = 0; i < 7; i++) {
            System.out.print(i+1 + "번 문항 - ");
            for (int j = 0; j < 5; j++) {
                System.out.print(answerChart[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("<<< 만족 비율 >>>");
        for (int i = 0; i < 7; i++) {
            System.out.print(i+1 + "번 문항 - ");
            System.out.println(((answerChart[i][0]+answerChart[i][1])/answered)*100 + "%");
        }
        System.out.println();
    }
}
