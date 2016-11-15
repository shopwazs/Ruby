import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventupdate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/update.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('userVerifyEmail','gan',9,[:],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('renderErrors','g',13,['bean':(eventVO)],-1)
printHtmlPart(6)
})
invokeTag('hasErrors','g',15,['bean':(eventVO)],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
codecOut.print(eventVO?.name)
printHtmlPart(9)
codecOut.print(event?.startDate?.format("dd/MM/yyyy"))
printHtmlPart(10)
codecOut.print(event?.startTime)
printHtmlPart(11)
codecOut.print(eventVO?.venue)
printHtmlPart(12)
invokeTag('select','g',72,['from':(['Planned', 'Ongoing', 'Done']),'name':("status"),'id':("status"),'class':("form-control"),'value':(eventVO?.status),'style':("width: 262px;padding: 5px")],-1)
printHtmlPart(13)
codecOut.print(eventVO?.description)
printHtmlPart(14)
codecOut.print(eventVO?.type)
printHtmlPart(15)
invokeTag('select','g',105,['from':(['Paid', 'Free', 'Discounted']),'name':("kind"),'id':("kind"),'class':("form-control"),'value':(eventVO?.kind),'style':("width: 262px;padding: 5px")],-1)
printHtmlPart(16)
codecOut.print(event?.id)
printHtmlPart(17)
})
invokeTag('form','g',135,['role':("form"),'controller':("manageEvent"),'action':("update"),'method':("post")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',139,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
