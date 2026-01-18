import singleton.DatabaseConnection;

public class Main4 {
    private static DatabaseConnection db4;
    public static void main(String[] args) {
        db4 = DatabaseConnection.getInstance();
        System.out.println(db4);
    }

}
