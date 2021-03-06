package project.hrms.start.service;

import project.hrms.start.entity.Sign;
import project.hrms.start.parameter.SignData;

import java.util.List;

/**
 * 时间格式
 * 实例 2020-3-31
 */
public interface SignServiceInterface {
    boolean sign(Sign sign,String key);

    //获取今天的签到表
    Sign getSignInfoByUid(Long uid);
    //获取所有签到表，时间查询
    List<Sign> getSignInfoByUid(Long uid,String time);
    //加载本月数据
    List<SignData> countByUid(Long uid);
    //今天打卡人数
    int countTodaySignInNumber();
    //某月某用户所有记录
    List<Sign> getAllByUidAndMonth(String date,Long uid);

    boolean leave(Sign sign);
}
