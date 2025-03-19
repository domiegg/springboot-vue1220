package com.dao;

import com.entity.TiceshujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiceshujuVO;
import com.entity.view.TiceshujuView;


/**
 * 体测数据
 * 
 * @author 
 * @email 
 * @date 2022-03-13 00:00:01
 */
public interface TiceshujuDao extends BaseMapper<TiceshujuEntity> {
	
	List<TiceshujuVO> selectListVO(@Param("ew") Wrapper<TiceshujuEntity> wrapper);
	
	TiceshujuVO selectVO(@Param("ew") Wrapper<TiceshujuEntity> wrapper);
	
	List<TiceshujuView> selectListView(@Param("ew") Wrapper<TiceshujuEntity> wrapper);

	List<TiceshujuView> selectListView(Pagination page,@Param("ew") Wrapper<TiceshujuEntity> wrapper);
	
	TiceshujuView selectView(@Param("ew") Wrapper<TiceshujuEntity> wrapper);
	

}
