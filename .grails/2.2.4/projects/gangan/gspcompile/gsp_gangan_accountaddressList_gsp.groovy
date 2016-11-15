import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_accountaddressList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/addressList.gsp" }
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
invokeTag('dashboard','gan',10,[:],-1)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',24,['controller':("home"),'action':("createAddress"),'style':("float: right"),'class':("btn btn-primary")],2)
printHtmlPart(7)
for( address in (addressList) ) {
printHtmlPart(8)
codecOut.print(address?.name)
printHtmlPart(9)
codecOut.print(address?.city)
printHtmlPart(9)
codecOut.print(address?.pinNumber)
printHtmlPart(9)
codecOut.print(address?.neighborhood)
printHtmlPart(9)
codecOut.print(address?.state)
printHtmlPart(9)
invokeTag('country','g',44,['code':(address?.country)],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',48,['controller':("home"),'action':("editAddress"),'class':("btn btn-primary"),'params':([addressId: address?.id])],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',52,['controller':("home"),'action':("deleteAddress"),'class':("btn btn-danger"),'params':([addressId: address?.id])],3)
printHtmlPart(14)
}
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',64,[:],1)
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
