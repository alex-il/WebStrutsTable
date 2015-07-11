<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
    	<sj:head jqueryui="true" jquerytheme="redmond" />
        <title>== Struts 2 Table ==</title>
        <s:head/>
    </head>
    <body>
    <a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a>
        <s:url var="remoteurl" action="jsontable"/>
	    <% out.println("----requ---"+request.getAttribute("remoteurl")); %>
	    <% out.println("--responce-----"+response.getContentType() ); %>
	    
	    <sjg:grid
	        id="gridtable"
	        caption="Web Table"
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true"
	        gridModel="gridModel"
	        rowList="2,4,9"
	        rowNum="2"
	        rownumbers="true"

	    >
	    
	    
	    <% out.println(session.getAttribute("href")); %>
	        <sjg:gridColumn name="id" index="id" title="ID" formatter="integer" sortable="false"/>
	        <sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	        <sjg:gridColumn name="country" index="country" title="Country" sortable="false"/>
	        <sjg:gridColumn name="city" index="city" title="City" sortable="false"/>
	        <sjg:gridColumn name="creditLimit" index="creditLimit" title="Credit Limit" formatter="currency" sortable="false"/>
	    </sjg:grid>
    </body>
</html>