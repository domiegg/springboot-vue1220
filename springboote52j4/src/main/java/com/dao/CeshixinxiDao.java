package com.dao;

import com.entity.CeshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshixinxiVO;
import com.entity.view.CeshixinxiView;


/**
 * 测试信息
 * 
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface CeshixinxiDao extends BaseMapper<CeshixinxiEntity> {
	
	List<CeshixinxiVO> selectListVO(@Param("ew") Wrapper<CeshixinxiEntity> wrapper);
	
	CeshixinxiVO selectVO(@Param("ew") Wrapper<CeshixinxiEntity> wrapper);
	
	List<CeshixinxiView> selectListView(@Param("ew") Wrapper<CeshixinxiEntity> wrapper);

	List<CeshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CeshixinxiEntity> wrapper);
	
	CeshixinxiView selectView(@Param("ew") Wrapper<CeshixinxiEntity> wrapper);
	

}
