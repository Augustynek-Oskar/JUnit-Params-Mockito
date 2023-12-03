public class UpperCase {
    public static String getUpperCase (String text){
        try {
            if (text == null) return "text";
            if (text == "") throw new RuntimeException();

        } catch (NullPointerException e){
            System.out.println(e.getMessage());
            return "";

        } catch (RuntimeException e){
            System.out.println("Argument cannot be empty!");
            return "";
        }
        return text.toUpperCase();
    }
}
