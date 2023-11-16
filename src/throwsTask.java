import java.util.Objects;
import java.util.Scanner;

public class throwsTask {
    boolean bool = true;
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );

        while (bool){
            try{
                String key = myScanner.next();
                printDetails( key );
            }
            catch (Exception e){
                System.out.println("Key set to empty string. Try again");
            }
        }

    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key) throws Exception {
        if(Objects.equals(key, "hi")) {
            throw new Exception( "Key set to empty string" );
        }
        bool = false;
        return "data for " + key;
    }
}