package com.entity.model;

import com.entity.TiceshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 体测数据
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public class TiceshujuModel  implements Serializable {
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
