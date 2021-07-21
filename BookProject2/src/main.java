class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "Ivanov";
        book1.bookName = "Hello, Droid!";
        book1.genre = "Fantazy";
        book1.pageNumbers = 110;
        book1.yearOfIssue = 2020;
        System.out.println(book1.toString());

        Book book2 = new Book();
        book2.author = "Petrov";
        book2.bookName = "Keep in mind";
        book2.genre = "Psyhology";
        book2.pageNumbers = 666;
        book2.yearOfIssue = 2021;
        System.out.println(book2.toString());


    }}