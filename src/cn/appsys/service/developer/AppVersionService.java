package cn.appsys.service.developer;

import java.util.List;
import cn.appsys.pojo.AppVersion;

public interface AppVersionService {
	/**
	 * 根据appId查询相应的app版本列表
	 * @param appId
	 * @return
	 * @throws Exception
	 */
	public List<AppVersion> getAppVersionList(Integer appId)throws Exception;
	/**
	 * 新增app版本信息，并更新app_info表的versionId字段
	 * @param appVersion
	 * @return
	 * @throws Exception
	 */
	public boolean appsysadd(AppVersion appVersion)throws Exception;
	/**
	 * 根据id获取AppVersion
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public AppVersion getAppVersionById(Integer id)throws Exception;
}
