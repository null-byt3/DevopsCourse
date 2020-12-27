public class Hello {
    public static void main(String[] args) {

        String text = "Goodbye Java! Good Riddance";
        
        while (text.length() > 0) {
            System.out.println(text);
            text = text.substring(0, text.length() - 1);
        }
    }
}