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
 * 测试信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
@TableName("ceshixinxi")
public class CeshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CeshixinxiEntity() {
		
	}
	
	public CeshixinxiEntity(T t) {
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
	 * 测试项目
	 */
					
	private String ceshixiangmu;
	
	/**
	 * 测试班级
	 */
					
	private String ceshibanji;
	
	/**
	 * 测试地点
	 */
					
	private String ceshididian;
	
	/**
	 * 测试介绍
	 */
					
	private String ceshijieshao;
	
	/**
	 * 测试时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ceshishijian;
	
	/**
	 * 测试图片
	 */
					
	private String ceshitupian;
	
	
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
	 * 设置：测试项目
	 */
	public void setCeshixiangmu(String ceshixiangmu) {
		this.ceshixiangmu = ceshixiangmu;
	}
	/**
	 * 获取：测试项目
	 */
	public String getCeshixiangmu() {
		return ceshixiangmu;
	}
	/**
	 * 设置：测试班级
	 */
	public void setCeshibanji(String ceshibanji) {
		this.ceshibanji = ceshibanji;
	}
	/**
	 * 获取：测试班级
	 */
	public String getCeshibanji() {
		return ceshibanji;
	}
	/**
	 * 设置：测试地点
	 */
	public void setCeshididian(String ceshididian) {
		this.ceshididian = ceshididian;
	}
	/**
	 * 获取：测试地点
	 */
	public String getCeshididian() {
		return ceshididian;
	}
	/**
	 * 设置：测试介绍
	 */
	public void setCeshijieshao(String ceshijieshao) {
		this.ceshijieshao = ceshijieshao;
	}
	/**
	 * 获取：测试介绍
	 */
	public String getCeshijieshao() {
		return ceshijieshao;
	}
	/**
	 * 设置：测试时间
	 */
	public void setCeshishijian(Date ceshishijian) {
		this.ceshishijian = ceshishijian;
	}
	/**
	 * 获取：测试时间
	 */
	public Date getCeshishijian() {
		return ceshishijian;
	}
	/**
	 * 设置：测试图片
	 */
	public void setCeshitupian(String ceshitupian) {
		this.ceshitupian = ceshitupian;
	}
	/**
	 * 获取：测试图片
	 */
	public String getCeshitupian() {
		return ceshitupian;
	}

}
