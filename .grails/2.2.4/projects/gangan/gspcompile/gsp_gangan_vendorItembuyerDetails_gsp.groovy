import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorItembuyerDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendorItem/buyerDetails.gsp" }
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
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',11,['bean':(shoppingRecordVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',13,['bean':(shoppingRecordVO)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
codecOut.print(user?.name)
printHtmlPart(8)
codecOut.print(user?.username)
printHtmlPart(9)
codecOut.print(address?.neighborhood)
printHtmlPart(10)
codecOut.print(user?.city)
printHtmlPart(11)
codecOut.print(address?.state)
printHtmlPart(12)
codecOut.print(address?.pinNumber)
printHtmlPart(13)
codecOut.print(phone?.number)
printHtmlPart(14)
invokeTag('countrySelect','g',103,['name':("country"),'class':("form-control"),'id':("country"),'value':(user?.country)],-1)
printHtmlPart(15)
codecOut.print(vendorItem?.itemName)
printHtmlPart(16)
codecOut.print(vendorItem?.id)
printHtmlPart(17)
codecOut.print(shoppingRecordVO?.quantity)
printHtmlPart(18)
codecOut.print(shoppingRecordVO?.deliveryAddress)
printHtmlPart(19)
codecOut.print(shoppingRecordVO?.landmark)
printHtmlPart(20)
codecOut.print(shoppingRecordVO?.tempCity)
printHtmlPart(21)
codecOut.print(shoppingRecordVO?.tempState)
printHtmlPart(22)
codecOut.print(shoppingRecordVO?.tempPinNumber)
printHtmlPart(23)
codecOut.print(vendorItem?.itemPrice)
printHtmlPart(24)
codecOut.print(vendorItem?.itemDiscount)
printHtmlPart(25)
codecOut.print(subTotal)
printHtmlPart(26)
codecOut.print(subTotal)
printHtmlPart(27)
codecOut.print(vendorItem?.id)
printHtmlPart(28)
codecOut.print(vendorItem?.itemName)
printHtmlPart(29)
codecOut.print(vendorItem?.itemPrice)
printHtmlPart(30)
codecOut.print(vendorItem?.itemDiscount)
printHtmlPart(31)
codecOut.print(vendorId)
printHtmlPart(32)
})
invokeTag('form','g',249,['role':("form"),'controller':("public"),'action':("saveBuyerDetails"),'method':("post")],2)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',253,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
