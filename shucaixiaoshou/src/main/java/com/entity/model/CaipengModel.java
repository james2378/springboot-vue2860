package com.entity.model;

import com.entity.CaipengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 菜棚
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CaipengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 菜棚名字
     */
    private String caipengName;


    /**
     * 菜棚图片
     */
    private String caipengPhoto;


    /**
     * 菜棚地址
     */
    private String caipengAddress;


    /**
     * 开放时间
     */
    private String caipengKaifang;


    /**
     * 菜棚介绍
     */
    private String caipengContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：菜棚名字
	 */
    public String getCaipengName() {
        return caipengName;
    }


    /**
	 * 设置：菜棚名字
	 */
    public void setCaipengName(String caipengName) {
        this.caipengName = caipengName;
    }
    /**
	 * 获取：菜棚图片
	 */
    public String getCaipengPhoto() {
        return caipengPhoto;
    }


    /**
	 * 设置：菜棚图片
	 */
    public void setCaipengPhoto(String caipengPhoto) {
        this.caipengPhoto = caipengPhoto;
    }
    /**
	 * 获取：菜棚地址
	 */
    public String getCaipengAddress() {
        return caipengAddress;
    }


    /**
	 * 设置：菜棚地址
	 */
    public void setCaipengAddress(String caipengAddress) {
        this.caipengAddress = caipengAddress;
    }
    /**
	 * 获取：开放时间
	 */
    public String getCaipengKaifang() {
        return caipengKaifang;
    }


    /**
	 * 设置：开放时间
	 */
    public void setCaipengKaifang(String caipengKaifang) {
        this.caipengKaifang = caipengKaifang;
    }
    /**
	 * 获取：菜棚介绍
	 */
    public String getCaipengContent() {
        return caipengContent;
    }


    /**
	 * 设置：菜棚介绍
	 */
    public void setCaipengContent(String caipengContent) {
        this.caipengContent = caipengContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
