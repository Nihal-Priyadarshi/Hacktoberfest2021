public class JavaShortExample1 {  
    static int i=1;  
    public static void main(String[] args) {  
        Short short1 = 500 ;  
        Short short2 = 12 ;  
        Short short3=12;  
       // It compares two Short objects numerically  
        int val = short1.compareTo(short2);  
        if (val>0) {  
            System.out.println(i++ + ". "+short1 + " is greater than " + short2);  
        }  
        else{  
            System.out.println(i++ + ". "+short2 + " is greater than " + short1);  
        }  
        //It is used check whether both short values are equal or not.  
        Boolean b1 = short3.equals(short2);  
        if (b1) {  
            System.out.println(i++ + ". "+short2 + " and " + short3 +" are equal.");  
        }  
        else{  
            System.out.println(i++ + ". "+short1 + " and " + short2 +" are not equal.");  
        }  
        //returns the value of this Short as a long  
        Long f3 = short2.longValue();  
        System.out.println(i++ + ". "+"Long value of "+short2+ " is : "+f3);  
        //Returns a string representation of the Short?s object  
        String f4 = short2.toString();  
        System.out.println(i++ + ". "+"String value of "+short2+ " is : "+f4);  
       //It returns a double value for this Short object  
        Double f5 = short1.doubleValue();  
        System.out.println(i++ + ". "+"Double value of "+short1+ " is : "+f5);  
    }  
}  
