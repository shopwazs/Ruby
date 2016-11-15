import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventeditAgenda_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/editAgenda.gsp" }
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
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
codecOut.print(eventAgendaVO?.startTime)
printHtmlPart(6)
codecOut.print(eventAgendaVO?.endTime)
printHtmlPart(7)
codecOut.print(eventAgendaVO?.title)
printHtmlPart(8)
codecOut.print(eventAgendaVO?.description)
printHtmlPart(9)
codecOut.print(eventId)
printHtmlPart(10)
})
invokeTag('form','g',90,['role':("form"),'controller':("manageEvent"),'action':("createEventAgenda"),'method':("post"),'enctype':("multipart/form-data")],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',90,[:],1)
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
