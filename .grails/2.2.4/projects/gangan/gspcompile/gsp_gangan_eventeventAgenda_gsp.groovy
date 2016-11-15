import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventeventAgenda_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/eventAgenda.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',6,[:],-1)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('renderErrors','g',7,['bean':(eventAgendaVO)],-1)
printHtmlPart(6)
})
invokeTag('hasErrors','g',9,['bean':(eventAgendaVO)],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
codecOut.print(eventAgendaVO?.startTime)
printHtmlPart(9)
codecOut.print(eventAgendaVO?.endTime)
printHtmlPart(10)
codecOut.print(eventAgendaVO?.title)
printHtmlPart(11)
codecOut.print(eventAgendaVO?.description)
printHtmlPart(12)
codecOut.print(eventId)
printHtmlPart(13)
for( eventAgenda in (eventAgendaList) ) {
printHtmlPart(14)
codecOut.print(eventAgenda?.agendaType)
printHtmlPart(15)
codecOut.print(eventAgenda?.title)
printHtmlPart(15)
codecOut.print(eventAgenda?.description)
printHtmlPart(15)
codecOut.print(eventAgenda?.startTime)
printHtmlPart(15)
codecOut.print(eventAgenda?.endTime)
printHtmlPart(16)
codecOut.print(createLink(controller: 'manageEvent', action: 'deleteAgenda', params: [agendaId: eventAgenda?.id, eventId: eventId]))
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('form','g',115,['role':("form"),'controller':("manageEvent"),'action':("createEventAgenda"),'method':("post"),'enctype':("multipart/form-data")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',118,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
