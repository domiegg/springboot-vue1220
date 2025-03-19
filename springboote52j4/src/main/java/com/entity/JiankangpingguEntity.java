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
 * 健康评估
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
@TableName("jiankangpinggu")
public class JiankangpingguEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangpingguEntity() {
		
	}
	
	public JiankangpingguEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身体形态分
	 */
					
	private Float shentixingtaifen;
	
	/**
	 * 运动能力分
	 */
					
	private Float yundongnenglifen;
	
	/**
	 * 身体素质分
	 */
					
	private Float shentisuzhifen;
	
	/**
	 * 身体机能分
	 */
					
	private Float shentijinengfen;
	
	/**
	 * 综合素质分
	 */
					
	private Float zonghesuzhifen;
	
	/**
	 * 评估内容
	 */
					
	private String pingguneirong;
	
	/**
	 * 评估日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingguriqi;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
	 * 设置：身体形态分
	 */
	public void setShentixingtaifen(Float shentixingtaifen) {
		this.shentixingtaifen = shentixingtaifen;
	}
	/**
	 * 获取：身体形态分
	 */
	public Float getShentixingtaifen() {
		return shentixingtaifen;
	}
	/**
	 * 设置：运动能力分
	 */
	public void setYundongnenglifen(Float yundongnenglifen) {
		this.yundongnenglifen = yundongnenglifen;
	}
	/**
	 * 获取：运动能力分
	 */
	public Float getYundongnenglifen() {
		return yundongnenglifen;
	}
	/**
	 * 设置：身体素质分
	 */
	public void setShentisuzhifen(Float shentisuzhifen) {
		this.shentisuzhifen = shentisuzhifen;
	}
	/**
	 * 获取：身体素质分
	 */
	public Float getShentisuzhifen() {
		return shentisuzhifen;
	}
	/**
	 * 设置：身体机能分
	 */
	public void setShentijinengfen(Float shentijinengfen) {
		this.shentijinengfen = shentijinengfen;
	}
	/**
	 * 获取：身体机能分
	 */
	public Float getShentijinengfen() {
		return shentijinengfen;
	}
	/**
	 * 设置：综合素质分
	 */
	public void setZonghesuzhifen(Float zonghesuzhifen) {
		this.zonghesuzhifen = zonghesuzhifen;
	}
	/**
	 * 获取：综合素质分
	 */
	public Float getZonghesuzhifen() {
		return zonghesuzhifen;
	}
	/**
	 * 设置：评估内容
	 */
	public void setPingguneirong(String pingguneirong) {
		this.pingguneirong = pingguneirong;
	}
	/**
	 * 获取：评估内容
	 */
	public String getPingguneirong() {
		return pingguneirong;
	}
	/**
	 * 设置：评估日期
	 */
	public void setPingguriqi(Date pingguriqi) {
		this.pingguriqi = pingguriqi;
	}
	/**
	 * 获取：评估日期
	 */
	public Date getPingguriqi() {
		return pingguriqi;
	}

}
