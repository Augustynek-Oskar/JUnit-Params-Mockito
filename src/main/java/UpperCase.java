public class UpperCase {
    public static void main(String[] args) {
        getUpperCase("");
    }
    public static String getUpperCase (String text){
            if (text == null) throw new NullPointerException("Text cannot be null!");
            else if (text == "") throw new RuntimeException("Text cannot be empty!");
            else return text.toUpperCase();
    }
}
