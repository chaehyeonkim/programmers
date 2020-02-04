package number_K;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int []array= {1, 5, 2, 6, 3, 7, 4};
		int commands[][]= {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(commands));
		int answer[]=solution(array,commands);
		System.out.println(Arrays.toString(answer));
		

	}
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start,end,k;
        for(int i=0;i<commands.length;i++) {   
            start=commands[i][0];
            end=commands[i][1];
            k=commands[i][2];
            System.out.println("hi");
            int tmp[]=new int[end-start+1];
            System.out.println(start);
            System.out.println("end "+ end);
            for(int j=start-1;j<end;j++){
                tmp[j+1-start]=array[j];
            }
            System.out.println("wow");
            System.out.println(Arrays.toString(tmp));
            Arrays.sort(tmp);
            System.out.println(Arrays.toString(tmp));
            answer[i]=tmp[k-1];
        }
        return answer;
    }
	

}
