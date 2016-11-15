import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/list.gsp" }
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
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',8,[:],-1)
printHtmlPart(4)
invokeTag('render','g',9,['template':("/event/eventNavigation")],-1)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('form','g',23,['controller':("manageEvent"),'action':("searchEvent"),'method':("post")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',27,['class':("btn btn-primary col-md-offset-4"),'controller':("manageEvent"),'action':("createEvent"),'style':("background-color: dodgerblue")],2)
printHtmlPart(9)
if(true && (eventsCreated)) {
printHtmlPart(10)
for( event in (eventsCreated) ) {
printHtmlPart(11)
codecOut.print(event?.name)
printHtmlPart(12)
codecOut.print(event?.startDate?.format("dd-MM-yyyy"))
printHtmlPart(13)
codecOut.print(event?.description)
printHtmlPart(14)
codecOut.print(com.gangan.event.EventAttendee.findAllByEvent(event)?.size())
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',77,['class':("btn btn-xs btn-primary active"),'controller':("home"),'action':("manageTicket"),'params':([eventId: event?.id])],4)
printHtmlPart(17)
codecOut.print(createLink(controller: 'manageEvent', action: 'manageAttendee', params: [eventId: event?.id]))
printHtmlPart(18)
codecOut.print(createLink(controller: 'manageEvent', action: 'navigation', params: [eventId: event?.id]))
printHtmlPart(19)
createClosureForHtmlPart(20, 4)
invokeTag('link','g',83,['class':("btn btn-xs btn-default active"),'controller':("manageEvent"),'action':("edit"),'params':([eventId: event?.id])],4)
printHtmlPart(21)
codecOut.print(event?.id)
printHtmlPart(22)
}
printHtmlPart(7)
}
else {
printHtmlPart(23)
if(true && (eventName && eventSearchList)) {
printHtmlPart(24)
for( events in (eventSearchList) ) {
printHtmlPart(25)
codecOut.print(events?.name)
printHtmlPart(26)
codecOut.print(events?.startDate?.format("dd-MM-yyyy"))
printHtmlPart(27)
codecOut.print(events?.description)
printHtmlPart(28)
}
printHtmlPart(29)
}
else {
printHtmlPart(30)
}
printHtmlPart(31)
}
printHtmlPart(32)
codecOut.print(createLink(controller: 'manageEvent', action: 'deleteEvent', absolute: true))
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
