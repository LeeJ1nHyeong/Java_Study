package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        // 다음 코드를 참고하여 상속관계의 클래스 만들기
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
