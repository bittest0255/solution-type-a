package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int Num[] = new int [3];

        int Chk[] = new int [3];

        int Answer , i , j, Strike , Ball , Cnt, Out;

        Random r = new Random();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            do {

                Answer = r.nextInt(1000);

                Num[0] = Answer / 100;

                Num[1] = (Answer / 10) % 10;

                Num[2] = Answer % 10;

                if (Num[0]!=Num[1] && Num[1]!=Num[2] && Num[0]!=Num[2]) break;

            }while(true);

            Cnt = 0;

            while(true) {

                Cnt = Cnt + 1;

                System.out.print(">");

                String  str;

                int n=0;

                str = scanner.nextLine();

                n = Integer.parseInt(str);

                if (str.length()!=3) {

                    System.out.println("3자리를 입력해 주세요.");

                    continue;   

                }

                Chk[0] = n / 100;

                Chk[1] = (n / 10) % 10;

                Chk[2] = n % 10;

                Strike = Ball = 0;

                for(i=0;i<3;i++) {

                    if (Num[i]==Chk[i]) Strike++;

                }

                for(i=0;i<3;i++) {

                    for(j=0;j<3;j++) {

                        if (i!=j && Num[i]==Chk[j]) Ball++;

                    }

                }

                Out = 3 - (Strike + Ball);
                System.out.println("S : " + Strike + " , B : " + Ball + " , O : " + Out);

                if (Strike==3) break;

            }

            System.out.print("(종료)");

            break;

        }       

	}
}