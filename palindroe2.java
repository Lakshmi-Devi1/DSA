public class palindrome{
    public static void main(String args[]){
        String name="mom";
        int left=0;
        int right=name.length()-1;
        while(left<right){
            if(name.charAt(left)!=name.charAt(right)){
                System.out.println("false");
            }
            left++;
            right--;
        }
        System.out.println("true");

    }
  

}
