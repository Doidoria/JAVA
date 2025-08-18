package Ch03;

import java.util.Scanner;

public class C06Ex연습 {

	public static void main(String[] args) {
		//5개의 정수값을 입력받아 int형 배열에 저장하고
		//최대값,최소값,전체합을 출력합니다.
		
		//5 명의 학생에 국영수점수를 입력받아 2차원배열 저장
		//각 학생의 국영수 점수의 합/평균 구하고
		//각 과목당 합 /평균 구해보세요
		
		Scanner sc=new Scanner(System.in);
		int score[][]=new int[5][3];
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 학생의 (국어, 수학, 영어) 점수 입력 : ",i+1);
			score[i][0]=sc.nextInt();
			score[i][1]=sc.nextInt();
			score[i][2]=sc.nextInt();
		}
		
		
		for(int i=0;i<score.length;i++) {
			int sum=score[i][0]+score[i][1]+score[i][2];
			System.out.printf("%d번째 학생의 총점 : %d\n",i+1,sum);
			double avg=(double)(sum/score[i].length);
			System.out.printf("%d번째 학생의 평균 : %.1f\n",i+1,avg);
			System.out.println("---------------");
		}
		
		int subject_sum[]=new int[3];
		for(int i=0;i<score[i].length;i++) { //i<3
			for(int j=0;j<score.length;j++) { //j<5
				subject_sum[i]+=score[j][i];		//subject_sum[0]~[2] <- score[0][0]
			}
		}
		double kogavg=(double)(subject_sum[0]/score.length);
		double mthavg=(double)(subject_sum[1]/score.length);
		double engavg=(double)(subject_sum[2]/score.length);
		System.out.printf("국어 총점 : %d, 국어 평균 : %.1f\n",subject_sum[0],kogavg);
		System.out.printf("수학 총점 : %d, 수학 평균 : %.1f\n",subject_sum[1],mthavg);
		System.out.printf("영어 총점 : %d, 영어 평균 : %.1f\n",subject_sum[2],engavg);
	}

}
