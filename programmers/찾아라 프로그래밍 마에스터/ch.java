import java.util.Arrays;

public class ch {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);
        // 가장 큰 번호의 값구하기
        int[] temp = new int[nums[nums.length - 1] + 1];
        for(int i = 0; i < nums.length; i++){
            temp[nums[i]]++;
        }

        int cnt = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != 0) cnt++;
        }

        // 최대 개수는 N/2만큼
        answer = (nums.length / 2) >= cnt ? cnt : (nums.length / 2);

        return answer;

    }
}
