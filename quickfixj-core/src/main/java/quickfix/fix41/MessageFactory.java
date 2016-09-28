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

package quickfix.fix41;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.fix41.Heartbeat.MSGTYPE:
				return new quickfix.fix41.Heartbeat();
	
			case quickfix.fix41.Logon.MSGTYPE:
				return new quickfix.fix41.Logon();
	
			case quickfix.fix41.TestRequest.MSGTYPE:
				return new quickfix.fix41.TestRequest();
	
			case quickfix.fix41.ResendRequest.MSGTYPE:
				return new quickfix.fix41.ResendRequest();
	
			case quickfix.fix41.Reject.MSGTYPE:
				return new quickfix.fix41.Reject();
	
			case quickfix.fix41.SequenceReset.MSGTYPE:
				return new quickfix.fix41.SequenceReset();
	
			case quickfix.fix41.Logout.MSGTYPE:
				return new quickfix.fix41.Logout();
	
			case quickfix.fix41.Advertisement.MSGTYPE:
				return new quickfix.fix41.Advertisement();
	
			case quickfix.fix41.IndicationofInterest.MSGTYPE:
				return new quickfix.fix41.IndicationofInterest();
	
			case quickfix.fix41.News.MSGTYPE:
				return new quickfix.fix41.News();
	
			case quickfix.fix41.Email.MSGTYPE:
				return new quickfix.fix41.Email();
	
			case quickfix.fix41.QuoteRequest.MSGTYPE:
				return new quickfix.fix41.QuoteRequest();
	
			case quickfix.fix41.Quote.MSGTYPE:
				return new quickfix.fix41.Quote();
	
			case quickfix.fix41.NewOrderSingle.MSGTYPE:
				return new quickfix.fix41.NewOrderSingle();
	
			case quickfix.fix41.ExecutionReport.MSGTYPE:
				return new quickfix.fix41.ExecutionReport();
	
			case quickfix.fix41.DontKnowTrade.MSGTYPE:
				return new quickfix.fix41.DontKnowTrade();
	
			case quickfix.fix41.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix41.OrderCancelReplaceRequest();
	
			case quickfix.fix41.OrderCancelRequest.MSGTYPE:
				return new quickfix.fix41.OrderCancelRequest();
	
			case quickfix.fix41.OrderCancelReject.MSGTYPE:
				return new quickfix.fix41.OrderCancelReject();
	
			case quickfix.fix41.OrderStatusRequest.MSGTYPE:
				return new quickfix.fix41.OrderStatusRequest();
	
			case quickfix.fix41.Allocation.MSGTYPE:
				return new quickfix.fix41.Allocation();
	
			case quickfix.fix41.AllocationACK.MSGTYPE:
				return new quickfix.fix41.AllocationACK();
	
			case quickfix.fix41.SettlementInstructions.MSGTYPE:
				return new quickfix.fix41.SettlementInstructions();
	
			case quickfix.fix41.NewOrderList.MSGTYPE:
				return new quickfix.fix41.NewOrderList();
	
			case quickfix.fix41.ListStatus.MSGTYPE:
				return new quickfix.fix41.ListStatus();
	
			case quickfix.fix41.ListExecute.MSGTYPE:
				return new quickfix.fix41.ListExecute();
	
			case quickfix.fix41.ListCancelRequest.MSGTYPE:
				return new quickfix.fix41.ListCancelRequest();
	
			case quickfix.fix41.ListStatusRequest.MSGTYPE:
				return new quickfix.fix41.ListStatusRequest();
	
		}

		return new quickfix.fix41.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.fix41.IndicationofInterest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix41.IndicationofInterest.NoIOIQualifiers();
	
				}
				break;
	
			case quickfix.fix41.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix41.News.NoRelatedSym();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix41.News.LinesOfText();
	
				}
				break;
	
			case quickfix.fix41.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix41.Email.NoRelatedSym();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix41.Email.LinesOfText();
	
				}
				break;
	
			case quickfix.fix41.Allocation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix41.Allocation.NoOrders();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix41.Allocation.NoExecs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix41.Allocation.NoAllocs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix41.Allocation.NoAllocs.NoMiscFees();
	
				}
				break;
	
			case quickfix.fix41.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix41.ListStatus.NoOrders();
	
				}
				break;
	
		}

		return null;
	}
}
