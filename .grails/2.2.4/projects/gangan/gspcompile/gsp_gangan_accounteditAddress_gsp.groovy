import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_accounteditAddress_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/editAddress.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',10,[:],-1)
printHtmlPart(4)
invokeTag('dashboard','gan',12,[:],-1)
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
codecOut.print(address?.name)
printHtmlPart(10)
codecOut.print(address?.city)
printHtmlPart(11)
codecOut.print(address?.pinNumber)
printHtmlPart(12)
codecOut.print(address?.neighborhood)
printHtmlPart(13)
codecOut.print(address?.state)
printHtmlPart(14)
invokeTag('countrySelect','g',84,['name':("country"),'class':("form-control"),'id':("country"),'value':(address?.country)],-1)
printHtmlPart(15)
codecOut.print(address?.id)
printHtmlPart(16)
})
invokeTag('form','g',97,['role':("form"),'controller':("home"),'action':("updateAddress"),'method':("post")],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',99,[:],1)
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
