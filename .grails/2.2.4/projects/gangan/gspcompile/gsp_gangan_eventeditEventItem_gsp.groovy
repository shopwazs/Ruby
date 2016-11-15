import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventeditEventItem_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/editEventItem.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('userVerifyEmail','gan',8,[:],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
codecOut.print(vendor?.name)
printHtmlPart(6)
codecOut.print(eventItem?.itemName)
printHtmlPart(7)
codecOut.print(eventItem?.itemQuantity)
printHtmlPart(8)
codecOut.print(eventItem?.itemDescription)
printHtmlPart(9)
codecOut.print(eventItem?.itemPrice)
printHtmlPart(10)
codecOut.print(eventItem?.itemDiscount)
printHtmlPart(11)
codecOut.print(eventItem?.total)
printHtmlPart(12)
codecOut.print(eventId?.id)
printHtmlPart(13)
codecOut.print(eventItem?.id)
printHtmlPart(14)
})
invokeTag('form','g',100,['role':("form"),'controller':("manageEvent"),'action':("updateEventItem"),'method':("post")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',102,[:],1)
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