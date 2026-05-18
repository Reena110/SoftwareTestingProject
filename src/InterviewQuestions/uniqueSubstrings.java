package InterviewQuestions;

public class uniqueSubstrings {
    public static void main(String[] args)
    {
        String s="eccba";
        int K=3;
        for(int i=0;i<=s.length()-K;i++)
        {
            String sub=s.substring(i,i+K);
            if(sub.charAt(0)!= sub.charAt(1) && sub.charAt(0)!=sub.charAt(2)&& sub.charAt(1)!=sub.charAt(2))
            {
                System.out.println(sub);
            }
        }
    }
}
