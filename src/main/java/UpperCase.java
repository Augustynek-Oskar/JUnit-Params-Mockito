public class UpperCase {
    public static void main(String[] args) {
        getUpperCase("");
    }
    public static String getUpperCase (String text){
            if (text == null) return "";
            if (text == "") return "";
            else return text.toUpperCase();
    }
}
