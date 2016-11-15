import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorcreatePremiumVendor_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendor/createPremiumVendor.gsp" }
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
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',11,['bean':(vendorVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',13,['bean':(vendorVO)],2)
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',15,[:],-1)
printHtmlPart(6)
invokeTag('render','g',17,['template':("/account/profileNavigation"),'model':([account:account])],-1)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
codecOut.print(vendorVO?.name)
printHtmlPart(9)
codecOut.print(vendorVO?.email)
printHtmlPart(10)
codecOut.print(vendorVO?.city)
printHtmlPart(11)
codecOut.print(vendorVO?.phoneNumber)
printHtmlPart(12)
codecOut.print(vendorVO?.mobileNumber)
printHtmlPart(13)
codecOut.print(vendorVO?.faxNumber)
printHtmlPart(14)
codecOut.print(vendorVO?.address)
printHtmlPart(15)
codecOut.print(vendorVO?.rating)
printHtmlPart(16)
codecOut.print(vendorVO?.reviews)
printHtmlPart(17)
codecOut.print(vendorVO?.website)
printHtmlPart(18)
codecOut.print(vendorVO?.history)
printHtmlPart(19)
codecOut.print(vendorVO?.descriptionOfServices)
printHtmlPart(20)
codecOut.print(vendorVO?.typeOfEventCategory)
printHtmlPart(21)
for( category in (publicCategoryList) ) {
printHtmlPart(22)
codecOut.print(category?.categoryName)
printHtmlPart(23)
}
printHtmlPart(24)
createClosureForHtmlPart(25, 3)
invokeTag('countrySelect','g',192,['name':("country"),'class':("form-control"),'id':("country"),'value':(vendorVO?.country)],3)
printHtmlPart(26)
})
invokeTag('form','g',205,['role':("form"),'controller':("home"),'action':("savePremiumVendor"),'method':("post")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',214,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
