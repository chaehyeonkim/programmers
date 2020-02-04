package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int answers[]= {1,2,3,4,5};
		int ans[]=solution(answers);
		/*
		 * for(int i=0;i<ans.length;i++) { System.out.println(ans[i]); }
		 */
		

	}
	public static int[] solution(int[] answers) {
		int []student1= {1,2,3,4,5};
		int []student2= {2, 1, 2, 3, 2, 4, 2, 5};
		int []student3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int score[]=new int[3];
		
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==student1[i%5])
				score[0]++;
			if(answers[i]==student2[i%8])
				score[1]++;
			if(answers[i]==student3[i%10])
				score[2]++;
		}
		int max=Math.max(score[0], Math.max(score[1], score[2]));
		 ArrayList<Integer> tmp = new ArrayList<>();

	      for (int i = 0; i < score.length; i++) {
	         if (max == score[i]) {
	            tmp.add(i+1);
	         }
	      }
	        
	      int[] answer = new int[tmp.size()];
	        
	      for (int i = 0; i < tmp.size(); i++) {
	    	  answer[i] = tmp.get(i);
	      }
	        return answer;

    }

}
