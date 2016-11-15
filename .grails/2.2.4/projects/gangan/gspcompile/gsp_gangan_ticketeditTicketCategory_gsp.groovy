import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_ticketeditTicketCategory_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ticket/editTicketCategory.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',9,[:],-1)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',12,['bean':(ticketCategoryVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',14,['bean':(ticketCategoryVO)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
codecOut.print(ticketCategory?.categoryName)
printHtmlPart(8)
codecOut.print(eventId)
printHtmlPart(9)
codecOut.print(ticketCategory?.id)
printHtmlPart(10)
})
invokeTag('form','g',37,['controller':("home"),'action':("updateTicketCategory")],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',43,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
