<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<head>
<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
  	<link href='${context}/resources/css/todo/test00.css' rel='stylesheet' type='text/css'>
  	<script defer src="${context}/resources/js/todo/test00.js"></script>
</head>

<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>

  	<div id="calendar">
    	<div id="calendar_header"><i class="icon-chevron-left"></i>          <h1></h1><i class="icon-chevron-right"></i>         </div>
    	<div id="calendar_weekdays"></div>
    	<div id="calendar_content"></div>
  	</div>

	
	
	
</body>
</html>