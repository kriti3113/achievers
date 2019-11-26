import java.util.*; 
  
class pretopost { 
  
    public static boolean isOperator(char x) 
    { 
  
        switch (x) { 
        case '+': 
        case '-': 
        case '/': 
        case '*': 
            return true; 
        } 
        return false; 
    } 
  
   public  static String postToPre(String str) 
    { 
        Stack<String> s = new Stack<String>(); 
         int n = str.length(); 
        for (int i = 0; i < n; i++) { 
            if (isOperator(str.charAt(i))) { 
                String op1 = s.peek(); 
                s.pop(); 
                String op2 = s.peek(); 
                s.pop(); 
                String temp = str.charAt(i) + op2 + op1; 
                s.push(temp); 
                 } 
            else { 

                s.push(str.charAt(i) + ""); 
            } 
        }
     StringBuffer sb=new StringBuffer(s.peek());
        sb.reverse();
        String d=new String(sb);
        return d; 
    } 

    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("prefix of particular string is: " + postToPre(str)); 
    } 
} 
