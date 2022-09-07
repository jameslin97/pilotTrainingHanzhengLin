public class StaticBookSeller {

    public static class Book {
        public String id;
        public String isbn;
        public String name;
        public String author;
        public String publish_date;

        public Book(String id, String isbn, String name, String author, String publish_date){
            this.id = id;
            this.isbn = isbn;
            this.name= name;
            this.author = author;
            this.publish_date = publish_date;
        }

        public static void String sellBooks(String id, String isbn, String name, String author, String publish_date){
            StaticBookSeller.Book b1 = new StaticBookSeller.Book(id,isbn,name,author,publish_date);
            System.out.println(b1.id + " " + b1.isbn + " " + b1.name + " " + b1.author + " " + b1.publish_date);
        }

        public static void main(String[] args){
            StaticBookSeller.sellBooks("id1", "isbn1", "name1" , "author1" , "publish_date1")
        }
    }
}
