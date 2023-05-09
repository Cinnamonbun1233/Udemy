package java_start.part_001.lesson_011.wrappers;

public class MainString {
    public static void main(String[] args) {
        String firstString = "ABC";
        String secondString = "ABC";
        String thirdString = new String("ABC");
        String fourthString = new String("ABC").intern();

        System.out.println(firstString == thirdString);
        System.out.println(firstString.equals(thirdString));
        System.out.println(firstString == secondString);
        System.out.println(firstString == fourthString);
    }
}