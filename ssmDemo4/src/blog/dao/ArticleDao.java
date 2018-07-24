package blog.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import blog.entity.Article;

/**
 * @author Administrator
 * ����Dao��
 */
@Repository("articleDao")
public interface ArticleDao {
	/**
	 * ��ѯ��������
	 * @param map
	 * @return
	 */
	public List<Article> listArticle(Map<String,Object> map);
	/**
	 * ��ȡ������Ŀ��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	/**
	 * ��ѯĳ������µ�������
	 * @param blogtypeid
	 * @return
	 */
	public Integer getBlogByTypeId(Integer blogtypeid);
	/**
	 * �������
	 * @param article
	 * @return
	 */
	public Integer addArticle(Article article);
	/**
	 * ��������
	 * @param article
	 * @return
	 */
	public Integer updateArticle(Article article);
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public Integer deleteArticle(Integer id);
	/**
	 * ͨ��id��ȡ����
	 * @param id
	 * @return
	 */
	public Article findById(Integer id);
	
}
