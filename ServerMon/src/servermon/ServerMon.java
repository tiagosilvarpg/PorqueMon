package servermon;

import java.rmi.Naming;

public class ServerMon {
    public ServerMon()
    {
        try {
            BattleInterface obj = new Battle( );
            Naming.rebind("//192.168.100.201/battle", obj);
        }
        catch( Exception e) {
            System.out.println("Erro: " + e);
        }
    }
    public static void main( String[] args )
    {
        new ServerMon( );
    }
}
