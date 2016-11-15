import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_accountphoneList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/phoneList.gsp" }
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
invokeTag('link','g',25,['controller':("home"),'action':("addPhoneNumber"),'style':("float: right"),'class':("btn btn-primary")],2)
printHtmlPart(7)
for( phone in (phoneList) ) {
printHtmlPart(8)
codecOut.print(phone?.name)
printHtmlPart(9)
codecOut.print(phone?.isMobile ? 'Mobile' : 'Landline')
printHtmlPart(9)
codecOut.print(phone?.number)
printHtmlPart(9)
codecOut.print(phone?.isPrivate ? 'Yes' : 'No')
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',44,['onclick':("return confirm('Are You Sure ?')"),'controller':("home"),'action':("deletePhoneNumber"),'class':("btn btn-danger"),'params':([phoneId: phone?.id])],3)
printHtmlPart(11)
}
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',54,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
