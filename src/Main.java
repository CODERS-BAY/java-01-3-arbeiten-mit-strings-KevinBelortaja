public class Main {
    public static void main(String[] args) {

        String text = " Hello World! ";
        System.out.println(text+" "+text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String replacetext = text.replace("World", "Codersbay");

        System.out.println(replacetext);

        System.out.println(text.stripLeading());

        System.out.println((text+"\n").repeat(15));

    }
}