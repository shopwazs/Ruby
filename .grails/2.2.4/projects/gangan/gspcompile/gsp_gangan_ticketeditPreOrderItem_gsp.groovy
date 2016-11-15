import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_ticketeditPreOrderItem_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ticket/editPreOrderItem.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',10,[:],-1)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',13,['bean':(ticketPreOrderItemVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',15,['bean':(ticketPreOrderItemVO)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('render','g',21,['template':("/ticket/preOrderTicketItemForm"),'model':([ticketPreOrderItemVO: ticketPreOrderItem])],-1)
printHtmlPart(8)
codecOut.print(eventId)
printHtmlPart(9)
codecOut.print(ticketPreOrderItem?.id)
printHtmlPart(10)
})
invokeTag('form','g',30,['controller':("home"),'action':("updatePreOrderTicketItem")],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',37,[:],1)
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
