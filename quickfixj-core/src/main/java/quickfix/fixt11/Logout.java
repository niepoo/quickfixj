
package quickfix.fixt11;

import quickfix.FieldNotFound;


public class Logout extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "5";
	

	public Logout() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.field.SessionStatus value) {
		setField(value);
	}

	public quickfix.field.SessionStatus get(quickfix.field.SessionStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SessionStatus getSessionStatus() throws FieldNotFound {
		return get(new quickfix.field.SessionStatus());
	}

	public boolean isSet(quickfix.field.SessionStatus field) {
		return isSetField(field);
	}

	public boolean isSetSessionStatus() {
		return isSetField(1409);
	}

	public void set(quickfix.field.Text value) {
		setField(value);
	}

	public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Text getText() throws FieldNotFound {
		return get(new quickfix.field.Text());
	}

	public boolean isSet(quickfix.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.field.EncodedText value) {
		setField(value);
	}

	public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.field.EncodedText());
	}

	public boolean isSet(quickfix.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
