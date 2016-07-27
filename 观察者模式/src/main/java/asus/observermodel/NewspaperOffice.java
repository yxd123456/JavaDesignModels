package asus.observermodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2016/7/27.
 */
public class NewspaperOffice {

    /**
     * 存放所有订阅者的集合
     */
    private List<Subject> subjects = new ArrayList<>();
    private String state;

    /**
     * 获取当前状态
     * @return
     */
    public String getNewspaper() {
        return state;
    }

    /**
     * 设置新的状态并通知所有订阅者
     * @param state
     */
    public void sendNewspaper(String state) {
        this.state = state;
        notifyAllSubjects();
    }

    /**
     * 添加一个订阅者
     * @param observer
     */
    public void attach(Subject observer){
        subjects.add(observer);
    }

    /**
     * 移除一个订阅者
     * @param observer
     */
    public void detach(Subject observer){
        subjects.remove(observer);
    }

    /**
     * 通知所有订阅者更新
     */
    public void notifyAllSubjects(){
        for (Subject subject : subjects) {
            subject.readNewspaper();
        }
    }

}
