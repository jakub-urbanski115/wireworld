package Prefabricates;

import InPut.World;

public class Not {
    public void draw_not(int x, int y){
        World world = new World();
        if(collision_not(x,y) == 0) {
            world.overwrite(x,y,1);
            world.overwrite(x+1,y,1);
            world.overwrite(x+2,y,1);
            world.overwrite(x+3,y,1);
            world.overwrite(x+4,y-1,1);
            world.overwrite(x+4,y+2,1);
            world.overwrite(x+5,y-2,1);
            world.overwrite(x+5,y+1,1);
            world.overwrite(x+5,y+3,1);
            world.overwrite(x+6,y-2,1);
            world.overwrite(x+6,y+2,1);
            world.overwrite(x+7,y-2,1);
            world.overwrite(x+7,y+2,1);
            world.overwrite(x+7,y,1);
            world.overwrite(x+8,y-1,1);
            world.overwrite(x+8,y,1);
            world.overwrite(x+8,y+1,1);
            world.overwrite(x+9,y,1);
            world.overwrite(x+9,y+2,1);
            world.overwrite(x+10,y+2,1);
            world.overwrite(x+11,y+1,1);
            world.overwrite(x+12,y,1);
            world.overwrite(x+13,y,1);
        }
        else{
            System.out.println("Nastąpiła kolizja prefabrykatów");
        }
    }


    private int collision_not(int x, int y){
        World world = new World();
        int [][] copied = world.copy_world();
        if(y<2) return 1;
        else if(copied[x][y] == 1) return 1;
        else if(copied[x+1][y] == 1) return 1;
        else if(copied[x+2][y] == 1) return 1;
        else if(copied[x+3][y] == 1) return 1;
        else if(copied[x+4][y-1] == 1) return 1;
        else if(copied[x+4][y+2] == 1) return 1;
        else if(copied[x+5][y-2] == 1) return 1;
        else if(copied[x+5][y+1] == 1) return 1;
        else if(copied[x+5][y+3] == 1) return 1;
        else if(copied[x+6][y-2] == 1) return 1;
        else if(copied[x+6][y+2] == 1) return 1;
        else if(copied[x+7][y-2] == 1) return 1;
        else if(copied[x+7][y+2] == 1) return 1;
        else if(copied[x+7][y] == 1) return 1;
        else if(copied[x+8][y-1] == 1) return 1;
        else if(copied[x+8][y] == 1) return 1;
        else if(copied[x+8][y+1] == 1) return 1;
        else if(copied[x+9][y] == 1) return 1;
        else if(copied[x+9][y+2] == 1) return 1;
        else if(copied[x+10][y+2] == 1) return 1;
        else if(copied[x+11][y+1] == 1) return 1;
        else if(copied[x+12][y] == 1) return 1;
        else if(copied[x+13][y] == 1) return 1;
        else{return 0;}
    }
}
