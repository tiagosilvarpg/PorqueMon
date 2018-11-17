/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermon;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiago
 */
public class Move
{
    int priority,id,power,acc,pp;
    boolean special;
    String code,name,type,numsei,description;
    static ArrayList<Move> move;
    public Move(String input)
    {
        String[] values=input.split(";");  
        id=Integer.parseInt(values[0]);
        code=values[1];
        name=values[2];
        power=Integer.parseInt(values[4]);
        type=values[5];
        special=values[6].equals("Special");
        acc=Integer.parseInt(values[7]);
        pp=Integer.parseInt(values[8]);
        numsei=values[12];
        description=values[13];
    }
    public static void Init()
    {
        try
        {
            Path path=Paths.get("C:/wamp64/www/porquedex","moves.txt");
            Charset charset = Charset.forName("UNICODE");
            List<String> moveStrings=Files.readAllLines(path,charset);
            move=new ArrayList<>();
            for (String m : moveStrings) {
                Move.move.add(new Move(m));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
