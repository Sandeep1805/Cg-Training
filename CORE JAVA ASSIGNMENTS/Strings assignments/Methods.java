
public class Methods {
      public static void main(String[] args)
      {
    	String str = "Java String pool refers to collection of Strings which are stored in heap memory";
         System.out.println("Lowercase of string is: "+str.toLowerCase());
         System.out.println("Uppercase of string is: "+str.toUpperCase());
         System.out.println("String replacing 'a' with '$' is: "+str.replace('a', '$'));
         if(str.contains("collection"))
        	 System.out.println("The word 'collection' is Found");
         else 
        	 System.out.println("The word 'collection' is Not found");
         
      
        String chk = "java string pool refers to collection of strings which are stored in heap memory";
        if(str.equals(chk))
        	System.out.println("same strings");
        else 
        	System.out.println("strings are not same");
        if(str.equalsIgnoreCase(chk))
        	System.out.println("same strings");
        else
    	System.out.println("same strings");

        

}
}