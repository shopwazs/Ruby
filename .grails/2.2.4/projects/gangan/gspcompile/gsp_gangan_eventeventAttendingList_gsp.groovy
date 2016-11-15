import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventeventAttendingList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/eventAttendingList.gsp" }
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
printHtmlPart(2)
invokeTag('userVerifyEmail','gan',8,[:],-1)
printHtmlPart(4)
invokeTag('render','g',10,['template':("/event/eventNavigation")],-1)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('form','g',24,['controller':("manageEvent"),'action':("searchAttendingEvent"),'method':("post")],2)
printHtmlPart(7)
if(true && (eventsAttendingList)) {
printHtmlPart(8)
for( event in (eventsAttendingList) ) {
printHtmlPart(9)
codecOut.print(event?.name)
printHtmlPart(10)
codecOut.print(event?.startDate?.format("dd-MM-yyyy"))
printHtmlPart(11)
codecOut.print(event?.description)
printHtmlPart(12)
createClosureForHtmlPart(13, 4)
invokeTag('link','g',65,['class':("btn btn-xs btn-danger"),'controller':("manageEvent"),'action':("cancelEventAttendee"),'params':([eventId: event?.id])],4)
printHtmlPart(14)
}
printHtmlPart(15)
}
else {
printHtmlPart(16)
if(true && (eventName && eventSearchList)) {
printHtmlPart(17)
for( events in (eventSearchList) ) {
printHtmlPart(18)
codecOut.print(events?.name)
printHtmlPart(19)
codecOut.print(events?.startDate?.format("dd-MM-yyyy"))
printHtmlPart(20)
codecOut.print(events?.description)
printHtmlPart(21)
}
printHtmlPart(22)
}
else {
printHtmlPart(23)
}
printHtmlPart(24)
}
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',85,[:],1)
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
