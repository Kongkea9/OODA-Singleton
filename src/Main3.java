import singleton.DatabaseConnection;

public class Main3 {

    private static DatabaseConnection db3;
    public static void main(String[] args) {
        db3 = DatabaseConnection.getInstance();
        System.out.println(db3);
    }
}
