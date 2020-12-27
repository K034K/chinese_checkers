package Server;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Player {

    private String color;
    private Field[][] Fields;

    ArrayList<Player> players = new ArrayList<Player>();

    public Player(String color) {
        this.color = color;
        if(!players.contains(color))
        {
            players.add(this);
        }
    }

//  Field field = new Field(color,Fields);

    public void doMove()
    {

    }

}
