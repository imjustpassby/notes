package blog.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import blog.entity.Link;

/**
 * @author Administrator
 * ��������Dao��
 */
@Repository("linkDao")
public interface LinkDao {
	/**
	 * �����������
	 * @param link
	 * @return
	 */
	public Integer addLink(Link link);
	/**
	 * ɾ����������
	 * @param id
	 * @return
	 */
	public Integer deleteLink(Integer id);
	/**
	 * ����id��ѯ����
	 * @param id
	 * @return
	 */
	public Link findById(Integer id);
	/**
	 * ������������
	 * @param link
	 * @return
	 */
	public Integer updateLink(Link link);
	/**
	 * ��ȡ������������
	 * @return
	 */
	public List<Link> listLink();
	/**
	 * ��ȡ�������ӵ�����
	 * @return
	 */
	public Long getTotal();
}
