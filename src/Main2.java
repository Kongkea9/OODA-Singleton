import singleton.DatabaseConnection;

public class Main2 {

    private static DatabaseConnection db2;
    public static void main(String[] args) {
        db2 = DatabaseConnection.getInstance();
        System.out.println(db2);
    }

}
