import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Sentence");
String sentence=sc.nextLine();
String[] words=sentence.trim().split("\\s+");
String reversed="";
for(int i=words.length-1;i>=0;i--){
    reversed+=words[i];
    if(i!=0){
        reversed+=" ";
}

    }
System.out.println("Reversed Sentence: "+reversed);
sc.close();
}
}
