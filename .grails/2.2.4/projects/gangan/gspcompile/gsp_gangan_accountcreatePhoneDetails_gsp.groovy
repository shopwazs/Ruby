import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_accountcreatePhoneDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/createPhoneDetails.gsp" }
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
invokeTag('renderErrors','g',19,['bean':(phoneVO)],-1)
printHtmlPart(7)
})
invokeTag('hasErrors','g',21,['bean':(phoneVO)],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('checkBox','g',70,['name':("isPrivate"),'style':("float: left")],-1)
printHtmlPart(9)
})
invokeTag('form','g',82,['role':("form"),'controller':("home"),'action':("savePhoneDetails"),'method':("post")],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',84,[:],1)
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
