<g:each in="${bookList}" status="i" var="book">
  <tr class="${i % 2) == 0 ? 'odd' : 'even'}">
    <td>
      <g:link action="show" id="${book.id}">${book.id?.encodeAsHTML()}</g:link>
    </td>
    <td>${book.author?.encodeAsHTML()}</td>
    <td>${book.pages?.encodeAsHTML()}</td>
    <td>${book.title?.encodeAsHTML()}</td>
  </tr>
</g:each>
