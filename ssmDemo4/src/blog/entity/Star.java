package blog.entity;

/**
 * @author Administrator
 * ����ʵ����
 */
public class Star {
	
	/**
	 * ������id
	 */
	private Integer subscriber;
	/**
	 * ��������id
	 */
	private Integer subscribee;
	
	public Integer getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(Integer subscriber) {
		this.subscriber = subscriber;
	}
	public Integer getSubscribee() {
		return subscribee;
	}
	public void setSubscribee(Integer subscribee) {
		this.subscribee = subscribee;
	}
	@Override
	public String toString() {
		return "Star [subscriber=" + subscriber + ", subscribee=" + subscribee + "]";
	}
	
}
