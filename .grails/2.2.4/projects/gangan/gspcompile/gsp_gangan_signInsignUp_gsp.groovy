import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_signInsignUp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/signIn/signUp.gsp" }
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
invokeTag('userVerifyEmail','gan',9,[:],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('renderErrors','g',14,['bean':(signUpVO)],-1)
printHtmlPart(6)
})
invokeTag('hasErrors','g',16,['bean':(signUpVO)],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(7)
codecOut.print(signUpVO.name)
printHtmlPart(8)
codecOut.print(signUpVO.email)
printHtmlPart(9)
codecOut.print(signUpVO.password)
printHtmlPart(10)
codecOut.print(signUpVO.confirmPassword)
printHtmlPart(11)
codecOut.print(signUpVO.city)
printHtmlPart(12)
invokeTag('countrySelect','g',79,['name':("country"),'class':("form-control"),'id':("country"),'value':(signUpVO.country)],-1)
printHtmlPart(13)
})
invokeTag('form','g',91,['role':("form"),'controller':("signIn"),'action':("createUser"),'method':("post")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',93,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
