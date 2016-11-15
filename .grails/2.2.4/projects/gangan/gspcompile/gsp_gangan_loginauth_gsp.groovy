import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_loginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/auth.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',5,['code':("springSecurity.login.title")],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',86,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('userVerifyEmail','gan',89,[:],-1)
printHtmlPart(6)
invokeTag('message','g',93,['code':("springSecurity.login.header")],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
codecOut.print(postUrl)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',116,['class':("btn btn-primary"),'id':("#"),'controller':("public"),'action':("forgotPasswordView")],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
codecOut.print(resource(dir: "/images/icons", file: "facebook.png"))
printHtmlPart(15)
})
invokeTag('link','g',133,['controller':("signIn"),'action':("connectFacebook"),'class':("btn btn-default btn-lg")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(16)
codecOut.print(resource(dir: "/images/icons", file: "google.png"))
printHtmlPart(17)
})
invokeTag('link','g',135,['controller':("signIn"),'action':("connectGoogle"),'class':("btn btn-default btn-lg")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',140,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
