//TO REVERSE A STRING

public class ReverseString{
public static void main(String args[]){
String str = "Java";
String reverseStr = "";
Char c;
for(int i=0; i<str.length();i++){
c = str.charAt(i);
b = c + reverseStr;
System.out.print(b);
}
}