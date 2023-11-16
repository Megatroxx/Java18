import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (ArithmeticException e){
            System.out.println("Ошибка деления на 0");
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка ввода");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally{
            System.out.println("finally worked");
        }

    }
}