package ru.javacore;

import ru.javacore.domain.example.com.Tester;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Ктото!" );
        System.out.println(Tester.sum(453.4623, 365.2346));
        Tester tester = new Tester("Алексей", "Столпнер");
        System.out.println(tester);
    }
}
