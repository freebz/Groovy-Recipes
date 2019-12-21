<%@ page import="bookstore.Publisher" %>



<div class="fieldcontain ${hasErrors(bean: publisherInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="publisher.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${publisherInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: publisherInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="publisher.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${publisherInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: publisherInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="publisher.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${publisherInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: publisherInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="publisher.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${publisherInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: publisherInstance, field: 'zipcode', 'error')} required">
	<label for="zipcode">
		<g:message code="publisher.zipcode.label" default="Zipcode" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="zipcode" required="" value="${publisherInstance?.zipcode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: publisherInstance, field: 'books', 'error')} ">
	<label for="books">
		<g:message code="publisher.books.label" default="Books" />
		
	</label>
	<g:select name="books" from="${bookstore.Book.list()}" multiple="multiple" optionKey="id" size="5" value="${publisherInstance?.books*.id}" class="many-to-many"/>

</div>

