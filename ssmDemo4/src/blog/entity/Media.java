package blog.entity;

/**
 * @author Administrator
 * ý��ʵ����
 */
public class Media {
	
	/**
	 * ý��id(Ĭ������)
	 */
	private Integer id;
	/**
	 * ý��·��
	 */
	private String imagepath;
	/**
	 * �ϴ�ý����û�id
	 */
	private String userid;
	
	/**
	 * �ϴ�����
	 */
	private String releaseDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String toString() {
		return "Media [id=" + id + ", imagepath=" + imagepath + ", userid=" + userid + "]";
	}

}
