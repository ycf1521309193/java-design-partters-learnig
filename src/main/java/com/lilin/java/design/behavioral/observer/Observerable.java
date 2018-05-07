package com.lilin.java.design.behavioral.observer;

/**
 * 被观察者接口
 * 
 * @author lilin
 *
 */
public interface Observerable {

	/**
	 * 注册
	 * 
	 * @param observer
	 */
	void registerObserver(Observer observer);

	/**
	 * 删除
	 * 
	 * @param observer
	 */
	void removeObserver(Observer observer);

	/**
	 * 通知
	 */
	void notifyObservers();
}
