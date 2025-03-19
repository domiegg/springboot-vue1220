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
 * 体测数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
@TableName("ticeshuju")
public class TiceshujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiceshujuEntity() {
		
	}
	
	public TiceshujuEntity(T t) {
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
	 * 测试数据
	 */
					
	private String ceshishuju;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	
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
	 * 设置：测试数据
	 */
	public void setCeshishuju(String ceshishuju) {
		this.ceshishuju = ceshishuju;
	}
	/**
	 * 获取：测试数据
	 */
	public String getCeshishuju() {
		return ceshishuju;
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
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}

}
