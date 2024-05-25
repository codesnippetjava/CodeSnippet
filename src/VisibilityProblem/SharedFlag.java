package VisibilityProblem;

public class SharedFlag {

    private  boolean flag = false;

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }
}
