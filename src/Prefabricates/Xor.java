package Prefabricates;

import InPut.World;

public class Xor {
    public void draw_xor(int x, int y) {
        World world = new World();
        if (collision_xor(x, y) == 0) {
            world.overwrite(x,y+1,3);
            world.overwrite(x,y-1,3);
            world.overwrite(x+1,y+1,3);
            world.overwrite(x+1,y-1,3);
            world.overwrite(x+2,y-1,3);
            world.overwrite(x+2,y+1,3);
            world.overwrite(x+3,y+2,3);
            world.overwrite(x+3,y-2,3);
            world.overwrite(x+4,y-3,3);
            world.overwrite(x+4,y+3,3);
            world.overwrite(x+5,y+3,3);
            world.overwrite(x+5,y-3,3);
            world.overwrite(x+5,y-1,3);
            world.overwrite(x+5,y,3);
            world.overwrite(x+5,y+1,3);
            world.overwrite(x+6,y+1,3);
            world.overwrite(x+6,y-1,3);
            world.overwrite(x+6,y-2,3);
            world.overwrite(x+6,y+2,3);
            world.overwrite(x+7,y+1,3);
            world.overwrite(x+7,y,3);
            world.overwrite(x+7,y-1,3);
            world.overwrite(x+8,y+1,3);
            world.overwrite(x+8,y,3);
            world.overwrite(x+8,y-1,3);
            world.overwrite(x+9,y,3);
        }
        else{
            System.out.println("Nastąpiła kolizja prefabrykatu 'Xor'");
        }
    }

    private int collision_xor(int x, int y) {
        World world = new World();
        int[][] copied = world.copy_world();
        if (y < 3) return 1;
        else if (copied[x][y+1] == 3) return 1;
        else if (copied[x][y-1] == 3) return 1;
        else if (copied[x+1][y+1] == 3) return 1;
        else if (copied[x+1][y-1] == 3) return 1;
        else if (copied[x+2][y+1] == 3) return 1;
        else if (copied[x+2][y-1] == 3) return 1;
        else if (copied[x+3][y+2] == 3) return 1;
        else if (copied[x+3][y-2] == 3) return 1;
        else if (copied[x+4][y-3] == 3) return 1;
        else if (copied[x+4][y+3] == 3) return 1;
        else if (copied[x+5][y+3] == 3) return 1;
        else if (copied[x+5][y-3] == 3) return 1;
        else if (copied[x+5][y-1] == 3) return 1;
        else if (copied[x+5][y] == 3) return 1;
        else if (copied[x+5][y+1] == 3) return 1;
        else if (copied[x+6][y+1] == 3) return 1;
        else if (copied[x+6][y-1] == 3) return 1;
        else if (copied[x+6][y-2] == 3) return 1;
        else if (copied[x+6][y+2] == 3) return 1;
        else if (copied[x+7][y-1] == 3) return 1;
        else if (copied[x+7][y] == 3) return 1;
        else if (copied[x+7][y+1] == 3) return 1;
        else if (copied[x+8][y-1] == 3) return 1;
        else if (copied[x+8][y] == 3) return 1;
        else if (copied[x+8][y+1] == 3) return 1;
        else if (copied[x+9][y] == 3) return 1;
        else{return 0;}
    }
}
