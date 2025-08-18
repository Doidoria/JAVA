package Ch03;

import java.util.Scanner;

public class C06Ex {

	public static void main(String[] args) {
		//5개의 정수값을 입력받아 int형 배열에 저장하고
		//최대값,최소값,전체합을 출력합니다.
		
		//5 명의 학생에 국영수점수를 입력받아 2차원배열 저장
		//각 학생의 국영수 점수의 합/평균 구하고
		//각 과목당 합 /평균 구해보세요
		
		Scanner sc=new Scanner(System.in);
		int score[][]=new int[5][3];
		
		//학생 순차별 국영수 점수 입력
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d 번째 학생 국영수 입력 : \n",i+1);
			score[i][0]=sc.nextInt();
			score[i][1]=sc.nextInt();
			score[i][2]=sc.nextInt();
		}
		
		for(int i=0;i<score.length;i++) {
			int sum=score[i][0]+score[i][1]+score[i][2];
			System.out.printf("%d번째 학생 총점 : %d\n",i+1,sum);
			double avg=(double)(sum/score[i].length);
			System.out.printf("%d번째 학생 평균 : %.1f\n",i+1,avg);
			System.out.println("---------------------");
		}
		
		int subject_sum[]=new int[3];
		for(int i=0;i<score[i].length;i++) {
			for(int j=0;j<score.length;j++) {
				subject_sum[i]+=score[j][i];
			}
		}
		double koravg=(double)(subject_sum[0]/score.length);
		double mthavg=(double)(subject_sum[1]/score.length);
		double Engavg=(double)(subject_sum[2]/score.length);
		System.out.printf("국어 총점 : %d, 국어 평균 : %.1f\n",subject_sum[0],koravg);
		System.out.printf("수학 총점 : %d, 수학 평균 : %.1f\n",subject_sum[1],mthavg);
		System.out.printf("영어 총점 : %d, 영어 평균 : %.1f\n",subject_sum[2],Engavg);

	}

}
