package Prefabricates;

import InPut.World;

public class And {
    public void draw_and(int x, int y){
        World world = new World();
        if(collision_and(x,y) == 0) {
            world.overwrite(x,y,3);
            for(int i = 1; i < 11; i++) {
                world.overwrite(x + i, y, 3);
            }
            world.overwrite(x,y+3,3);
            world.overwrite(x+1,y+3,3);
            world.overwrite(x+2,y+3,3);
            world.overwrite(x+3,y+3,3);
            world.overwrite(x+4,y+4,3);
            world.overwrite(x+4,y+5,3);
            world.overwrite(x+4,y+6,3);
            world.overwrite(x+5,y+7,3);
            world.overwrite(x+6,y+6,3);
            world.overwrite(x+6,y+5,3);
            world.overwrite(x+6,y+4,3);
            world.overwrite(x+7,y+3,3);
            world.overwrite(x+8,y+3,3);
            world.overwrite(x+8,y+4,3);
            world.overwrite(x+8,y+2,3);
            world.overwrite(x+9,y+3,3);
            world.overwrite(x+10,y+2,3);
            world.overwrite(x+10,y+4,3);
            world.overwrite(x+11,y+5,3);
            world.overwrite(x+12,y+5,3);
            world.overwrite(x+12,y+6,3);
            world.overwrite(x+12,y+4,3);
            world.overwrite(x+13,y+5,3);
            world.overwrite(x+11,y+1,3);
            world.overwrite(x+12,y+1,3);
            world.overwrite(x+13,y+1,3);
            world.overwrite(x+14,y+2,3);
            world.overwrite(x+14,y+3,3);
            world.overwrite(x+14,y+4,3);
            world.overwrite(x+14,y+6,3);
            world.overwrite(x+15,y+6,3);
            world.overwrite(x+16,y+5,3);
            world.overwrite(x+17,y+4,3);
            world.overwrite(x+18,y+3,3);
        }
        else{
            System.out.println("Nastąpiła kolizja prefabrykatu 'And'");
        }
    }

    private int collision_and(int x, int y){
        World world = new World();
        int [][] copied = world.copy_world();
        if(copied[x][y] == 3) return 1;
        for(int i = 1; i < 11; i++) {
            if (copied[x + i][y] == 3) return 1;
        }
        if(copied[x][y+3]==3)  return 1;
        else if(copied[x+1][y+3]==3)  return 1;
        else if(copied[x+2][y+3]==3)  return 1;
        else if(copied[x+3][y+3]==3)  return 1;
        else if(copied[x+4][y+4]==3)  return 1;
        else if(copied[x+4][y+5]==3)  return 1;
        else if(copied[x+4][y+6]==3)  return 1;
        else if(copied[x+5][y+7]==3)  return 1;
        else if(copied[x+6][y+6]==3)  return 1;
        else if(copied[x+6][y+5]==3)  return 1;
        else if(copied[x+6][y+4]==3)  return 1;
        else if(copied[x+7][y+3]==3)  return 1;
        else if(copied[x+8][y+3]==3)  return 1;
        else if(copied[x+8][y+4]==3)  return 1;
        else if(copied[x+8][y+2]==3)  return 1;
        else if(copied[x+9][y+3]==3)  return 1;
        else if(copied[x+10][y+2]==3)  return 1;
        else if(copied[x+10][y+4]==3)  return 1;
        else if(copied[x+11][y+5]==3)  return 1;
        else if(copied[x+12][y+5]==3)  return 1;
        else if(copied[x+12][y+6]==3)  return 1;
        else if(copied[x+12][y+4]==3)  return 1;
        else if(copied[x+13][y+5]==3)  return 1;
        else if(copied[x+11][y+1]==3)  return 1;
        else if(copied[x+12][y+1]==3)  return 1;
        else if(copied[x+13][y+1]==3)  return 1;
        else if(copied[x+14][y+2]==3)  return 1;
        else if(copied[x+14][y+3]==3)  return 1;
        else if(copied[x+14][y+4]==3)  return 1;
        else if(copied[x+14][y+6]==3)  return 1;
        else if(copied[x+15][y+6]==3)  return 1;
        else if(copied[x+16][y+5]==3)  return 1;
        else if(copied[x+17][y+4]==3)  return 1;
        else if(copied[x+18][y+3]==3)  return 1;
        else{
            return 0;
        }
    }
}
