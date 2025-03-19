package com.dao;

import com.entity.DiscussceshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussceshixinxiVO;
import com.entity.view.DiscussceshixinxiView;


/**
 * 测试信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface DiscussceshixinxiDao extends BaseMapper<DiscussceshixinxiEntity> {
	
	List<DiscussceshixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussceshixinxiEntity> wrapper);
	
	DiscussceshixinxiVO selectVO(@Param("ew") Wrapper<DiscussceshixinxiEntity> wrapper);
	
	List<DiscussceshixinxiView> selectListView(@Param("ew") Wrapper<DiscussceshixinxiEntity> wrapper);

	List<DiscussceshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussceshixinxiEntity> wrapper);
	
	DiscussceshixinxiView selectView(@Param("ew") Wrapper<DiscussceshixinxiEntity> wrapper);
	

}
