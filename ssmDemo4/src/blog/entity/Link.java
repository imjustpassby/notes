package blog.entity;

/**
 * @author Administrator
 * ����ʵ����
 */
public class Link {
	
	/**
	 * ����id
	 */
	private Integer id;
	/**
	 * ��������
	 */
	private String linkname;
	/**
	 * ����url
	 */
	private String linkurl;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLinkname() {
		return linkname;
	}
	public void setLinkname(String linkname) {
		this.linkname = linkname;
	}
	public String getLinkurl() {
		return linkurl;
	}
	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}
	
	@Override
	public String toString() {
		return "Link [id=" + id + ", linkname=" + linkname + ", linkurl=" + linkurl + "]";
	}
	
}
