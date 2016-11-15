import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventcheckOut_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/checkOut.gsp" }
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
codecOut.print(user?.name)
printHtmlPart(6)
codecOut.print(user?.username)
printHtmlPart(7)
codecOut.print(address?.neighborhood)
printHtmlPart(8)
codecOut.print(user?.city)
printHtmlPart(9)
codecOut.print(address?.state)
printHtmlPart(10)
codecOut.print(address?.pinNumber)
printHtmlPart(11)
codecOut.print(phone?.number)
printHtmlPart(12)
invokeTag('countrySelect','g',101,['name':("country"),'class':("form-control"),'id':("country"),'style':("margin: 0em"),'value':(user?.country)],-1)
printHtmlPart(13)
for( eventItem in (eventItemList) ) {
printHtmlPart(14)
codecOut.print(eventItem?.itemName)
printHtmlPart(15)
codecOut.print(eventItem?.itemDescription)
printHtmlPart(16)
}
printHtmlPart(17)
})
invokeTag('form','g',138,['role':("form"),'controller':("public"),'action':("saveCheckout"),'method':("post")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',138,[:],1)
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
