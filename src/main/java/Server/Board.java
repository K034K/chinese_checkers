package Server;

public class Board {
    public class Field {
        Boolean access = false;
        String color;
    }

    Field[][] Fields = new Field[17][17];

    Board(){
        initBoard();
    };


    public void initBoard() {
        int start = 8;
        int counter = 1;
        for (int i = 0; i < Fields.length; i++) {
            int localStart = start;
            for (int j = 0; j < counter; j++) {
                Fields[i][localStart].access = true;
                Fields[i][localStart].color = "white";
                localStart += 2;
            }
            if (i < 9) {
                start--;
                counter++;
            } else {
                start++;
                counter--;
            }
        }
        initBoardPlayers();
    }
/*Initializing corners of board for functionality*/
    public void initBoardPlayers() {
        int start = 0;
        int width = 4;
        for (int i = 4; i < 9; i++) {
            for (int j = 0; j < width; j++) {
                Fields[i][start].access = true;
            }
            width--;
        }
        width = 1;
        for (int i = 9; i < 14; i++) {
            for (int j = 0; j < width; j++) {
                Fields[i][start].access = true;
            }
            width++;

        }
        start =13;
        width = 4;
        for (int i = 4; i < 9; i++) {
            for (int j = 0; j < width; j++) {
                Fields[i][start].access = true;
            }
            start++;
            width--;
        }
        start = 16;
        width = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < width; j++) {
                Fields[i][start].access = true;
            }
            width++;
            start--;
        }
    }


}
