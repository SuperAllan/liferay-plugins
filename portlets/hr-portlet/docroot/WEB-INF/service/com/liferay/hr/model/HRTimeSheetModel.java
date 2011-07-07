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

package com.liferay.hr.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRTimeSheet service. Represents a row in the &quot;HRTimeSheet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRTimeSheetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRTimeSheetImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRTimeSheet
 * @see com.liferay.hr.model.impl.HRTimeSheetImpl
 * @see com.liferay.hr.model.impl.HRTimeSheetModelImpl
 * @generated
 */
public interface HRTimeSheetModel extends BaseModel<HRTimeSheet>, GroupedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r time sheet model instance should use the {@link HRTimeSheet} interface instead.
	 */

	/**
	 * Returns the primary key of this h r time sheet.
	 *
	 * @return the primary key of this h r time sheet
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r time sheet.
	 *
	 * @param primaryKey the primary key of this h r time sheet
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the hr time sheet ID of this h r time sheet.
	 *
	 * @return the hr time sheet ID of this h r time sheet
	 */
	public long getHrTimeSheetId();

	/**
	 * Sets the hr time sheet ID of this h r time sheet.
	 *
	 * @param hrTimeSheetId the hr time sheet ID of this h r time sheet
	 */
	public void setHrTimeSheetId(long hrTimeSheetId);

	/**
	 * Returns the group ID of this h r time sheet.
	 *
	 * @return the group ID of this h r time sheet
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r time sheet.
	 *
	 * @param groupId the group ID of this h r time sheet
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this h r time sheet.
	 *
	 * @return the company ID of this h r time sheet
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r time sheet.
	 *
	 * @param companyId the company ID of this h r time sheet
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this h r time sheet.
	 *
	 * @return the user ID of this h r time sheet
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r time sheet.
	 *
	 * @param userId the user ID of this h r time sheet
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this h r time sheet.
	 *
	 * @return the user uuid of this h r time sheet
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r time sheet.
	 *
	 * @param userUuid the user uuid of this h r time sheet
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this h r time sheet.
	 *
	 * @return the user name of this h r time sheet
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r time sheet.
	 *
	 * @param userName the user name of this h r time sheet
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this h r time sheet.
	 *
	 * @return the create date of this h r time sheet
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r time sheet.
	 *
	 * @param createDate the create date of this h r time sheet
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this h r time sheet.
	 *
	 * @return the modified date of this h r time sheet
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r time sheet.
	 *
	 * @param modifiedDate the modified date of this h r time sheet
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the hr user ID of this h r time sheet.
	 *
	 * @return the hr user ID of this h r time sheet
	 */
	public long getHrUserId();

	/**
	 * Sets the hr user ID of this h r time sheet.
	 *
	 * @param hrUserId the hr user ID of this h r time sheet
	 */
	public void setHrUserId(long hrUserId);

	/**
	 * Returns the hr user uuid of this h r time sheet.
	 *
	 * @return the hr user uuid of this h r time sheet
	 * @throws SystemException if a system exception occurred
	 */
	public String getHrUserUuid() throws SystemException;

	/**
	 * Sets the hr user uuid of this h r time sheet.
	 *
	 * @param hrUserUuid the hr user uuid of this h r time sheet
	 */
	public void setHrUserUuid(String hrUserUuid);

	/**
	 * Returns the start day of year of this h r time sheet.
	 *
	 * @return the start day of year of this h r time sheet
	 */
	public int getStartDayOfYear();

	/**
	 * Sets the start day of year of this h r time sheet.
	 *
	 * @param startDayOfYear the start day of year of this h r time sheet
	 */
	public void setStartDayOfYear(int startDayOfYear);

	/**
	 * Returns the end day of year of this h r time sheet.
	 *
	 * @return the end day of year of this h r time sheet
	 */
	public int getEndDayOfYear();

	/**
	 * Sets the end day of year of this h r time sheet.
	 *
	 * @param endDayOfYear the end day of year of this h r time sheet
	 */
	public void setEndDayOfYear(int endDayOfYear);

	/**
	 * Returns the year of this h r time sheet.
	 *
	 * @return the year of this h r time sheet
	 */
	public int getYear();

	/**
	 * Sets the year of this h r time sheet.
	 *
	 * @param year the year of this h r time sheet
	 */
	public void setYear(int year);

	/**
	 * Returns the status of this h r time sheet.
	 *
	 * @return the status of this h r time sheet
	 */
	public int getStatus();

	/**
	 * Sets the status of this h r time sheet.
	 *
	 * @param status the status of this h r time sheet
	 */
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this h r time sheet.
	 *
	 * @return the status by user ID of this h r time sheet
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this h r time sheet.
	 *
	 * @param statusByUserId the status by user ID of this h r time sheet
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this h r time sheet.
	 *
	 * @return the status by user uuid of this h r time sheet
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this h r time sheet.
	 *
	 * @param statusByUserUuid the status by user uuid of this h r time sheet
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this h r time sheet.
	 *
	 * @return the status by user name of this h r time sheet
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this h r time sheet.
	 *
	 * @param statusByUserName the status by user name of this h r time sheet
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this h r time sheet.
	 *
	 * @return the status date of this h r time sheet
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this h r time sheet.
	 *
	 * @param statusDate the status date of this h r time sheet
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated Renamed to {@link #isApproved()}
	 */
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this h r time sheet is approved.
	 *
	 * @return <code>true</code> if this h r time sheet is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this h r time sheet is a draft.
	 *
	 * @return <code>true</code> if this h r time sheet is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this h r time sheet is expired.
	 *
	 * @return <code>true</code> if this h r time sheet is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this h r time sheet is pending.
	 *
	 * @return <code>true</code> if this h r time sheet is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(HRTimeSheet hrTimeSheet);

	public int hashCode();

	public CacheModel<HRTimeSheet> toCacheModel();

	public HRTimeSheet toEscapedModel();

	public String toString();

	public String toXmlString();
}