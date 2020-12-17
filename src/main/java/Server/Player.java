package Server;

import Server.Server;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.tuple.Pair;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String color;


    Pair <Integer, Integer> ans = new Pair <Integer, Integer> ();

    private Player(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void doMove(String color,int x, int y)
    {
        if(usedFields.contains(x,y))
    }

}
