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


import com.dao.CeshibaomingDao;
import com.entity.CeshibaomingEntity;
import com.service.CeshibaomingService;
import com.entity.vo.CeshibaomingVO;
import com.entity.view.CeshibaomingView;

@Service("ceshibaomingService")
public class CeshibaomingServiceImpl extends ServiceImpl<CeshibaomingDao, CeshibaomingEntity> implements CeshibaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshibaomingEntity> page = this.selectPage(
                new Query<CeshibaomingEntity>(params).getPage(),
                new EntityWrapper<CeshibaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshibaomingEntity> wrapper) {
		  Page<CeshibaomingView> page =new Query<CeshibaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CeshibaomingVO> selectListVO(Wrapper<CeshibaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshibaomingVO selectVO(Wrapper<CeshibaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshibaomingView> selectListView(Wrapper<CeshibaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshibaomingView selectView(Wrapper<CeshibaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
