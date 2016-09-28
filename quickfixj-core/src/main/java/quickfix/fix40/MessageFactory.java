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

package quickfix.fix40;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.fix40.Heartbeat.MSGTYPE:
				return new quickfix.fix40.Heartbeat();
	
			case quickfix.fix40.Logon.MSGTYPE:
				return new quickfix.fix40.Logon();
	
			case quickfix.fix40.TestRequest.MSGTYPE:
				return new quickfix.fix40.TestRequest();
	
			case quickfix.fix40.ResendRequest.MSGTYPE:
				return new quickfix.fix40.ResendRequest();
	
			case quickfix.fix40.Reject.MSGTYPE:
				return new quickfix.fix40.Reject();
	
			case quickfix.fix40.SequenceReset.MSGTYPE:
				return new quickfix.fix40.SequenceReset();
	
			case quickfix.fix40.Logout.MSGTYPE:
				return new quickfix.fix40.Logout();
	
			case quickfix.fix40.Advertisement.MSGTYPE:
				return new quickfix.fix40.Advertisement();
	
			case quickfix.fix40.IndicationofInterest.MSGTYPE:
				return new quickfix.fix40.IndicationofInterest();
	
			case quickfix.fix40.News.MSGTYPE:
				return new quickfix.fix40.News();
	
			case quickfix.fix40.Email.MSGTYPE:
				return new quickfix.fix40.Email();
	
			case quickfix.fix40.QuoteRequest.MSGTYPE:
				return new quickfix.fix40.QuoteRequest();
	
			case quickfix.fix40.Quote.MSGTYPE:
				return new quickfix.fix40.Quote();
	
			case quickfix.fix40.NewOrderSingle.MSGTYPE:
				return new quickfix.fix40.NewOrderSingle();
	
			case quickfix.fix40.ExecutionReport.MSGTYPE:
				return new quickfix.fix40.ExecutionReport();
	
			case quickfix.fix40.DontKnowTrade.MSGTYPE:
				return new quickfix.fix40.DontKnowTrade();
	
			case quickfix.fix40.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix40.OrderCancelReplaceRequest();
	
			case quickfix.fix40.OrderCancelRequest.MSGTYPE:
				return new quickfix.fix40.OrderCancelRequest();
	
			case quickfix.fix40.OrderCancelReject.MSGTYPE:
				return new quickfix.fix40.OrderCancelReject();
	
			case quickfix.fix40.OrderStatusRequest.MSGTYPE:
				return new quickfix.fix40.OrderStatusRequest();
	
			case quickfix.fix40.Allocation.MSGTYPE:
				return new quickfix.fix40.Allocation();
	
			case quickfix.fix40.AllocationACK.MSGTYPE:
				return new quickfix.fix40.AllocationACK();
	
			case quickfix.fix40.NewOrderList.MSGTYPE:
				return new quickfix.fix40.NewOrderList();
	
			case quickfix.fix40.ListStatus.MSGTYPE:
				return new quickfix.fix40.ListStatus();
	
			case quickfix.fix40.ListExecute.MSGTYPE:
				return new quickfix.fix40.ListExecute();
	
			case quickfix.fix40.ListCancelRequest.MSGTYPE:
				return new quickfix.fix40.ListCancelRequest();
	
			case quickfix.fix40.ListStatusRequest.MSGTYPE:
				return new quickfix.fix40.ListStatusRequest();
	
		}

		return new quickfix.fix40.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.fix40.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix40.News.LinesOfText();
	
				}
				break;
	
			case quickfix.fix40.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix40.Email.LinesOfText();
	
				}
				break;
	
			case quickfix.fix40.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix40.ExecutionReport.NoMiscFees();
	
				}
				break;
	
			case quickfix.fix40.Allocation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix40.Allocation.NoOrders();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix40.Allocation.NoExecs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix40.Allocation.NoMiscFees();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix40.Allocation.NoAllocs();
	
				case quickfix.field.NoDlvyInst.FIELD:
					return new quickfix.fix40.Allocation.NoAllocs.NoDlvyInst();
	
				}
				break;
	
			case quickfix.fix40.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix40.ListStatus.NoOrders();
	
				}
				break;
	
		}

		return null;
	}
}
