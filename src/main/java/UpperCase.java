public class UpperCase {
    public static String getUpperCase (String text){
        try{
            if (text == null) throw new NullPointerException();
            if (text == "") throw new RuntimeException();
        }
        catch (NullPointerException e){
            System.out.println("Illegal argument!");
        }
        catch (RuntimeException e){
            System.out.println("String cannot be empty!");
        }


        return text.toUpperCase();
    }
}
