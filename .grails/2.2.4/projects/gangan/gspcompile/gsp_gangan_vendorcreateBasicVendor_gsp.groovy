import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorcreateBasicVendor_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendor/createBasicVendor.gsp" }
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
invokeTag('render','g',17,['template':("/account/profileNavigation"),'model':([account: account])],-1)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
codecOut.print(vendorVO?.name)
printHtmlPart(9)
codecOut.print(vendorVO?.email)
printHtmlPart(10)
codecOut.print(vendorVO?.password)
printHtmlPart(11)
codecOut.print(vendorVO?.city)
printHtmlPart(12)
invokeTag('select','g',74,['from':(com.gangan.event.Category.list()),'multiple':("multiple"),'class':("chosen-select"),'style':("width:370px;"),'name':("categoryList"),'id':("categoryList")],-1)
printHtmlPart(13)
invokeTag('countrySelect','g',85,['name':("country"),'class':("form-control"),'id':("country"),'value':(vendorVO?.country)],-1)
printHtmlPart(14)
})
invokeTag('form','g',98,['role':("form"),'controller':("home"),'action':("saveBasicVendor"),'method':("post")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',105,[:],1)
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
