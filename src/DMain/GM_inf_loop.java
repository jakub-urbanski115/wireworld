package DMain;

public class GM_inf_loop {
    volatile boolean stop = false;

    private GM_inf_loop(){
        while (!stop) {
            //Thread.onSpinWait();

        }
    }
    public void start_inf_loop(){
        stop = true;
    }
    public void stop_inf_loop(){
        stop = false;
    }
}
