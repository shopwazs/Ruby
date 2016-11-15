import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventpublicEventBeforeLogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/publicEventBeforeLogin.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
for( event in (eventList) ) {
printHtmlPart(5)
codecOut.print(event?.name)
printHtmlPart(6)
codecOut.print(event?.startDate?.format("dd-MM-yyyy"))
printHtmlPart(6)
codecOut.print(event?.venue)
printHtmlPart(6)
codecOut.print(event?.kind)
printHtmlPart(6)
codecOut.print(event.cost)
printHtmlPart(7)
createTagBody(3, {->
printHtmlPart(8)
createClosureForHtmlPart(9, 4)
invokeTag('link','g',42,['controller':("event"),'action':("publicEventSignIn"),'style':("height: 30px"),'class':("btn btn-primary"),'params':([eventId: event?.id])],4)
printHtmlPart(10)
})
invokeTag('ifNotLoggedIn','sec',44,[:],3)
printHtmlPart(11)
}
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
