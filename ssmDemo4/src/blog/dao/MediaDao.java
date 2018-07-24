package blog.dao;

import java.util.List;

import javax.xml.bind.annotation.W3CDomHandler;

import org.springframework.stereotype.Repository;

import blog.entity.Media;

@Repository("mediaDao")
public interface MediaDao {
	
	/**
	 * ���ý��
	 * @param media
	 * @return
	 */
	public Integer addMedia(Media media);
	
	/**
	 * ɾ��ý��
	 * @param id
	 * @return
	 */
	public Integer deleteMedia(Integer id);
	
	/**
	 * ����id��ѯmedia
	 * @param id
	 * @return
	 */
	public Media findById(Integer id);
	
	/**
	 * ����ý��
	 * @param media
	 * @return
	 */
	public Integer updateMedia(Media media);
	
	/**
	 * �����û�id�г����û�������ý��
	 * @param userid
	 * @return
	 */
	public List<Media> listByUserId(Integer userid);
	
	/**
	 * �����û�id��ȡ���û��ϴ���ý����
	 * @param userid
	 * @return
	 */
	public Long getTotalByUserId(Integer userid);

}
