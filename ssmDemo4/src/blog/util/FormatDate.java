package blog.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 * ��ʽ��ʱ��
 */
public class FormatDate {
	
	/**
	 * ����: 2018-07-23 10:10:13 �����ݿ�now()һ��
	 * @return
	 */
	public static String formatDate(){
		Date currentTime = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    String dateString = formatter.format(currentTime);   
	    return dateString;
	}

}
