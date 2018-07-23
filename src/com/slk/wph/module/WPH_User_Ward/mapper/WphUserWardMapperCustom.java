package com.slk.wph.module.WPH_User_Ward.mapper;

import java.util.List;

import com.slk.wph.module.WPH_User_Ward.po.WphUserWard;
import com.slk.wph.module.WPH_User_Ward.po.WphUserWardCustom;
import org.apache.ibatis.annotations.Param;

public interface WphUserWardMapperCustom  {
	
	public List<WphUserWardCustom> getWphUserWardList();
	
	public int updateWphUserWard(Integer fid);
	
	public int saveWphUserWard(WphUserWard wphUserWard);
	
	public int saveUserWardArray(List<WphUserWard> list);
	
	public int deleteUserWardByUserId(@Param("userFid") Integer userFid, @Param("wardFid") Integer wardFid);
	/**
	 * 描述：通过user获取wardList  返回的集合只包含病区fid不包含病区name
	 *
	 * @param userFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-上午10:18:34
	 */
	public List<WphUserWard> getWardListByUser(Integer userFid);

	/**
	 * 通过user获取病区fid集合
	 * @param userFid
	 * @return
	 */
	public List<String> selectWardListByUser(Integer userFid);
}
