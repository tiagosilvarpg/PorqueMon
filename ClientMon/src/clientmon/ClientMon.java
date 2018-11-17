package clientmon;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
public class ClientMon {
    public static void main( String[] args ) {
        try {
            BattleInterface battle = (BattleInterface) Naming.lookup("//192.168.100.201/battle");
            System.out.println( battle.Status());
        }
        catch ( MalformedURLException murle ) {
            System.out.println( );
            System.out.println( "MalformedURLException" );
            System.out.println( murle );
        }
        catch ( RemoteException re ) {
            System.out.println( );
            System.out.println( "RemoteException" );
            System.out.println( re );
        }
        catch ( NotBoundException nbe ) {
            System.out.println( );
            System.out.println( "NotBoundException" );
            System.out.println( nbe );
        }
        catch ( java.lang.ArithmeticException ae ) {
            System.out.println( );
            System.out.println( "java.lang.ArithmeticException" );
            System.out.println( ae );
        }
    }
}
