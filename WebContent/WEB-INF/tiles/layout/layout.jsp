<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
<title>Explosion</title>
<script type="text/javascript" src="/resource/js/jquery-3.4.1.min/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/resource/js/common_util.js"></script>
</head>
<body class="wrapper">
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">        
        <tiles:insertAttribute name="header"/>        
        <tiles:insertAttribute name="menu" />    
    </nav>
     <div id="page-wrapper">
            <div class="row">                 
                <tiles:insertAttribute name="content" />                                                  
            </div>
     </div>
 
    <div class="main_footer">
        <div class="main_footer-inner">
            <tiles:insertAttribute name="footer" />
        </div>
    </div>
</body>
</html>
