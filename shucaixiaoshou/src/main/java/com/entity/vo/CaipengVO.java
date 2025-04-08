package com.entity.vo;

import com.entity.CaipengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 菜棚
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("caipeng")
public class CaipengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
