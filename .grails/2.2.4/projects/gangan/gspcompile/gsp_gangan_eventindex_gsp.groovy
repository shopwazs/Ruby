import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/index.gsp" }
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
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',11,['bean':(eventVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',13,['bean':(eventVO)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
codecOut.print(eventVO?.name)
printHtmlPart(8)
codecOut.print(eventVO?.datepicker)
printHtmlPart(9)
codecOut.print(eventVO?.venue)
printHtmlPart(10)
codecOut.print(eventVO?.description)
printHtmlPart(11)
codecOut.print(eventVO?.type)
printHtmlPart(12)
invokeTag('select','g',166,['from':(['Paid', 'Free', 'Discounted']),'name':("kind"),'id':("kind"),'class':("form-control"),'value':(eventVO?.kind)],-1)
printHtmlPart(13)
invokeTag('select','g',176,['from':(['Planned', 'Ongoing', 'Done']),'name':("status"),'id':("status"),'class':("form-control"),'value':(eventVO?.status)],-1)
printHtmlPart(14)
})
invokeTag('form','g',185,['class':("horizontal event-new"),'controller':("manageEvent"),'action':("saveEvent"),'method':("post")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',209,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
