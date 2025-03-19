package com.entity.view;

import com.entity.DiscussceshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 测试信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
@TableName("discussceshixinxi")
public class DiscussceshixinxiView  extends DiscussceshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussceshixinxiView(){
	}
 
 	public DiscussceshixinxiView(DiscussceshixinxiEntity discussceshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussceshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
