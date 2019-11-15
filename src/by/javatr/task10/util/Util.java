package by.javatr.task10.util;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class Util {
    public static void functionValue(double startOfSegment, double endOfSegment, double step){
        if(startOfSegment<endOfSegment) {
            System.out.printf("%-15s %-15s %n", "Argument value", "Function value");
            System.out.println("__________________________________");
            double x;
            for (double i = startOfSegment; i <= endOfSegment; i = i + step) {
                x = Math.tan(i);
                System.out.printf("%-15.3f %-15.3f %n", i, x);
            }
        }
        else{
            System.out.println("Segment entered incorrectly");
        }
    }
}
