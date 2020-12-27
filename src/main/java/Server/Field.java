package Server;

import java.util.ArrayList;

public class Field {

    protected String color;
    protected Field[][] Fields;
    Boolean access = false;

    ArrayList<Field> fields = new ArrayList<Field>();

//    public Field(String color,Field[][] Fields) {
//        this.color = color;
//        this.Fields = Fields;
//        fields.add(this);
//    }

    public String color()
    {
        return color;
    }

    public Field[][] Fields()
    {
        return Fields;
    }

}
