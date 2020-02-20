package basicWebAppInMaven.maven;


public class App 
{
    public static void main( String[] args )
    {
    	String res=test();
    	System.out.println("================"+res);
       
    }
    @SuppressWarnings("finally")
	public static String test() {
    	String ress="N";
    	try {
   		 System.out.println( "Hello World!" );
   		ress= "Y";
   		String a ="abc";
   		String ab ="ab"+"c";
   		System.out.println(a!=ab);
   		 return ress;
   	}
   	
   	catch(Exception e) {
   		System.out.println("e" +e.getMessage());
   		return ress;
   	}
   	
   	finally {
   		System.out.println("finally ........");
   		try {
      		 System.out.println( "Hello World!" );
      		return ress;
      	}
      	
      	catch(Exception e) {
      		System.out.println("e" +e.getMessage());
      		return ress;
      	}
   		
   	}
    }
}
