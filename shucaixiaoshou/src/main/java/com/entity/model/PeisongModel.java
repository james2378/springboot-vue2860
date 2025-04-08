package com.entity.model;

import com.entity.PeisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 配送人员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PeisongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 配送人员姓名
     */
    private String peisongName;


    /**
     * 配送人员手机号
     */
    private String peisongPhone;


    /**
     * 配送人员头像
     */
    private String peisongPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 创建时间
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
	 * 获取：配送人员姓名
	 */
    public String getPeisongName() {
        return peisongName;
    }


    /**
	 * 设置：配送人员姓名
	 */
    public void setPeisongName(String peisongName) {
        this.peisongName = peisongName;
    }
    /**
	 * 获取：配送人员手机号
	 */
    public String getPeisongPhone() {
        return peisongPhone;
    }


    /**
	 * 设置：配送人员手机号
	 */
    public void setPeisongPhone(String peisongPhone) {
        this.peisongPhone = peisongPhone;
    }
    /**
	 * 获取：配送人员头像
	 */
    public String getPeisongPhoto() {
        return peisongPhoto;
    }


    /**
	 * 设置：配送人员头像
	 */
    public void setPeisongPhoto(String peisongPhoto) {
        this.peisongPhoto = peisongPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
