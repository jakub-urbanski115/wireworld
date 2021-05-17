package Prefabricates;

import InPut.World;

public class And {
    public void draw_and(int x, int y){
        World world = new World();
        if(collision_and(x,y) == 0) {
            world.overwrite(x,y,1);
            world.overwrite(x+1,y,1);
            world.overwrite(x,y+1,1);
            world.overwrite(x,y+2,1);
            world.overwrite(x+1,y+2,1);
            world.overwrite(x+2,y+1,1);
            world.overwrite(x+3,y+1,1);
            world.overwrite(x,y+4,1);
            world.overwrite(x,y+5,1);
            world.overwrite(x,y+6,1);
            world.overwrite(x+1,y+4,1);
            world.overwrite(x+1,y+6,1);
            world.overwrite(x+2,y+5,1);
            world.overwrite(x+3,y+5,1);
            world.overwrite(x+3,y+2,1);
            world.overwrite(x+3,y+3,1);
            world.overwrite(x+3,y+4,1);
            world.overwrite(x+4,y+2,1);
            world.overwrite(x+4,y+4,1);
            world.overwrite(x+5,y+3,1);
        }
        else{
            System.out.println("Nastąpiła kolizja prefabrykatów");
        }
    }

    public int collision_and(int x, int y){
        World world = new World();
        int [][] copied = world.copy_world();
        if(copied[x][y] == 1) return 1;
        else if(copied[x+1][y] == 1) return 1;
        else if(copied[x][y+1] == 1) return 1;
        else if(copied[x][y+2] == 1) return 1;
        else if(copied[x+1][y+2] == 1) return 1;
        else if(copied[x+2][y+1] == 1) return 1;
        else if(copied[x+3][y+1] == 1) return 1;
        else if(copied[x][y+4] == 1) return 1;
        else if(copied[x][y+5] == 1) return 1;
        else if(copied[x][y+6] == 1) return 1;
        else if(copied[x+1][y+4] == 1) return 1;
        else if(copied[x+1][y+6] == 1) return 1;
        else if(copied[x+2][y+5] == 1) return 1;
        else if(copied[x+3][y+5] == 1) return 1;
        else if(copied[x+3][y+2] == 1) return 1;
        else if(copied[x+3][y+3] == 1) return 1;
        else if(copied[x+3][y+4] == 1) return 1;
        else if(copied[x+4][y+2] == 1) return 1;
        else if(copied[x+4][y+4] == 1) return 1;
        else if(copied[x+5][y+3] == 1) return 1;
        else{
            return 0;
        }
    }
}
