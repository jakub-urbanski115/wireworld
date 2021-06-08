package Prefabricates;

import InPut.World;

public class And {
    public void draw_and(int x, int y){
        World world = new World();
        if(collision_and(x,y) == 0) {
            world.overwrite(x,y,3);
            world.overwrite(x+1,y,3);
            world.overwrite(x,y+1,3);
            world.overwrite(x,y+2,3);
            world.overwrite(x+1,y+2,3);
            world.overwrite(x+2,y+1,3);
            world.overwrite(x+3,y+1,3);
            world.overwrite(x,y+4,3);
            world.overwrite(x,y+5,3);
            world.overwrite(x,y+6,3);
            world.overwrite(x+1,y+4,3);
            world.overwrite(x+1,y+6,3);
            world.overwrite(x+2,y+5,3);
            world.overwrite(x+3,y+5,3);
            world.overwrite(x+3,y+2,3);
            world.overwrite(x+3,y+3,3);
            world.overwrite(x+3,y+4,3);
            world.overwrite(x+4,y+2,3);
            world.overwrite(x+4,y+4,3);
            world.overwrite(x+5,y+3,3);
        }
        else{
            System.out.println("Nastąpiła kolizja prefabrykatu 'And'");
        }
    }

    private int collision_and(int x, int y){
        World world = new World();
        int [][] copied = world.copy_world();
        if(copied[x][y] == 3) return 1;
        else if(copied[x+1][y] == 3) return 1;
        else if(copied[x][y+1] == 3) return 1;
        else if(copied[x][y+2] == 3) return 1;
        else if(copied[x+1][y+2] == 3) return 1;
        else if(copied[x+2][y+1] == 3) return 1;
        else if(copied[x+3][y+1] == 3) return 1;
        else if(copied[x][y+4] == 3) return 1;
        else if(copied[x][y+5] == 3) return 1;
        else if(copied[x][y+6] == 3) return 1;
        else if(copied[x+1][y+4] == 3) return 1;
        else if(copied[x+1][y+6] == 3) return 1;
        else if(copied[x+2][y+5] == 3) return 1;
        else if(copied[x+3][y+5] == 3) return 1;
        else if(copied[x+3][y+2] == 3) return 1;
        else if(copied[x+3][y+3] == 3) return 1;
        else if(copied[x+3][y+4] == 3) return 1;
        else if(copied[x+4][y+2] == 3) return 1;
        else if(copied[x+4][y+4] == 3) return 1;
        else if(copied[x+5][y+3] == 3) return 1;
        else{
            return 0;
        }
    }
}
