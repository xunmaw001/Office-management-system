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
 * 工作汇报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-02 17:13:56
 */
@TableName("gongzuohuibao")
public class GongzuohuibaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzuohuibaoEntity() {
		
	}
	
	public GongzuohuibaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 管理账号
	 */
					
	private String guanlizhanghao;
	
	/**
	 * 管理姓名
	 */
					
	private String guanlixingming;
	
	/**
	 * 汇报名称
	 */
					
	private String huibaomingcheng;
	
	/**
	 * 工作内容
	 */
					
	private String gongzuoneirong;
	
	/**
	 * 工作周期
	 */
					
	private String gongzuozhouqi;
	
	/**
	 * 完成情况
	 */
					
	private String wanchengqingkuang;
	
	/**
	 * 未完成原因
	 */
					
	private String weiwanchengyuanyin;
	
	/**
	 * 解决措施
	 */
					
	private String jiejuecuoshi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 汇报日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date huibaoriqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：管理账号
	 */
	public void setGuanlizhanghao(String guanlizhanghao) {
		this.guanlizhanghao = guanlizhanghao;
	}
	/**
	 * 获取：管理账号
	 */
	public String getGuanlizhanghao() {
		return guanlizhanghao;
	}
	/**
	 * 设置：管理姓名
	 */
	public void setGuanlixingming(String guanlixingming) {
		this.guanlixingming = guanlixingming;
	}
	/**
	 * 获取：管理姓名
	 */
	public String getGuanlixingming() {
		return guanlixingming;
	}
	/**
	 * 设置：汇报名称
	 */
	public void setHuibaomingcheng(String huibaomingcheng) {
		this.huibaomingcheng = huibaomingcheng;
	}
	/**
	 * 获取：汇报名称
	 */
	public String getHuibaomingcheng() {
		return huibaomingcheng;
	}
	/**
	 * 设置：工作内容
	 */
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
	/**
	 * 设置：工作周期
	 */
	public void setGongzuozhouqi(String gongzuozhouqi) {
		this.gongzuozhouqi = gongzuozhouqi;
	}
	/**
	 * 获取：工作周期
	 */
	public String getGongzuozhouqi() {
		return gongzuozhouqi;
	}
	/**
	 * 设置：完成情况
	 */
	public void setWanchengqingkuang(String wanchengqingkuang) {
		this.wanchengqingkuang = wanchengqingkuang;
	}
	/**
	 * 获取：完成情况
	 */
	public String getWanchengqingkuang() {
		return wanchengqingkuang;
	}
	/**
	 * 设置：未完成原因
	 */
	public void setWeiwanchengyuanyin(String weiwanchengyuanyin) {
		this.weiwanchengyuanyin = weiwanchengyuanyin;
	}
	/**
	 * 获取：未完成原因
	 */
	public String getWeiwanchengyuanyin() {
		return weiwanchengyuanyin;
	}
	/**
	 * 设置：解决措施
	 */
	public void setJiejuecuoshi(String jiejuecuoshi) {
		this.jiejuecuoshi = jiejuecuoshi;
	}
	/**
	 * 获取：解决措施
	 */
	public String getJiejuecuoshi() {
		return jiejuecuoshi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：汇报日期
	 */
	public void setHuibaoriqi(Date huibaoriqi) {
		this.huibaoriqi = huibaoriqi;
	}
	/**
	 * 获取：汇报日期
	 */
	public Date getHuibaoriqi() {
		return huibaoriqi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
