public class Length {
    public static int getTextLength(String text){
        if (text == null) return 0;
        if (text == "") return 0;
        return text.length();
    }
}
