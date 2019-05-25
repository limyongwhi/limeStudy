<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script type="text/javascript">
 function test(){
	 ajaxCall('getTime.do','',false, function(data){
		 alert("디비서 가져온 현재시간" + data.nowTime);
	 },function(e){
		 console.log(e)
	 })
 }
 
 </script>
    <button onclick="test()">테스트</button>
    main