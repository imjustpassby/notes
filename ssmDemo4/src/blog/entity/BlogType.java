package blog.entity;

/**
 * @author Administrator
 * ���·���ʵ����
 */
public class BlogType {
	/**
	 * ���·���id
	 */
	private Integer id;
	/**
	 * ���·�������
	 */
	private String typename;
	/**
	 * ������µ�������
	 */
	private Integer typecount;
	
	public BlogType(){
		
	}
	
	public BlogType(String typename, Integer typecount) {
		super();
		this.typename = typename;
		this.typecount = typecount;
	}
	
	public BlogType(Integer id,Integer typecount,String typename) {
		super();
		this.id = id;
		this.typecount = typecount;
		this.typename = typename;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public Integer getTypecount() {
		return typecount;
	}
	public void setTypecount(Integer typecount) {
		this.typecount = typecount;
	}
	
	@Override
	public String toString() {
		return "BlogType [id=" + id + ", typename=" + typename + ", typecount=" + typecount + "]";
	}
	
}
