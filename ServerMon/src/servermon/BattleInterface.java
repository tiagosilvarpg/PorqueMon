/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermon;

/**
 *
 * @author Tiago
 */
public interface BattleInterface extends java.rmi.Remote{
    public void DefineTeam(String team,String player) throws java.rmi.RemoteException;
    public void SelectMove(int player,int move) throws java.rmi.RemoteException;
    public void SelectPokemon(int player,int pokemon) throws java.rmi.RemoteException;
    public String Status() throws java.rmi.RemoteException;
}