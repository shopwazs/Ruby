import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventpublicList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/publicList.gsp" }
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
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('userVerifyEmail','gan',10,[:],-1)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('form','g',33,['controller':("manageEvent"),'action':("searchPublicEvent"),'method':("post"),'style':("height: 150px")],2)
printHtmlPart(7)
if(true && (eventList)) {
printHtmlPart(8)
for( event in (eventList) ) {
printHtmlPart(9)
codecOut.print(event?.name)
printHtmlPart(10)
codecOut.print(event?.venue)
printHtmlPart(11)
codecOut.print(event?.startTime)
printHtmlPart(12)
codecOut.print(event?.createdBy)
printHtmlPart(13)
codecOut.print(createLink(controller: 'manageEvent', action: 'eventDetails', params: [eventId: event?.id]))
printHtmlPart(14)
}
printHtmlPart(15)
}
else {
printHtmlPart(16)
if(true && (publicEventList && eventName)) {
printHtmlPart(17)
for( event in (publicEventList) ) {
printHtmlPart(18)
codecOut.print(event?.name)
printHtmlPart(19)
codecOut.print(event?.venue)
printHtmlPart(20)
codecOut.print(event?.startTime)
printHtmlPart(21)
codecOut.print(event?.createdBy)
printHtmlPart(22)
codecOut.print(createLink(controller: 'manageEvent', action: 'eventDetails', params: [eventId: event?.id]))
printHtmlPart(23)
}
printHtmlPart(8)
}
else {
printHtmlPart(24)
}
printHtmlPart(15)
}
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',149,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
