
<%@ page import="bookstore.Publisher" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'publisher.label', default: 'Publisher')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-publisher" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-publisher" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list publisher">
			
				<g:if test="${publisherInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="publisher.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${publisherInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publisherInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="publisher.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${publisherInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publisherInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="publisher.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${publisherInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publisherInstance?.state}">
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="publisher.state.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${publisherInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publisherInstance?.zipcode}">
				<li class="fieldcontain">
					<span id="zipcode-label" class="property-label"><g:message code="publisher.zipcode.label" default="Zipcode" /></span>
					
						<span class="property-value" aria-labelledby="zipcode-label"><g:fieldValue bean="${publisherInstance}" field="zipcode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publisherInstance?.books}">
				<li class="fieldcontain">
					<span id="books-label" class="property-label"><g:message code="publisher.books.label" default="Books" /></span>
					
						<g:each in="${publisherInstance.books}" var="b">
						<span class="property-value" aria-labelledby="books-label"><g:link controller="book" action="show" id="${b.id}">${b?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:publisherInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${publisherInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
