public class Main {
    //Efimov DA
    public static void main(String[] args) {
        DataConverter dd = DataConverter.getLogger();
        dd.info("hello");
        System.out.println(dd.toBinary("Input.txt", "Output.txt", "UTF-8"));
        System.out.println(dd.toText("Output.txt", "Text.txt", "UTF-8"));
    }
}
