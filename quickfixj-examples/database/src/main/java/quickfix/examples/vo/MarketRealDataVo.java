package quickfix.examples.vo;
/**
 * 金融数据实时行情vo
 * @author niepoo
 *
 */
public class MarketRealDataVo {
	public String uuid;//uuid
	public String quotetime;// 行情时间
	public String marketTime;// 市场最新时间
	public int secucode;// 证券代码
	public String secuname;//证券名称
	public String tp;// 是否停牌(01:停牌 02：不停牌）
	public int excange;// 交易市场
	public float open;// 今日开盘
	public float high;// 最高成交
	public float low;// 最低成交
	public float close;// 最近成交
	public float preClose;// 昨日收盘
	public int vol;// 成交数量
	public double amt;// 成交金额
	public float askprice5;// 卖价5
	public int askvol5;// 卖量5
	public float askprice4;// 卖价4
	public int askcol4;// 卖量4
	public float askprice3;// 卖价3
	public int askvol3;// 卖量3
	public float askprice2;// 卖价2
	public int askvol2;// 卖量2
	public int askvol1;// 卖量1
	public float askprice1;// 卖价1
	public float bidprice1;// 买价1
	public int bidvol1;// 买量1
	public float bidprice2;// 买价2
	public int bidvol2;// 买量2
	public float bidprice3;// 买价3
	public int bidvol3;// 买量3
	public float bidprice4;// 买价4
	public int bidvol4;// 买量4
	public float bidprice5;// 买价5
	public int bidvol5;// 买量5
	public float zf;// 涨幅
	public float zd;// 涨跌
	public float zt;// 涨停价
	public float dt;// 跌停价
	public int xs;// 现量
	public int actualxs;// 实际每笔间现量
	public float xe;// 现额
	public float hs;// 换手
	public float amp;// 振幅
	public float lb;// 量比
	public float wb;// 委比
	public float wc;// 委差
	public int nwp;// 内外盘
	public int np;// 内盘数
	public int wp;// 外盘数
	public int sp;// 是否收盘
	public int detailid;// 明细最新id
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getQuotetime() {
		return quotetime;
	}
	public void setQuotetime(String quotetime) {
		this.quotetime = quotetime;
	}
	public String getMarketTime() {
		return marketTime;
	}
	public void setMarketTime(String marketTime) {
		this.marketTime = marketTime;
	}
	public int getSecucode() {
		return secucode;
	}
	public void setSecucode(int secucode) {
		this.secucode = secucode;
	}
	public String getSecuname() {
		return secuname;
	}
	public void setSecuname(String secuname) {
		this.secuname = secuname;
	}
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public int getExcange() {
		return excange;
	}
	public void setExcange(int excange) {
		this.excange = excange;
	}
	public float getOpen() {
		return open;
	}
	public void setOpen(float open) {
		this.open = open;
	}
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public float getLow() {
		return low;
	}
	public void setLow(float low) {
		this.low = low;
	}
	public float getClose() {
		return close;
	}
	public void setClose(float close) {
		this.close = close;
	}
	public float getPreClose() {
		return preClose;
	}
	public void setPreClose(float preClose) {
		this.preClose = preClose;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public float getAskprice5() {
		return askprice5;
	}
	public void setAskprice5(float askprice5) {
		this.askprice5 = askprice5;
	}
	public int getAskvol5() {
		return askvol5;
	}
	public void setAskvol5(int askvol5) {
		this.askvol5 = askvol5;
	}
	public float getAskprice4() {
		return askprice4;
	}
	public void setAskprice4(float askprice4) {
		this.askprice4 = askprice4;
	}
	public int getAskcol4() {
		return askcol4;
	}
	public void setAskcol4(int askcol4) {
		this.askcol4 = askcol4;
	}
	public float getAskprice3() {
		return askprice3;
	}
	public void setAskprice3(float askprice3) {
		this.askprice3 = askprice3;
	}
	public int getAskvol3() {
		return askvol3;
	}
	public void setAskvol3(int askvol3) {
		this.askvol3 = askvol3;
	}
	public float getAskprice2() {
		return askprice2;
	}
	public void setAskprice2(float askprice2) {
		this.askprice2 = askprice2;
	}
	public int getAskvol2() {
		return askvol2;
	}
	public void setAskvol2(int askvol2) {
		this.askvol2 = askvol2;
	}
	public int getAskvol1() {
		return askvol1;
	}
	public void setAskvol1(int askvol1) {
		this.askvol1 = askvol1;
	}
	public float getAskprice1() {
		return askprice1;
	}
	public void setAskprice1(float askprice1) {
		this.askprice1 = askprice1;
	}
	public float getBidprice1() {
		return bidprice1;
	}
	public void setBidprice1(float bidprice1) {
		this.bidprice1 = bidprice1;
	}
	public int getBidvol1() {
		return bidvol1;
	}
	public void setBidvol1(int bidvol1) {
		this.bidvol1 = bidvol1;
	}
	public float getBidprice2() {
		return bidprice2;
	}
	public void setBidprice2(float bidprice2) {
		this.bidprice2 = bidprice2;
	}
	public int getBidvol2() {
		return bidvol2;
	}
	public void setBidvol2(int bidvol2) {
		this.bidvol2 = bidvol2;
	}
	public float getBidprice3() {
		return bidprice3;
	}
	public void setBidprice3(float bidprice3) {
		this.bidprice3 = bidprice3;
	}
	public int getBidvol3() {
		return bidvol3;
	}
	public void setBidvol3(int bidvol3) {
		this.bidvol3 = bidvol3;
	}
	public float getBidprice4() {
		return bidprice4;
	}
	public void setBidprice4(float bidprice4) {
		this.bidprice4 = bidprice4;
	}
	public int getBidvol4() {
		return bidvol4;
	}
	public void setBidvol4(int bidvol4) {
		this.bidvol4 = bidvol4;
	}
	public float getBidprice5() {
		return bidprice5;
	}
	public void setBidprice5(float bidprice5) {
		this.bidprice5 = bidprice5;
	}
	public int getBidvol5() {
		return bidvol5;
	}
	public void setBidvol5(int bidvol5) {
		this.bidvol5 = bidvol5;
	}
	public float getZf() {
		return zf;
	}
	public void setZf(float zf) {
		this.zf = zf;
	}
	public float getZd() {
		return zd;
	}
	public void setZd(float zd) {
		this.zd = zd;
	}
	public float getZt() {
		return zt;
	}
	public void setZt(float zt) {
		this.zt = zt;
	}
	public float getDt() {
		return dt;
	}
	public void setDt(float dt) {
		this.dt = dt;
	}
	public int getXs() {
		return xs;
	}
	public void setXs(int xs) {
		this.xs = xs;
	}
	public int getActualxs() {
		return actualxs;
	}
	public void setActualxs(int actualxs) {
		this.actualxs = actualxs;
	}
	public float getXe() {
		return xe;
	}
	public void setXe(float xe) {
		this.xe = xe;
	}
	public float getHs() {
		return hs;
	}
	public void setHs(float hs) {
		this.hs = hs;
	}
	public float getAmp() {
		return amp;
	}
	public void setAmp(float amp) {
		this.amp = amp;
	}
	public float getLb() {
		return lb;
	}
	public void setLb(float lb) {
		this.lb = lb;
	}
	public float getWb() {
		return wb;
	}
	public void setWb(float wb) {
		this.wb = wb;
	}
	public float getWc() {
		return wc;
	}
	public void setWc(float wc) {
		this.wc = wc;
	}
	public int getNwp() {
		return nwp;
	}
	public void setNwp(int nwp) {
		this.nwp = nwp;
	}
	public int getNp() {
		return np;
	}
	public void setNp(int np) {
		this.np = np;
	}
	public int getWp() {
		return wp;
	}
	public void setWp(int wp) {
		this.wp = wp;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public int getDetailid() {
		return detailid;
	}
	public void setDetailid(int detailid) {
		this.detailid = detailid;
	}
	
	
}
