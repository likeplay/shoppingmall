package com.spmall.common.mapper;

import com.spmall.common.model.CtUser;
import com.spmall.common.model.CtUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtUserMapper {
    int countByExample(CtUserExample example);

    int deleteByExample(CtUserExample example);

    int insert(CtUser record);

    int insertSelective(CtUser record);

    List<CtUser> selectByExample(CtUserExample example);

    int updateByExampleSelective(@Param("record") CtUser record, @Param("example") CtUserExample example);

    int updateByExample(@Param("record") CtUser record, @Param("example") CtUserExample example);
}