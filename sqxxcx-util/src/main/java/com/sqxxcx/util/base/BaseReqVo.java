package com.sqxxcx.util.base;

import java.io.Serializable;

public class BaseReqVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8327467934360237979L;

	private int pageNum;
	
	private int pageSize;
	
	private int totalCount;
	
	private int toutalPage;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getToutalPage() {
		return toutalPage;
	}

	public void setToutalPage(int toutalPage) {
		this.toutalPage = toutalPage;
	}

	@Override
	public String toString() {
		return "BaseReqVo [pageNum=" + pageNum + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", toutalPage=" + toutalPage + "]";
	}

	public BaseReqVo(int pageNum, int pageSize, int totalCount, int toutalPage) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.toutalPage = toutalPage;
	}

	public BaseReqVo() {}
	
	
}
