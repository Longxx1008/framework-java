package com.anguo.mybatis.db.core;

/**
 * 分页参数类
 * 
 */
public class BaseVo {

 

	public static final int DEFAULT_PAGE_SIZE = 10;
	
	
	

    

	private int rows;
    private int page;
    private int prePage;
    private int nextPage;
    private int totalPage;
    private int totalCount;


	public BaseVo() {
        this.page = 1;
        this.rows = DEFAULT_PAGE_SIZE;
    }

    /**
     * 
     * @param page
     * @param pageSize
     */
    public BaseVo(int page, int pageSize) {
        this.page = page;
        this.rows = pageSize;
    }

    

    public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrePage() {
		return prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	


}