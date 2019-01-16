import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

 */
public class CodingChallenge1 {

    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10,15,3,7));
        //List<Integer> nums = new ArrayList<>();

        int k = 17;
        if(solution(nums,k)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static boolean solution(List<Integer> numbers, int k ){
        List<Integer> numbs = new ArrayList<>(numbers);
        if(numbers.isEmpty()){
            return false;
        }
        for(int i=0;i<numbers.size()-1;i++){
            List<Integer> addList = add(numbers.get(i),numbs);
            System.out.println(" add list is " + addList.toString());
            if(addList.contains(k)){
                return true;
            }
        }
        return false;
    }
    public static List add(int a, List<Integer> numbers){
        numbers.remove((Integer)a);
        for(int i=0;i<numbers.size();i++){
            numbers.set(i, numbers.get(i) + a);
        }
        return numbers;
    }
}
