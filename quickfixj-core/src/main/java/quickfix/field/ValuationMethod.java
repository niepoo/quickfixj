/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.field;

import quickfix.StringField;


public class ValuationMethod extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1197;
	public static final String PREMIUM_STYLE = "EQTY";
	public static final String FUTURES_STYLE_MARK_TO_MARKET = "FUT";
	public static final String FUTURES_STYLE_WITH_AN_ATTACHED_CASH_ADJUSTMENT = "FUTDA";
	public static final String CDS_STYLE_COLLATERALIZATION_OF_MARKET_TO_MARKET_AND_COUPON = "CDS";
	public static final String CDS_IN_DELIVERY_USE_RECOVERY_RATE_TO_CALCULATE_OBLIGATION = "CDSD";
	
	public ValuationMethod() {
		super(1197);
	}

	public ValuationMethod(String data) {
		super(1197, data);
	}
	
}
