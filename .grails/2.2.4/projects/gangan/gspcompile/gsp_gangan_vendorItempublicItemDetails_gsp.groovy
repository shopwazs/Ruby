import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorItempublicItemDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendorItem/publicItemDetails.gsp" }
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
codecOut.print(vendorItem?.vendor?.name)
printHtmlPart(6)
codecOut.print(vendorItem?.itemName)
printHtmlPart(7)
codecOut.print(vendorItem?.id)
printHtmlPart(8)
codecOut.print(vendorItem?.itemQuantity)
printHtmlPart(9)
codecOut.print(vendorItem?.itemDescription)
printHtmlPart(10)
codecOut.print(vendorItem?.itemPrice)
printHtmlPart(11)
codecOut.print(vendorItem?.itemDiscount)
printHtmlPart(12)
codecOut.print(vendorItem?.total)
printHtmlPart(13)
codecOut.print(user?.name)
printHtmlPart(14)
codecOut.print(user?.username)
printHtmlPart(15)
codecOut.print(address?.neighborhood)
printHtmlPart(16)
codecOut.print(address?.pinNumber)
printHtmlPart(17)
codecOut.print(user?.city)
printHtmlPart(18)
invokeTag('countrySelect','g',190,['name':("country"),'class':("form-control"),'id':("country"),'value':(user?.country)],-1)
printHtmlPart(19)
codecOut.print(eventId)
printHtmlPart(20)
codecOut.print(itemId)
printHtmlPart(21)
codecOut.print(vendorItem?.vendor?.id)
printHtmlPart(22)
codecOut.print(vendorItem?.total)
printHtmlPart(23)
codecOut.print(eventAgenda?.id)
printHtmlPart(24)
})
invokeTag('form','g',200,['role':("form"),'controller':("public"),'action':("addToEvent"),'method':("post")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',200,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
