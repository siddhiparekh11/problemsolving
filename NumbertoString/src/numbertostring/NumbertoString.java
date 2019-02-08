
package numbertostring;

public class NumbertoString {

  public static void main(String[] args) {
    
    System.out.println(convert(999999999));
    
  }
  
  public static String convert(int num){
    String[] blwTwenty = {"", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    String[] blwHundred = { "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };   
    
    if(num<20)
      return blwTwenty[num];
    
    if(num<100)
      return blwHundred[num/10] + blwTwenty[num%10];
    
    if(num<1000)
      return blwTwenty[(num/100)] + "hundred" + convert(num%100);
    
   if(num<1000000)
     return convert(num/1000) + "thousand" + convert(num%1000);
    if (num < 1000000000) 
     return convert(num / 1000000) + " million" + ((num % 1000000 != 0) ? " " : "") + convert(num % 1000000);      

    return convert(num / 1000000000) + " billion"  + ((num % 1000000000 != 0) ? " " : "") + convert(num % 1000000000);
  }
  
}
