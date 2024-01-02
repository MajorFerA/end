package com.dao;

import com.entity.DiscusswupinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswupinxinxiVO;
import com.entity.view.DiscusswupinxinxiView;


/**
 * 物品信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-11-14 17:25:21
 */
public interface DiscusswupinxinxiDao extends BaseMapper<DiscusswupinxinxiEntity> {
	
	List<DiscusswupinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusswupinxinxiEntity> wrapper);
	
	DiscusswupinxinxiVO selectVO(@Param("ew") Wrapper<DiscusswupinxinxiEntity> wrapper);
	
	List<DiscusswupinxinxiView> selectListView(@Param("ew") Wrapper<DiscusswupinxinxiEntity> wrapper);

	List<DiscusswupinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswupinxinxiEntity> wrapper);
	
	DiscusswupinxinxiView selectView(@Param("ew") Wrapper<DiscusswupinxinxiEntity> wrapper);
	

}
