package PGame;

import InPut.World;

public class Game extends Thread{

    private int[][] tmpwrld;
    private int Xdim;
    private int Ydim;
    private int delay;

    private void get_data(World world){
       Xdim = world.getXdim();
       Ydim = world.getYdim();
       tmpwrld = world.copy_world();
    }
    public void world_loop(World world,int d){
        delay =d;
        get_data(world);
        for(int i = 0; i < Xdim; i++)
            for (int j = 0; j < Ydim; j++){
                int cae = count_electrons(i,j);
                int value= rules(tmpwrld[i][j],cae);
                world.overwrite(i,j,value);
            }
        try {
            sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("game delay exception");
        }

    }
    private int count_electrons(int i, int j){
        int cae=0;
        for(int l=i-1; l < i + 2; l++)
        {
            for(int k = j - 1; k < j + 2; k++)
            {
                if(k >= 0 && k < Ydim && l >= 0 && l < Xdim )//zachowanie na krawedziach
                {
                    if(tmpwrld[l][k]==1)
                        cae++;
                }
            }
        }
        return cae;
    }


    private int rules(int tpoc,int cae){
        switch (tpoc){
            case 1:
                return head();
            case 2:
                return tail();
            case 3:
                return cable(cae);
            default:
                return 0;
        }
    }
    private int head(){
        return 2;
    }

    private int tail(){
        return 3;
    }

    private int cable(int cae){
        if(cae>0 && cae<3){
            return 1;
        }
        else return 3;
    }

}
