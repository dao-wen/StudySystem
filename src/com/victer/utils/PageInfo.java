package com.victer.utils;

import java.util.List;

public class PageInfo<T> {
	private Integer pageNo;
	private int pageSize = 10;
	private Long totalCount;
	private List<T> list ;
	
	public PageInfo(Integer pageNo) {
		if(pageNo == null)
			this.pageNo = 1;
		else 
			this.pageNo = pageNo;
	}
	//get the quality of page
	public long getTotalPage() {
		Long totalPage = totalCount/pageSize;
		if(totalCount%pageSize != 0 || totalPage == 0)
			totalPage++;
		return totalPage;
	}
	
	public int getNextPage() {
		Integer nextPage = 0;
		if(nextPage < this.getTotalPage()) {
			nextPage = pageNo + 1;			
		}else {
			nextPage = pageNo;
		}
		return nextPage;
	}
	
	public int getPrePage() {
		Integer prePage = 0;
		if(pageNo > 1) {
			prePage = pageNo - 1;			
		}else {
			prePage = pageNo;
		}
		return prePage;
	}
	
	public boolean isFirstPage() {
		boolean isFirstPage = false;
		if(pageNo > 1) {
			isFirstPage = false;
		}else {
			isFirstPage = true;
		}
		return isFirstPage;
	}
	
	public boolean isLastPage() {
		boolean isLastPage = false;
		if(pageNo < this.getTotalPage()) {
			isLastPage = false;
		}else {
			isLastPage = true;
		}
		return isLastPage;
	}
	
	public Integer getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
