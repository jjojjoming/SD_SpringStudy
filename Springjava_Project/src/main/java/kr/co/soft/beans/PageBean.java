package kr.co.soft.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageBean {
	
	//최소 페이지 번호
	private int min;
	//최대 페이지 번호
	private int max;
	
	//이전 버튼의 페이지 번호
	private int prevPage;
	//다음 버튼의 페이지 번호
	private int nextPage;
	//전체 페이지 개수
	private int pageCnt;
	//현재 페이지 번호
	private int currentPage;
	
	
	
	//contentCnt:전체 글 갯수(mapper이용해서  table에서 가져옴)
	//currentPage : 현재 페이지 번호(param)
	//contentPageCnt : 페이지당 글번호(property)
	//paginationCnt : 페이지 버튼 개수 (property)
	public PageBean(int contentCnt, int currentPage, int contentPageCnt, int paginationCnt) {
		this.currentPage = currentPage;
		//전체 페이지 개수
		pageCnt = contentCnt / contentPageCnt;
		// 533 / 10 = 53 & 3개이므로 1page가 더 필요
		if(contentCnt % contentPageCnt > 0) {
			pageCnt++;
		}
		/*
		1.
		1 ~ 10 : 1(최소), 10(최대)
		11 ~ 20 : 11, 20
		21 ~ 30 : 21, 30
		2. 최대번호는 최소에 9를 더하므로 -1을계산해줌
		3. 페이지당 글의 개수로 나눔
		4. 페이지당글의 개수로 다시 곱함
		*/
		min = ((currentPage-1) / contentPageCnt) * contentPageCnt + 1;
		max = min + paginationCnt -1;
		
		//10개의 버튼을 다 표시할 필요가 없을 때
		//63개의 글은 6페이지 버튼에 1개 추가최므로 나머지 8 ~ 10은 불필요
		if(max > pageCnt) {
			max = pageCnt;
		}
		
		prevPage = min - 1; //0이 나오면 비활성화
		nextPage = max + 1;
		
		//마지막 페이지를 넘어가지 않게 설정
		if(nextPage > pageCnt) {
			nextPage = pageCnt;
		}
	}

}
