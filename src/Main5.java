import singleton.DatabaseConnection;

public class Main5 {

    private static DatabaseConnection db5;
    public static void main(String[] args) {
        db5 = DatabaseConnection.getInstance();
        System.out.println(db5);
    }


}




