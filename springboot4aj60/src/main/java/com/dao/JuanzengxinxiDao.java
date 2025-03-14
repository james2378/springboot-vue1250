package com.dao;

import com.entity.JuanzengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuanzengxinxiVO;
import com.entity.view.JuanzengxinxiView;


/**
 * 捐赠信息
 * 
 * @author 
 * @email 
 * @date 2023-04-04 10:58:06
 */
public interface JuanzengxinxiDao extends BaseMapper<JuanzengxinxiEntity> {
	
	List<JuanzengxinxiVO> selectListVO(@Param("ew") Wrapper<JuanzengxinxiEntity> wrapper);
	
	JuanzengxinxiVO selectVO(@Param("ew") Wrapper<JuanzengxinxiEntity> wrapper);
	
	List<JuanzengxinxiView> selectListView(@Param("ew") Wrapper<JuanzengxinxiEntity> wrapper);

	List<JuanzengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JuanzengxinxiEntity> wrapper);
	
	JuanzengxinxiView selectView(@Param("ew") Wrapper<JuanzengxinxiEntity> wrapper);
	

}
