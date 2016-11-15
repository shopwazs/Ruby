import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventbasketItems_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/basketItems.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('userVerifyEmail','gan',11,[:],-1)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',35,['controller':("manageEvent"),'action':("eventDetails"),'class':("btn btn-primary btn-sm btn-block"),'params':([eventId: eventId?.id])],2)
printHtmlPart(7)
loop:{
int i = 0
for( eventItem in (eventItemList) ) {
printHtmlPart(8)
codecOut.print(eventItem?.itemName)
printHtmlPart(9)
codecOut.print(eventItem?.itemDescription)
printHtmlPart(10)
invokeTag('hiddenField','g',63,['name':("itemPrice"),'class':("itemPrice"),'value':(eventItem?.itemPrice)],-1)
printHtmlPart(11)
codecOut.print(eventItem?.itemPrice)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',80,['controller':("manageEvent"),'action':("deleteEventItem"),'class':("btn btn-xs"),'params':([eventItemId: eventItem?.id, eventId: eventId?.id, agendaId: eventAgenda?.id])],3)
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',108,['controller':("public"),'action':("checkout"),'class':("btn btn-success btn-block"),'params':([agendaId: eventAgenda?.id])],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',119,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
