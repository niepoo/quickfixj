package quickfix.examples.sevice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quickfix.examples.dao.IMarketDataDao;
import quickfix.examples.vo.MarketRealDataVo;

@Service("BaseDataService")
public class BaseDataService{
	@Autowired
	private IMarketDataDao marketDataDao;
	
	public static final String beanId = "BaseDataService";
	
	public List<MarketRealDataVo> selectMarketList(Map<String,Object> paramsMap){
		return marketDataDao.selectMarketList(paramsMap);
	}
	
}