package com.entity.view;

import com.entity.CaipengyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 菜棚预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("caipengyuyue")
public class CaipengyuyueView extends CaipengyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 是否同意的值
		*/
		private String caipengyuyueYesnoValue;



		//级联表 caipeng
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public CaipengyuyueView() {

	}

	public CaipengyuyueView(CaipengyuyueEntity caipengyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, caipengyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否同意的值
			*/
			public String getCaipengyuyueYesnoValue() {
				return caipengyuyueYesnoValue;
			}
			/**
			* 设置： 是否同意的值
			*/
			public void setCaipengyuyueYesnoValue(String caipengyuyueYesnoValue) {
				this.caipengyuyueYesnoValue = caipengyuyueYesnoValue;
			}








				//级联表的get和set caipeng
					/**
					* 获取： 菜棚名字
					*/
					public String getCaipengName() {
						return caipengName;
					}
					/**
					* 设置： 菜棚名字
					*/
					public void setCaipengName(String caipengName) {
						this.caipengName = caipengName;
					}
					/**
					* 获取： 菜棚图片
					*/
					public String getCaipengPhoto() {
						return caipengPhoto;
					}
					/**
					* 设置： 菜棚图片
					*/
					public void setCaipengPhoto(String caipengPhoto) {
						this.caipengPhoto = caipengPhoto;
					}
					/**
					* 获取： 菜棚地址
					*/
					public String getCaipengAddress() {
						return caipengAddress;
					}
					/**
					* 设置： 菜棚地址
					*/
					public void setCaipengAddress(String caipengAddress) {
						this.caipengAddress = caipengAddress;
					}
					/**
					* 获取： 开放时间
					*/
					public String getCaipengKaifang() {
						return caipengKaifang;
					}
					/**
					* 设置： 开放时间
					*/
					public void setCaipengKaifang(String caipengKaifang) {
						this.caipengKaifang = caipengKaifang;
					}
					/**
					* 获取： 菜棚介绍
					*/
					public String getCaipengContent() {
						return caipengContent;
					}
					/**
					* 设置： 菜棚介绍
					*/
					public void setCaipengContent(String caipengContent) {
						this.caipengContent = caipengContent;
					}
































				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




}
