import bookstore.Book
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bookstore_book_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/book/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: bookInstance, field: 'author', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("book.author.label"),'default':("Author")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("author"),'required':(""),'value':(bookInstance?.author)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bookInstance, field: 'pages', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("book.pages.label"),'default':("Pages")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("pages"),'type':("number"),'value':(bookInstance.pages),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bookInstance, field: 'title', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("book.title.label"),'default':("Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("title"),'required':(""),'value':(bookInstance?.title)],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1576771533000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
