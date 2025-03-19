package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TiceshujuDao;
import com.entity.TiceshujuEntity;
import com.service.TiceshujuService;
import com.entity.vo.TiceshujuVO;
import com.entity.view.TiceshujuView;

@Service("ticeshujuService")
public class TiceshujuServiceImpl extends ServiceImpl<TiceshujuDao, TiceshujuEntity> implements TiceshujuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiceshujuEntity> page = this.selectPage(
                new Query<TiceshujuEntity>(params).getPage(),
                new EntityWrapper<TiceshujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiceshujuEntity> wrapper) {
		  Page<TiceshujuView> page =new Query<TiceshujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiceshujuVO> selectListVO(Wrapper<TiceshujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiceshujuVO selectVO(Wrapper<TiceshujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiceshujuView> selectListView(Wrapper<TiceshujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiceshujuView selectView(Wrapper<TiceshujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
