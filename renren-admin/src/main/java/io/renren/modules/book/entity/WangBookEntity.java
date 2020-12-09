package io.renren.modules.book.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-12-08 09:06:33
 */
@Data
@TableName("wang_book")
public class WangBookEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 图书id
	 */
	@TableId
	private String bookId;
	/**
	 * 
	 */
	private String bookName;
	/**
	 * 
	 */
	private Integer bookDelete;
	/**
	 * 
	 */
	private String bookMark;
	/**
	 * 
	 */
	private Integer beDelete;

}
