//���������o�v���O����

import java.util.Scanner;

public class Root {
    public static void main(String[] args){
        //double a = Double.parseDouble(args[0]);   ���s����[java �N���X�� ���l]�Ɠ��͂���ƁA���l��args[0]�ɑ�������B
        double a = 0.0;
        double right = 0.0;
        double left = 0.0;
        double mid = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("�������𓱏o���������l����͂��Ă��������B�@");
        a = sc.nextDouble();
        sc.close();
        right = a;

        if(!(right > 0.0)){
            System.out.println("Error!");
            System.exit(0);
        }

        for(int i = 0; i < 1000; i++){
            mid = (left + right) / 2;
            if(mid * mid - a < 0){
                left = mid;
            }else{
                right = mid;
            }
        }
        
        System.out.println("root: " + mid);
    }
}