import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',12,[:],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
codecOut.print(event?.name)
printHtmlPart(6)
codecOut.print(event?.startDate?.format("dd/MM/yyyy"))
printHtmlPart(7)
codecOut.print(event?.startTime)
printHtmlPart(8)
codecOut.print(event?.venue)
printHtmlPart(9)
codecOut.print(event?.description)
printHtmlPart(10)
codecOut.print(event?.type)
printHtmlPart(11)
invokeTag('select','g',95,['from':(['Paid', 'Free', 'Discounted']),'name':("kind"),'id':("kind"),'class':("form-control"),'value':(event?.kind),'style':("width: 240px;padding: 5px")],-1)
printHtmlPart(12)
invokeTag('select','g',106,['from':(['Planned', 'Ongoing', 'Done']),'name':("status"),'id':("status"),'class':("form-control"),'value':(event?.status),'style':("width: 240px;padding: 5px")],-1)
printHtmlPart(13)
codecOut.print(event?.createdBy)
printHtmlPart(14)
codecOut.print(event?.id)
printHtmlPart(15)
})
invokeTag('form','g',137,['role':("form"),'controller':("manageEvent"),'onsubmit':("updateConfirm()"),'action':("update"),'method':("post")],2)
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',146,['controller':("manageEvent"),'action':("eventAgenda"),'class':("btn btn-primary col-md-8 col-md-offset-4"),'params':([eventId: event?.id])],2)
printHtmlPart(18)
for( eventAgenda in (eventAgendaList) ) {
printHtmlPart(19)
codecOut.print(eventAgenda?.title)
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',178,['controller':("public"),'action':("publicItemList"),'class':("badge"),'params':([agendaId: eventAgenda?.id, eventId: event?.id])],3)
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
codecOut.print(eventAgenda?.eventItems?.size())
printHtmlPart(24)
})
invokeTag('link','g',185,['controller':("manageEvent"),'action':("basketItems"),'params':([agendaId: eventAgenda?.id, eventId: event?.id])],3)
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',188,['controller':("manageEvent"),'action':("bidItem"),'class':("badge"),'params':([agendaId: eventAgenda?.id, eventId: event?.id])],3)
printHtmlPart(27)
}
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',204,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
