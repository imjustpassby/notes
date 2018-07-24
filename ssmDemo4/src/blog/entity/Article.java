package blog.entity;

/**
 * @author Administrator
 * ����ʵ����
 */
public class Article {
	/**
	 * ����id
	 */
	private Integer id;
	/**
	 * ������Ŀ
	 */
	private String title;
	/**
	 * ����ժҪ
	 */
	private String summary;
	/**
	 * ���·�������
	 */
	private String releaseDate;
	/**
	 * ���µ����
	 */
	private Integer clickCount;
	/**
	 * ���±�������
	 */
	private Integer replyCount;
	/**
	 * ��������
	 */
	private String content;
	/**
	 * ���±�ǩ(Ҫ��','���Ÿ��� �Ա��ڸ�ʽ��)
	 */
	private String tags;
	/**
	 * �������id
	 */
	private Integer blogtypeid;
	
	public Article(){
		
	}
	
	/**
	 * ���췽��
	 * @param title
	 * @param summary
	 * @param content
	 * @param tags
	 * @param blogtypeid
	 */
	public Article(String title, String summary, String content, String tags, Integer blogtypeid) {
		super();
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.tags = tags;
		this.blogtypeid = blogtypeid;
	}
	
	/**
	 * @param id
	 * @param title
	 * @param summary
	 * @param releaseDate
	 * @param clickCount
	 * @param replyCount
	 * @param content
	 * @param tags
	 * @param blogtypeid
	 */
	public Article(Integer id, String title, String summary, String releaseDate, Integer clickCount, Integer replyCount,
			String content, String tags, Integer blogtypeid) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.releaseDate = releaseDate;
		this.clickCount = clickCount;
		this.replyCount = replyCount;
		this.content = content;
		this.tags = tags;
		this.blogtypeid = blogtypeid;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getClickCount() {
		return clickCount;
	}
	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}
	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Integer getBlogtypeid() {
		return blogtypeid;
	}
	public void setBlogtypeid(Integer blogtypeid) {
		this.blogtypeid = blogtypeid;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", summary=" + summary + ", releaseDate=" + releaseDate
				+ ", clickCount=" + clickCount + ", replyCount=" + replyCount + ", content=" + content + ", tags="
				+ tags + ", blogtypeid=" + blogtypeid + "]";
	}
	
}
