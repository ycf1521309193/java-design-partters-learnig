package com.lilin.java.design.observer;

/**
 * 观察者接口
 * 推模型：被观察者主动向观察者推送自身的信息，可以是全部信息或者是部分信息。
 * 拉模型：被观察者通过把自身的引用传递给观察者，需要观察者自行通过该引用来获取相关的信息。
 * @author lilin
 *
 */
public interface Observer {

	/**
	 * 更新（推模型）
	 * 
	 * @param edition
	 * @param cost
	 */
	void update(int edition, float cost);
	
}
