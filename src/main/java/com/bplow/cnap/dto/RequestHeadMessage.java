/**
 * www.bplow.com
 */
package com.bplow.cnap.dto;

import com.bplow.cnap.anontation.block;

/**
 * @desc 
 * @author wangxiaolei
 * @date 2018年11月4日 下午3:36:30
 */
public class RequestHeadMessage {
	
	@block(index=0,lenght=3,value="{H:")
	public String beginFlag;//起始标识
	
	@block(index=1,lenght=2,value="02")
	public String versionId;//版本号
	
	@block(index=2,lenght=14,value="")
	public String origSender;//报文发起人
	
	@block(index=3,lenght=4,value="")
	public String origSenderSID;//发送系统号
	
	@block(index=4,lenght=14,value="")
	public String origReceiver;//报文接收人
	
	@block(index=5,lenght=4,value="")
	public String origReceiverSID;//接收系统号
	
	@block(index=6,lenght=8,value="")
	public String origSendDate;//报文发起日期
	
	@block(index=7,lenght=6,value="")
	public String origSendTime;//报文发起时间
	
	@block(index=8,lenght=3,value="")
	public String structType;//格式类型
	
	@block(index=9,lenght=20,value="")
	public String mesgType;//报文类型代码
	
	@block(index=10,lenght=20,value="")
	public String mesgId;//通信级标识号
	
	@block(index=11,lenght=20,value="")
	public String mesgRefId;//通信级参考号
	
	@block(index=12,lenght=1,value="3")
	public String mesgPriority;//报文优先级
	
	@block(index=13,lenght=1,value="")
	public String mesgDirection;//报文传输方向
	
	@block(index=14,lenght=9,value="")
	public String reserve;//保留域
	
	@block(index=15,lenght=3,value="}\r\n")
	public String EndFlag;//结束标识

	public String getBeginFlag() {
		return beginFlag;
	}

	public void setBeginFlag(String beginFlag) {
		this.beginFlag = beginFlag;
	}

	public String getVersionId() {
		return versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getOrigSender() {
		return origSender;
	}

	public void setOrigSender(String origSender) {
		this.origSender = origSender;
	}

	public String getOrigSenderSID() {
		return origSenderSID;
	}

	public void setOrigSenderSID(String origSenderSID) {
		this.origSenderSID = origSenderSID;
	}

	public String getOrigReceiver() {
		return origReceiver;
	}

	public void setOrigReceiver(String origReceiver) {
		this.origReceiver = origReceiver;
	}

	public String getOrigReceiverSID() {
		return origReceiverSID;
	}

	public void setOrigReceiverSID(String origReceiverSID) {
		this.origReceiverSID = origReceiverSID;
	}

	public String getOrigSendDate() {
		return origSendDate;
	}

	public void setOrigSendDate(String origSendDate) {
		this.origSendDate = origSendDate;
	}

	public String getOrigSendTime() {
		return origSendTime;
	}

	public void setOrigSendTime(String origSendTime) {
		this.origSendTime = origSendTime;
	}

	public String getStructType() {
		return structType;
	}

	public void setStructType(String structType) {
		this.structType = structType;
	}

	public String getMesgType() {
		return mesgType;
	}

	public void setMesgType(String mesgType) {
		this.mesgType = mesgType;
	}

	public String getMesgId() {
		return mesgId;
	}

	public void setMesgId(String mesgId) {
		this.mesgId = mesgId;
	}

	public String getMesgRefId() {
		return mesgRefId;
	}

	public void setMesgRefId(String mesgRefId) {
		this.mesgRefId = mesgRefId;
	}

	public String getMesgPriority() {
		return mesgPriority;
	}

	public void setMesgPriority(String mesgPriority) {
		this.mesgPriority = mesgPriority;
	}

	public String getMesgDirection() {
		return mesgDirection;
	}

	public void setMesgDirection(String mesgDirection) {
		this.mesgDirection = mesgDirection;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getEndFlag() {
		return EndFlag;
	}

	public void setEndFlag(String endFlag) {
		EndFlag = endFlag;
	}
	
}
