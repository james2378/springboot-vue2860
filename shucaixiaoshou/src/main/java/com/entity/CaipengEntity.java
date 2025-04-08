package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 菜棚
 *
 * @author 
 * @email
 */
@TableName("caipeng")
public class CaipengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaipengEntity() {

	}

	public CaipengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 菜棚名字
     */
    @TableField(value = "caipeng_name")

    private String caipengName;


    /**
     * 菜棚图片
     */
    @TableField(value = "caipeng_photo")

    private String caipengPhoto;


    /**
     * 菜棚地址
     */
    @TableField(value = "caipeng_address")

    private String caipengAddress;


    /**
     * 开放时间
     */
    @TableField(value = "caipeng_kaifang")

    private String caipengKaifang;


    /**
     * 菜棚介绍
     */
    @TableField(value = "caipeng_content")

    private String caipengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：菜棚名字
	 */
    public String getCaipengName() {
        return caipengName;
    }


    /**
	 * 获取：菜棚名字
	 */

    public void setCaipengName(String caipengName) {
        this.caipengName = caipengName;
    }
    /**
	 * 设置：菜棚图片
	 */
    public String getCaipengPhoto() {
        return caipengPhoto;
    }


    /**
	 * 获取：菜棚图片
	 */

    public void setCaipengPhoto(String caipengPhoto) {
        this.caipengPhoto = caipengPhoto;
    }
    /**
	 * 设置：菜棚地址
	 */
    public String getCaipengAddress() {
        return caipengAddress;
    }


    /**
	 * 获取：菜棚地址
	 */

    public void setCaipengAddress(String caipengAddress) {
        this.caipengAddress = caipengAddress;
    }
    /**
	 * 设置：开放时间
	 */
    public String getCaipengKaifang() {
        return caipengKaifang;
    }


    /**
	 * 获取：开放时间
	 */

    public void setCaipengKaifang(String caipengKaifang) {
        this.caipengKaifang = caipengKaifang;
    }
    /**
	 * 设置：菜棚介绍
	 */
    public String getCaipengContent() {
        return caipengContent;
    }


    /**
	 * 获取：菜棚介绍
	 */

    public void setCaipengContent(String caipengContent) {
        this.caipengContent = caipengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Caipeng{" +
            "id=" + id +
            ", caipengName=" + caipengName +
            ", caipengPhoto=" + caipengPhoto +
            ", caipengAddress=" + caipengAddress +
            ", caipengKaifang=" + caipengKaifang +
            ", caipengContent=" + caipengContent +
            ", createTime=" + createTime +
        "}";
    }
}
