import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_accountcreateNewPassword_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/createNewPassword.gsp" }
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
invokeTag('renderErrors','g',15,['bean':(passwordVO)],-1)
printHtmlPart(7)
})
invokeTag('hasErrors','g',17,['bean':(passwordVO)],2)
printHtmlPart(2)
if(true && (flash.message)) {
printHtmlPart(6)
codecOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('form','g',68,['role':("form"),'controller':("home"),'action':("saveNewPassword"),'method':("post")],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
