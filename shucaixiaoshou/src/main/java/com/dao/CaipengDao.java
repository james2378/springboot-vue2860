package com.dao;

import com.entity.CaipengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipengView;

/**
 * 菜棚 Dao 接口
 *
 * @author 
 */
public interface CaipengDao extends BaseMapper<CaipengEntity> {

   List<CaipengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
