public class Books {

//public main (String []args) {
    public String author;
    public String bookName;
    public String genre;
    public int pageNumbers;
    public int yearOfIssue;
    private String email;
    private String name;
    private String surname;
    private String authorName;
    private String authorsurname;
    private String authorBirthday;
    private String authorCountry;
    private String pages;
    private String year;


    void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    void setBookName(String newBookName) {
        bookName = newBookName;
    }

    void setGenre(String newGenre) {
        genre = newGenre;
    }

    void setPageNumbers(int newPageNumber) {
        pageNumbers = newPageNumber;
    }

    void setYearOfIssue(int newYearOfIssue) {
        yearOfIssue = newYearOfIssue;
    }

    void compareAuthor(String Author)
    // найти методоы п. 3 и 4 задания


    //задание со *
    public void user(String email, String name, String surname) {
        this.email = email;
        this.name = name;
        this.surname = surname;
    }

    public void author(String authorName, String authorSurname, String authorBirthday, String authorCountry) {
        this.authorName = name;
        this.authorsurname = surname;
        this.authorBirthday = authorBirthday;
        this.authorCountry = authorCountry;
    }

    public void book (String author, String pages, String year) {
        this.author = author;
        this.pages = pages;
        this.year = year;
    }
}
}
