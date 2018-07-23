package com.slk.wph.module.WPH_Invoicerate.mapper;

import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerate;
import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphInvoicerateMapper {
    int countByExample(WphInvoicerateExample example);

    int deleteByExample(WphInvoicerateExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphInvoicerate record);

    int insertSelective(WphInvoicerate record);

    List<WphInvoicerate> selectByExample(WphInvoicerateExample example);

    WphInvoicerate selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphInvoicerate record, @Param("example") WphInvoicerateExample example);

    int updateByExample(@Param("record") WphInvoicerate record, @Param("example") WphInvoicerateExample example);

    int updateByPrimaryKeySelective(WphInvoicerate record);

    int updateByPrimaryKey(WphInvoicerate record);
}