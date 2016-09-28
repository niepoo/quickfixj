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

package quickfix.fix50;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.fix50.BusinessMessageReject.MSGTYPE:
				return new quickfix.fix50.BusinessMessageReject();
	
			case quickfix.fix50.UserRequest.MSGTYPE:
				return new quickfix.fix50.UserRequest();
	
			case quickfix.fix50.UserResponse.MSGTYPE:
				return new quickfix.fix50.UserResponse();
	
			case quickfix.fix50.Advertisement.MSGTYPE:
				return new quickfix.fix50.Advertisement();
	
			case quickfix.fix50.News.MSGTYPE:
				return new quickfix.fix50.News();
	
			case quickfix.fix50.Email.MSGTYPE:
				return new quickfix.fix50.Email();
	
			case quickfix.fix50.QuoteRequest.MSGTYPE:
				return new quickfix.fix50.QuoteRequest();
	
			case quickfix.fix50.QuoteResponse.MSGTYPE:
				return new quickfix.fix50.QuoteResponse();
	
			case quickfix.fix50.QuoteRequestReject.MSGTYPE:
				return new quickfix.fix50.QuoteRequestReject();
	
			case quickfix.fix50.RFQRequest.MSGTYPE:
				return new quickfix.fix50.RFQRequest();
	
			case quickfix.fix50.Quote.MSGTYPE:
				return new quickfix.fix50.Quote();
	
			case quickfix.fix50.QuoteCancel.MSGTYPE:
				return new quickfix.fix50.QuoteCancel();
	
			case quickfix.fix50.QuoteStatusRequest.MSGTYPE:
				return new quickfix.fix50.QuoteStatusRequest();
	
			case quickfix.fix50.QuoteStatusReport.MSGTYPE:
				return new quickfix.fix50.QuoteStatusReport();
	
			case quickfix.fix50.MassQuote.MSGTYPE:
				return new quickfix.fix50.MassQuote();
	
			case quickfix.fix50.MassQuoteAcknowledgement.MSGTYPE:
				return new quickfix.fix50.MassQuoteAcknowledgement();
	
			case quickfix.fix50.MarketDataRequest.MSGTYPE:
				return new quickfix.fix50.MarketDataRequest();
	
			case quickfix.fix50.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.fix50.MarketDataSnapshotFullRefresh();
	
			case quickfix.fix50.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.fix50.MarketDataIncrementalRefresh();
	
			case quickfix.fix50.MarketDataRequestReject.MSGTYPE:
				return new quickfix.fix50.MarketDataRequestReject();
	
			case quickfix.fix50.SecurityDefinitionRequest.MSGTYPE:
				return new quickfix.fix50.SecurityDefinitionRequest();
	
			case quickfix.fix50.SecurityDefinition.MSGTYPE:
				return new quickfix.fix50.SecurityDefinition();
	
			case quickfix.fix50.SecurityTypeRequest.MSGTYPE:
				return new quickfix.fix50.SecurityTypeRequest();
	
			case quickfix.fix50.SecurityTypes.MSGTYPE:
				return new quickfix.fix50.SecurityTypes();
	
			case quickfix.fix50.SecurityListRequest.MSGTYPE:
				return new quickfix.fix50.SecurityListRequest();
	
			case quickfix.fix50.SecurityList.MSGTYPE:
				return new quickfix.fix50.SecurityList();
	
			case quickfix.fix50.DerivativeSecurityListRequest.MSGTYPE:
				return new quickfix.fix50.DerivativeSecurityListRequest();
	
			case quickfix.fix50.DerivativeSecurityList.MSGTYPE:
				return new quickfix.fix50.DerivativeSecurityList();
	
			case quickfix.fix50.SecurityStatusRequest.MSGTYPE:
				return new quickfix.fix50.SecurityStatusRequest();
	
			case quickfix.fix50.SecurityStatus.MSGTYPE:
				return new quickfix.fix50.SecurityStatus();
	
			case quickfix.fix50.TradingSessionStatusRequest.MSGTYPE:
				return new quickfix.fix50.TradingSessionStatusRequest();
	
			case quickfix.fix50.TradingSessionStatus.MSGTYPE:
				return new quickfix.fix50.TradingSessionStatus();
	
			case quickfix.fix50.NewOrderSingle.MSGTYPE:
				return new quickfix.fix50.NewOrderSingle();
	
			case quickfix.fix50.ExecutionReport.MSGTYPE:
				return new quickfix.fix50.ExecutionReport();
	
			case quickfix.fix50.DontKnowTradeDK.MSGTYPE:
				return new quickfix.fix50.DontKnowTradeDK();
	
			case quickfix.fix50.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix50.OrderCancelReplaceRequest();
	
			case quickfix.fix50.OrderCancelRequest.MSGTYPE:
				return new quickfix.fix50.OrderCancelRequest();
	
			case quickfix.fix50.OrderCancelReject.MSGTYPE:
				return new quickfix.fix50.OrderCancelReject();
	
			case quickfix.fix50.OrderStatusRequest.MSGTYPE:
				return new quickfix.fix50.OrderStatusRequest();
	
			case quickfix.fix50.OrderMassCancelRequest.MSGTYPE:
				return new quickfix.fix50.OrderMassCancelRequest();
	
			case quickfix.fix50.OrderMassCancelReport.MSGTYPE:
				return new quickfix.fix50.OrderMassCancelReport();
	
			case quickfix.fix50.OrderMassStatusRequest.MSGTYPE:
				return new quickfix.fix50.OrderMassStatusRequest();
	
			case quickfix.fix50.NewOrderCross.MSGTYPE:
				return new quickfix.fix50.NewOrderCross();
	
			case quickfix.fix50.CrossOrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix50.CrossOrderCancelReplaceRequest();
	
			case quickfix.fix50.CrossOrderCancelRequest.MSGTYPE:
				return new quickfix.fix50.CrossOrderCancelRequest();
	
			case quickfix.fix50.NewOrderMultileg.MSGTYPE:
				return new quickfix.fix50.NewOrderMultileg();
	
			case quickfix.fix50.MultilegOrderCancelReplace.MSGTYPE:
				return new quickfix.fix50.MultilegOrderCancelReplace();
	
			case quickfix.fix50.BidRequest.MSGTYPE:
				return new quickfix.fix50.BidRequest();
	
			case quickfix.fix50.BidResponse.MSGTYPE:
				return new quickfix.fix50.BidResponse();
	
			case quickfix.fix50.NewOrderList.MSGTYPE:
				return new quickfix.fix50.NewOrderList();
	
			case quickfix.fix50.ListStrikePrice.MSGTYPE:
				return new quickfix.fix50.ListStrikePrice();
	
			case quickfix.fix50.ListStatus.MSGTYPE:
				return new quickfix.fix50.ListStatus();
	
			case quickfix.fix50.ListExecute.MSGTYPE:
				return new quickfix.fix50.ListExecute();
	
			case quickfix.fix50.ListCancelRequest.MSGTYPE:
				return new quickfix.fix50.ListCancelRequest();
	
			case quickfix.fix50.ListStatusRequest.MSGTYPE:
				return new quickfix.fix50.ListStatusRequest();
	
			case quickfix.fix50.AllocationInstruction.MSGTYPE:
				return new quickfix.fix50.AllocationInstruction();
	
			case quickfix.fix50.AllocationInstructionAck.MSGTYPE:
				return new quickfix.fix50.AllocationInstructionAck();
	
			case quickfix.fix50.AllocationReport.MSGTYPE:
				return new quickfix.fix50.AllocationReport();
	
			case quickfix.fix50.AllocationReportAck.MSGTYPE:
				return new quickfix.fix50.AllocationReportAck();
	
			case quickfix.fix50.Confirmation.MSGTYPE:
				return new quickfix.fix50.Confirmation();
	
			case quickfix.fix50.Confirmation_Ack.MSGTYPE:
				return new quickfix.fix50.Confirmation_Ack();
	
			case quickfix.fix50.ConfirmationRequest.MSGTYPE:
				return new quickfix.fix50.ConfirmationRequest();
	
			case quickfix.fix50.SettlementInstructions.MSGTYPE:
				return new quickfix.fix50.SettlementInstructions();
	
			case quickfix.fix50.SettlementInstructionRequest.MSGTYPE:
				return new quickfix.fix50.SettlementInstructionRequest();
	
			case quickfix.fix50.TradeCaptureReportRequest.MSGTYPE:
				return new quickfix.fix50.TradeCaptureReportRequest();
	
			case quickfix.fix50.TradeCaptureReportRequestAck.MSGTYPE:
				return new quickfix.fix50.TradeCaptureReportRequestAck();
	
			case quickfix.fix50.TradeCaptureReport.MSGTYPE:
				return new quickfix.fix50.TradeCaptureReport();
	
			case quickfix.fix50.TradeCaptureReportAck.MSGTYPE:
				return new quickfix.fix50.TradeCaptureReportAck();
	
			case quickfix.fix50.RegistrationInstructions.MSGTYPE:
				return new quickfix.fix50.RegistrationInstructions();
	
			case quickfix.fix50.RegistrationInstructionsResponse.MSGTYPE:
				return new quickfix.fix50.RegistrationInstructionsResponse();
	
			case quickfix.fix50.PositionMaintenanceRequest.MSGTYPE:
				return new quickfix.fix50.PositionMaintenanceRequest();
	
			case quickfix.fix50.PositionMaintenanceReport.MSGTYPE:
				return new quickfix.fix50.PositionMaintenanceReport();
	
			case quickfix.fix50.RequestForPositions.MSGTYPE:
				return new quickfix.fix50.RequestForPositions();
	
			case quickfix.fix50.RequestForPositionsAck.MSGTYPE:
				return new quickfix.fix50.RequestForPositionsAck();
	
			case quickfix.fix50.PositionReport.MSGTYPE:
				return new quickfix.fix50.PositionReport();
	
			case quickfix.fix50.AssignmentReport.MSGTYPE:
				return new quickfix.fix50.AssignmentReport();
	
			case quickfix.fix50.CollateralRequest.MSGTYPE:
				return new quickfix.fix50.CollateralRequest();
	
			case quickfix.fix50.CollateralAssignment.MSGTYPE:
				return new quickfix.fix50.CollateralAssignment();
	
			case quickfix.fix50.CollateralResponse.MSGTYPE:
				return new quickfix.fix50.CollateralResponse();
	
			case quickfix.fix50.CollateralReport.MSGTYPE:
				return new quickfix.fix50.CollateralReport();
	
			case quickfix.fix50.CollateralInquiry.MSGTYPE:
				return new quickfix.fix50.CollateralInquiry();
	
			case quickfix.fix50.NetworkCounterpartySystemStatusRequest.MSGTYPE:
				return new quickfix.fix50.NetworkCounterpartySystemStatusRequest();
	
			case quickfix.fix50.NetworkCounterpartySystemStatusResponse.MSGTYPE:
				return new quickfix.fix50.NetworkCounterpartySystemStatusResponse();
	
			case quickfix.fix50.CollateralInquiryAck.MSGTYPE:
				return new quickfix.fix50.CollateralInquiryAck();
	
			case quickfix.fix50.ContraryIntentionReport.MSGTYPE:
				return new quickfix.fix50.ContraryIntentionReport();
	
			case quickfix.fix50.SecurityDefinitionUpdateReport.MSGTYPE:
				return new quickfix.fix50.SecurityDefinitionUpdateReport();
	
			case quickfix.fix50.SecurityListUpdateReport.MSGTYPE:
				return new quickfix.fix50.SecurityListUpdateReport();
	
			case quickfix.fix50.AdjustedPositionReport.MSGTYPE:
				return new quickfix.fix50.AdjustedPositionReport();
	
			case quickfix.fix50.AllocationInstructionAlert.MSGTYPE:
				return new quickfix.fix50.AllocationInstructionAlert();
	
			case quickfix.fix50.ExecutionAcknowledgement.MSGTYPE:
				return new quickfix.fix50.ExecutionAcknowledgement();
	
			case quickfix.fix50.TradingSessionList.MSGTYPE:
				return new quickfix.fix50.TradingSessionList();
	
			case quickfix.fix50.TradingSessionListRequest.MSGTYPE:
				return new quickfix.fix50.TradingSessionListRequest();
	
			case quickfix.fix50.IOI.MSGTYPE:
				return new quickfix.fix50.IOI();
	
		}

		return new quickfix.fix50.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.fix50.Advertisement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.Advertisement.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.Advertisement.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50.News.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.News.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.News.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.News.NoUnderlyings();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50.News.NoLinesOfText();
	
				}
				break;
	
			case quickfix.fix50.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50.Email.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.Email.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.Email.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.Email.NoLegs();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50.Email.NoLinesOfText();
	
				}
				break;
	
			case quickfix.fix50.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.QuoteResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50.QuoteResponse.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.QuoteResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.QuoteResponse.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.QuoteResponse.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.QuoteResponse.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.QuoteResponse.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.QuoteResponse.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.QuoteRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteRequestReject.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.RFQRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.RFQRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.RFQRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.RFQRequest.NoRelatedSym.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.Quote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50.Quote.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.Quote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.Quote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.Quote.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.Quote.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.Quote.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.Quote.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.Quote.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.QuoteCancel.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.QuoteCancel.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteCancel.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50.QuoteCancel.NoQuoteEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.QuoteCancel.NoQuoteEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.QuoteCancel.NoQuoteEntries.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.QuoteStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.QuoteStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.QuoteStatusRequest.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.QuoteStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.QuoteStatusReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50.QuoteStatusReport.NoQuoteQualifiers();
	
				}
				break;
	
			case quickfix.fix50.MassQuote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.MassQuote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.MassQuote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50.MassQuote.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.MassQuoteAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.MassQuoteAcknowledgement.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50.MassQuoteAcknowledgement.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntryTypes.FIELD:
					return new quickfix.fix50.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.MarketDataRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.MarketDataRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.MarketDataRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.MarketDataRequest.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix50.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoLegs();
	
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50.MarketDataSnapshotFullRefresh.NoRoutingIDs();
	
				}
				break;
	
			case quickfix.fix50.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50.MarketDataIncrementalRefresh.NoRoutingIDs();
	
				}
				break;
	
			case quickfix.fix50.MarketDataRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAltMDSource.FIELD:
					return new quickfix.fix50.MarketDataRequestReject.NoAltMDSource();
	
				}
				break;
	
			case quickfix.fix50.SecurityDefinitionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.SecurityDefinitionRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityDefinitionRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.SecurityDefinition.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityDefinition.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.SecurityTypes.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityTypes.FIELD:
					return new quickfix.fix50.SecurityTypes.NoSecurityTypes();
	
				}
				break;
	
			case quickfix.fix50.SecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.SecurityListRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityListRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.SecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.SecurityList.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.SecurityList.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.SecurityList.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
	
				}
				break;
	
			case quickfix.fix50.DerivativeSecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				}
				break;
	
			case quickfix.fix50.DerivativeSecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.DerivativeSecurityList.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.SecurityStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.SecurityStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityStatusRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.SecurityStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.SecurityStatus.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityStatus.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.TradingSessionStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				}
				break;
	
			case quickfix.fix50.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.NewOrderSingle.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix50.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.ExecutionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoContraBrokers.FIELD:
					return new quickfix.fix50.ExecutionReport.NoContraBrokers();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.ExecutionReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.ExecutionReport.NoStipulations();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50.ExecutionReport.NoContAmts();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.ExecutionReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.ExecutionReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.ExecutionReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.ExecutionReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.ExecutionReport.NoMiscFees();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.ExecutionReport.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.ExecutionReport.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix50.DontKnowTradeDK.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.DontKnowTradeDK.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.DontKnowTradeDK.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.OrderCancelReplaceRequest.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix50.OrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.OrderCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.OrderCancelRequest.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.OrderStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.OrderStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.OrderStatusRequest.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.OrderMassCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.OrderMassCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.OrderMassCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.OrderMassCancelReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.OrderMassCancelReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.OrderMassCancelReport.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.OrderMassStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.OrderMassStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.NewOrderCross.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50.NewOrderCross.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.NewOrderCross.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.NewOrderCross.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.NewOrderCross.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.NewOrderCross.NoStrategyParameters();
	
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderCross.NoRootPartyIDs.NoRootPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.CrossOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoStrategyParameters();
	
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelReplaceRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.CrossOrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50.CrossOrderCancelRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CrossOrderCancelRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CrossOrderCancelRequest.NoLegs();
	
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50.CrossOrderCancelRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.NewOrderMultileg.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.NewOrderMultileg.NoStrategyParameters();
	
				}
				break;
	
			case quickfix.fix50.MultilegOrderCancelReplace.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.MultilegOrderCancelReplace.NoStrategyParameters();
	
				}
				break;
	
			case quickfix.fix50.BidRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidDescriptors.FIELD:
					return new quickfix.fix50.BidRequest.NoBidDescriptors();
	
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50.BidRequest.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix50.BidResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50.BidResponse.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix50.NewOrderList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50.NewOrderList.NoOrders.NoStrategyParameters();
	
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50.NewOrderList.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50.NewOrderList.NoRootPartyIDs.NoRootPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.ListStrikePrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoStrikes.FIELD:
					return new quickfix.fix50.ListStrikePrice.NoStrikes();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.ListStrikePrice.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50.ListStatus.NoOrders();
	
				}
				break;
	
			case quickfix.fix50.ListCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.ListCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.ListCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.AllocationInstruction.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoStipulations();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoAllocs.NoClearingInstructions();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.AllocationInstruction.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50.AllocationInstructionAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.AllocationInstructionAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.AllocationReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50.AllocationReport.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.AllocationReport.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.AllocationReport.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.AllocationReport.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.AllocationReport.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.AllocationReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.AllocationReport.NoStipulations();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.AllocationReport.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.AllocationReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.AllocationReport.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50.AllocationReport.NoAllocs.NoClearingInstructions();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.AllocationReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50.AllocationReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.AllocationReportAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.AllocationReportAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.AllocationReportAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationReportAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.Confirmation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.Confirmation.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.Confirmation.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50.Confirmation.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.Confirmation.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.Confirmation.NoTrdRegTimestamps();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.Confirmation.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.Confirmation.NoLegs();
	
				case quickfix.field.NoCapacities.FIELD:
					return new quickfix.fix50.Confirmation.NoCapacities();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.Confirmation.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.Confirmation.NoMiscFees();
	
				}
				break;
	
			case quickfix.fix50.ConfirmationRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50.ConfirmationRequest.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.SettlementInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlInst.FIELD:
					return new quickfix.fix50.SettlementInstructions.NoSettlInst();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.SettlementInstructions.NoSettlInst.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.SettlementInstructionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.SettlementInstructionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.TradeCaptureReportRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.TradeCaptureReportRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.TradeCaptureReportRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.TradeCaptureReportRequestAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.TradeCaptureReportRequestAck.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.TradeCaptureReportRequestAck.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.TradeCaptureReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoUnderlyings();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoPosAmt();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoMiscFees();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoSides.NoSideTrdRegTS();
	
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReport.NoRootPartyIDs.NoRootPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.TradeCaptureReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoTrdRegTimestamps();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoPosAmt();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoMiscFees();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoSides.NoSideTrdRegTS();
	
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.TradeCaptureReportAck.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.RegistrationInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.RegistrationInstructions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRegistDtls.FIELD:
					return new quickfix.fix50.RegistrationInstructions.NoRegistDtls();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoDistribInsts.FIELD:
					return new quickfix.fix50.RegistrationInstructions.NoDistribInsts();
	
				}
				break;
	
			case quickfix.fix50.RegistrationInstructionsResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.RegistrationInstructionsResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.PositionMaintenanceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.PositionMaintenanceRequest.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50.PositionMaintenanceReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.PositionMaintenanceReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50.RequestForPositions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.RequestForPositions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.RequestForPositions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.RequestForPositions.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.RequestForPositions.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.RequestForPositions.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix50.RequestForPositionsAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.RequestForPositionsAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.RequestForPositionsAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.RequestForPositionsAck.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.PositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.PositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.PositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.PositionReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.PositionReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingAmounts.FIELD:
					return new quickfix.fix50.PositionReport.NoUnderlyings.NoUnderlyingAmounts();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50.PositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.PositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.PositionReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50.AssignmentReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.AssignmentReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.AssignmentReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.AssignmentReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.AssignmentReport.NoUnderlyings();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50.AssignmentReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.AssignmentReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.AssignmentReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50.CollateralRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CollateralRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CollateralRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.CollateralRequest.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50.CollateralRequest.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CollateralRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CollateralRequest.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.CollateralRequest.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.CollateralRequest.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.CollateralRequest.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50.CollateralAssignment.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.CollateralAssignment.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50.CollateralResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CollateralResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CollateralResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.CollateralResponse.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50.CollateralResponse.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CollateralResponse.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CollateralResponse.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.CollateralResponse.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.CollateralResponse.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.CollateralResponse.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50.CollateralReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CollateralReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CollateralReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.CollateralReport.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50.CollateralReport.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CollateralReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CollateralReport.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.CollateralReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.CollateralReport.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.CollateralReport.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50.CollateralInquiry.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.CollateralInquiry.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50.NetworkCounterpartySystemStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50.NetworkCounterpartySystemStatusRequest.NoCompIDs();
	
				}
				break;
	
			case quickfix.fix50.NetworkCounterpartySystemStatusResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50.NetworkCounterpartySystemStatusResponse.NoCompIDs();
	
				}
				break;
	
			case quickfix.fix50.CollateralInquiryAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50.CollateralInquiryAck.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.CollateralInquiryAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.CollateralInquiryAck.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50.CollateralInquiryAck.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.CollateralInquiryAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.CollateralInquiryAck.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.ContraryIntentionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.ContraryIntentionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.ContraryIntentionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExpiration.FIELD:
					return new quickfix.fix50.ContraryIntentionReport.NoExpiration();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.ContraryIntentionReport.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50.SecurityDefinitionUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityDefinitionUpdateReport.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.SecurityListUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.SecurityListUpdateReport.NoRelatedSym.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50.AdjustedPositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.AdjustedPositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.AdjustedPositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50.AdjustedPositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.AdjustedPositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.AdjustedPositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50.AllocationInstructionAlert.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50.AllocationInstructionAlert.NoAllocs.NoClearingInstructions();
	
				}
				break;
	
			case quickfix.fix50.ExecutionAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.ExecutionAcknowledgement.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.ExecutionAcknowledgement.NoLegs();
	
				}
				break;
	
			case quickfix.fix50.TradingSessionList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50.TradingSessionList.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix50.IOI.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50.IOI.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50.IOI.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50.IOI.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50.IOI.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix50.IOI.NoIOIQualifiers();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50.IOI.NoRoutingIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50.IOI.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50.IOI.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
		}

		return null;
	}
}
