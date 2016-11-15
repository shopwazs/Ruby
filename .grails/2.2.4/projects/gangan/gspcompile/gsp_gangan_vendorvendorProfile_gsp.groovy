import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorvendorProfile_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendor/vendorProfile.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('userVerifyEmail','gan',8,[:],-1)
printHtmlPart(4)
invokeTag('render','g',10,['template':("/account/profileNavigation"),'model':([account: account])],-1)
printHtmlPart(5)
codecOut.print(vendor?.name)
printHtmlPart(6)
codecOut.print(vendor?.email)
printHtmlPart(7)
codecOut.print(vendor?.city)
printHtmlPart(8)
codecOut.print(vendor?.country)
printHtmlPart(9)
codecOut.print(vendorCategoryList?.category?.categoryName)
printHtmlPart(10)
if(true && (vendorItemList)) {
printHtmlPart(11)
for( vendorItem in (vendorItemList) ) {
printHtmlPart(12)
codecOut.print(createLink(controller: "vendor", action: "showVendorItemImage", params:
                                            [itemId: "${vendorItem.id}"]))
printHtmlPart(13)
codecOut.print(vendorItem?.itemName)
printHtmlPart(14)
codecOut.print(vendorItem?.itemQuantity)
printHtmlPart(14)
codecOut.print(vendorItem?.itemDescription)
printHtmlPart(14)
codecOut.print(vendorItem?.itemPrice)
printHtmlPart(14)
codecOut.print(vendorItem?.itemDiscount)
printHtmlPart(14)
codecOut.print(vendorItem?.total)
printHtmlPart(15)
}
printHtmlPart(16)
}
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',117,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
