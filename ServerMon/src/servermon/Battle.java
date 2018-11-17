/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermon;

import java.rmi.RemoteException;

/**
 *
 * @author Tiago
 */
public class Battle extends java.rmi.server.UnicastRemoteObject implements BattleInterface{
    public Team[] team;
    public boolean teamsSet;
    public int turn;
    public Move[] move;
    
    public Battle()throws  RemoteException{
        super();
    }
    @Override
    public void SelectMove(int source, int move)throws RemoteException{
        
    }
    @Override
    public void SelectPokemon(int player, int pokemon) throws  RemoteException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    @Override
    public String Status() throws  java.rmi.RemoteException{
        return "online";
        //return team[0].pokemon[0].toString();
    }

    @Override
    public void DefineTeam(String team, String player) throws RemoteException {
        int t=0;
        if (this.team[t]!=null)
            t=1;
        
    }
}
