package asus.observermodel;

import android.os.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2016/7/27.
 */
public class Observer {

    private Observer(){

    }

    private static Observer observer = new Observer();

    public static Observer getObserver(){
        return observer;
    }

    /**
     * 存放所有Activity订阅者的集合
     */
    public List<ActivitySubject> activitySubs = new ArrayList<>();

    /**
     * 存放所有Fragment订阅者的集合
     */
    public List<FragmentSubject> fragmentSubs = new ArrayList<>();

    private Message activityMessage, fragmentMessage;

    /**
     * 获取当前状态
     * @return
     */
    public Message getActivityMessage() {
        return activityMessage;
    }

    public Message getFragmentMessage() {
        return fragmentMessage;
    }

    /**
     * 设置新的状态并通知所有订阅者
     * @param message
     */
    public void notifyAllActivitys(Message message) {
        this.activityMessage = message;
        notifyAllActivitySubjects();
    }

    public void notifyActivity(Message message, ActivitySubject...subjects){
        this.activityMessage = message;
        for (ActivitySubject subject:subjects
             ) {
            if(activitySubs.contains(subject)){
                subject.update();
            }
        }
    }

    public void notifyFragment(Message message, FragmentSubject...subjects){
        this.fragmentMessage = message;
        for (FragmentSubject subject:subjects
                ) {
            if(fragmentSubs.contains(subject)){
                subject.update();
            }
        }
    }

    public void notifyAllFragments(Message message) {
        this.fragmentMessage = message;
        notifyAllActivitySubjects();
    }

    /**
     * 添加一个Activity订阅者
     */
    public void attachActivity(ActivitySubject subject){
        if(!activitySubs.contains(subject)) activitySubs.add(subject);
    }

    /**
     * 移除一个Activity订阅者
     */
    public void detachActivity(ActivitySubject subject){
        if(activitySubs.contains(subject)) activitySubs.remove(subject);
    }

    public void attachFragment(FragmentSubject subject){
        if(!fragmentSubs.contains(subject)) fragmentSubs.add(subject);
    }

    public void detachFragment(FragmentSubject subject){
        if(fragmentSubs.contains(subject)) fragmentSubs.remove(subject);
    }

    /**
     * 通知所有订阅者更新
     */
    public void notifyAllActivitySubjects(){
        for (ActivitySubject subject : activitySubs) {
            subject.update();
        }
    }

    public void notifyAllFragmentSubjects(){
        for (FragmentSubject subject : fragmentSubs) {
            subject.update();
        }
    }

}
