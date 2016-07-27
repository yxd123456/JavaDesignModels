package asus.singleinstancemodel;

/**
 * Created by asus on 2016/7/27.
 * 不推荐
 */
public class Lazyer {

    private static Lazyer lazyer;

    private Lazyer(){

    }

    /**
     * 线程不安全
     */
    public static Lazyer getPresident(){
        if(lazyer == null){
            lazyer  = new Lazyer();
        }
        return lazyer;
    }

    /**
     * 线程安全
     */
    public static synchronized Lazyer getThreadInstance() {
        if (lazyer == null) {
            lazyer = new Lazyer();
        }
        return lazyer;
    }

}
