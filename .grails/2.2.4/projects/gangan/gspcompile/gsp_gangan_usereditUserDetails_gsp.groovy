import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_usereditUserDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/editUserDetails.gsp" }
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
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',10,['bean':(updateUserVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',12,['bean':(updateUserVO)],2)
printHtmlPart(2)
invokeTag('userVerifyEmail','gan',13,[:],-1)
printHtmlPart(6)
invokeTag('dashboard','gan',15,[:],-1)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
codecOut.print(flash.clear())
printHtmlPart(10)
invokeTag('textField','g',35,['class':("form-control"),'name':("name"),'value':(userFields?.name)],-1)
printHtmlPart(11)
invokeTag('textField','g',47,['class':("form-control"),'name':("username"),'value':(userFields?.username)],-1)
printHtmlPart(12)
invokeTag('countrySelect','g',67,['class':("form-control"),'name':("country"),'value':(userFields?.country),'style':("width: 100%")],-1)
printHtmlPart(13)
invokeTag('textField','g',79,['class':("form-control"),'name':("city"),'value':(userFields?.city)],-1)
printHtmlPart(14)
invokeTag('select','g',96,['class':("form-control"),'from':(['Male', 'Female']),'name':("gender"),'value':(userFields?.gender),'style':("width: 100%")],-1)
printHtmlPart(15)
})
invokeTag('form','g',107,['role':("form"),'controller':("home"),'action':("updateUserDetails"),'method':("post"),'enctype':("multipart/form-data")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',107,[:],1)
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
