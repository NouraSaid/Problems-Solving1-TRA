public class WithoutEnd {
    public static void main(String[] args) {
        System.out.println(withoutEnd("Telecommunications "));  
         System.out.println(withoutEnd(" Regulatory "));  
          System.out.println(withoutEnd("Authority"));  
        
    }

    static String withoutEnd(String str) {
        
        if (str.length() >= 2) {
            
            return str.substring(1, str.length() - 1);
        } else {
           
            return "";
        }
    }
}
