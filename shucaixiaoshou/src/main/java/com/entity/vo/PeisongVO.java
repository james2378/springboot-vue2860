package com.entity.vo;

import com.entity.PeisongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 配送人员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("peisong")
public class PeisongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 配送人员姓名
     */

    @TableField(value = "peisong_name")
    private String peisongName;


    /**
     * 配送人员手机号
     */

    @TableField(value = "peisong_phone")
    private String peisongPhone;


    /**
     * 配送人员头像
     */

    @TableField(value = "peisong_photo")
    private String peisongPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 创建时间
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
	 * 设置：配送人员姓名
	 */
    public String getPeisongName() {
        return peisongName;
    }


    /**
	 * 获取：配送人员姓名
	 */

    public void setPeisongName(String peisongName) {
        this.peisongName = peisongName;
    }
    /**
	 * 设置：配送人员手机号
	 */
    public String getPeisongPhone() {
        return peisongPhone;
    }


    /**
	 * 获取：配送人员手机号
	 */

    public void setPeisongPhone(String peisongPhone) {
        this.peisongPhone = peisongPhone;
    }
    /**
	 * 设置：配送人员头像
	 */
    public String getPeisongPhoto() {
        return peisongPhoto;
    }


    /**
	 * 获取：配送人员头像
	 */

    public void setPeisongPhoto(String peisongPhoto) {
        this.peisongPhoto = peisongPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
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

}
