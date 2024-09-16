public class reversal3 {
    //we have to reverse the given name and we also have to ignore the special characters
    public static void main(String args[]){
    String string="lakshmi-Devi";
    String ignore=string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    StringBuilder sb=new StringBuilder(ignore);
    String reversal=sb.reverse().toString();
    System.out.println(reversal);
}

    
}
