package string;

public class ref {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", hello!");  
        System.out.println(sb);  
        
        sb.insert(2, "java");  
        System.out.println(sb);  
        
        sb.delete(2, 10);  
        System.out.println(sb);  
    }
}