package quickfix.examples.dao;

import java.util.List;
import java.util.Map;

import com.dbcon.base.database.MyBatisRepository;

import quickfix.examples.vo.MarketRealDataVo;
/***
 * 从数据库中获取需要产生行情的数据
 * @author niepoo
 *
 */
@MyBatisRepository
public interface IMarketDataDao{
	public List<MarketRealDataVo> selectMarketList(Map<String,Object> paramsMap);
}
