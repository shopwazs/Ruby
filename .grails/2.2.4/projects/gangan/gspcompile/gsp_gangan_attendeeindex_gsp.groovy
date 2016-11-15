import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_attendeeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendee/index.gsp" }
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
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('renderErrors','g',7,['bean':(attendeeVO)],-1)
printHtmlPart(6)
})
invokeTag('hasErrors','g',7,['bean':(attendeeVO)],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
codecOut.print(user.name)
printHtmlPart(9)
codecOut.print(user.username)
printHtmlPart(10)
invokeTag('message','g',27,['code':("springSecurity.login.username.label")],-1)
printHtmlPart(11)
codecOut.print(user.password)
printHtmlPart(10)
invokeTag('message','g',33,['code':("springSecurity.login.password.label")],-1)
printHtmlPart(12)
codecOut.print(user.city)
printHtmlPart(13)
codecOut.print(user.country)
printHtmlPart(14)
invokeTag('countrySelect','g',79,['name':("country"),'class':("form-control"),'id':("country")],-1)
printHtmlPart(15)
})
invokeTag('form','g',88,['role':("form"),'controller':("attendee"),'action':("update"),'method':("post")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',89,[:],1)
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
