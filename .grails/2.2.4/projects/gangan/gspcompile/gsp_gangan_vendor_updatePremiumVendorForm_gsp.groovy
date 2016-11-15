import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendor_updatePremiumVendorForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendor/_updatePremiumVendorForm.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
codecOut.print(flash.message)
printHtmlPart(1)
codecOut.print(flash.clear())
printHtmlPart(2)
codecOut.print(vendor?.name)
printHtmlPart(3)
codecOut.print(vendor?.email)
printHtmlPart(4)
codecOut.print(vendor?.city)
printHtmlPart(5)
codecOut.print(vendor?.phoneNumber)
printHtmlPart(6)
codecOut.print(vendor.mobileNumber)
printHtmlPart(7)
codecOut.print(vendor?.faxNumber)
printHtmlPart(8)
codecOut.print(vendor?.address)
printHtmlPart(9)
codecOut.print(vendor?.rating)
printHtmlPart(10)
codecOut.print(vendor?.reviews)
printHtmlPart(11)
codecOut.print(vendor?.website)
printHtmlPart(12)
codecOut.print(vendor?.history)
printHtmlPart(13)
codecOut.print(vendor?.descriptionOfServices)
printHtmlPart(14)
codecOut.print(vendor?.typeOfEventCategory)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('countrySelect','g',81,['name':("country"),'class':("form-control"),'id':("country"),'value':(vendor?.country)],2)
printHtmlPart(17)
})
invokeTag('form','g',1,['role':("form"),'controller':("home"),'action':("updatePremiumVendor"),'method':("post")],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
