
public class GradeAvg {
	public static void main(String[] args) {
		double quizScore1,quizScore2,quizScore3,testScore1,testScore2,testScoreAvg,quizScoreAvg;
		quizScore1 = 100.0;
		quizScore2 = 86.4;
		quizScore3 = 44.0;
		testScore1 = 95.5;
		testScore2 = 97.0;
		quizScoreAvg = quizScore1 + quizScore2 + quizScore3/3;
		testScoreAvg = testScore1 + testScore2/2;
		System.out.println("quizScore1  :" + quizScore1);
		System.out.println("quizScore2  :" + quizScore2);
		System.out.println("quizScore3  :" + quizScore3);
		System.out.println("testScore1  :" + testScore1);
		System.out.println("testScore2  :" + testScore2);
		System.out.println("quizScoreAvg  :" + quizScoreAvg);
		System.out.println("testScoreAvg  :" + testScoreAvg);
		 }
}