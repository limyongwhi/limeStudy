/**
 *	공통소스 모음
 *	@작성일 20190526 
 */


/*
 * 공통 AJAX 호출
 * @param url - 요청할 url
 * @param params - 보낼 데이터
 * @param callback - 성공시 수행할 func	(안보내도됨)
 * @param errorCallback - 실패시 수행할 func (안보내도됨)
 **/
function ajaxCall(url, params, asyncType, callback, errorCallback){
	if(asyncType === undefined){asyncType=false}
	if(!callback){callback = function(){}}
	if(!errorCallback){errorCallback = function(){}}	
	$.ajax({
		url : url,							// 클라이언트가 요청을 보낼 서버의 URL 주소
		data : JSON.stringify(params),		// HTTP 요청과 함께 서버로 보낼 데이터
		type : "POST",						// HTTP 요청 방식(GET, POST)
		dataType: "json",               	// 서버에서 보내줄 데이터의 타입
		async : asyncType					// 동기 , 비동기	
	}).done(callback)
	.fail(errorCallback);	
}



