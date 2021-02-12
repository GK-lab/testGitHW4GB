package lessonA3;

public class PhoneBookReader {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.add("Саша", "43893261469");
        book.add("Катя", "038847589199");
        book.add("Лена", "391875481384");
        book.add("Катя", "0397432462811");

        System.out.println(book.getNumber("Саша"));
        System.out.println(book.getNumber("Катя"));
        System.out.println(book.getNumber("Лена"));
    }
}
