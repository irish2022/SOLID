
public class Calculator {  
  
    /** <summary> 
    * This Method is for all kind of users 
    * </summary> 
    * <param name="nums"></param> 
    * <returns></returns> 
     */  
    public int add(int[] nums) {  
        int sum = 0;  
        //Advanced for loop  
        for (int num : nums) {  
            sum = sum + num;  
        }  
        return sum;  
    }  
  
  
    /** <summary> 
     * This Method is for all kind of users 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public int substract(int a, int b) {  
        return a > b ? a - b : b - a;  
    }  
  
    /** <summary> 
     * This Method is for all kind of users 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public int multplicaton(int[] nums) {  
        int mul = 0;  
        //Advanced for loop  
        for (int num : nums) {  
            mul = mul * num;  
        }  
        return mul;  
    }  
  
    /** <summary> 
     * This Method is for all kind of users 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public int division(int a, int b) {  
        return a > b ? a / b : b / a;  
    }  
  
  
    /** <summary> 
     * This Method is for School students 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public double sinOf(double x) {  
        return Math.sin(x);  
    }  
  
    /** <summary> 
     * This Method is for School students 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public double cosOf(double x) {  
        return Math.cos(x);  
    }  
  
    /** <summary> 
     * This Method is for School students 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public double tanOf(double x) {  
        return Math.tan(x);  
    }  
  
    /** <summary> 
     * This Method is for Programmer 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public String convertHexToBinary(String input) {  
        return "Add logic to Convert to Binary for hex input :" + "input";  
    }  
  
    /** <summary> 
     * This Method is for Programmer 
     * </summary> 
     * <param name="nums"></param> 
     * <returns></returns> 
     */  
    public String convertBinaryToHex(String input) {  
        return "Add logic to Convert to hex for Binary input :" + "input";  
    }  
}  