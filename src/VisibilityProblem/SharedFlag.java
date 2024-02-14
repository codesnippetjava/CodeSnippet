package VisibilityProblem;

public class SharedFlag {
    // private  boolean flag = false;
    private volatile boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
