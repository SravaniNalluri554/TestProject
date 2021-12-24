package com.vnr.demo.vnr_demo;

import com.vnr.demo.vnr_demo.module1.First;
import com.vnr.demo.vnr_demo.module1.Srp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Srp srp= new Srp("sravani", 10002);
        First fir=new First(12,'f');
        Srp.display();
        fir.show();
       singleResponsiblityTest();   
    }
    private static void singleResponsiblityTest()
    
    {
           
    	System.out.println( "singleResponsiblityTest" );
    }
}
