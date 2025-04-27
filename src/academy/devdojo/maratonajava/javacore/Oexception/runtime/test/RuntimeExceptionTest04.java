package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException"); // -> mais generica vem no final
        }

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, IOException{

    }
}
