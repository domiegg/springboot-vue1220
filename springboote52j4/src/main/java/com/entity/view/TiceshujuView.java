package com.entity.view;

import com.entity.TiceshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体测数据
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
@TableName("ticeshuju")
public class TiceshujuView  extends TiceshujuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiceshujuView(){
	}
 
 	public TiceshujuView(TiceshujuEntity ticeshujuEntity){
 	try {
			BeanUtils.copyProperties(this, ticeshujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
