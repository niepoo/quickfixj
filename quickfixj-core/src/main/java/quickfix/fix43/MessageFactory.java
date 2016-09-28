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

package quickfix.fix43;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.fix43.Heartbeat.MSGTYPE:
				return new quickfix.fix43.Heartbeat();
	
			case quickfix.fix43.Logon.MSGTYPE:
				return new quickfix.fix43.Logon();
	
			case quickfix.fix43.TestRequest.MSGTYPE:
				return new quickfix.fix43.TestRequest();
	
			case quickfix.fix43.ResendRequest.MSGTYPE:
				return new quickfix.fix43.ResendRequest();
	
			case quickfix.fix43.Reject.MSGTYPE:
				return new quickfix.fix43.Reject();
	
			case quickfix.fix43.SequenceReset.MSGTYPE:
				return new quickfix.fix43.SequenceReset();
	
			case quickfix.fix43.Logout.MSGTYPE:
				return new quickfix.fix43.Logout();
	
			case quickfix.fix43.BusinessMessageReject.MSGTYPE:
				return new quickfix.fix43.BusinessMessageReject();
	
			case quickfix.fix43.Advertisement.MSGTYPE:
				return new quickfix.fix43.Advertisement();
	
			case quickfix.fix43.IndicationOfInterest.MSGTYPE:
				return new quickfix.fix43.IndicationOfInterest();
	
			case quickfix.fix43.News.MSGTYPE:
				return new quickfix.fix43.News();
	
			case quickfix.fix43.Email.MSGTYPE:
				return new quickfix.fix43.Email();
	
			case quickfix.fix43.QuoteRequest.MSGTYPE:
				return new quickfix.fix43.QuoteRequest();
	
			case quickfix.fix43.QuoteRequestReject.MSGTYPE:
				return new quickfix.fix43.QuoteRequestReject();
	
			case quickfix.fix43.RFQRequest.MSGTYPE:
				return new quickfix.fix43.RFQRequest();
	
			case quickfix.fix43.Quote.MSGTYPE:
				return new quickfix.fix43.Quote();
	
			case quickfix.fix43.QuoteCancel.MSGTYPE:
				return new quickfix.fix43.QuoteCancel();
	
			case quickfix.fix43.QuoteStatusRequest.MSGTYPE:
				return new quickfix.fix43.QuoteStatusRequest();
	
			case quickfix.fix43.QuoteStatusReport.MSGTYPE:
				return new quickfix.fix43.QuoteStatusReport();
	
			case quickfix.fix43.MassQuote.MSGTYPE:
				return new quickfix.fix43.MassQuote();
	
			case quickfix.fix43.MassQuoteAcknowledgement.MSGTYPE:
				return new quickfix.fix43.MassQuoteAcknowledgement();
	
			case quickfix.fix43.MarketDataRequest.MSGTYPE:
				return new quickfix.fix43.MarketDataRequest();
	
			case quickfix.fix43.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.fix43.MarketDataSnapshotFullRefresh();
	
			case quickfix.fix43.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.fix43.MarketDataIncrementalRefresh();
	
			case quickfix.fix43.MarketDataRequestReject.MSGTYPE:
				return new quickfix.fix43.MarketDataRequestReject();
	
			case quickfix.fix43.SecurityDefinitionRequest.MSGTYPE:
				return new quickfix.fix43.SecurityDefinitionRequest();
	
			case quickfix.fix43.SecurityDefinition.MSGTYPE:
				return new quickfix.fix43.SecurityDefinition();
	
			case quickfix.fix43.SecurityTypeRequest.MSGTYPE:
				return new quickfix.fix43.SecurityTypeRequest();
	
			case quickfix.fix43.SecurityTypes.MSGTYPE:
				return new quickfix.fix43.SecurityTypes();
	
			case quickfix.fix43.SecurityListRequest.MSGTYPE:
				return new quickfix.fix43.SecurityListRequest();
	
			case quickfix.fix43.SecurityList.MSGTYPE:
				return new quickfix.fix43.SecurityList();
	
			case quickfix.fix43.DerivativeSecurityListRequest.MSGTYPE:
				return new quickfix.fix43.DerivativeSecurityListRequest();
	
			case quickfix.fix43.DerivativeSecurityList.MSGTYPE:
				return new quickfix.fix43.DerivativeSecurityList();
	
			case quickfix.fix43.SecurityStatusRequest.MSGTYPE:
				return new quickfix.fix43.SecurityStatusRequest();
	
			case quickfix.fix43.SecurityStatus.MSGTYPE:
				return new quickfix.fix43.SecurityStatus();
	
			case quickfix.fix43.TradingSessionStatusRequest.MSGTYPE:
				return new quickfix.fix43.TradingSessionStatusRequest();
	
			case quickfix.fix43.TradingSessionStatus.MSGTYPE:
				return new quickfix.fix43.TradingSessionStatus();
	
			case quickfix.fix43.NewOrderSingle.MSGTYPE:
				return new quickfix.fix43.NewOrderSingle();
	
			case quickfix.fix43.ExecutionReport.MSGTYPE:
				return new quickfix.fix43.ExecutionReport();
	
			case quickfix.fix43.DontKnowTrade.MSGTYPE:
				return new quickfix.fix43.DontKnowTrade();
	
			case quickfix.fix43.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix43.OrderCancelReplaceRequest();
	
			case quickfix.fix43.OrderCancelRequest.MSGTYPE:
				return new quickfix.fix43.OrderCancelRequest();
	
			case quickfix.fix43.OrderCancelReject.MSGTYPE:
				return new quickfix.fix43.OrderCancelReject();
	
			case quickfix.fix43.OrderStatusRequest.MSGTYPE:
				return new quickfix.fix43.OrderStatusRequest();
	
			case quickfix.fix43.OrderMassCancelRequest.MSGTYPE:
				return new quickfix.fix43.OrderMassCancelRequest();
	
			case quickfix.fix43.OrderMassCancelReport.MSGTYPE:
				return new quickfix.fix43.OrderMassCancelReport();
	
			case quickfix.fix43.OrderMassStatusRequest.MSGTYPE:
				return new quickfix.fix43.OrderMassStatusRequest();
	
			case quickfix.fix43.NewOrderCross.MSGTYPE:
				return new quickfix.fix43.NewOrderCross();
	
			case quickfix.fix43.CrossOrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix43.CrossOrderCancelReplaceRequest();
	
			case quickfix.fix43.CrossOrderCancelRequest.MSGTYPE:
				return new quickfix.fix43.CrossOrderCancelRequest();
	
			case quickfix.fix43.NewOrderMultileg.MSGTYPE:
				return new quickfix.fix43.NewOrderMultileg();
	
			case quickfix.fix43.MultilegOrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix43.MultilegOrderCancelReplaceRequest();
	
			case quickfix.fix43.BidRequest.MSGTYPE:
				return new quickfix.fix43.BidRequest();
	
			case quickfix.fix43.BidResponse.MSGTYPE:
				return new quickfix.fix43.BidResponse();
	
			case quickfix.fix43.NewOrderList.MSGTYPE:
				return new quickfix.fix43.NewOrderList();
	
			case quickfix.fix43.ListStrikePrice.MSGTYPE:
				return new quickfix.fix43.ListStrikePrice();
	
			case quickfix.fix43.ListExecute.MSGTYPE:
				return new quickfix.fix43.ListExecute();
	
			case quickfix.fix43.ListCancelRequest.MSGTYPE:
				return new quickfix.fix43.ListCancelRequest();
	
			case quickfix.fix43.ListStatusRequest.MSGTYPE:
				return new quickfix.fix43.ListStatusRequest();
	
			case quickfix.fix43.ListStatus.MSGTYPE:
				return new quickfix.fix43.ListStatus();
	
			case quickfix.fix43.Allocation.MSGTYPE:
				return new quickfix.fix43.Allocation();
	
			case quickfix.fix43.AllocationACK.MSGTYPE:
				return new quickfix.fix43.AllocationACK();
	
			case quickfix.fix43.SettlementInstructions.MSGTYPE:
				return new quickfix.fix43.SettlementInstructions();
	
			case quickfix.fix43.TradeCaptureReportRequest.MSGTYPE:
				return new quickfix.fix43.TradeCaptureReportRequest();
	
			case quickfix.fix43.TradeCaptureReport.MSGTYPE:
				return new quickfix.fix43.TradeCaptureReport();
	
			case quickfix.fix43.RegistrationInstructions.MSGTYPE:
				return new quickfix.fix43.RegistrationInstructions();
	
			case quickfix.fix43.RegistrationInstructionsResponse.MSGTYPE:
				return new quickfix.fix43.RegistrationInstructionsResponse();
	
		}

		return new quickfix.fix43.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.fix43.Logon.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMsgTypes.FIELD:
					return new quickfix.fix43.Logon.NoMsgTypes();
	
				}
				break;
	
			case quickfix.fix43.Advertisement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.Advertisement.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.IndicationOfInterest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix43.IndicationOfInterest.NoIOIQualifiers();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix43.IndicationOfInterest.NoRoutingIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.IndicationOfInterest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix43.News.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.News.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.News.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix43.News.LinesOfText();
	
				}
				break;
	
			case quickfix.fix43.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix43.Email.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.Email.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.Email.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.LinesOfText.FIELD:
					return new quickfix.fix43.Email.LinesOfText();
	
				}
				break;
	
			case quickfix.fix43.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.QuoteRequest.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.QuoteRequest.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix43.QuoteRequest.NoRelatedSym.NoStipulations();
	
				}
				break;
	
			case quickfix.fix43.QuoteRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.QuoteRequestReject.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.QuoteRequestReject.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix43.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				}
				break;
	
			case quickfix.fix43.RFQRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.RFQRequest.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.RFQRequest.NoRelatedSym.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.Quote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.Quote.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.Quote.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.QuoteCancel.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix43.QuoteCancel.NoQuoteEntries();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.QuoteCancel.NoQuoteEntries.NoSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.QuoteCancel.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.QuoteStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.QuoteStatusRequest.NoSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.QuoteStatusRequest.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.QuoteStatusReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.QuoteStatusReport.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.QuoteStatusReport.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.MassQuote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix43.MassQuote.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix43.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.MassQuote.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix43.MassQuote.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.MassQuote.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.MassQuoteAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix43.MassQuoteAcknowledgement.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.MassQuoteAcknowledgement.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntryTypes.FIELD:
					return new quickfix.fix43.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.MarketDataRequest.NoRelatedSym();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.MarketDataRequest.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.MarketDataRequest.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix43.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix43.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.MarketDataSnapshotFullRefresh.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix43.MarketDataIncrementalRefresh.NoMDEntries();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.MarketDataIncrementalRefresh.NoMDEntries.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.SecurityDefinitionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix43.SecurityDefinitionRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityDefinitionRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityDefinitionRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix43.SecurityDefinition.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityDefinition.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityDefinition.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.SecurityTypes.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityTypes.FIELD:
					return new quickfix.fix43.SecurityTypes.NoSecurityTypes();
	
				}
				break;
	
			case quickfix.fix43.SecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityListRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.SecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.SecurityList.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix43.SecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityList.NoRelatedSym.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.DerivativeSecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix43.DerivativeSecurityListRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.DerivativeSecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.DerivativeSecurityList.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix43.DerivativeSecurityList.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.SecurityStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityStatusRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.SecurityStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.SecurityStatus.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.NewOrderSingle.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.NewOrderSingle.NoTradingSessions();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderSingle.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.NewOrderSingle.NoSecurityAltID();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix43.NewOrderSingle.NoStipulations();
	
				}
				break;
	
			case quickfix.fix43.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoContraBrokers.FIELD:
					return new quickfix.fix43.ExecutionReport.NoContraBrokers();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix43.ExecutionReport.NoContAmts();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix43.ExecutionReport.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix43.ExecutionReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.ExecutionReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.ExecutionReport.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.ExecutionReport.NoSecurityAltID();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix43.ExecutionReport.NoStipulations();
	
				}
				break;
	
			case quickfix.fix43.DontKnowTrade.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.DontKnowTrade.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.OrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.OrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.OrderCancelReplaceRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.OrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.OrderCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.OrderCancelRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.OrderStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.OrderStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.OrderStatusRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.OrderMassCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.OrderMassCancelRequest.NoSecurityAltID();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix43.OrderMassCancelRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.OrderMassCancelReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix43.OrderMassCancelReport.NoAffectedOrders();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.OrderMassCancelReport.NoSecurityAltID();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix43.OrderMassCancelReport.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.OrderMassStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.OrderMassStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.OrderMassStatusRequest.NoSecurityAltID();
	
				case quickfix.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.fix43.OrderMassStatusRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.NewOrderCross.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix43.NewOrderCross.NoSides();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.NewOrderCross.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderCross.NoSides.NoPartyIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.NewOrderCross.NoTradingSessions();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.NewOrderCross.NoSecurityAltID();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix43.NewOrderCross.NoStipulations();
	
				}
				break;
	
			case quickfix.fix43.CrossOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoSecurityAltID();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix43.CrossOrderCancelReplaceRequest.NoStipulations();
	
				}
				break;
	
			case quickfix.fix43.CrossOrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix43.CrossOrderCancelRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.CrossOrderCancelRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.NewOrderMultileg.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.NewOrderMultileg.NoAllocs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.NewOrderMultileg.NoTradingSessions();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix43.NewOrderMultileg.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix43.NewOrderMultileg.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderMultileg.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.NewOrderMultileg.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.MultilegOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoLegs();
	
				case quickfix.field.NoLegSecurityAltID.FIELD:
					return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.MultilegOrderCancelReplaceRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.BidRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidDescriptors.FIELD:
					return new quickfix.fix43.BidRequest.NoBidDescriptors();
	
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix43.BidRequest.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix43.BidResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix43.BidResponse.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix43.NewOrderList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix43.NewOrderList.NoOrders();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.NewOrderList.NoOrders.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix43.NewOrderList.NoOrders.NoTradingSessions();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.NewOrderList.NoOrders.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.NewOrderList.NoOrders.NoSecurityAltID();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix43.NewOrderList.NoOrders.NoStipulations();
	
				}
				break;
	
			case quickfix.fix43.ListStrikePrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoStrikes.FIELD:
					return new quickfix.fix43.ListStrikePrice.NoStrikes();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.ListStrikePrice.NoStrikes.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix43.ListStatus.NoOrders();
	
				}
				break;
	
			case quickfix.fix43.Allocation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix43.Allocation.NoOrders();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix43.Allocation.NoExecs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix43.Allocation.NoAllocs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix43.Allocation.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.Allocation.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.Allocation.NoSecurityAltID();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.Allocation.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.AllocationACK.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.AllocationACK.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.SettlementInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.SettlementInstructions.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.TradeCaptureReportRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoDates.FIELD:
					return new quickfix.fix43.TradeCaptureReportRequest.NoDates();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.TradeCaptureReportRequest.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.TradeCaptureReportRequest.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.TradeCaptureReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix43.TradeCaptureReport.NoSides();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix43.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix43.TradeCaptureReport.NoSides.NoContAmts();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix43.TradeCaptureReport.NoSides.NoMiscFees();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case quickfix.field.NoSecurityAltID.FIELD:
					return new quickfix.fix43.TradeCaptureReport.NoSecurityAltID();
	
				}
				break;
	
			case quickfix.fix43.RegistrationInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRegistDtls.FIELD:
					return new quickfix.fix43.RegistrationInstructions.NoRegistDtls();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix43.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case quickfix.field.NoDistribInsts.FIELD:
					return new quickfix.fix43.RegistrationInstructions.NoDistribInsts();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.RegistrationInstructions.NoPartyIDs();
	
				}
				break;
	
			case quickfix.fix43.RegistrationInstructionsResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix43.RegistrationInstructionsResponse.NoPartyIDs();
	
				}
				break;
	
		}

		return null;
	}
}
