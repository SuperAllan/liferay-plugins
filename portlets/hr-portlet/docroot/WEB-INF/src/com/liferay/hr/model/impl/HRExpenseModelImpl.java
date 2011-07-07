/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.hr.model.impl;

import com.liferay.hr.model.HRExpense;
import com.liferay.hr.model.HRExpenseModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HRExpense service. Represents a row in the &quot;HRExpense&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRExpenseModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRExpenseImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRExpenseImpl
 * @see com.liferay.hr.model.HRExpense
 * @see com.liferay.hr.model.HRExpenseModel
 * @generated
 */
public class HRExpenseModelImpl extends BaseModelImpl<HRExpense>
	implements HRExpenseModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r expense model instance should use the {@link com.liferay.hr.model.HRExpense} interface instead.
	 */
	public static final String TABLE_NAME = "HRExpense";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrExpenseId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "hrExpenseAccountId", Types.BIGINT },
			{ "hrExpenseTypeId", Types.BIGINT },
			{ "hrUserId", Types.BIGINT },
			{ "expenseDate", Types.TIMESTAMP },
			{ "expenseAmount", Types.DOUBLE },
			{ "expenseHRExpenseCurrencyId", Types.BIGINT },
			{ "reimbursementAmount", Types.DOUBLE },
			{ "reimbursementHRExpenseCurrencyId", Types.BIGINT },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusByUserName", Types.VARCHAR },
			{ "statusDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table HRExpense (hrExpenseId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,hrExpenseAccountId LONG,hrExpenseTypeId LONG,hrUserId LONG,expenseDate DATE null,expenseAmount DOUBLE,expenseHRExpenseCurrencyId LONG,reimbursementAmount DOUBLE,reimbursementHRExpenseCurrencyId LONG,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table HRExpense";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRExpense"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRExpense"),
			true);

	public Class<?> getModelClass() {
		return HRExpense.class;
	}

	public String getModelClassName() {
		return HRExpense.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRExpense"));

	public HRExpenseModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrExpenseId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrExpenseId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrExpenseId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrExpenseId() {
		return _hrExpenseId;
	}

	public void setHrExpenseId(long hrExpenseId) {
		_hrExpenseId = hrExpenseId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getHrExpenseAccountId() {
		return _hrExpenseAccountId;
	}

	public void setHrExpenseAccountId(long hrExpenseAccountId) {
		_hrExpenseAccountId = hrExpenseAccountId;
	}

	public long getHrExpenseTypeId() {
		return _hrExpenseTypeId;
	}

	public void setHrExpenseTypeId(long hrExpenseTypeId) {
		_hrExpenseTypeId = hrExpenseTypeId;
	}

	public long getHrUserId() {
		return _hrUserId;
	}

	public void setHrUserId(long hrUserId) {
		_hrUserId = hrUserId;
	}

	public String getHrUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getHrUserId(), "uuid", _hrUserUuid);
	}

	public void setHrUserUuid(String hrUserUuid) {
		_hrUserUuid = hrUserUuid;
	}

	public Date getExpenseDate() {
		return _expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		_expenseDate = expenseDate;
	}

	public double getExpenseAmount() {
		return _expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		_expenseAmount = expenseAmount;
	}

	public long getExpenseHRExpenseCurrencyId() {
		return _expenseHRExpenseCurrencyId;
	}

	public void setExpenseHRExpenseCurrencyId(long expenseHRExpenseCurrencyId) {
		_expenseHRExpenseCurrencyId = expenseHRExpenseCurrencyId;
	}

	public double getReimbursementAmount() {
		return _reimbursementAmount;
	}

	public void setReimbursementAmount(double reimbursementAmount) {
		_reimbursementAmount = reimbursementAmount;
	}

	public long getReimbursementHRExpenseCurrencyId() {
		return _reimbursementHRExpenseCurrencyId;
	}

	public void setReimbursementHRExpenseCurrencyId(
		long reimbursementHRExpenseCurrencyId) {
		_reimbursementHRExpenseCurrencyId = reimbursementHRExpenseCurrencyId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusByUserName;
		}
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	/**
	 * @deprecated {@link #isApproved}
	 */
	public boolean getApproved() {
		return isApproved();
	}

	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public HRExpense toEscapedModel() {
		if (isEscapedModel()) {
			return (HRExpense)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (HRExpense)Proxy.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRExpense.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HRExpenseImpl hrExpenseImpl = new HRExpenseImpl();

		hrExpenseImpl.setHrExpenseId(getHrExpenseId());
		hrExpenseImpl.setGroupId(getGroupId());
		hrExpenseImpl.setCompanyId(getCompanyId());
		hrExpenseImpl.setUserId(getUserId());
		hrExpenseImpl.setUserName(getUserName());
		hrExpenseImpl.setCreateDate(getCreateDate());
		hrExpenseImpl.setModifiedDate(getModifiedDate());
		hrExpenseImpl.setHrExpenseAccountId(getHrExpenseAccountId());
		hrExpenseImpl.setHrExpenseTypeId(getHrExpenseTypeId());
		hrExpenseImpl.setHrUserId(getHrUserId());
		hrExpenseImpl.setExpenseDate(getExpenseDate());
		hrExpenseImpl.setExpenseAmount(getExpenseAmount());
		hrExpenseImpl.setExpenseHRExpenseCurrencyId(getExpenseHRExpenseCurrencyId());
		hrExpenseImpl.setReimbursementAmount(getReimbursementAmount());
		hrExpenseImpl.setReimbursementHRExpenseCurrencyId(getReimbursementHRExpenseCurrencyId());
		hrExpenseImpl.setStatus(getStatus());
		hrExpenseImpl.setStatusByUserId(getStatusByUserId());
		hrExpenseImpl.setStatusByUserName(getStatusByUserName());
		hrExpenseImpl.setStatusDate(getStatusDate());

		hrExpenseImpl.resetOriginalValues();

		return hrExpenseImpl;
	}

	public int compareTo(HRExpense hrExpense) {
		long primaryKey = hrExpense.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HRExpense hrExpense = null;

		try {
			hrExpense = (HRExpense)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrExpense.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<HRExpense> toCacheModel() {
		HRExpenseCacheModel hrExpenseCacheModel = new HRExpenseCacheModel();

		hrExpenseCacheModel.hrExpenseId = getHrExpenseId();

		hrExpenseCacheModel.groupId = getGroupId();

		hrExpenseCacheModel.companyId = getCompanyId();

		hrExpenseCacheModel.userId = getUserId();

		hrExpenseCacheModel.userName = getUserName();

		String userName = hrExpenseCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			hrExpenseCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			hrExpenseCacheModel.createDate = createDate.getTime();
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			hrExpenseCacheModel.modifiedDate = modifiedDate.getTime();
		}

		hrExpenseCacheModel.hrExpenseAccountId = getHrExpenseAccountId();

		hrExpenseCacheModel.hrExpenseTypeId = getHrExpenseTypeId();

		hrExpenseCacheModel.hrUserId = getHrUserId();

		Date expenseDate = getExpenseDate();

		if (expenseDate != null) {
			hrExpenseCacheModel.expenseDate = expenseDate.getTime();
		}

		hrExpenseCacheModel.expenseAmount = getExpenseAmount();

		hrExpenseCacheModel.expenseHRExpenseCurrencyId = getExpenseHRExpenseCurrencyId();

		hrExpenseCacheModel.reimbursementAmount = getReimbursementAmount();

		hrExpenseCacheModel.reimbursementHRExpenseCurrencyId = getReimbursementHRExpenseCurrencyId();

		hrExpenseCacheModel.status = getStatus();

		hrExpenseCacheModel.statusByUserId = getStatusByUserId();

		hrExpenseCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = hrExpenseCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			hrExpenseCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			hrExpenseCacheModel.statusDate = statusDate.getTime();
		}

		return hrExpenseCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{hrExpenseId=");
		sb.append(getHrExpenseId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", hrExpenseAccountId=");
		sb.append(getHrExpenseAccountId());
		sb.append(", hrExpenseTypeId=");
		sb.append(getHrExpenseTypeId());
		sb.append(", hrUserId=");
		sb.append(getHrUserId());
		sb.append(", expenseDate=");
		sb.append(getExpenseDate());
		sb.append(", expenseAmount=");
		sb.append(getExpenseAmount());
		sb.append(", expenseHRExpenseCurrencyId=");
		sb.append(getExpenseHRExpenseCurrencyId());
		sb.append(", reimbursementAmount=");
		sb.append(getReimbursementAmount());
		sb.append(", reimbursementHRExpenseCurrencyId=");
		sb.append(getReimbursementHRExpenseCurrencyId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRExpense");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrExpenseId</column-name><column-value><![CDATA[");
		sb.append(getHrExpenseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrExpenseAccountId</column-name><column-value><![CDATA[");
		sb.append(getHrExpenseAccountId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrExpenseTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrExpenseTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrUserId</column-name><column-value><![CDATA[");
		sb.append(getHrUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expenseDate</column-name><column-value><![CDATA[");
		sb.append(getExpenseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expenseAmount</column-name><column-value><![CDATA[");
		sb.append(getExpenseAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expenseHRExpenseCurrencyId</column-name><column-value><![CDATA[");
		sb.append(getExpenseHRExpenseCurrencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reimbursementAmount</column-name><column-value><![CDATA[");
		sb.append(getReimbursementAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reimbursementHRExpenseCurrencyId</column-name><column-value><![CDATA[");
		sb.append(getReimbursementHRExpenseCurrencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRExpense.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRExpense.class
		};
	private long _hrExpenseId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _hrExpenseAccountId;
	private long _hrExpenseTypeId;
	private long _hrUserId;
	private String _hrUserUuid;
	private Date _expenseDate;
	private double _expenseAmount;
	private long _expenseHRExpenseCurrencyId;
	private double _reimbursementAmount;
	private long _reimbursementHRExpenseCurrencyId;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private String _statusByUserName;
	private Date _statusDate;
	private transient ExpandoBridge _expandoBridge;
	private HRExpense _escapedModelProxy;
}