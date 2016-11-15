import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_accountcreateAddress_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/createAddress.gsp" }
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
invokeTag('dashboard','gan',10,[:],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('renderErrors','g',17,['bean':(addressVO)],-1)
printHtmlPart(7)
})
invokeTag('hasErrors','g',19,['bean':(addressVO)],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
codecOut.print(addressVO?.name)
printHtmlPart(10)
codecOut.print(addressVO?.city)
printHtmlPart(11)
codecOut.print(addressVO?.pinNumber)
printHtmlPart(12)
codecOut.print(addressVO?.neighborhood)
printHtmlPart(13)
codecOut.print(addressVO?.state)
printHtmlPart(14)
invokeTag('countrySelect','g',85,['name':("country"),'class':("form-control"),'id':("country"),'value':(addressVO?.country)],-1)
printHtmlPart(15)
})
invokeTag('form','g',97,['role':("form"),'controller':("home"),'action':("saveAddress"),'method':("post")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
