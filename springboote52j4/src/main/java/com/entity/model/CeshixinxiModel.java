package com.entity.model;

import com.entity.CeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 测试信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public class CeshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
