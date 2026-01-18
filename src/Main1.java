import singleton.DatabaseConnection;

public class Main1 {


    private static DatabaseConnection db1;
    public static void main(String[] args) {

         db1 = DatabaseConnection.getInstance();
        System.out.println(db1);
    }

}
