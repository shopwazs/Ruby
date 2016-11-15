import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendor_showPremiumVendorTemplate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendor/_showPremiumVendorTemplate.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
codecOut.print(vendor?.name)
printHtmlPart(1)
createClosureForHtmlPart(2, 2)
invokeTag('link','g',14,['controller':("vendor"),'action':("createVendorItem"),'style':("height: 32px"),'name':("createItem"),'class':("btn btn-primary")],2)
printHtmlPart(3)
codecOut.print(vendor?.email)
printHtmlPart(1)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',29,['controller':("vendor"),'action':("createVendorAddress"),'style':("height: 32px"),'name':("createItem"),'class':("btn btn-primary")],2)
printHtmlPart(5)
codecOut.print(vendor?.city)
printHtmlPart(6)
codecOut.print(vendor?.phoneNumber)
printHtmlPart(7)
codecOut.print(vendor?.mobileNumber)
printHtmlPart(8)
codecOut.print(vendor?.faxNumber)
printHtmlPart(9)
codecOut.print(vendor?.address)
printHtmlPart(10)
codecOut.print(vendor?.rating)
printHtmlPart(11)
codecOut.print(vendor?.reviews)
printHtmlPart(12)
codecOut.print(vendor?.website)
printHtmlPart(13)
codecOut.print(vendor?.history)
printHtmlPart(14)
codecOut.print(vendor?.descriptionOfServices)
printHtmlPart(15)
codecOut.print(vendor?.typeOfEventCategory)
printHtmlPart(16)
for( categories in (categoryList) ) {
printHtmlPart(17)
codecOut.print(categories?.categoryName)
printHtmlPart(18)
}
printHtmlPart(19)
createClosureForHtmlPart(20, 2)
invokeTag('countrySelect','g',177,['name':("country"),'class':("form-control"),'id':("country"),'value':(vendor?.country)],2)
printHtmlPart(21)
})
invokeTag('form','g',189,['role':("form"),'controller':("home"),'action':("updatePremiumVendor"),'method':("post")],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
