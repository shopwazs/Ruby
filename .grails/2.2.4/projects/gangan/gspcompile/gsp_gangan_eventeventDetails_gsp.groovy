import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventeventDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/eventDetails.gsp" }
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
codecOut.print(event?.name)
printHtmlPart(5)
codecOut.print(event?.startDate?.format("dd-MM-yyyy"))
printHtmlPart(6)
codecOut.print(event?.venue)
printHtmlPart(7)
codecOut.print(event?.kind)
printHtmlPart(8)
codecOut.print(event?.type)
printHtmlPart(9)
codecOut.print(event?.status)
printHtmlPart(10)
codecOut.print(event?.description)
printHtmlPart(11)
codecOut.print(event?.occurrence)
printHtmlPart(12)
codecOut.print(event?.createdBy)
printHtmlPart(13)
codecOut.print(categoryList?.categoryName)
printHtmlPart(14)
for( eventAttendee in (eventAttendeeList) ) {
printHtmlPart(15)
createTagBody(3, {->
codecOut.print(eventAttendee.attendee.account.name)
})
invokeTag('link','g',34,['class':("btn btn-primary disabled")],3)
printHtmlPart(16)
}
printHtmlPart(17)
for( eventAgenda in (eventAgendaList) ) {
printHtmlPart(18)
codecOut.print(eventAgenda?.title)
printHtmlPart(19)
codecOut.print(eventAgenda?.startTime)
printHtmlPart(19)
codecOut.print(eventAgenda?.endTime)
printHtmlPart(19)
codecOut.print(eventAgenda?.description)
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',64,['controller':("public"),'action':("publicItemList"),'class':("btn btn-xs btn-primary"),'params':([agendaId: eventAgenda?.id, eventId: event?.id])],3)
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',67,['controller':("manageEvent"),'action':("deleteAgenda"),'class':("btn btn-xs btn-danger"),'value':("deleteAgenda"),'params':([agendaId: eventAgenda?.id, eventId: event?.id])],3)
printHtmlPart(24)
}
printHtmlPart(25)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',77,['controller':("manageEvent"),'action':("eventAgenda"),'class':("btn btn-xs btn-primary"),'value':("Add Agenda"),'params':([eventId: event?.id])],2)
printHtmlPart(27)
for( eventItem in (eventItemList) ) {
printHtmlPart(18)
codecOut.print(eventItem?.itemName)
printHtmlPart(19)
codecOut.print(eventItem?.itemDescription)
printHtmlPart(19)
codecOut.print(eventItem?.itemPrice)
printHtmlPart(19)
codecOut.print(eventItem?.itemDiscount)
printHtmlPart(19)
codecOut.print(eventItem?.itemQuantity)
printHtmlPart(19)
codecOut.print(eventItem?.total)
printHtmlPart(28)
}
printHtmlPart(29)
createClosureForHtmlPart(30, 2)
invokeTag('link','g',112,['controller':("manageEvent"),'action':("attendEvent"),'style':("height: 30px;margin-left: 1000px"),'class':("btn btn-primary"),'params':([eventId: event?.id])],2)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',116,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
