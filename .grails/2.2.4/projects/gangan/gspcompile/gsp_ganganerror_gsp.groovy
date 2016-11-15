import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ganganerror_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/error.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
if((grails.util.Environment.current.name == 'development') && true) {
printHtmlPart(2)
}
else {
printHtmlPart(3)
}
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(5)
if((grails.util.Environment.current.name == 'development') && true) {
printHtmlPart(6)
codecOut.print(resource(dir: 'css', file: 'errors.css'))
printHtmlPart(7)
}
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(1)
if((grails.util.Environment.current.name == 'development') && true) {
printHtmlPart(9)
invokeTag('renderException','g',8,['exception':(exception)],-1)
printHtmlPart(1)
}
else {
printHtmlPart(10)
}
printHtmlPart(8)
})
invokeTag('captureBody','sitemesh',9,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
