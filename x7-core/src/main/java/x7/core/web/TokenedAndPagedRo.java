/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package x7.core.web;

import x7.core.bean.Sort;
import x7.core.util.StringUtil;

import java.util.List;

public class TokenedAndPagedRo implements Paged, Tokened{

	private String passportId;
	private String token;
	private String passportType;
	private boolean isScroll;
	private int page;
	private int rows;
	private String orderBy;
	private Direction direction;
	private List<Sort> sortList;
	public long getPassportId() {
		if (StringUtil.isNullOrEmpty(passportId))
			return 0;
		return Long.valueOf(passportId);
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPassportType() {
		return passportType;
	}
	public void setPassportType(String passportType) {
		this.passportType = passportType;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction sc) {
		this.direction = sc;
	}
	public boolean isScroll() {
		return isScroll;
	}
	public void setScroll(boolean isScroll) {
		this.isScroll = isScroll;
	}

	@Override
	public List<Sort> getSortList() {
		return sortList;
	}

	public void setSortList(List<Sort> sortList) {
		this.sortList = sortList;
	}

	@Override
	public String toString() {
		return "TokenedAndPagedRo{" +
				"passportId='" + passportId + '\'' +
				", token='" + token + '\'' +
				", passportType='" + passportType + '\'' +
				", isScroll=" + isScroll +
				", page=" + page +
				", rows=" + rows +
				", orderBy='" + orderBy + '\'' +
				", direction=" + direction +
				", sortList=" + sortList +
				'}';
	}
}
