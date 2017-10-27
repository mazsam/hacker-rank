public class MakingAnagram{

    public static void main (String[] args){
        String a = "cde";
        String b = "abc";        

        System.out.println(Solution(a,b));
    }

    public static int Solution(String a, String b){
        int[] counts = new int[20];
        for(char i : a.toCharArray()){
            counts[i-'a']++;
        }

        for(char i : b.toCharArray()){
            counts[i-'a']--;
        }

        int num = 0;

        for(int i : counts){
            num += Math.abs(i);
        }
        return num;
    }
}