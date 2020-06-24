package kr.co.vo;

public class SearchCriteria extends Criteria{
	private String searchType = "";
	private String keyword = "";
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override //스트링으로 출력하는것 같으니까 그냥 이렇게 가져다쓰나..?
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword +"]";
	}
}
