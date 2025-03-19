package com.dao;

import com.entity.CeshibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshibaomingVO;
import com.entity.view.CeshibaomingView;


/**
 * 测试报名
 * 
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface CeshibaomingDao extends BaseMapper<CeshibaomingEntity> {
	
	List<CeshibaomingVO> selectListVO(@Param("ew") Wrapper<CeshibaomingEntity> wrapper);
	
	CeshibaomingVO selectVO(@Param("ew") Wrapper<CeshibaomingEntity> wrapper);
	
	List<CeshibaomingView> selectListView(@Param("ew") Wrapper<CeshibaomingEntity> wrapper);

	List<CeshibaomingView> selectListView(Pagination page,@Param("ew") Wrapper<CeshibaomingEntity> wrapper);
	
	CeshibaomingView selectView(@Param("ew") Wrapper<CeshibaomingEntity> wrapper);
	

}
