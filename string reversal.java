public class reversal {
    //reversing of the string in java
    //we can use the traditional for loop
    //we can also use the string biilder format
    public static void main(String args[]){
        //"lak"==>"kal"
        //using traditional for loop
        String reverse="";
        String name="lakshmi";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }   
}
