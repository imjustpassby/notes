package blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import blog.entity.BlogType;

/**
 * @author Administrator
 * �������Dao��
 */
@Repository("blogTypeDao")
public interface BlogTypeDao {

	/**
	 * ������
	 * @param blogType
	 * @return
	 */
	public Integer addBlogType(BlogType blogType);
	/**
	 * ɾ�����
	 * @param id
	 * @return
	 */
	public Integer deleteBlogType(Integer id);
	/**
	 * ͨ��id��ѯ���
	 * @param id
	 * @return
	 */
	public BlogType findById(Integer id);
	/**
	 * �������
	 * @param blogType
	 * @return
	 */
	public Integer updateBlogType(BlogType blogType);
	/**
	 * ��ѯ�ڼ�ҳ
	 * @param start
	 * @param end
	 * @return
	 */
	public List<BlogType> listBlogType(@Param("start") Integer start,
			@Param("end") Integer end);
	/**
	 * �������
	 * @return
	 */
	public Long getTotal();
}
