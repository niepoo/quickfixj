
package quickfix.fix41;

import quickfix.FieldNotFound;


public class QuoteRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "R";
	

	public QuoteRequest() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public QuoteRequest(quickfix.field.QuoteReqID quoteReqID, quickfix.field.Symbol symbol) {
		this();
		setField(quoteReqID);
		setField(symbol);
	}
	
	public void set(quickfix.field.QuoteReqID value) {
		setField(value);
	}

	public quickfix.field.QuoteReqID get(quickfix.field.QuoteReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteReqID getQuoteReqID() throws FieldNotFound {
		return get(new quickfix.field.QuoteReqID());
	}

	public boolean isSet(quickfix.field.QuoteReqID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteReqID() {
		return isSetField(131);
	}

	public void set(quickfix.field.Symbol value) {
		setField(value);
	}

	public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.field.Symbol());
	}

	public boolean isSet(quickfix.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.field.SymbolSfx value) {
		setField(value);
	}

	public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.SymbolSfx());
	}

	public boolean isSet(quickfix.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(quickfix.field.SecurityID value) {
		setField(value);
	}

	public quickfix.field.SecurityID get(quickfix.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.field.SecurityID());
	}

	public boolean isSet(quickfix.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.field.IDSource value) {
		setField(value);
	}

	public quickfix.field.IDSource get(quickfix.field.IDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IDSource getIDSource() throws FieldNotFound {
		return get(new quickfix.field.IDSource());
	}

	public boolean isSet(quickfix.field.IDSource field) {
		return isSetField(field);
	}

	public boolean isSetIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.field.SecurityType value) {
		setField(value);
	}

	public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.field.SecurityType());
	}

	public boolean isSet(quickfix.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYear get(quickfix.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.field.MaturityDay value) {
		setField(value);
	}

	public quickfix.field.MaturityDay get(quickfix.field.MaturityDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityDay getMaturityDay() throws FieldNotFound {
		return get(new quickfix.field.MaturityDay());
	}

	public boolean isSet(quickfix.field.MaturityDay field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDay() {
		return isSetField(205);
	}

	public void set(quickfix.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.field.PutOrCall get(quickfix.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.PutOrCall());
	}

	public boolean isSet(quickfix.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(quickfix.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.StrikePrice());
	}

	public boolean isSet(quickfix.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.field.OptAttribute get(quickfix.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.OptAttribute());
	}

	public boolean isSet(quickfix.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.SecurityExchange());
	}

	public boolean isSet(quickfix.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.field.Issuer value) {
		setField(value);
	}

	public quickfix.field.Issuer get(quickfix.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Issuer getIssuer() throws FieldNotFound {
		return get(new quickfix.field.Issuer());
	}

	public boolean isSet(quickfix.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(quickfix.field.SecurityDesc value) {
		setField(value);
	}

	public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.SecurityDesc());
	}

	public boolean isSet(quickfix.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(quickfix.field.PrevClosePx value) {
		setField(value);
	}

	public quickfix.field.PrevClosePx get(quickfix.field.PrevClosePx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PrevClosePx getPrevClosePx() throws FieldNotFound {
		return get(new quickfix.field.PrevClosePx());
	}

	public boolean isSet(quickfix.field.PrevClosePx field) {
		return isSetField(field);
	}

	public boolean isSetPrevClosePx() {
		return isSetField(140);
	}

	public void set(quickfix.field.Side value) {
		setField(value);
	}

	public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.field.Side());
	}

	public boolean isSet(quickfix.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.field.OrderQty value) {
		setField(value);
	}

	public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.field.OrderQty());
	}

	public boolean isSet(quickfix.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.field.FutSettDate value) {
		setField(value);
	}

	public quickfix.field.FutSettDate get(quickfix.field.FutSettDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FutSettDate getFutSettDate() throws FieldNotFound {
		return get(new quickfix.field.FutSettDate());
	}

	public boolean isSet(quickfix.field.FutSettDate field) {
		return isSetField(field);
	}

	public boolean isSetFutSettDate() {
		return isSetField(64);
	}

	public void set(quickfix.field.OrdType value) {
		setField(value);
	}

	public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.field.OrdType());
	}

	public boolean isSet(quickfix.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(quickfix.field.FutSettDate2 value) {
		setField(value);
	}

	public quickfix.field.FutSettDate2 get(quickfix.field.FutSettDate2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FutSettDate2 getFutSettDate2() throws FieldNotFound {
		return get(new quickfix.field.FutSettDate2());
	}

	public boolean isSet(quickfix.field.FutSettDate2 field) {
		return isSetField(field);
	}

	public boolean isSetFutSettDate2() {
		return isSetField(193);
	}

	public void set(quickfix.field.OrderQty2 value) {
		setField(value);
	}

	public quickfix.field.OrderQty2 get(quickfix.field.OrderQty2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound {
		return get(new quickfix.field.OrderQty2());
	}

	public boolean isSet(quickfix.field.OrderQty2 field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty2() {
		return isSetField(192);
	}

}
