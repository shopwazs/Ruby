import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_ticketeditTicket_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ticket/editTicket.gsp" }
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
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',13,['bean':(ticketVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',15,['bean':(ticketVO)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('select','g',47,['name':("category"),'from':(ticketCategoryList?.categoryName),'class':("form-control"),'style':("width: 100%;margin: 0em")],-1)
printHtmlPart(8)
codecOut.print(ticket?.ticketPrice)
printHtmlPart(9)
invokeTag('select','g',58,['name':("section"),'from':(sectionList?.sectionName),'class':("form-control"),'style':("width: 100%;margin: 0em")],-1)
printHtmlPart(10)
codecOut.print(ticket?.rowNumber)
printHtmlPart(11)
codecOut.print(ticket?.number)
printHtmlPart(12)
codecOut.print(eventId)
printHtmlPart(13)
codecOut.print(ticket?.id)
printHtmlPart(14)
})
invokeTag('form','g',78,['controller':("home"),'action':("updateTicket")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',85,[:],1)
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
